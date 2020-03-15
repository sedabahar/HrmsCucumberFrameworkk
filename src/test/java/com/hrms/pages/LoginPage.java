package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.hrms.testbase.BaseClass;

public class LoginPage extends BaseClass{

	
	public WebElement username=driver.findElement(By.id("txtUsername"));
	public WebElement password=driver.findElement(By.id("txtpassword"));
	public WebElement loginButton=driver.findElement(By.id("btnLogin"));
	public WebElement errMsg=driver.findElement(By.id("spanMessage"));
	
	
	/*@Test   LOGINTEST
	public void login() {
		
		LoginPage login=new LoginPage();
		
		sendText(login.username, "Admin");
		sendText(login.password, "Hum@nhrm123");
		click(login.loginButton);
	}*/
	
	
	//commpnMETHODS
	/* public static void sendText(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }*/
	
	
	
	

}
