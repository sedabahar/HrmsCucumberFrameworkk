package com.hrms.steps;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmployeeStep extends  CommonMethods{
	LoginPageElements login1;
	DashboardPageElements dash;
	 AddEmployeePageElements add;
	
	@Given("I open navigated to the HRMS")
	public void i_open_navigated_to_the_HRMS() {
	  BaseClass.setUp();
	}

	@When("I enter username and password")
	public void i_enter_username_and_password() {
		login1 = new LoginPageElements();
		sendText(login1.username, "Admin");
		sendText(login1.password, "Syntax@123");
	}

	@When("I click login")
	public void i_click_login() {
		click(login1.loginBtn);
	
	}

	@When("I click PIM")
	public void i_click_PIM() {
		dash=new DashboardPageElements();
		dash.navigateToAddEmployee();
		
	}

	@Then("I click Add Employee")
	public void i_click_Add_Employee() {
		dash.add();
	}

	@Then("I delete employe id")
	public void i_delete_employe_id() {
		add=new AddEmployeePageElements();
		sendText(add.firstName,"Huzurlu");
	      sendText(add.lastName,"Gunler");
	      driver.findElement(By.id("employeeId")).clear();
	   
	}

	@Then("I click save")
	public void i_click_save() {
		add=new AddEmployeePageElements();
	     click(add.Save);
	   
	}

	@Then("I see employee without employee and id is being added")
	public void i_see_employee_without_employee_and_id_is_being_added() {
	   boolean x= driver.findElement(By.id("personal_txtEmployeeId")).isDisplayed();
	   Assert.assertTrue(x);

}

@Then("I click checkbox")
public void i_click_checkbox() {
	 driver.findElement(By.id("chkLogin")).click();
}

@Then("I add userName, password and repassword")
public void i_add_userName_password_and_repassword() {
  driver.findElement(By.id("user_name")).sendKeys("selamlar");
  driver.findElement(By.id("user_password")).sendKeys("selamlar@2020!selam");
  driver.findElement(By.id("re_password")).sendKeys("selamlar@2020!selam");
  driver.findElement(By.id("btnSave")).submit();
}

@When("I add {string}, {string} ,and {string}")
public void i_add_and(String firstName, String middle, String lastName) {
add=new AddEmployeePageElements();
sendText(add.firstName,firstName);
sendText(add.middle,middle);
sendText(add.lastName,lastName);
click(add.Save);
if(firstName.equals(firstName)) {
	System.out.println(firstName+" "+middle+" "+lastName);
}
}
/*
 * 
	@When("I enter {string} and {string}")
	public void i_enter_and(String userN, String psw) {
		login1 = new LoginPageElements();
		sendText(login1.username, userN);
		sendText(login1.password, psw);
	}

	@Then("I see {string}")
	public void i_see(String exp) {
		login1 = new LoginPageElements();
		String act=login1.errorMsg.getText();
		Assert.assertEquals(act,exp);
		
	}


 * 
 * 
 * 
 */


}