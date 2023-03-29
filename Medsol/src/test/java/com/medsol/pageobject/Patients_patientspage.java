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

public class Patients_patientspage  extends Baseclass {

	WebDriver ldriver;
	public Patients_patientspage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//span[normalize-space()='Patients']")
    WebElement Patients;
	
	@FindBy(xpath="//a[@id='dropdownMenuButton']")
    WebElement dropdownMenuButton;
	
	@FindBy(xpath="//a[normalize-space()='New Patient']")
    WebElement NewPatient;
	
	@FindBy(xpath="//input[@id='patientFirstName']")
    WebElement patientFirstName;
	
	@FindBy(xpath="//input[@id='last_name']")
    WebElement last_name;
	
	@FindBy(xpath="//div[@class='form-group mb-5']//input[@id='email']")
    WebElement email;
	
	@FindBy(xpath="//input[@id='patientBirthDate']")
    WebElement patientBirthDate;
	
	@FindBy(xpath="//select[@aria-label='Month']")
    WebElement patientsMonth;
	
	@FindBy(xpath="//input[@aria-label='Year']")
    WebElement patientsYear;
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[2]/div[1]/span")
	List<WebElement> patientsdate;
	
	
	@FindBy(xpath="//input[@id='patientPhoneNumber']")
    WebElement patientPhoneNumber;
	
	@FindBy(xpath="//input[@id='patientFemale']")
    WebElement patientFemale;
	
	
	@FindBy(xpath="//span[@id='select2-patientBloodGroup-container']")
    WebElement selectbloodgroup;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement searchbox;
	
	@FindBy(xpath="//input[@id='password']")
    WebElement password;
	
	@FindBy(xpath="//input[@id='password_confirmation']")
    WebElement password_confirmation;
	
	@FindBy(xpath="//input[@id='address1']")
    WebElement address1;
	
	@FindBy(xpath="//input[@id='address2']")
    WebElement address2;
	
	@FindBy(xpath="//input[@id='city']")
    WebElement city;
	
	@FindBy(xpath="//input[@id='zip']")
    WebElement zip;
	
	@FindBy(xpath="//span[@title='Profile']//label//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement Profile;
	
	@FindBy(xpath="//input[@id='patientFacebookUrl']")
    WebElement patientFacebookUrl;
	
	@FindBy(xpath="//input[@id='patientTwitterUrl']")
    WebElement patientTwitterUrl;
	
	@FindBy(xpath="//input[@id='patientInstagramUrl']")
    WebElement patientInstagramUrl;
	
	@FindBy(xpath="//input[@id='patientLinkedInUrl']")
    WebElement patientLinkedInUrl;
	
	@FindBy(xpath="//input[@id='patientSave']")
    WebElement patientSave;
	
	

	public void clickonPatients()
	{
		Patients.click();
	}
	
	public void clickondropdownMenuButton()
	{
		dropdownMenuButton.click();
	}
	
	public void clickonNewPatient()
	{
		NewPatient.click();
	}
	
	
	
	public void setfirst_name(String fname)
	{
		patientFirstName.click();
		patientFirstName.sendKeys(fname);
	}
	
	public void setlast_name(String lname)
	{
		last_name.click();
		last_name.sendKeys(lname);	
	}
	
	
	public void setpatientsemail(String emails)
	{
		email.click();
		email.sendKeys(emails);
	}
	
	public void setpatientBirthDate(String year,String month,String date)
	{
		patientBirthDate.click();
		patientsYear.click();
		patientsYear.clear();
		patientsYear.sendKeys(year);
		 Select month_drp= new Select(patientsMonth);
         month_drp.selectByVisibleText(month);
         List<WebElement> alldate= patientsdate;
       
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
	

	public void setpatientPhoneNumber(String phonenumber)
	{
		patientPhoneNumber.click();
		patientPhoneNumber.sendKeys(phonenumber);
	}
	
	
	public void setselectbloodgroup(String group)
	{
		selectbloodgroup.click();
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
		patientFemale.click();
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
	
	public void setpatientTwitterUrl(String quali)
	{
		patientTwitterUrl.click();
		patientTwitterUrl.sendKeys(quali);
	}
	
	public void setpatientFacebookUrl(String quali)
	{
		patientFacebookUrl.click();
		patientFacebookUrl.sendKeys(quali);
	}
	
	public void setpatientInstagramUrl(String quali)
	{
		patientInstagramUrl.click();
		patientInstagramUrl.sendKeys(quali);
	}
	
	public void setpatientLinkedInUrl(String quali)
	{
		patientLinkedInUrl.click();
		patientLinkedInUrl.sendKeys(quali);
	}
	
	public void clickonSave()
	{
		patientSave.click();
	}
	
	public void setattachment(String path) throws AWTException
	{
		Profile.click();
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
