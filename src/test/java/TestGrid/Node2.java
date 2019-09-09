package TestGrid;
import java.net.MalformedURLException;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class Node2 {
	
	WebDriver driver;
	String url;

	
	
public  void setUp() throws MalformedURLException {
		String url=" http://10.1.227.123:5555/wd/hub";
		DesiredCapabilities capability=new DesiredCapabilities();
    	capability.setPlatform(Platform.WIN10);
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\sdhar\\Desktop\\softwares\\jars\\chromedriver.exe");
    	capability.setBrowserName("chrome");
    	ChromeOptions options=new ChromeOptions();
       // WebDriver driver=new RemoteWebDriver(new URL(url),options);
	WebDriver driver = new RemoteWebDriver(new URL(prop.getProperty("node_url").trim()), options);
		driver.manage().deleteAllCookies();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	 
	   
	 
	    
}
}


