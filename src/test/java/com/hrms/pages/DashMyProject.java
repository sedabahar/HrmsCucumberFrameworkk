package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class DashMyProject extends CommonMethods{


	@FindBy(linkText = "Leave List")
	public WebElement leaveList;

	
	@FindBy(id=("menu_pim_viewPimModule"))
	public WebElement pim;
	
	@FindBy(id="menu_pim_addEmployee")
	public WebElement addEmploye;
	
	public void add() {
		click(addEmploye);
		
		}
	public void addCountry() {
		WebElement x=driver.findElement(By.id("contact_country"));
		Select select=new Select(x);
			select.selectByVisibleText("United States");
	}
	public void verfy() {
		boolean x=driver.findElement(By.xpath("//*[@id=\"sidenav\"]/li[2]/a")).isDisplayed();
		if(x) {
			System.out.println("employee added");
		}else {
			System.out.println("Not added");
		}
	}
	@FindBy(id=("firstName"))
	public WebElement firstName;
	
	@FindBy(id="lastName")
	public WebElement lastName;

@FindBy(id="menu_pim_viewEmployeeList")
	public WebElement EmployeeList;

@FindBy(id="empsearch_id")  
	public WebElement empsearch_id;

@FindBy(id="btnLogin")  
	public WebElement searchBtn;
	

	public void navigateToAddEmployee() {
		click(pim);
		
	}

	@FindBy(xpath="//*[@id='sidenav']/li[2]")
	public WebElement contactDetails;
	
	
	@FindBy(id="btnSave")
	public WebElement save1;
	
	@FindBy(id="contact_street1")
	public WebElement street;
	
	@FindBy(id="contact_emp_oth_email")
	public WebElement email;
	
	
	@FindBy(id="contact_city")
	public WebElement city;
	
	@FindBy(id="contact_city")
	public WebElement cit;
	
	@FindBy(id="contact_province")
	public WebElement state;

	
	 
   //select state on back side   change
	
    @FindBy(id="contact_province")
	public WebElement province;
	
	
    @FindBy(id="contact_emp_zipcode")
	public WebElement zipcode;
	
	//select country on back side   change
	
	@FindBy(id="contact_emp_hm_telephone")
	public WebElement hm_telephone;
	


	@FindBy(id="contact_emp_mobile")
	public WebElement emp_mobile;
	

	@FindBy(id="contact_emp_work_telephone")
	public WebElement work_telephone;
	
	@FindBy(id="contact_emp_oth_email")
	public WebElement oth_emai;
	

	@FindBy(xpath="//div[@id='divLogo']")
	public WebElement logo;
	
	@FindBy(id="logInPanelHeading")
	public WebElement  loginLabel;
	
	@FindBy(name="txtUsername")
	public WebElement username;
	
	@FindBy(css="input#txtPassword")
	public WebElement password;
	
	@FindBy(id="btnSave")
	public WebElement btnSave;
	
	//name css ile boyle yazilir
	@FindBy(css="input[name='Submit']")
	public WebElement loginBtn;
	
	@FindBy(id="spanMessage")
	public WebElement errorMsg;

	@FindBy(id="btnLogin")
	public WebElement login;

	@FindBy(id="btnSave")
	public WebElement saveAll;
	


public void clickPim() {

	click(pim);
}

	
public void navigateToLeaveList() {
	click(addEmploye);

}




	public DashMyProject() {
		PageFactory.initElements(BaseClass.driver,this);
	}
	
	
}
