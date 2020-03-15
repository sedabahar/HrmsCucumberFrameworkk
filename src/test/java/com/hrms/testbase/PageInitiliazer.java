package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPageElements;

public class PageInitiliazer {
	
	protected static LoginPageElements login;
	protected static DashboardPageElements dashboard;
	protected static AddEmployeePageElements addEmp;
	
	public static void initializeAllPage() {
		login=new  LoginPageElements();
		dashboard=new DashboardPageElements ();
		addEmp=new AddEmployeePageElements();
	}
	

}
