package stepDef;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestGrid.Node1;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.java.Before;
import lib.utils.BrowserUtility;
import lib.utils.PropertiesFileReader;
import page.locators.AgentHomePage;
import page.locators.Login;


public class AgentLogin {

	PropertiesFileReader obj = new PropertiesFileReader();
	private WebDriver driver;
	Node1 nod = new Node1();

	public  AgentLogin() throws Throwable{
		this.driver = nod.setUp();
	}
	@Given("^Open FireFox Browser with URL$")
	public void Open_FireFox_Browser_with_URL() throws Throwable {

		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream(
					new File("./UIProperties.Properties")));
		} catch (IOException e) {

		}
		Properties properties = obj.getProperty();

//driver=BrowserUtility.OpenBrowser(driver, prop.getProperty("browser.name"), prop.getProperty("browser.baseurl"));

		BrowserUtility.OpenBrowser(this.driver, properties.getProperty("browser.name"),
				properties.getProperty("browser.baseurl"));

	}

	@When("^User Enters Correct username and paasword$")
	public void User_Enters_Correct_username_and_paasword() throws Throwable {

		Login log = new Login(driver);
		log.firstpage();
	}

	@Then("^Agent Portal is displayed$")
	public void Agent_Portal_is_displayed() throws Throwable {
		Thread.sleep(5000);

		// String expectedTitle = "Gmail";

		String actualTitle = new AgentHomePage(this.driver).getTitle();
		boolean flag = false;
		if (actualTitle.contains("Gmail")) {
			flag = true;
		} else {
			flag = false;
		}

		Assert.assertEquals(flag, true);
		

		// driver.quit();
	}

}
