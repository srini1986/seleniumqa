package stepDef;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import page.Actions.LoginActions;
import utils.SeleniumDriver;

public class LoginStepDef {
WebDriver driver;
LoginActions loginActions=new LoginActions();	
@Given("^users is on the \"([^\"]*)\"$")
public void user_is_on_the(String Url) throws Throwable {
	SeleniumDriver driver=new SeleniumDriver();	
	driver.startApp("firefox", Url);
	loginActions.cookieheaderclick();  
}
@When("^users enters details$")
public void user_enters_details() throws Throwable {
	loginActions.loginheaderclick();
	loginActions.customerclick();      
}
@Then("^quotes should be successfully generated$")
public void login_should_be_successfull()
{
	System.out.println("quote should be generated successfully");
}

}
