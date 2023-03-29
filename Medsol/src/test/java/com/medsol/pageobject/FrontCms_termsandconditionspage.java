package com.medsol.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class FrontCms_termsandconditionspage extends Baseclass {

	
	WebDriver ldriver;
	public FrontCms_termsandconditionspage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//span[normalize-space()='Front CMS']")
    WebElement FrontCMS;
	
	@FindBy(xpath="//a[normalize-space()='Terms & Conditions']")
    WebElement TermsandConditions;
	
	@FindBy(xpath="//p[normalize-space()='terms_conditions']")
    WebElement terms_conditions;
	
	@FindBy(xpath="//div[contains(@class,'ql-editor ql-blank')]//p")
    WebElement editterms_conditions;
	
	
	
	@FindBy(xpath="//p[normalize-space()='privacy_policy']")
    WebElement privacy_policy;
	
	@FindBy(xpath="//div[contains(@data-placeholder,'Privacy Policy')]//p")
    WebElement editprivacy_policy;
	
	@FindBy(xpath="//input[@value='Save']")
    WebElement Save;
	
	
	public void clickonFrontCMS()
	{
		FrontCMS.click();
	}
	
	public void clickonTermsandConditions()
	{
		TermsandConditions.click();
	}
	
	public void setterms_conditions(String license)
	{
		terms_conditions.click();
		terms_conditions.clear();
		editterms_conditions.sendKeys(license);
	}
	
	public void setprivacy_policy(String license)
	{
		privacy_policy.click();
		privacy_policy.clear();
		editprivacy_policy.sendKeys(license);
	}
	
	public void clickonSave()
	{
		Save.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
