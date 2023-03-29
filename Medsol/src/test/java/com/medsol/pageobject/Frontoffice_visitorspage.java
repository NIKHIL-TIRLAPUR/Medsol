package com.medsol.pageobject;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.medsol.testcases.Baseclass;

public class Frontoffice_visitorspage extends Baseclass 
{
	WebDriver ldriver;
	public Frontoffice_visitorspage (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/div[3]/ul[1]/li[13]/a[1]")
    WebElement frontoffice;
	
	@FindBy(xpath="//a[normalize-space()='Visitors']")
    WebElement frontofficevisitors;
	
	@FindBy(xpath="//a[@id='dropdownMenuButton']")
    WebElement frontofficevisitorsdropdown;
	
	@FindBy(xpath="//a[normalize-space()='New Visitor']")
    WebElement frontofficenewvisitor;
	
	@FindBy(xpath="//span[@id='select2-visitorPurpose-container']")
    WebElement selectpurposedropdown;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement txtsearchbox;
	
	
	
	@FindBy(xpath="//input[@name='name']")
    WebElement txtname;
	
	@FindBy(xpath="//input[@id='visitorPhoneNumber']")//input[@id='phoneNumber']
    WebElement txtphonenumber;
	
	@FindBy(xpath="//input[@id='visitorIdCard']")//input[@id='visitorIdCard']//input[@id='visitorIdCard']
    WebElement txtvisitorIdCard;
	
	@FindBy(xpath="//input[@id='no_of_visitor']")
    WebElement txtnumberofperson;
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[2]/div[1]")
    WebElement txtvisitordate;
	

	@FindBy(xpath="//input[@aria-label='Year']")
    WebElement txtyear;
	
	@FindBy(xpath="//select[@aria-label='Month']")//select[@aria-label='Month']
    WebElement txtmonth;
	
	@FindBy(xpath="//div[@class='dayContainer']/span")
    List<WebElement>  txtdate;
	
	
	
	@FindBy(xpath="//input[@id='visitorInTime']")
    WebElement txtintime;
	
	@FindBy(xpath="//body/div[3]/div[1]/div[1]/input[1]")
    WebElement txtintimehour;
	
	@FindBy(xpath="//body/div[3]/div[1]/div[1]/input[1]")
    WebElement txtintimeminute;
	
	@FindBy(xpath="//body/div[3]/div[1]/div[3]/input[1]")
    WebElement txtintimesecond;
	
	@FindBy(xpath="//body/div[3]/div[1]/span[3]")
    WebElement txtintimeamorpm;
	
	@FindBy(xpath="//input[@id='visitorOutTime']")
    WebElement txtouttime;
	
	@FindBy(xpath="//body/div[4]/div[1]/div[1]/input[1]")
    WebElement txtouttimehour;
	
	@FindBy(xpath="//body/div[4]/div[1]/div[2]/input[1]")
    WebElement txtouttimeminute;
	
	@FindBy(xpath="//body/div[4]/div[1]/div[3]/input[1]")
    WebElement txtouttimesecond;
	
	@FindBy(xpath="//body/div[4]/div[1]/span[3]")
    WebElement txtouttimeamorpm;
	
	
	@FindBy(xpath="//textarea[@id='visitorNote']")
    WebElement txtvisitornote;
	
	@FindBy(xpath="//span[@title='Attachment']//label//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement Attachment;
	
	@FindBy(xpath="//input[@id='visitorSave']")//input[@id='visitorSave']//input[@id='visitorSave']
    WebElement visitorSavebutton;
	
	public void clickonfrontoffice()
	{
		frontoffice.click();
	}
	
	
	public void clickonfrontofficevisitors()
	{
		frontofficevisitors.click();
	}
	
	public void clickonfrontofficevisitorsdropdown()
	{
		frontofficevisitorsdropdown.click();
	}
	
	public void clickonfrontofficenewvisitor()
	{
		frontofficenewvisitor.click();
	}
	
	public void setpurposedropdown(String purpose)
	{
		selectpurposedropdown.click();
		txtsearchbox.click();
		txtsearchbox.sendKeys(purpose);
		txtsearchbox.sendKeys(Keys.ENTER);
	}
	
	public void setnameofvisitor(String visitorname)
	{
		txtname.click();
		txtname.sendKeys(visitorname);
	}
	
	
	
	public void setphonenumber(String number)
	{
		txtphonenumber.click();
		txtphonenumber.sendKeys(number);
	}
	
	public void setvisitorIdCard(String id)
	{
		txtvisitorIdCard.click();
		txtvisitorIdCard.sendKeys(id);
	}
	
	public void setnumberofvisitor(String person)
	{
		txtnumberofperson.click();
		txtnumberofperson.sendKeys(person);
	}
	
	public void setdateofvisitors(String year,String month,String date)
	{
		txtvisitordate.click();
		txtyear.click();
		txtyear.sendKeys(year);
		 Select month_drp= new Select(txtmonth);
         month_drp.selectByVisibleText(month);
         List<WebElement> alldate= txtdate;
       
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
	
	
	public void setintimeofvisitor(String hour,String minute, String second)
	{
		txtintime.click();
		txtintimehour.click();
		txtintimehour.sendKeys(hour);
		txtintimeminute.click();
		txtintimeminute.sendKeys(minute);
		txtintimesecond.click();
		txtintimesecond.sendKeys(second);
		txtintimeamorpm.click();
		txtintime.sendKeys(Keys.ENTER);
	}
	
	
	public void setouttimeofvisitor(String hour,String minute, String second)
	{
		txtouttime.click();
		txtouttimehour.click();
		txtouttimehour.sendKeys(hour);
		txtouttimeminute.click();
		txtouttimeminute.sendKeys(minute);
		txtouttimesecond.click();
		txtouttimesecond.sendKeys(second);
		txtouttimeamorpm.click();
		txtouttime.sendKeys(Keys.ENTER);
	}
	
	
	public void setvisitornote(String note)
	{
		txtvisitornote.click();
		txtvisitornote.sendKeys(note);
	}
	
	public void clickonvisitorSavebutton()
	{
		visitorSavebutton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
