package com.hrms.utils;

public class Constants  {

	public static final String HRMS_URL="http://166.62.36.207/Syntax_HRM/symfony/web/index.php/auth/login";
	
	
	public static final String BROWSER="chrome";
	
	//specify path to chrome & gecko driver
	public static final String USERNAME="Admin";
	
	public static final String CHROME_DRIVER_PATH=System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver";
	
	public static final String GECKO_DRIVER_PATH=System.getProperty("user.dir")+"/src/test/resources/drivers/geckoriver";
	
	public static final int PAGE_LOAD_TIME=30;
	
	public static final int IMPLICIT_LOAD_TIME=30;


	public static final long EXPLICIT_LOAD_TIME = 30;
	
public static final String CREDENTIALS_FILEPATH="/Users/mustafademirkiran/eclipse-workspace/HrmsCucumberFrameworkk/src/test/resources/configs/Configuration.properties";

public static final String XL_DATA_FILEPATH=System.getProperty("user.dir")
+"/src/test/resources/testdata/HrmsTestData.xlsx";


public static final String SCREENSHOTS_FILEPATH=System.getProperty("user.dir")+"/target/screenshots/";


}
