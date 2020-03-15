package com.hrms.API.steps.practice;

import static io.restassured.RestAssured.given;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIGetAllEmployeeStatusstep {
	
	private static RequestSpecification request;
    private static Response response;
	
	
	@Given("user calls employee Status API")
	public void user_calls_employee_Status_API() {
		  request =
		  		   
				    given()
					
				   .header("Content-Type","application/json")
				   .header("Authorization",SyntaxAPIAuthenticationSteps.Token);
		
		  //employeeStatus.php
	}

	@When("User retrieves response for employee Status API")
	public void user_retrieves_response_for_employee_Status_API() {
		 response = request.get("http://18.232.148.34/syntaxapi/api/employeeStatus.php");
	}

	@Then("status code is {int} for employee Status API")
	public void status_code_is_for_employee_Status_API(Integer int1) {
		response.then().assertThat().statusCode(int1);
	}

	@Then("user validates got employee Status")
	public void user_validates_got_employee_Status() {
		 System.out.println("Response is "+response.prettyPrint());
	}

	
	

}
