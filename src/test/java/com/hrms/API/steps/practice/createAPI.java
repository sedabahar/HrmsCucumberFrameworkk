package com.hrms.API.steps.practice;

import static io.restassured.RestAssured.given;

import org.junit.Test;

import com.hrms.utils.CommonMethods;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class createAPI {
	   private static RequestSpecification request;
	    private Response response;

	
	@Test
	public void getoneEmployee() {

		
	       request =
	    		   
	       given()
	      .header("Content-Type","application/json")
	      .header("Authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODMwMTUwNDIsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MzEzMDI0MiwidXNlcklkIjoiMzEzIn0.kO-1yjRekMkAMQ7wNnB_WGjqIbISC4kcArN_E5fkmEw");
	       request.body(CommonMethods.readJson(
	   "/Users/mustafademirkiran/eclipse-workspace/HrmsCucumberFrameworkk/src/test/resources/JSONFiles/createEmployee.json"));
	      response = request.post("http://54.167.125.15/syntaxapi/api/createEmployee.php");
	      response.prettyPrint();
	}

	
	
	
	
}
	
