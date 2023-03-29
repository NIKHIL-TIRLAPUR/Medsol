package com.medsol.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class FrontCms_aboutuspage extends Baseclass {

	WebDriver ldriver;
	public FrontCms_aboutuspage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//span[normalize-space()='Front CMS']")
    WebElement FrontCMS;
	
	@FindBy(xpath="//a[normalize-space()='About Us']")
    WebElement AboutUs;
	
	@FindBy(xpath="//input[@id='aboutUsTitle']")
    WebElement aboutUsTitle;
	
	@FindBy(xpath="//textarea[@id='aboutUsDes']")
    WebElement aboutUsDes;
	
	@FindBy(xpath="//textarea[@id='aboutUsMission']")
    WebElement aboutUsMission;
	
	@FindBy(xpath="//span[@title='Change about us image']//label//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement image;
	
	
	@FindBy(xpath="//input[@value='Save']")
    WebElement Save;
	
	public void clickonFrontCMS()
	{
		FrontCMS.click();
	}
	
	public void clickonAboutUs()
	{
		AboutUs.click();
	}
	
	public void setaboutUsTitle(String license)
	{
		aboutUsTitle.click();
		aboutUsTitle.clear();
		aboutUsTitle.sendKeys(license);
	}
	
	public void setaboutUsDes(String license)
	{
		aboutUsDes.click();
		aboutUsDes.clear();
		aboutUsDes.sendKeys(license);
	}
	
	public void setaboutUsMission(String license)
	{
		aboutUsMission.click();
		aboutUsMission.clear();
		aboutUsMission.sendKeys(license);
	}
	
	
	public void clickonimage()
	{
		image.click();
	}
	
	
	public void clickonSave()
	{
		Save.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
