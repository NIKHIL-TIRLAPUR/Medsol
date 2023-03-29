package com.medsol.pageobject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class Settings_Generalpage extends Baseclass{

	WebDriver ldriver;
	public Settings_Generalpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Settings']")
    WebElement Settings;
	

	@FindBy(xpath="//input[@id='app_name']")
    WebElement app_name;
	

	@FindBy(xpath="//input[@id='company_name']")
    WebElement company_name;
	
	@FindBy(xpath="//input[@id='createAccountantEmail']")
    WebElement Email;
	

	@FindBy(xpath="//input[@id='generalPhoneNumber']")
    WebElement generalPhoneNumber;
	
	
	@FindBy(xpath="//input[@id='hospital_from_day']")
    WebElement hospital_from_day;
	

	@FindBy(xpath="//input[@id='hospital_from_time']")
    WebElement hospital_from_time;
	

	@FindBy(xpath="//input[@id='hospital_address']")
    WebElement hospital_address;
	
	@FindBy(xpath="//span[@id='select2-generalCurrencyType-container']")
    WebElement selectcurrentcurrency;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement searchbox;

	@FindBy(xpath="//input[@id='countryPhone']")
    WebElement countryPhone;
	
	@FindBy(xpath="//div[contains(@class,'form-group mb-5 country-code')]//div[contains(@class,'iti__arrow')]")
    WebElement country_code;
	
	@FindBy(xpath="//li[@id='iti-0__item-is']//span[contains(@class,'iti__country-name')][normalize-space()='Iceland (Ísland)']")
    WebElement Iceland;

	@FindBy(xpath="//textarea[@id='about_us']")
    WebElement about_us;
	

	@FindBy(xpath="//span[@title='Change app logo']//label//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement applogo;
	

	@FindBy(xpath="//input[@id='generalFacebookUrl']")
    WebElement generalFacebookUrl;
	
	@FindBy(xpath="//input[@id='generalTwitterUrl']")
    WebElement generalTwitterUrl;
	

	@FindBy(xpath="//input[@id='generalInstagramUrl']")
    WebElement generalInstagramUrl;
	
	@FindBy(xpath="//input[@id='generalLinkedInUrl']")
    WebElement generalLinkedInUrl;
	
	@FindBy(xpath="//input[@value='Save']")
    WebElement Save;
	
	public void clickonSettings()
	{
		Settings.click();
	}
	
	public void setapp_name(String bname)
	{
		app_name.click();
		app_name.clear();
		app_name.sendKeys(bname);
	}
	
	public void setcompany_name(String bname)
	{
		company_name.click();
		company_name.clear();
		company_name.sendKeys(bname);
	}
	
	public void setEmail(String bname)
	{
		Email.click();
		Email.clear();
		Email.sendKeys(bname);
	}
	
	public void setgeneralPhoneNumber(String bname)
	{
		generalPhoneNumber.click();
		generalPhoneNumber.clear();
		generalPhoneNumber.sendKeys(bname);
	}
	
	public void sethospital_from_day(String bname)
	{
		hospital_from_day.click();
		hospital_from_day.clear();
		hospital_from_day.sendKeys(bname);
	}
	
	public void sethospital_from_time(String bname)
	{
		hospital_from_time.click();
		hospital_from_time.clear();
		hospital_from_time.sendKeys(bname);
	}
	
	public void sethospital_address(String bname)
	{
		hospital_address.click();
		hospital_address.clear();
		hospital_address.sendKeys(bname);
	}
	
	public void setselectcurrentcurrency(String group)
	{
		selectcurrentcurrency.click();
		searchbox.click();
		searchbox.sendKeys(group);
		searchbox.sendKeys(Keys.ENTER);
		
	}
	
	public void setcountry_code()
	{
		country_code.click();
		
	}
	
	public void clickoniceland()
	{
		Iceland.click();
		
	}
	
	public void setabout_us(String bname)
	{
		about_us.click();
		about_us.clear();
		about_us.sendKeys(bname);
	}
	
	public void setapplogo(String path) throws AWTException
	{
		applogo.click();
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
	
	
	public void setgeneralFacebookUrl(String bname)
	{
		generalFacebookUrl.click();
		generalFacebookUrl.clear();
		generalFacebookUrl.sendKeys(bname);
	}
	
	public void setgeneralTwitterUrl(String bname)
	{
		generalTwitterUrl.click();
		generalTwitterUrl.clear();
		generalTwitterUrl.sendKeys(bname);
	}
	
	public void setgeneralInstagramUrl(String bname)
	{
		generalInstagramUrl.click();
		generalInstagramUrl.clear();
		generalInstagramUrl.sendKeys(bname);
	}
	
	public void setgeneralLinkedInUrl(String bname)
	{
		generalLinkedInUrl.click();
		generalLinkedInUrl.clear();
		generalLinkedInUrl.sendKeys(bname);
	}
	
	public void clickonSave()
	{
		Save.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
