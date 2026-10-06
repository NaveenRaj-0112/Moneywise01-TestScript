package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {

    WebDriver driver;

    // Constructor (no return type, matches class name)
    public Signup(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

 
    @FindBy(id ="")
    WebElement sinupbtn;
    
    @FindBy(id = "")           
    WebElement FullNameTextBox;

    @FindBy(id = "")        
    WebElement EmailTextBox;

    
    @FindBy(xpath = "")  
    WebElement PasswordTextBox;
    
    @FindBy(xpath = "")
    WebElement ConfirmPassword;
    
    @FindBy(xpath ="")
    WebElement CreateaccountBtn;

	private WebDriver getDriver() {
		return driver;
	}

	private WebElement getSinupbtn() {
		return sinupbtn;
	}

	private WebElement getFullNameTextBox() {
		return FullNameTextBox;
	}

	private WebElement getEmailTextBox() {
		return EmailTextBox;
	}

	private WebElement getPasswordTextBox() {
		return PasswordTextBox;
	}

	private WebElement getConfirmPassword() {
		return ConfirmPassword;
	}

	private WebElement getCreateaccountBtn() {
		return CreateaccountBtn;
	}
    
    
    
    
}