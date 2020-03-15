package com.hrms.steps;


import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddEmpSteps extends CommonMethods {
	LoginPageElements login1;
	DashboardPageElements dash;
	 AddEmployeePageElements add;
	 
	@When("I enter valid username and password")
	public void i_enter_valid_username_and_password() {
		login1 = new LoginPageElements();
		sendText(login1.username, "Admin");
		sendText(login1.password, "Syntax@123");
	}

	@When("I click login button")
	public void i_click_login_button() {
		click(login1.loginBtn);
	}

	@Then("I successfully logged in")
	public void i_successfully_logged_in() {
System.out.println("passed");
	}

	@Then("I click PIM link")
	public void i_click_PIM_link() {
		dash=new DashboardPageElements();
		dash.navigateToAddEmployee();
		//click(dash.pim);
	}

	@Then("I click Add Employee link")
	public void i_click_Add_Employee_link() {
  //click(dash.addEmploye);
		dash.add();
	}

	@Then("I entered fullName and lastName")
	public void i_entered_fullName_and_lastName() throws InterruptedException {
		add=new AddEmployeePageElements();
		sendText(add.firstName,"Uyku");
	      sendText(add.lastName,"Yok");
	}

	@Then("I click save button")
	public void i_click_save_button() {
		add=new AddEmployeePageElements();
     click(add.Save);
	}

	@Then("I close browser")
	public void i_close_browser() {
		BaseClass.tearDown();
	}

}
