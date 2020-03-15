package com.hrms.API.steps.practice;

import static io.restassured.RestAssured.given;

import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POSTgetALLemployeLIst {
	private static RequestSpecification request;
    private static Response response;

@Then("user validates all employee")
public void user_validates_all_employee() {
  
	
	allLIst();
	
	
	
}

public static void allLIst() {
	
    request =
  		   
    given()
	
   .header("Content-Type","application/json")
   .header("Authorization",SyntaxAPIAuthenticationSteps.Token);
	
}








}
