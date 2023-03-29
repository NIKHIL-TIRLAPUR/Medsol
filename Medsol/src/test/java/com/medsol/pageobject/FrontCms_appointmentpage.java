package com.medsol.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class FrontCms_appointmentpage extends Baseclass {

	WebDriver ldriver;
	public FrontCms_appointmentpage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//span[normalize-space()='Front CMS']")
    WebElement FrontCMS;
	
	@FindBy(xpath="//a[normalize-space()='Appointment']")
    WebElement Appointment;
	
	@FindBy(xpath="//input[@name='appointment_title']")
    WebElement appointment_title;
	
	@FindBy(xpath="//textarea[@name='appointment_description']")
    WebElement appointment_description;
	
	@FindBy(xpath="//input[@value='Save']")
    WebElement Save;
	
	public void clickonFrontCMS()
	{
		FrontCMS.click();
	}
	
	public void clickonAppointment()
	{
		Appointment.click();
	}
	
	public void setappointment_title(String license)
	{
		appointment_title.click();
		appointment_title.clear();
		appointment_title.sendKeys(license);
	}
	
	public void setappointment_description(String license)
	{
		appointment_description.click();
		appointment_description.clear();
		appointment_description.sendKeys(license);
	}
	
	
	public void clickonSave()
	{
		Save.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
