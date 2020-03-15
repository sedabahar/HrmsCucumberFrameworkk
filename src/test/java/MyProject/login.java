package MyProject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;





public class login extends CommonMethods {
	
	//setup("chrome","http://166.62.36.207/Syntax_HRM/symfony/web/index.php/pim/addEmployee");
	@FindBy(id="ohrmList_chkSelectRecord_9286")
	public WebElement chkSelectRecord;

	@FindBy(id="id(\"txtUsername\"")
	public WebElement name;
	
	
	@FindBy(id="lastName")
	public WebElement lastname;
	
	@FindBy(id="btnSave")
	public WebElement save;
	
	@FindBy(xpath="//*[@id=\\\"sidenav\\\"]/li[2]/a")
	public WebElement contactDetails;
	
	
	
	@FindBy(id="btnSave")
	public WebElement save1;
	
	@FindBy(id="contact_street1")
	public WebElement street;
	
	
	@FindBy(id="contact_city")
	public WebElement city;
	
	@FindBy(id="contact_city")
	public WebElement cit;
	
	
	@FindBy(id="contact_state")
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
	
	
	
	@FindBy(id="btnSave")
	public WebElement saveAll;
	
	
	public login(){
		
		PageFactory.initElements(BaseClass.driver,this);
		
	}
	
	
}
