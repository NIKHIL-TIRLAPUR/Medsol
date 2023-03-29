package com.medsol.pageobject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.medsol.testcases.Baseclass;

public class Reports_operationreportspage extends Baseclass {

	WebDriver ldriver;
	public Reports_operationreportspage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//span[normalize-space()='Reports']")
    WebElement Reports;
	
	@FindBy(xpath="//a[normalize-space()='Operation Reports']")
    WebElement OperationReports;
	
	@FindBy(xpath="//a[normalize-space()='New Operation Report']")
    WebElement NewOperationReport;
	

	@FindBy(xpath="//span[@id='select2-operationCaseId-container']")
    WebElement selectcase;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement searchbox;
	
	
	@FindBy(xpath="//span[@id='select2-operationDoctorId-container']")
    WebElement selectdoctor;
	

	@FindBy(xpath="//input[@id='operationDate']")
    WebElement operationDate;
	
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/select[1]")
    WebElement operationMonth;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/span[2]")
    WebElement operationyeararrowDown;
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[2]/div[1]/span")
	List<WebElement> operationdates;
	
	@FindBy(xpath="//textarea[@id='description']")
    WebElement description;
	
	@FindBy(xpath="//button[@id='operationReportSave']")
    WebElement operationReportSave;
	
	

	public void clickonReports()
	{
		Reports.click();
	}
	
	public void clickonOperationReports()
	{
		OperationReports.click();
	}
	
	
	public void clickonNewOperationReport()
	{
		NewOperationReport.click();
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
	
	
	
	public void setoperationDate(String month,String date)
	{
		operationDate.click();
		operationyeararrowDown.click();
		//pharmacistYear.clear();
		//pharmacistYear.sendKeys(year);
		 Select month_drp= new Select(operationMonth);
         month_drp.selectByVisibleText(month);
         List<WebElement> alldate= operationdates;
       
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
	
	public void clickonoperationReportSave()
	{
		operationReportSave.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
