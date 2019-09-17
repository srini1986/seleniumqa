package TestGrid;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Node1 {

	WebDriver driver;
	String url;

	@Test

	public WebDriver setUp() throws InterruptedException, FileNotFoundException, IOException {

		// url="http://35.224.174.206:4444/wd/hub";
//		url = "http://10.1.227.151:7777/wd/hub";
		Properties prop = new Properties();
		prop.load(new FileInputStream(new File("./UIProperties.Properties")));
		
		DesiredCapabilities capability = new DesiredCapabilities();
		//capability.setPlatform(Platform.LINUX);
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\sdhar\\Desktop\\softwares\\jars\\chromedriver.exe");
		capability.setBrowserName("chrome");
		ChromeOptions options = new ChromeOptions();
		String url="http://34.70.117.31:4444/wd/hub";
                WebDriver driver=new RemoteWebDriver(new URL(url),capability);
		//WebDriver driver = new RemoteWebDriver(new URL(prop.getProperty("node_url").trim()), options);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		return driver;

//
	}

}

//import org.openqa.selenium.Platform;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import org.openqa.selenium.firefox.FirefoxOptions;
//
//
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.testng.annotations.*;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
//
//public class Grid {
//	WebDriver driver;
//
//    @Parameters(value = {"browser"})
//    @BeforeTest
//    public void beforeTest (String browser) throws MalformedURLException {
//    	
//
//        if (browser.equals("firefox")) {
//        	 String nodeurl = "http://10.1.227.123:5555/wd/hub";
//        	 DesiredCapabilities capability1=new DesiredCapabilities();
//        	System.setProperty("webdriver.gecko.driver","C:\\Users\\sdhar\\Desktop\\softwares\\jars\\geckodriver.exe");
//        	capability1.setPlatform(Platform.WIN10);
//        	capability1.setBrowserName("firefox");
//        	FirefoxOptions options=new FirefoxOptions();
//        	WebDriver driver1 = new RemoteWebDriver(new URL(nodeurl),capability1);
//        	driver1.navigate().to("https://innovation.beta.thig.com");
//      	          	
//        }
//        
//        else if (browser.equals("chrome")) {
//        	 String nodeurl = "http://10.1.227.123:7777/wd/hub";
//        	 DesiredCapabilities capability2=new DesiredCapabilities();
//        	System.setProperty("webdriver.chrome.driver","C:\\Users\\sdhar\\Desktop\\softwares\\jars\\chromedriver.exe");
//        	capability2.setPlatform(Platform.WIN10);
//        	capability2.setBrowserName("chrome");
//        	ChromeOptions options=new ChromeOptions();
//        	 WebDriver driver1 = new RemoteWebDriver(new URL(nodeurl),capability2);
//        	 driver1.navigate().to("https://innovation.beta.thig.com");
//        										} 
//        else {
//        	System.out.println("provide correct port no.");
//        		}
//
//        
////	    String url="http://10.1.227.123:4444/wd/hub";
////	    WebDriver driver=new RemoteWebDriver(new URL(url),capability);
//    }
//
//}
