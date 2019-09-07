package stepDef;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;



import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateIncidentDefinitions {

	private Response response;
	private RequestSpecification request;
	

	private String URL = "https://dev83967.service-now.com/";

@Test

	@Given("^Incident service  with  username and Password$")
	public void CreateIncident(){
	
	RestAssured.baseURI = "https://dev83967.service-now.com/api/now/table/incident";
	
	
	
	RestAssured.authentication = RestAssured.basic("admin", "ix4kKncZKGV0");
	
	
	
	Response response = RestAssured
			.given()
			
			.contentType(ContentType.JSON)
			
			.body("{\"short_description\":\"Created by Surf123456\"}").post();	
	}

	@When("^user hits create Incident Api$")
	public void user_posts(){
		response = request.when().get(URL);
		System.out.println("response: " + response.prettyPrint());
	}

	@Then("^the status code is201$")
	public void verify_status_code(int statusCode){
		
		int statuscode = response.statusCode();

		System.out.println(statuscode);	
				
		if (response.statusCode()==201) 
			
			
		response.then().statusCode(statusCode);
	}

	
}


