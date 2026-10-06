package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {

    WebDriver driver;

    // Constructor
    public Signin(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

   
    
    @FindBy(id = "")
    WebElement usernameTF;
    
    @FindBy(id="")
    WebElement passwordTF;
    
    @FindBy(xpath ="")
    WebElement SigninBTN;

	private WebDriver getDriver() {
		return driver;
	}

	private WebElement getUsernameTF() {
		return usernameTF;
	}

	private WebElement getPasswordTF() {
		return passwordTF;
	}

	private WebElement getSigninBTN() {
		return SigninBTN;
	}
    
    
    
}