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

public class Reports_investigationreportspage extends Baseclass {

	
	WebDriver ldriver;
	public Reports_investigationreportspage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//span[normalize-space()='Reports']")
    WebElement Reports;
	
	@FindBy(xpath="//a[normalize-space()='Investigation Reports']")
    WebElement InvestigationReports;
	
	@FindBy(xpath="//a[normalize-space()='New Investigation Report']")
    WebElement NewInvestigationReport;
	
	@FindBy(xpath="//input[@id='title']")
    WebElement title;
	
	@FindBy(xpath="//span[@id='select2-investigationPatientId-container']")
    WebElement selectpatient;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement searchbox;
	
	@FindBy(xpath="//span[@id='select2-investigationDoctorId-container']")
    WebElement selectdoctor;
	
	@FindBy(xpath="//input[@id='investigationDate']")
    WebElement investigationDate;
	
	@FindBy(xpath="//select[@aria-label='Month']")
    WebElement investigationMonth;
	
	@FindBy(xpath="//input[@aria-label='Year']")
    WebElement investigationYear;
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[2]/div[1]/span")
	List<WebElement> investigationdates;
	
	@FindBy(xpath="//span[@title='Attachment']//label//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement Attachment;
	
	@FindBy(xpath="//span[@id='select2-investigationStatus-container']")
    WebElement investigationStatus;
	
	@FindBy(xpath="//textarea[@id='description']")
    WebElement description;
	
	@FindBy(xpath="//input[@value='Save']")
    WebElement Save;
	
	
	
	public void clickonReports()
	{
		Reports.click();
	}
	
	public void clickonInvestigationReports()
	{
		InvestigationReports.click();
	}
	
	
	public void clickonNewInvestigationReport()
	{
		NewInvestigationReport.click();
	}
	
	public void settitle(String pass)
	{
		title.click();
		title.sendKeys(pass);
	}
	
	public void setselectpatient(String group)
	{
		selectpatient.click();
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
	
	public void setinvestigationDate(String year,String month,String date)
	{
		investigationDate.click();
		investigationYear.click();
		investigationYear.clear();
		investigationYear.sendKeys(year);
		 Select month_drp= new Select(investigationMonth);
         month_drp.selectByVisibleText(month);
         List<WebElement> alldate= investigationdates;
       
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
	
	
	

	public void setAttachment(String pass)
	{
		Attachment.click();
		
	}
	
	public void setinvestigationStatus(String group)
	{
		investigationStatus.click();
		searchbox.click();
		searchbox.sendKeys(group);
		searchbox.sendKeys(Keys.ENTER);
		
	}
	
	public void setdescription(String pass)
	{
		description.click();
		description.sendKeys(pass);
	}
	
	
	public void clickonSave()
	{
		Save.click();
	}
	
	public void setattachment(String path) throws AWTException
	{
		Attachment.click();
		Robot rb= new Robot();
		rb.delay(2000);
		
		StringSelection ss= new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(2000);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(2000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
