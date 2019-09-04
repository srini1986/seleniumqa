package page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.SeleniumDriver;

public class Login extends SeleniumDriver {

	public Login() {
		PageFactory.initElements(driver,this);
	}
	//Login Enter the UserName
	@FindBy(how=How.ID,using="cookie_action_close_header")
	public WebElement cookieheader;
	@FindBy(how=How.ID,using="menu-item-6777")
	public WebElement loginClick;
	@FindBy(how=How.LINK_TEXT,using="Customer Portal")
	public WebElement customerclick;
	
}
