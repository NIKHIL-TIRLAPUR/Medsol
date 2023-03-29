package com.medsol.pageobject;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.medsol.testcases.Baseclass;

public class Reports_birthreportspage extends Baseclass {

	WebDriver ldriver;
	public Reports_birthreportspage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//span[normalize-space()='Reports']")
    WebElement Reports;
	
	@FindBy(xpath="//a[normalize-space()='New Birth Report']")
    WebElement NewBirthReport;
	
	@FindBy(xpath="//span[@id='select2-birthCaseId-container']")
    WebElement selectcase;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement searchbox;
	
	
	@FindBy(xpath="//span[@id='select2-birthDoctorId-container']")
    WebElement selectdoctor;
	

	@FindBy(xpath="//input[@id='birthDate']")
    WebElement birthDate;
	
	
	@FindBy(xpath="//div[contains(@class,'flatpickr-calendar hasTime animate arrowTop arrowLeft open')]//select[contains(@aria-label,'Month')]")
    WebElement birthMonth;
	
	@FindBy(xpath="//div[contains(@class,'flatpickr-calendar hasTime animate arrowTop arrowLeft open')]//div[contains(@class,'flatpickr-months')]//span[contains(@class,'arrowDown')]")
    WebElement birthyeararrowDown;
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[2]/div[1]/span")
	List<WebElement> birthdates;
	
	@FindBy(xpath="//textarea[@id='description']")
    WebElement description;
	
	@FindBy(xpath="//button[@id='btnBirthSave']")
    WebElement btnBirthSave;
	
	
	public void clickonReports()
	{
		Reports.click();
	}
	
	public void clickonNewBirthReport()
	{
		NewBirthReport.click();
	}
	
	
	public void setselectcase(String group)
	{
		selectcase.click();
		searchbox.click();
		searchbox.sendKeys(group);
		searchbox.sendKeys(Keys.ENTER);
		
	}
	
	public void setselectdoctor(String group)
	{
		selectdoctor.click();
		searchbox.click();
		searchbox.sendKeys(group);
		searchbox.sendKeys(Keys.ENTER);
		
	}
	
	
	
	public void setbirthDate(String month,String date)
	{
		birthDate.click();
		birthyeararrowDown.click();
		//pharmacistYear.clear();
		//pharmacistYear.sendKeys(year);
		 Select month_drp= new Select(birthMonth);
         month_drp.selectByVisibleText(month);
         List<WebElement> alldate= birthdates;
       
         for(WebElement ele:alldate)

         {

                       String dt= ele.getText();

                       if(dt.equals(date))

                       {

                                     ele.click();

                                     break;

                       }

         }
	}
	
	
	public void setdescription(String pass)
	{
		description.click();
		description.sendKeys(pass);
	}
	
	public void clickonbtnBirthSave()
	{
		btnBirthSave.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
