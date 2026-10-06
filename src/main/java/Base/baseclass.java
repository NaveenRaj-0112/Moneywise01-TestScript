package Base;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import WebDriverUtil.ConfigReader;

public class baseclass {

	public WebDriver driver;
    public static WebDriver sDriver;
    public ExtentReports report;
    public ExtentTest test;

    private static final String BASE_URL = ConfigReader.getProperty("url");

    @Parameters("browser")
    @BeforeClass(alwaysRun = true)
    public void launchBrowser(@Optional("chrome") String browser) throws IOException {

        // Initialize report
        ExtentSparkReporter spark = new ExtentSparkReporter("./src/test/resources/reports/TestReport.html");
        report = new ExtentReports();
        report.attachReporter(spark);

        // Launch browser
        switch (browser.toLowerCase()) {
            case "chrome"  -> driver = new ChromeDriver();
            case "edge"    -> driver = new EdgeDriver();
            case "firefox" -> driver = new FirefoxDriver();
            case "safari"  -> driver = new SafariDriver();
            default        -> throw new IllegalArgumentException(
                                 "Unsupported browser: " + browser);
        }

        sDriver = driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Navigate and login
        driver.get(BASE_URL);

        driver.findElement(By.id("email")).sendKeys(ConfigReader.getProperty("tes123@.com"));
        driver.findElement(By.id("password")).sendKeys();
        driver.findElement(By.xpath("//button[@class='btn btn-p']")).click();

        // ✅ FIX: Wait for login form to disappear (Sign In button gone = logged in)
        //         instead of waiting for URL change which never happens on this app
        //new WebDriverWait(driver, Duration.ofSeconds(15))
           // .until(ExpectedConditions.invisibilityOfElementLocated(
               // By.xpath("//button[contains(text(),'Sign In')]")));
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeEachTest(Method m) {
        test = report.createTest(m.getName());
        test.log(Status.INFO, "Starting test: " + m.getName());

        // Navigate back to home before each test for a clean state
        driver.get(BASE_URL);
    }

    @AfterClass(alwaysRun = true)
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    @AfterSuite
    public void saveReport() {
        if (report != null) {
            report.flush();
        }
    }

}
