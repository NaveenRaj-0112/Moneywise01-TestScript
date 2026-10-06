package WebDriverUtil;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {


	WebDriver driver;
	WebDriverWait wait;
	Actions action;

	// Constructor
	public Utils(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		this.action = new Actions(driver);
	}

	// ==========================
	// Screenshot Method
	// ==========================

	public void takeScreenshot(String fileName) {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File destination = new File("./Screenshots/" + fileName + ".png");

		try {
			// Ensure the Screenshots directory exists before copying
			File parentDir = destination.getParentFile();
			if (parentDir != null && !parentDir.exists()) {
				parentDir.mkdirs();
			}

			FileUtils.copyFile(source, destination);
			System.out.println("Screenshot Taken Successfully");

		} catch (IOException e) {

			System.out.println("Screenshot Failed");
			e.printStackTrace();
		}
	}

	// ==========================
	// Select Class Methods
	// ==========================

	// Select By Visible Text
	public void selectByVisibleText(WebElement element, String text) {

		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	// Select By Value
	public void selectByValue(WebElement element, String value) {

		Select select = new Select(element);
		select.selectByValue(value);
	}

	// Select By Index
	public void selectByIndex(WebElement element, int index) {

		Select select = new Select(element);
		select.selectByIndex(index);
	}

	// Get All Options
	public List<WebElement> getAllOptions(WebElement element) {

		Select select = new Select(element);
		return select.getOptions();
	}

	// ==========================
	// Actions Class Methods
	// ==========================

	public void mouseHover(WebElement element) {
        action.moveToElement(element).perform();
    }

    // ─────────────────────────────────────────
    // 2. Double Click
    // ─────────────────────────────────────────
    public void doubleClick(WebElement element) {
        action.doubleClick(element).perform();
    }

    // ─────────────────────────────────────────
    // 3. Right Click
    // ─────────────────────────────────────────
    public void rightClick(WebElement element) {
        action.contextClick(element).perform();
    }

    // ─────────────────────────────────────────
    // 4. Drag And Drop
    // ─────────────────────────────────────────
    public void dragAndDrop(WebElement source, WebElement target) {
        action.dragAndDrop(source, target).perform();
    }

    // ─────────────────────────────────────────
    // 5. Click And Hold
    // ─────────────────────────────────────────
    public void clickAndHold(WebElement element) {
        action.clickAndHold(element).perform();
    }

    // ─────────────────────────────────────────
    // 6. Release
    // ─────────────────────────────────────────
    public void release(WebElement element) {
        action.release(element).perform();
    }

    // ─────────────────────────────────────────
    // 7. Single Click
    // ─────────────────────────────────────────
    public void singleClick(WebElement element) {
        action.click(element).perform();
    }

    // ─────────────────────────────────────────
    // 8. Hover And Fetch Title
    // ─────────────────────────────────────────
    public String hoverAndFetchTitle(WebElement element) {
        action.moveToElement(element).perform();
        String title = element.getAttribute("title");
        System.out.println("Title on Hover : " + title);
        return title;
    }

    // ─────────────────────────────────────────
    // 9. Hover Then Click
    // ─────────────────────────────────────────
    public void hoverAndClick(WebElement element) {
        action.moveToElement(element).click().perform();
    }

    // ─────────────────────────────────────────
    // 10. Hover On Parent Then Click SubMenu
    // ─────────────────────────────────────────
    public void hoverAndClickSubMenu(WebElement parentMenu, WebElement subMenu) {
        action.moveToElement(parentMenu)
              .moveToElement(subMenu)
              .click()
              .perform();
    }

    // ─────────────────────────────────────────
    // 11. Drag And Drop By Offset
    // ─────────────────────────────────────────
    public void dragAndDropByOffset(WebElement source, int xOffset, int yOffset) {
        action.dragAndDropBy(source, xOffset, yOffset).perform();
    }

    // ─────────────────────────────────────────
    // 12. Move To Element With Offset
    // ─────────────────────────────────────────
    public void moveToElementWithOffset(WebElement element, int xOffset, int yOffset) {
        action.moveToElement(element, xOffset, yOffset).perform();
    }

    // ─────────────────────────────────────────
    // 13. Send Keys Via Actions
    // ─────────────────────────────────────────
    public void sendKeys(WebElement element, String text) {
        action.click(element).sendKeys(text).perform();
    }

    // ─────────────────────────────────────────
    // 14. Key Down
    // ─────────────────────────────────────────
    public void keyDown(WebElement element, CharSequence key) {
        action.keyDown(element, key).perform();
    }

    // ─────────────────────────────────────────
    // 15. Key Up
    // ─────────────────────────────────────────
    public void keyUp(WebElement element, CharSequence key) {
        action.keyUp(element, key).perform();
    }

    // ─────────────────────────────────────────
    // 16. Scroll To Element
    // ─────────────────────────────────────────
    public void scrollToElement(WebElement element) {
        action.scrollToElement(element).perform();
    }


	// ==========================
	// Wait Methods
	// ==========================

	// Wait For Visibility
	public void waitForVisibility(WebElement element) {

		wait.until(ExpectedConditions.visibilityOf(element));
	}

	// Wait For Clickable
	public void waitForClickable(WebElement element) {

		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	// ==========================
	// JavaScript Executor Methods
	// ==========================

	// Scroll Down
	public void scrollDown() {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,500)");
	}

	// Click Using JavaScript
	public void clickUsingJS(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", element);
	}

	// ==========================
	// Browser Utility Methods
	// ==========================

	// Maximize Window
	public void maximizeWindow() {

		driver.manage().window().maximize();
	}

	// Implicit Wait
	public void implicitWait(int seconds) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

	// Open Application
	public void openApplication(String url) {

		driver.get(url);
	}

	// Close Browser
	public void closeBrowser() {

		driver.quit();
	}

}