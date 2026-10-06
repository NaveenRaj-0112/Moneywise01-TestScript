package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Expenses {

    WebDriver driver;
    // Constructor
    public Expenses(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath = "//button[@class='ni act']")
    WebElement expensesicon;
 
    @FindBy(xpath = "//button[@class='btn btn-d']")
    WebElement expensesbtn;
    
   @FindBy(xpath ="//input[@type='number']")
   WebElement expensesfields;
   
   @FindBy(xpath = "//div[@class='chip' and contains(.,'Groceries')]")
   WebElement Groceriestxt ;
   
   @FindBy(xpath = "//div[@class='chip' and contains(.,'Food')]")
   WebElement Foodtxt ;
   
   @FindBy(xpath = "//div[@class='chip' and contains(.,'Food & Dining')]")
   WebElement foodAndDiningTxt;
   
   @FindBy(xpath = "//div[@class='chip' and contains(.,'Coffee')]")
   WebElement Coffeetxt ;
   
   @FindBy(xpath = "//div[@class='chip' and contains(.,'Car')]")
   WebElement Cartxt;
   
   @FindBy(xpath = "//div[@class='chip' and contains(.,'Car / Fuel')]")
   WebElement CarFueltxt;
  
   @FindBy(xpath = "//div[@class='chip' and contains(.,'Transportation')]")
   WebElement Transportationtxt;
   
   @FindBy(xpath = "//div[@class='chip' and contains(.,' Travel')]")
   WebElement  Traveltxt;
   
   @FindBy(xpath = "//div[@class='chip' and contains(.,'Home')]")
   WebElement txtHome ;
   
   @FindBy(xpath = "//div[@class='chip' and contains(.,'Electricity')]")
   WebElement Electricitytxt;
   
   @FindBy(xpath = "//div[@class='chip' and contains(.,'Health')]")
   WebElement Healthtxt;
   
  
   @FindBy(xpath = "//textarea[@placeholder ='Add a note...']")
   WebElement NoteField;
   private WebDriver getDriver() {
	return driver;
   }


   private WebElement getExpensesicon() {
	return expensesicon;
   }


   private WebElement getExpensesbtn() {
	return expensesbtn;
   }


   private WebElement getExpensesfields() {
	return expensesfields;
   }


   private WebElement getGroceriestxt() {
	return Groceriestxt;
   }


   private WebElement getFoodtxt() {
	return Foodtxt;
   }


   private WebElement getFoodAndDiningTxt() {
	return foodAndDiningTxt;
   }


   private WebElement getCoffeetxt() {
	return Coffeetxt;
   }


   private WebElement getCartxt() {
	return Cartxt;
   }


   private WebElement getCarFueltxt() {
	return CarFueltxt;
   }


   private WebElement getTransportationtxt() {
	return Transportationtxt;
   }


   private WebElement getTraveltxt() {
	return Traveltxt;
   }


   private WebElement getTxtHome() {
	return txtHome;
   }


   private WebElement getElectricitytxt() {
	return Electricitytxt;
   }


   private WebElement getHealthtxt() {
	return Healthtxt;
   }


   private WebElement getNoteField() {
	return NoteField;
   }
   
  
   
}

