package com.hrms.API.steps.practice;

import static io.restassured.RestAssured.given;

import org.junit.Assert;

import com.hrms.utils.APIConstants;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.equalTo;

public class APIOneEmployee {
	
    private static RequestSpecification request;
    private Response response;
  
    @Given("user calls getoneEmployee API")
    public void user_calls_getoneEmployee_API() {
     	
        request =
        given()
    	.param("employee_id", "3536")
       .header("Content-Type","application/json")
       .header("Authorization",SyntaxAPIAuthenticationSteps.Token);
      


    }

    @When("User retrieves response for getOneEmployee API")
    public void user_retrieves_response_for_getOneEmployee_API() {
    	System.out.println(request.log().all());
    	response = request.get("http://18.232.148.34/syntaxapi/api/getOneEmployee.php");
	
    	
    }

    @Then("status code is {int} for getOneEmployee API")
    public void status_code_is_for_getOneEmployee_API(Integer int1) {
    	    	response.then().assertThat().statusCode(int1);

    	
    }

    @Then("user validates created employee exists")
    public void user_validates_created_employee_exists() {
    System.out.println("Response is "+response.prettyPrint());//onemli creating employee showing
    	
    	response.then().body("employee[0].employee_id", equalTo("3536"));
		//JsonPath jsonPathEvaluator = response.jsonPath();
		
		//String actualyEmployeeID = jsonPathEvaluator.get("employee[0].employee_id");
		//System.out.println("Actual Employee ID is:" + actualyEmployeeID);
		
	System.out.println("EMPLOYEE ID's MATCH");
    	   
    }
    
    

   
    
    

}