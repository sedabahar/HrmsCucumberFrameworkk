package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class PersonalDetailsPageElement {
	
	@FindBy(id="empPic")
	public WebElement empPicture;
	
	@FindBy(xpath="//div[@id='profile-pic']/h1")
	public WebElement nameOnPicture;
	
	@FindBy(id="personal_txtEmployeeId")
    public WebElement empId;
	
	@FindBy(id="personal_optGender_1")
	public WebElement male;
	
	@FindBy(id="personal_optGender_2")
	public WebElement female;
	
	@FindBy(id="btnSave.")//(id="btnSave")
	public WebElement edit_saveBtn;
	
	@FindBy(id="personal_txtLicenNo")
	public WebElement driverLicense;
	
	@FindBy(id="personal_txtLicExpDate")
	public WebElement personal_txtLicExpDate;
	
	@FindBy(id="personal_txtSINNo")
	public WebElement SIN;
	
	@FindBy(id="personal_cmbNation")
	public WebElement Nationalty;
	
	
	@FindBy(id="personal_DOB")
	public WebElement Date_of_Birth;
	
	@FindBy(id="personal_txtNICNo")
	public WebElement SSN;		
	
	
	public PersonalDetailsPageElement() {
		PageFactory.initElements(BaseClass.driver,this);
	}
	
	
	 public void selectGender(String gender) {
			
			if(gender.equalsIgnoreCase("Male")) {
				male.click();
			}
			else if(gender.equalsIgnoreCase("Female")) {
				female.click();
			}
	 }

	    public void oylesine(String gender) {
	    	if(gender.equalsIgnoreCase("Male")) {
	    		
	    	}
	    }
	
	
}
