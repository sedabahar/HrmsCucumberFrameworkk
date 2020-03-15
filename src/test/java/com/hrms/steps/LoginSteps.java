package com.hrms.steps;


import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetailsPageElement;
import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class LoginSteps extends CommonMethods {
	LoginPageElements login1;
	AddEmployeePageElements add;
	PersonalDetailsPageElement pdetails;
	DashboardPageElements dash;
	@Given("I open browser and navigated to the HRMS")
	public void i_open_browser_and_navigated_to_the_HRMS() {
		BaseClass.setUp();
	}

	@When("I enter valid username and valid password")
	public void i_enter_valid_username_and_valid_password() {
		login1 = new LoginPageElements();
		sendText(login1.username, "Admin");
		sendText(login1.password, "Syntax@123");
	}


	@When("I click on login button")
	public void i_click_on_login_button() {
		click(login1.loginBtn);
	}

	@When("I enter valid username and invalid")
	public void i_enter_valid_username_and_invalid() {
		login1 = new LoginPageElements();
		sendText(login1.username, "Admin");
		sendText(login1.password, "Syntax@12");
	}

	@When("I enter {string} and {string}")
	public void i_enter_and(String userName, String passwrd ) {
		login1 = new LoginPageElements();
		//sendText(login1.username, userName);
	driver.findElement(By.id("txtUsername")).sendKeys(userName);
		sendText(login1.password, passwrd );
		
	}

	@Then("I see {string}")
	public void i_see(String string) {
		login1 = new LoginPageElements();
		boolean error=login1.errorMsg.isDisplayed();
		Assert.assertTrue("Not displayed",error);

	}

	@Given("I open browser and navigate to HRMS")
	public void i_open_browser_and_navigate_to_HRMS() {
		BaseClass.setUp();
	}


@When("I enter employee detais")
public void i_enter_employee_detais(DataTable empDetails) throws InterruptedException {
	
	add=new AddEmployeePageElements();
	dash=new DashboardPageElements();
	click(dash.pim);
	Thread.sleep(2000);
	click(dash.addEmploye);
	
	
	List<Map<String ,String >>empDetailList=empDetails.asMaps();
	
	for(Map<String ,String >map:empDetailList) {
		sendText(add.firstName,map.get("FirsName"));
		sendText(add.middle,map.get("MiddleName"));
		sendText(add.lastName,map.get("LastName"));
		click(add.Save);
		
	}	
		

}
@When("I click Save")
public void i_click_Save() {
	  pdetails=new PersonalDetailsPageElement();
	    click(pdetails.edit_saveBtn);
}

	
	
	
	
	
	


@When("i enter employee details")
public void i_enter_employee_details(DataTable empDetails) {
	add=new AddEmployeePageElements();
	List<Map<String ,String >>empDetailList=empDetails.asMaps();
	
	for(Map<String ,String >map:empDetailList) {
	
		sendText(add.firstName,map.get("FirstName"));
		sendText(add.middle,map.get("Middle"));
		sendText(add.lastName,map.get("LastName"));
	
		
	}	
}

@When("I click on Edit")
public void i_click_on_Edit() {
    pdetails=new PersonalDetailsPageElement();
    click(pdetails.edit_saveBtn);
}


@Then("I am able to modify Employee Details")
public void i_am_able_to_modify_Employee_Details(DataTable modiftEmpDetails) throws InterruptedException {
	
	 pdetails=new PersonalDetailsPageElement();
	 
	List<Map<String, String>> details=	modiftEmpDetails.asMaps();
	
	for(Map<String, String> map:details) {
		
		sendText(pdetails.driverLicense,map.get("DeriverLisence"));
		
		sendText(pdetails.personal_txtLicExpDate,map.get("ExpirationDate"));
		
		sendText(pdetails.SIN,map.get("SIN"));
		
		sendText(pdetails.SSN,map.get("SSN"));
		
		 pdetails.selectGender(map.get("Gender"));
		 
		selectbySelected(pdetails.Nationalty,map.get("Nationality"));
		
		sendText(pdetails.Date_of_Birth,map.get("DateOfBirth"));
		
		click(pdetails.edit_saveBtn);
		
	}
	
	
	
}


	
	
@When("I click Edit")
public void i_click_Edit() {
	 pdetails=new PersonalDetailsPageElement();
	    click(pdetails.edit_saveBtn);
}
	
@When("I take a screenshot")
public void i_take_a_screenshot() {
	//takeScreenshot(("ScreenShots/HRMS/Login.pg"));
	//takeScreenshot("ScreenShots");
}



}
