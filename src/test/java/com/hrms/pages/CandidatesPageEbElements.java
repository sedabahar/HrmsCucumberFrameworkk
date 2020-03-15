package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hrms.utils.CommonMethods;

public class CandidatesPageEbElements extends CommonMethods{

	@FindBy(xpath="//h1[text()='Candidates']")
	public WebElement candidatesPageHeader;
	

	@FindBy(id="candidateSearch_candidateName")
	public WebElement candidatesName;
	
	@FindBy(id="candidateSearch_modeOfApplication")
	public WebElement methodOfApplication;
	
	@FindBy(id="candidateSearch_jobVacancy")
	public WebElement vacancy;
	
	@FindBy(id="candidateSearch_keywords")
	public WebElement keywords;
	
	@FindBy(id="candidateSearch_hiringManager")
	public WebElement hiringManager;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
