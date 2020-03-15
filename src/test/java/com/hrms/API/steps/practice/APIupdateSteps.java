package com.hrms.API.steps.practice;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Assert;
import org.junit.Test;

import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class APIupdateSteps {

	   private static RequestSpecification request;
	    private static Response response;
	    
	
	//@Then("user validates employee status updated")
	public void user_validates_employee_status_updated() {
	
		update();
		
	}

    

	public static void update() {
	request =
				
				   given().header("Content-Type","application/json")
			      .header("Authorization",SyntaxAPIAuthenticationSteps.Token);
			       request.body(CommonMethods.readJson("/Users/mustafademirkiran/eclipse-workspace/HrmsCucumberFrameworkk/src/test/resources/JSONFiles/updateEmployee.json"));
			       
			      // response = request.post("http://18.232.148.34/syntaxapi/api/updateEmployee.php");
			       //System.out.println("Response is "+response.prettyPrint());

	}


@Given("user calls updateEmployee API")
public void user_calls_updateEmployee_API() {
	request =
			
			   given().header("Content-Type","application/json")
		      .header("Authorization",SyntaxAPIAuthenticationSteps.Token);
request.body(CommonMethods.readJson("/Users/mustafademirkiran/eclipse-workspace/HrmsCucumberFrameworkk/src/test/resources/JSONFiles/updateEmployee.json"));
//
}

@When("User retrieves response for updated Employee")
public void user_retrieves_response_for_updated_Employee() {

System.out.println(request.log().all());
	response = request.put("http://18.232.148.34/syntaxapi/api/updateEmployee.php");

}

@Then("status code is {int} for updated Employee")
public void status_code_is_for_updated_Employee(int int1) {
	
  response.then().assertThat().statusCode(int1);
}

@Then("user validates employee is updated")
public void user_validates_employee_is_updated() {
	System.out.println("Response is "+response.prettyPrint());//onemli creating employee showing
	
	
	response.then().body("employee[0].employee_id", equalTo("05587A"));
	JsonPath jsonPathEvaluator = response.jsonPath();
	
	String actualyEmployeeID = jsonPathEvaluator.get("employee[0].employee_id");
	System.out.println("Actual Employee ID is:" + actualyEmployeeID);
	
	System.out.println("EMPLOYEE ID's MATCH");

	   
	
}

 
	
}
