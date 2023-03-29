package com.medsol.pageobject;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.medsol.testcases.Baseclass;

public class Patients_casespage extends Baseclass {
	
	WebDriver ldriver;
	public Patients_casespage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}

	
	@FindBy(xpath="//span[normalize-space()='Patients']")
    WebElement Patients;
	
	@FindBy(xpath="//a[normalize-space()='Cases']")
    WebElement Cases;
	
	@FindBy(xpath="//a[normalize-space()='New Case']")
    WebElement NewCase;
	
	@FindBy(xpath="//span[@id='select2-casePatientId-container']")
    WebElement selectPatient;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement searchbox;
	
	@FindBy(xpath="//span[@id='select2-caseDoctorId-container']")
    WebElement selectdoctor;
	
	@FindBy(xpath="//input[@id='caseDate']")
    WebElement caseDate;
	
	@FindBy(xpath="//select[@aria-label='Month']")
    WebElement caseMonth;
	
	@FindBy(xpath="//input[@aria-label='Year']")
    WebElement caseYear;
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[2]/div[1]/span")
	List<WebElement> casedates;
	
	@FindBy(xpath="//input[@id='casePhoneNumber']")
    WebElement casePhoneNumber;
	
	@FindBy(xpath="//input[@id='fee']")
    WebElement casefee;
	
	@FindBy(xpath="//textarea[@id='description']")
    WebElement casedescription;
	
	@FindBy(xpath="//input[@name='status']")
    WebElement status;
	
	@FindBy(xpath="//input[@id='saveCaseBtn']")
    WebElement saveCaseBtn;
	
	public void clickonPatients()
	{
		Patients.click();
	}
	
	public void clickonCases()
	{
		Cases.click();
	}
	
	public void clickonNewCase()
	{
		NewCase.click();
	}
	
	public void setselectPatient(String group)
	{
		selectPatient.click();
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
	
	
	
	public void setcaseDate(String year,String month,String date)
	{
		caseDate.click();
		caseYear.click();
		caseYear.clear();
		caseYear.sendKeys(year);
		 Select month_drp= new Select(caseMonth);
         month_drp.selectByVisibleText(month);
         List<WebElement> alldate= casedates;
       
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
	
	
	
	public void setcasePhoneNumber(String phonenumber)
	{
		casePhoneNumber.click();
		casePhoneNumber.sendKeys(phonenumber);
	}
	
	
	public void setcasefee(String phonenumber)
	{
		casefee.click();
		casefee.sendKeys(phonenumber);
	}
	
	public void clickonstatus()
	{
		status.click();
	}
	
	public void setcasedescription(String phonenumber)
	{
		casedescription.click();
		casedescription.sendKeys(phonenumber);
	}
	
	
	public void clickonsave()
	{
		saveCaseBtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
