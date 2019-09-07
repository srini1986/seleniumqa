package page.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.SeleniumDriver;

public class AgentHomePage extends SeleniumDriver {

	WebDriver driver;
	
	public AgentHomePage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	//Login Enter the UserName	
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"product-title\"]")
	public WebElement tleProductTitle;
	
	
	public void firstpage() throws InterruptedException{
		
		Thread.sleep(2000);		
		
	}
	
	public String getTitle() {
		
		return driver.getTitle();
		
		
	}
	
	
}
