package rest;

import java.io.IOException;

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


public class deleteeaincident {
	
	
	
	@Test
	public void setup() throws IOException {
		
ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/deleteaincident.html");
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		ExtentTest logger = extent.createTest("DeleteaIncident Test Case");
		
		//logger.addScreenCaptureFromPath("C://Users//skaja//Desktop//towerhill.png");
		
		logger.log(Status.INFO, "API Creation Started");
		
		RestAssured.baseURI = "https://dev83967.service-now.com/api/now/table/incident";
		
		RestAssured.authentication = RestAssured.basic("admin", "ix4kKncZKGV0");
		
		logger.log(Status.PASS, "Authentication is successful");
		
		Response response = RestAssured
								
							.delete("/70f073cedb233300a3fd47823996195c");
				
				
					
//JsonPath jsonResponse = response.jsonPath();  
//String sys_id = jsonResponse.get("result.sys_id");          
//System.out.println("Created sys_id is -> " + sys_id);      
  
int statusCode = response.statusCode();  
System.out.println(statusCode);          
String statusLine = response.statusLine();  
System.out.println(statusLine);
response.prettyPrint();
int statuscode = response.statusCode();

System.out.println(statuscode);	
		
if (response.statusCode()==204) 

System.out.println("Test Case Passed");

extent.flush();
		
	}
	
	
		
	}
	
	
