package com.hrms.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import com.hrms.pages.DashMyProject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyProjectSteps extends DashMyProject{
	
	DashMyProject login;
	
	
	
	@Given("I am logged into HRMS")
	public void i_am_logged_into_HRMS() throws InterruptedException {
		login=new DashMyProject();
		sendText(login.username,"Admin");
		   sendText(login.password,"Syntax@123");
		   click(login.login);
		   Thread.sleep(3000);
		   click(login.pim);
		   Thread.sleep(3000);
		   click(login.addEmploye);
		
	}

	@Then("I add employee")
	public void i_add_employee() throws InterruptedException {
		login=new DashMyProject();
		login.add();
		Thread.sleep(2000);
		sendText(login.firstName,"Iamsohyu");
		sendText(login.lastName,"boredye");
		click(login.btnSave);
	}

	@Then("I verify it")
	public void i_verify_it() {
		login=new DashMyProject();
	  login.verfy();
	}

	@Given("I click on Contact Details")
	public void i_click_on_Contact_Details() {
		   click(login.contactDetails);
	}

	@When("click on edit button")
	public void click_on_edit_button() {
		click(login.save1);
	}

	@Then("enter address Street")
	public void enter_address_Street() {
	    sendText(login.street,"8309 old sonoma place");
	}

	@Then("enter City")
	public void enter_City() throws InterruptedException {
		 sendText(login.city,"Bristow");
		 Thread.sleep(1000);
	}

	@Then("enter State")
	public void enter_State() throws InterruptedException {
		sendText(login.state,"VA");
		Thread.sleep(1000);
	}

	@Then("enter Zip code")
	public void enter_Zip_code() throws InterruptedException {
		sendText(login.zipcode,"20136");
		Thread.sleep(1000);
	}

	@Then("add Country")
	public void add_Country() {
login.addCountry();
	}

	@Then("enter Home Telephone")
	public void enter_Home_Telephone() {
		sendText(login.hm_telephone,"5712520136");
	}

	@Then("enter WorkTelephone")
	public void enter_WorkTelephone() {
		sendText(login.work_telephone,"5712589936");
	}

	@Then("click on save button")
	public void click_on_save_button() {
		click(login.saveAll);
	}

	@Then("other email")
	public void other_email() {
		sendText(login.oth_emai,"seda@gmail");
	}


}
