package lib.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtility {
	
	public static WebDriver OpenBrowser(WebDriver driver, String browserName, String URL) throws InterruptedException  
	{
		if(browserName.equals("Chrome"))
		{
			
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdhar\\Desktop\\softwares\\jars\\chromedriver.exe");
			
			//driver = new ChromeDriver();
			
			//driver.manage().window().maximize();
			
			driver.get(URL);
			
			Thread.sleep(5000);
			
			return driver;
			
		}
		
		else
			
			if(browserName.equals("Firefox"))
			{
				
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\sdhar\\Desktop\\softwares\\jars\\geckodriver.exe");
				
				driver = new FirefoxDriver();
				
				driver.manage().window().maximize();
				
				driver.get(URL);
				
				Thread.sleep(5000);
				
				return driver;
		
		
			}		
		
		return null;

}}

