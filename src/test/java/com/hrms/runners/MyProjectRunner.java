package com.hrms.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/project.feature"
,glue="com/hrms/steps"
,dryRun=false
,tags= {"@smoke"}
		)

public class MyProjectRunner {
	
	
	
	

}
