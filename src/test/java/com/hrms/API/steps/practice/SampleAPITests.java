package com.hrms.API.steps.practice;

import org.junit.Assert;
import org.junit.Test;

import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class SampleAPITests {
	


	@Test
	public void getoneEmployee() {

		Response response = RestAssured
				
				.given()
				.param("employee_id", "3440")
				.contentType("application/json")
				.header(
				"Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODMwMTUwNDIsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MzEzMDI0MiwidXNlcklkIjoiMzEzIn0.kO-1yjRekMkAMQ7wNnB_WGjqIbISC4kcArN_E5fkmEw")
				.when()
				.get("http://18.232.148.34/syntaxapi/api/getOneEmployee.php");

		response.prettyPrint();

	}

	//@Test
	public void getAllEmployee() {
		Response response = RestAssured
				.given()
				.contentType("application/json")
				.header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0MDEzNDMsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjUxNjU0MywidXNlcklkIjoiMjU0In0.K2-epl-Su6DhpkCJfMGPZ8ZHS0QmacKr6q6-e1ZTmXQ")
				.when()
				.get("http://18.232.148.34/syntaxapi/api/getAllEmployees.php");

		response.prettyPrint();
		
		int actualStatusCode=response.getStatusCode();
		Assert.assertEquals(200,actualStatusCode);
	}
	
	






//@Test
	public void delete() {

		Response response = RestAssured
				.given()
				.param("employee_id", "06322A")
				.contentType("application/json")
				.header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI1MTIwODYsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjYyNzI4NiwidXNlcklkIjoiMjU0In0.zAWPqOY62WatBv2IucB-lEqbGVjTxRH0F6nH07ahQKU")
				.when()
				.get("http://18.232.148.34/syntaxapi/api/deleteEmployee.php");


		response.prettyPrint();
		
		
	}










}
