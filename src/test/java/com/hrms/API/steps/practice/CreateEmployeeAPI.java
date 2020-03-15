package com.hrms.API.steps.practice;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.equalTo;

import org.junit.Assert;

import com.hrms.utils.APIConstants;
import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import io.restassured.response.Response;

public class CreateEmployeeAPI {

    private static RequestSpecification request;
    private Response response;

    @Given("user calls createEmployee API")
    public void user_calls_createEmployee_API() {
    	
       request =
    		   
       given()
      .header("Content-Type","application/json")
      .header("Authorization",SyntaxAPIAuthenticationSteps.Token);
       request.body(CommonMethods.readJson(
   "/Users/mustafademirkiran/eclipse-workspace/HrmsCucumberFrameworkk/src/test/resources/JSONFiles/createEmployee.json"));
      
       
    }
   
    @Then("status code is {int}")
    public void status_code_is(Integer int1) {
       response.then().assertThat().statusCode(int1);
        
    	 //response = request.post("http://54.167.125.15/syntaxapi/api/createEmployee.php");
       
    }
    
    @Then("user validates employee is created")
    public void user_validates_employee_is_created() {
    	
        System.out.println("Response is "+response.prettyPrint());
    	
    }

@When("User retrieves response")
public void user_retrieves_response() {
	 response = request.post("http://54.167.125.15/syntaxapi/api/createEmployee.php");
	
	 
}








}