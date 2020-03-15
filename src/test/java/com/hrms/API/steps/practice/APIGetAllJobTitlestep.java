package com.hrms.API.steps.practice;

import static io.restassured.RestAssured.given;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.equalTo;

import org.json.JSONArray;
import org.json.JSONObject;
public class APIGetAllJobTitlestep {
	
	 private static RequestSpecification request;
	    private static Response response;
	
	@Given("user calls jobTitle  API")
	public void user_calls_jobTitle_API() {
		  request =
		  		   
				    given()
					
				   .header("Content-Type","application/json")
				   .header("Authorization",SyntaxAPIAuthenticationSteps.Token);
	}

	@When("User retrieves response for jobTitle  API")
	public void user_retrieves_response_for_jobTitle_API() {
	   
		 response = request.get("http://18.232.148.34/syntaxapi/api/jobTitle.php");
	}

	@Then("status code is {int} for jobTitle  API")
	public void status_code_is_for_jobTitle_API(Integer int1) {
		response.then().assertThat().statusCode(int1);
	}

	@Then("user validates got jobTitle")
	public void user_validates_got_jobTitle() {
		 System.out.println("Response is "+response.prettyPrint());
		
	}
	
	
}

	        