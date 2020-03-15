package com.hrms.API.steps.practice;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIdeleteEmployeSteps {
	   private static RequestSpecification request;
	    private static Response response;
	    
	
	//@Then("user validates employee deleted")
	public void user_validates_employee_deleted() {
	  
		delete();
		
		
	}



	public static void delete() {

		request =
				 given()
				   .param("employee_id","05388A" )
				   .header("Content-Type","application/json")
			      .header("Authorization",SyntaxAPIAuthenticationSteps.Token);

		 request.body(CommonMethods.readJson("/Users/mustafademirkiran/eclipse-workspace/HrmsCucumberFrameworkk/src/test/resources/JSONFiles/deleteEmp.json"));	
		
		 response = request.delete("http://18.232.148.34/syntaxapi/api/deleteEmployee.php");
	      System.out.println("Response is "+response.prettyPrint());
	}



	  
				
@Given("user calls delete Employee API")
public void user_calls_delete_Employee_API() {
    request =
            given()
        	.param("employee_id", "05388A")
           .header("Content-Type","application/json")
           .header("Authorization",SyntaxAPIAuthenticationSteps.Token);

	
}

@When("User retrieves response for delete EmployeeAPI")
public void user_retrieves_response_for_delete_EmployeeAPI() {
	
	System.out.println(request.log().all());
	response = request.delete("http://18.232.148.34/syntaxapi/api/deleteEmployee.php");
	

}

@Then("status code is {int} for delete EmployeeAPI")
public void status_code_is_for_delete_EmployeeAPI(Integer int1) {
	
	response.then().assertThat().statusCode(int1);
	
}

@Then("user validates deleted Employee")
public void user_validates_deleted_Employee() {
	
System.out.println("Response is "+response.prettyPrint());//onemli creating employee showing
response.then().body("employee[0].employee_id", equalTo("05388A"));
JsonPath jsonPathEvaluator = response.jsonPath();

String actualyEmployeeID = jsonPathEvaluator.get("employee[0].employee_id");
System.out.println("Actual Employee ID is:" + actualyEmployeeID);

System.out.println("EMPLOYEE ID's MATCH");



}
	
	
	
	
	
	
}
