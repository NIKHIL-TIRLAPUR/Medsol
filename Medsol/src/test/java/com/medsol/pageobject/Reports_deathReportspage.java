package com.medsol.pageobject;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.medsol.testcases.Baseclass;

public class Reports_deathReportspage extends Baseclass {

	WebDriver ldriver;
	public Reports_deathReportspage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//span[normalize-space()='Reports']")
    WebElement Reports;
	
	@FindBy(xpath="//a[normalize-space()='Death Reports']")
    WebElement DeathReports;
	
	@FindBy(xpath="//a[normalize-space()='New Death Report']")
    WebElement NewDeathReport;
	
	@FindBy(xpath="//span[@id='select2-deathCaseId-container']")
    WebElement selectcase;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement searchbox;
	
	
	@FindBy(xpath="//span[@id='select2-deathDoctorId-container']")
    WebElement selectdoctor;
	

	@FindBy(xpath="//input[@id='deathDate']")
    WebElement deathDate;
	
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/select[1]")
    WebElement deathMonth;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/span[2]")
    WebElement deathyeararrowDown;
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[2]/div[1]/span")
	List<WebElement> birthdates;
	
	@FindBy(xpath="//textarea[@id='description']")
    WebElement description;
	
	@FindBy(xpath="//button[@id='deathReportSave']")
    WebElement deathReportSave;
	
	
	public void clickonReports()
	{
		Reports.click();
	}
	
	public void clickonDeathReports()
	{
		DeathReports.click();
	}
	
	
	public void clickonNewDeathReport()
	{
		NewDeathReport.click();
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
	
	
	
	public void setdeathDate(String month,String date)
	{
		deathDate.click();
		deathyeararrowDown.click();
		//pharmacistYear.clear();
		//pharmacistYear.sendKeys(year);
		 Select month_drp= new Select(deathMonth);
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
	
	public void clickondeathReportSave()
	{
		deathReportSave.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
