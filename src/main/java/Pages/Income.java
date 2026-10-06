package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Income {

    WebDriver driver;

    // Constructor
    public Income(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);
    }
    
    
    
    @FindBy(id ="")
    WebElement addincomeicon;
   
    @FindBy(id ="")
    WebElement Addincomebtn;
    
    @FindBy(xpath="//input[@type='number']")
    WebElement numberTxt;
    
    @FindBy(xpath="//div[@class='chip'][1]")
    WebElement freelancebtn;
    
    @FindBy(xpath="//div[@class='chip'][2]")
    WebElement business;
    
    @FindBy(xpath="//div[@class='chip'][3]")
    WebElement investmentbtn;
    
    @FindBy(xpath="//div[@class='chip'][4]")
    WebElement giftbtn;
    
    @FindBy(xpath="//div[@class='chip'][5]")
    WebElement rentalbtn;
    
    @FindBy(xpath="//div[@class='chip'][6]")
    WebElement rentalincombtn;
    
    @FindBy(xpath="//div[@class='chip'][7]")
    WebElement bonusbtn;
    
    @FindBy(xpath="//div[@class='chip'][8]")
    WebElement commissionbtn;
    
    @FindBy(xpath="//div[@class='chip'][9]")
    WebElement sideincombtn;
    
    @FindBy(xpath="//div[@class='chip'][10]")
    WebElement cashbackbtn;
    
    @FindBy(xpath="//div[@class='chip'][11]")
    WebElement refundbtn;
    
    @FindBy(xpath="//div[@class='chip'][12]")
    WebElement dividendbtn;
    
    @FindBy(xpath="//div[@class='chip'][13]")
    WebElement intrestbtn;
    
    @FindBy(xpath="//div[@class='chip'][14]")
    WebElement consultingbtn;
    
    @FindBy(xpath="//div[@class='chip'][15]")
    WebElement othersbtn;
    
    @FindBy(xpath="//div[@class='chip'][16]")
    WebElement salarybtn;
    
 
  //  @FindBy(xpath ="//input[@type='date']")
    //WebElement dateBtn;
    
    @FindBy(xpath ="//textarea[@class='inp']")
    WebElement NoteTF;
    
    @FindBy(xpath = "//button[@class='btn btn-p']")
    WebElement Addbtn;

	private WebDriver getDriver() {
		return driver;
	}

	private WebElement getAddincomeicon() {
		return addincomeicon;
	}

	private WebElement getAddincomebtn() {
		return Addincomebtn;
	}

	private WebElement getNumberTxt() {
		return numberTxt;
	}

	private WebElement getFreelancebtn() {
		return freelancebtn;
	}

	private WebElement getBusiness() {
		return business;
	}

	private WebElement getInvestmentbtn() {
		return investmentbtn;
	}

	private WebElement getGiftbtn() {
		return giftbtn;
	}

	private WebElement getRentalbtn() {
		return rentalbtn;
	}

	private WebElement getRentalincombtn() {
		return rentalincombtn;
	}

	private WebElement getBonusbtn() {
		return bonusbtn;
	}

	private WebElement getCommissionbtn() {
		return commissionbtn;
	}

	private WebElement getSideincombtn() {
		return sideincombtn;
	}

	private WebElement getCashbackbtn() {
		return cashbackbtn;
	}

	private WebElement getRefundbtn() {
		return refundbtn;
	}

	private WebElement getDividendbtn() {
		return dividendbtn;
	}

	private WebElement getIntrestbtn() {
		return intrestbtn;
	}

	private WebElement getConsultingbtn() {
		return consultingbtn;
	}

	private WebElement getOthersbtn() {
		return othersbtn;
	}

	private WebElement getSalarybtn() {
		return salarybtn;
	}

	//private WebElement getDateBtn() {
		//return dateBtn;
	//}

	private WebElement getNoteTF() {
		return NoteTF;
	}

	private WebElement getAddbtn() {
		return Addbtn;
	}
    
       
}