package services;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;

import java.util.Arrays;

import org.apache.http.HttpStatus;
import org.junit.Test;

import io.restassured.http.ContentType;


public class CreateaIncident
{
	

	@Test
	public void CreateIncident(){
		

		given().
		
		when().
		
		contentType(ContentType.JSON)
		.body("{\"short_description\":\"Created by Surf12345\"}").post()
		.then()
		.statusCode(HttpStatus.SC_OK)
		;
		
		
	}
}
