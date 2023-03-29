package com.medsol.pageobject;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.medsol.testcases.Baseclass;

public class Patients_casehandlerspage extends Baseclass{

	WebDriver ldriver;
	public Patients_casehandlerspage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//span[normalize-space()='Patients']")
    WebElement Patients;
	
	@FindBy(xpath="//a[normalize-space()='Case Handlers']")
    WebElement CaseHandlers;
	
	@FindBy(xpath="//a[@id='dropdownMenuButton']")
    WebElement dropdownMenuButton;
	
	@FindBy(xpath="//a[normalize-space()='New Case Handler']")
    WebElement NewCaseHandler;
	
	@FindBy(xpath="//input[@id='first_name']")
    WebElement first_name;
	
	@FindBy(xpath="//input[@id='last_name']")
    WebElement last_name;
	
	@FindBy(xpath="//input[@id='caseHandlerEmail']")
    WebElement caseHandlerEmail;
	
	@FindBy(xpath="//input[@id='designation']")
    WebElement designation;
	
	@FindBy(xpath="//input[@id='caseHandlerPhoneNumber']")
    WebElement caseHandlerPhoneNumber;
	
	@FindBy(xpath="//input[@id='qualification']")
    WebElement qualification;
	
	@FindBy(xpath="//input[@id='caseHandlerBirthDate']")
    WebElement caseHandlerBirthDate;
	
	@FindBy(xpath="//input[@aria-label='Year']")
    WebElement caseHandlerYear;
	
	@FindBy(xpath="//select[@aria-label='Month']")
    WebElement caseHandlerMonth;
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[2]/div[1]/span")
	List<WebElement> caseHandlerdate;
	
	@FindBy(xpath="//span[@id='select2-caseHandlerBloodGroup-container']")
    WebElement caseHandlerBloodGroup;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement searchbox;
	
	@FindBy(xpath="//input[@id='password']")
    WebElement password;
	
	@FindBy(xpath="//input[@id='password_confirmation']")
    WebElement password_confirmation;
	
	@FindBy(xpath="//input[@id='caseHandlerFemale']")
    WebElement caseHandlerFemale;
	
	@FindBy(xpath="//input[@id='caseHandlerMale']")
    WebElement caseHandlerMale;
	
	@FindBy(xpath="//input[@name='status']")
    WebElement status;
	
	@FindBy(xpath="//span[@title='Profile']//label//*[name()='svg']")
    WebElement Profile;
	
	@FindBy(xpath="//input[@id='address1']")//input[@id='address1']
    WebElement address1;
	
	@FindBy(xpath="//input[@id='address2']")
    WebElement address2;
	
	@FindBy(xpath="//input[@id='city']")
    WebElement city;
	
	@FindBy(xpath="//input[@id='zip']")
    WebElement zip;
	
	@FindBy(xpath="//input[@value='Save']")
    WebElement Save;
	
	public void clickonPatients()
	{
		Patients.click();
	}
	
	public void clickonCaseHandlers()
	{
		CaseHandlers.click();
	}
	
	public void clickondropdownMenuButton()
	{
		dropdownMenuButton.click();
	}
	
	public void clickonNewCaseHandler()
	{
		NewCaseHandler.click();
	}
	
	public void setfirst_name(String fname)
	{
		first_name.click();
		first_name.sendKeys(fname);
	}
	
	public void setlast_name(String lname)
	{
		last_name.click();
		last_name.sendKeys(lname);	
	}
	
	
	public void setcaseHandlerEmail(String email)
	{
		caseHandlerEmail.click();
		caseHandlerEmail.sendKeys(email);
	}
	
	public void setdesignation(String desi)
	{
		designation.click();
		designation.sendKeys(desi);
	}
	
	public void setcaseHandlerPhoneNumber(String phonenumber)
	{
		caseHandlerPhoneNumber.click();
		caseHandlerPhoneNumber.sendKeys(phonenumber);
	}
	
	public void setqualification(String quali)
	{
		qualification.click();
		qualification.sendKeys(quali);
	}
	
	public void setcaseHandlerBirthDate(String year,String month,String date)
	{
		caseHandlerBirthDate.click();
		caseHandlerYear.click();
		caseHandlerYear.clear();
		caseHandlerYear.sendKeys(year);
		 Select month_drp= new Select(caseHandlerMonth);
         month_drp.selectByVisibleText(month);
         List<WebElement> alldate= caseHandlerdate;
       
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
	
	
	public void setcaseHandlerBloodGroup(String group)
	{
		caseHandlerBloodGroup.click();
		searchbox.click();
		searchbox.sendKeys(group);
		searchbox.sendKeys(Keys.ENTER);
		
	}

	public void setpassword(String pass)
	{
		password.click();
		password.sendKeys(pass);
	}
	
	public void setpassword_confirmation(String cpass)
	{
		password_confirmation.click();
		password_confirmation.sendKeys(cpass);
	}
	
	
	public void setgender()
	{
		caseHandlerFemale.click();
	}
	
	public void setaddress1(String ad1)
	{
		address1.click();
		address1.sendKeys(ad1);
	}
	
	
	public void setaddress2(String ad2)
	{
		address2.click();
		address2.sendKeys(ad2);
	}
	
	
	public void setcity(String cty)
	{
		city.click();
		city.sendKeys(cty);
	}
	
	public void setzip(String zp)
	{
		zip.click();
		zip.sendKeys(zp);
	}
	
	
	public void clickonSave()
	{
		Save.click();
	}
	
	
	
	public void clickonstatus()
	{
		status.click();
	}
	
	
	
	
	
	
	
	
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

