package page.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.SeleniumDriver;

public class Login {

	WebDriver driver;

	// JavascriptExecutor js = (JavascriptExecutor) driver;

	public Login(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//	
	@FindBy(how = How.ID, using = "inputGroupID")
	public WebElement txtGroupID;

	@FindBy(how = How.ID, using = "inputUserName")
	public WebElement txtUserName;
//	
	@FindBy(how = How.ID, using = "inputPassword")
	public WebElement txtPassword;
//	
	@FindBy(how = How.XPATH, using = "//div[@class='col-6 offset-3'][contains(.,'Submit')]")
	public WebElement btnSubmit;
//	

	@FindBy(how = How.ID, using = "idEJde")
	public WebElement verifygoogle;
//
	@FindBy(how = How.ID, using = "headingText")
	public WebElement Signinpage;
//
	@FindBy(how = How.ID, using = "headingSubtext")
	public WebElement Agreetogmail;

	@FindBy(how = How.ID, using = "identifierId")
	public WebElement txtemail;

	@FindBy(how = How.ID, using = "identifierNext")
	public WebElement Nextbtn;

	@FindBy(how = How.NAME, using = "password")
	public WebElement txtpassword;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Next')]")
	public WebElement pwdNextBtn;

	public Login() {
		// TODO Auto-generated constructor stub
	}

	public void firstpage() throws InterruptedException {

	
		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.elementToBeClickable(txtemail));
		txtemail.sendKeys("aishwaryassteja@gmail.com");
		Nextbtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(txtpassword));
		txtpassword.sendKeys("Saibaba1936");

		pwdNextBtn.click();

	}

}
