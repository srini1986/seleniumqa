package rest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestLogSpecification;
import lib.rest.RESTAssuredBase;



public class createaincident {	
	@Test
	public void setup() {
		
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(new File("./config.properties")));
		} catch (IOException e) {
			
		}
		
		String URL1 = prop.getProperty("URL");
		
		System.out.println(URL1);	
		
		
		RestAssured.authentication = RestAssured.basic(
										prop.getProperty("UserName"), 
										prop.getProperty("Password")										
										);
		
		
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/createaincident.html");
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		ExtentTest logger = extent.createTest("Create Incident Test Case");
		
		logger.log(Status.INFO, "API Creation Started");	
		
	
		
		RestAssured.baseURI = "https://dev83967.service-now.com/api/now/table/incident";	
	
		
		//RestAssured.authentication = RestAssured.basic("admin", "ix4kKncZKGV0");
		
		logger.log(Status.PASS, "Authentication is successful");
		
		Response response = RestAssured
				.given()
				
				.contentType(ContentType.JSON)
				
				.body("{\"short_description\":\"Created by Surf123456789\"}").post();
		
		logger.log(Status.PASS, "Incident is created with Short Description as Surf12345");
											
JsonPath jsonResponse = response.jsonPath();  

String sys_id = jsonResponse.get("result.sys_id");          

System.out.println("Created sys_id is -> " + sys_id);

logger.log(Status.PASS, "Sys ID Created is: "+sys_id);

int statusCode = response.statusCode();  

logger.log(Status.PASS, "StatusCode Validation is Successful: "+statusCode);

System.out.println(statusCode);        

String statusLine = response.statusLine();  

logger.log(Status.PASS, "statusLine Validation is Successful: "+statusLine);

System.out.println(statusLine);

response.prettyPrint();

int statuscode = response.statusCode();

System.out.println(statuscode);	
		
if (response.statusCode()==201) 
	
	logger.log(Status.PASS, "Status code is 201");

System.out.println("Test Case Passed");

extent.flush();


}
}
	
