package com.hrms.API.steps.practice;

import org.junit.Test;

import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class employeeStatus {
	
	@Then("user validates employee status")
	public void user_validates_employee_status() {
		getAllStatus();
	}

	
	
	public void getAllStatus() {
		Response response = RestAssured
				
				.given()
				.contentType("application/json")
				.header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODMwMDExNjAsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MzExNjM2MCwidXNlcklkIjoiMjU0In0.yiPD9P11hPHsgHLk6tZlNMPmyMbl0gsrVnpBJRloDe8")
				.when()
				.get("http://18.232.148.34/syntaxapi/api/employeeStatus.php");

		response.prettyPrint();
		

	}

}
