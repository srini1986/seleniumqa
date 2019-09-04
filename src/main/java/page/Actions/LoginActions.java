package page.Actions;

import page.locators.Login;
import utils.SeleniumDriver;

public class LoginActions extends SeleniumDriver {

	Login loginobj=new Login();
	public void cookieheaderclick()
	{
		//loginobj.cookieheader.click();
		click(loginobj.cookieheader);
		
	}
	public void loginheaderclick()
	{
		//loginobj.loginClick.click();
		click(loginobj.loginClick);
	}
	public void customerclick()
	{
		//loginobj.customerclick.click();
		click(loginobj.customerclick);
	}
	
}
