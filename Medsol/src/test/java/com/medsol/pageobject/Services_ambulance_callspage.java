package com.medsol.pageobject;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.medsol.testcases.Baseclass;

public class Services_ambulance_callspage extends Baseclass {

	WebDriver ldriver;
	public Services_ambulance_callspage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[contains(@class,'aside-menu-title')][normalize-space()='Services']")
    WebElement Services;
	
	@FindBy(xpath="//a[normalize-space()='Ambulance Calls']")
    WebElement AmbulanceCalls;
	
	@FindBy(xpath="//a[normalize-space()='New Ambulance Call']")
    WebElement NewAmbulanceCall;
	
	@FindBy(xpath="//span[@id='select2-ambulanceCallPatientId-container']")//span[@id='select2-ambulanceCallPatientId-container']
    WebElement selectpatient;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement searchbox;
	
	@FindBy(xpath="//span[@id='select2-callAmbulanceId-container']")//span[@id='select2-callAmbulanceId-container']
    WebElement selectambulance;
	
	@FindBy(xpath="//input[@id='ambulanceCallDate']")//input[@id='ambulanceCallDate']
    WebElement ambulanceCallDate;
	
	@FindBy(xpath="//input[@id='amount']")
    WebElement amount;
	
	@FindBy(xpath="//input[@id='ambulanceCallSaveBtn']")
    WebElement ambulanceCallSaveBtn;
	
	@FindBy(xpath="//select[@aria-label='Month']")
    WebElement Month;
	
	@FindBy(xpath="//input[@aria-label='Year']")
    WebElement Year;
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[2]/div[1]/span")
	List<WebElement> txtdate;
	
	@FindBy(xpath="//input[@name='search']")//input[@name='search']
    WebElement searchboxfordeleteoredit;
	
	@FindBy(xpath="//a[@title='Edit']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement editbutton;
	
	@FindBy(xpath="//a[@title='Delete']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
    WebElement yesdeletebutton;
	
	
	
	
	public void clickonServices()
	{
		Services.click();
	}
	
	public void clickonAmbulanceCalls()
	{
		AmbulanceCalls.click();
	}
	
	public void clickonNewAmbulanceCall()
	{
		NewAmbulanceCall.click();
	}
	
	public void setselectpatient(String Type)
	{
		selectpatient.click();
		searchbox.click();
		searchbox.sendKeys(Type);
		searchbox.sendKeys(Keys.ENTER);
	}
	
	public void setselectambulance(String Type)
	{
		selectambulance.click();
		searchbox.click();
		searchbox.sendKeys(Type);
		searchbox.sendKeys(Keys.ENTER);
	}
	
	
	public void setambulanceCallDate(String year1,String month1,String date1)
	{
		ambulanceCallDate.click();
		Year.click();
		Year.sendKeys(year1);
		 Select month_drp= new Select(Month);
         month_drp.selectByVisibleText(month1);
         List<WebElement> alldate= txtdate;
       
         for(WebElement ele:alldate)

         {

                       String dt= ele.getText();

                       if(dt.equals(date1))

                       {

                                     ele.click();

                                     break;

                       }

         }
	}
	
	
	public void setamount(String license)
	{
		amount.click();
		amount.sendKeys(license);
	}
	
	public void clickonambulanceCallSaveBtn()
	{
		ambulanceCallSaveBtn.click();
	}
	
	
	public void seteditselectpatient(String Type)
	{
		selectpatient.click();
		searchbox.click();
		searchbox.sendKeys(Type);
		searchbox.sendKeys(Keys.ENTER);
	}
	
	public void seteditselectambulance(String Type)
	{
		selectambulance.click();
		searchbox.click();
		searchbox.sendKeys(Type);
		searchbox.sendKeys(Keys.ENTER);
	}
	
	
	public void seteditambulanceCallDate(String year2,String month2,String date2)
	{
		ambulanceCallDate.click();
		Year.click();
		Year.sendKeys(year2);
		 Select month_drp= new Select(Month);
         month_drp.selectByVisibleText(month2);
         List<WebElement> alldate= txtdate;
       
         for(WebElement ele:alldate)

         {

                       String dt= ele.getText();

                       if(dt.equals(date2))

                       {

                                     ele.click();

                                     break;

                       }

         }
	}
	
	
	public void seteditamount(String license)
	{
		amount.click();
		amount.clear();
		amount.sendKeys(license);
	}
	
	
	
	
	
	public void clickoneditbutton()
	{
		editbutton.click();
	}
	
	public void setnameinsearchboxfordeleteoredit(String name)
	{
		searchboxfordeleteoredit.click();
		searchboxfordeleteoredit.sendKeys(name);
	}
	
	public void clickondeletebutton()
	{
		deletebutton.click();
		
	}
	
	public void clickonyesdeletebutton()
	{
		yesdeletebutton.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
