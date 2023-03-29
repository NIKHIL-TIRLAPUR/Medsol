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

public class Pharmacistspage extends Baseclass {

	WebDriver ldriver;
	public Pharmacistspage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//span[normalize-space()='Pharmacists']")
    WebElement Pharmacists;
	
	@FindBy(xpath="//a[@id='dropdownMenuButton']")
    WebElement dropdownMenuButton;
	
	@FindBy(xpath="//a[normalize-space()='New Pharmacist']")
    WebElement NewPharmacist;
	
	@FindBy(xpath="//input[@id='first_name']")
    WebElement first_name;
	
	@FindBy(xpath="//input[@id='last_name']")
    WebElement last_name;
	
	@FindBy(xpath="//input[@id='pharmacistEmail']")
    WebElement pharmacistEmail;
	
	@FindBy(xpath="//input[@id='designation']")
    WebElement designation;
	
	@FindBy(xpath="//input[@id='pharmacistPhoneNumber']")
    WebElement pharmacistPhoneNumber;
	
	@FindBy(xpath="//input[@id='qualification']")
    WebElement qualification;
	
	@FindBy(xpath="//input[@id='pharmacistBirthDate']")
    WebElement pharmacistBirthDate;
	
	@FindBy(xpath="//input[@aria-label='Year']")
    WebElement pharmacistYear;
	
	@FindBy(xpath="//select[@aria-label='Month']")
    WebElement pharmacistMonth;
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[2]/div[1]/span")
	List<WebElement> pharmacistdate;
	
	@FindBy(xpath="//span[@id='select2-pharmacistBloodGroup-container']")
    WebElement pharmacistBloodGroup;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement searchbox;
	
	@FindBy(xpath="//input[@id='password']")
    WebElement password;
	
	@FindBy(xpath="//input[@id='password_confirmation']")
    WebElement password_confirmation;
	
	@FindBy(xpath="//input[@id='pharmacistGenderFemale']")
    WebElement pharmacistGenderFemale;
	
	@FindBy(xpath="//input[@id='pharmacistGenderMale']")
    WebElement pharmacistGenderMale;
	
	@FindBy(xpath="//input[@name='status']")
    WebElement status;
	
	@FindBy(xpath="//span[@title='Profile']//label//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement Profile;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[14]/div[2]/div[1]/input[1]")//input[@id='address1']
    WebElement address1;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[14]/div[3]/div[1]/input[1]")
    WebElement address2;
	
	@FindBy(xpath="//input[@id='city']")
    WebElement city;
	
	@FindBy(xpath="//input[@id='zip']")
    WebElement zip;
	
	@FindBy(xpath="//input[@value='Save']")
    WebElement Save;
	
	public void clickonPharmacists()
	{
		Pharmacists.click();
	}
	
	public void clickondropdownMenuButton()
	{
		dropdownMenuButton.click();
	}
	
	public void clickonNewPharmacist()
	{
		NewPharmacist.click();
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
	
	
	public void setpharmacistEmail(String email)
	{
		pharmacistEmail.click();
		pharmacistEmail.sendKeys(email);
	}
	
	public void setdesignation(String desi)
	{
		designation.click();
		designation.sendKeys(desi);
	}
	
	public void setpharmacistPhoneNumber(String phonenumber)
	{
		pharmacistPhoneNumber.click();
		pharmacistPhoneNumber.sendKeys(phonenumber);
	}
	
	public void setqualification(String quali)
	{
		qualification.click();
		qualification.sendKeys(quali);
	}
	
	public void setpharmacistBirthDate(String year,String month,String date)
	{
		pharmacistBirthDate.click();
		pharmacistYear.click();
		pharmacistYear.clear();
		pharmacistYear.sendKeys(year);
		 Select month_drp= new Select(pharmacistMonth);
         month_drp.selectByVisibleText(month);
         List<WebElement> alldate= pharmacistdate;
       
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
	
	
	public void setpharmacistBloodGroup(String group)
	{
		pharmacistBloodGroup.click();
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
		pharmacistGenderFemale.click();
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
