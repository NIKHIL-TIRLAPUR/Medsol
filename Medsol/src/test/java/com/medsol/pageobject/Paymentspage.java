package com.medsol.pageobject;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Paymentspage {
	
WebDriver ldriver;
	
	public Paymentspage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}

	@FindBy(xpath="//body/div[1]/div[1]/div[1]/div[3]/ul[1]/li[5]/a[1]")
    WebElement billings;
	
	@FindBy(xpath="//a[normalize-space()='Payments']")
    WebElement Payments;
	
	@FindBy(xpath="//body/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/a[1]/*[1]")
    WebElement Actions;
	
	@FindBy(xpath="//a[contains(text(),'New Payment')]")
    WebElement Newpayment;
	
	@FindBy(xpath="//body/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/span[2]/span[1]/span[1]")
    WebElement selectaccount;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement txtselectaccount;
	
	@FindBy(id="paymentDate")
    WebElement paymentdate;
	
	@FindBy(xpath="//select[@aria-label='Month']")
    WebElement txtselectmonth;
	
	@FindBy(xpath="//input[@aria-label='Year']")
    WebElement txtselectyear;
	
	@FindBy(xpath="//div[@class='dayContainer']/span")
    List<WebElement> txtselectdate;
	
	
	@FindBy(id="amount")
    WebElement txtamount;
	
	@FindBy(xpath="//input[@id='pay_to']")
    WebElement txtpayto;
	
	@FindBy(xpath="//textarea[@id='description']")
    WebElement description;
	
	@FindBy(xpath="//input[@id='btnPaymentSave']")
    WebElement savebutton;
	
	
	public void clickonbillings()
	{
		billings.click();
	}
	
	public void clickonpayments()
	{
		Payments.click();
	}
	
	public void clickonActions()
	{
		Actions.click();
	}
	
	public void clickonNewpayment()
	{
		Newpayment.click();
	}
	
	public void clickonselectaccount()
	{
		selectaccount.click();
	}
	
	public void setselectaccount(String account)
	{
		txtselectaccount.sendKeys(account);
		txtselectaccount.sendKeys(Keys.ENTER);
	}
	
	public void setpaymentdate(String year,String month,String date)
	{
		paymentdate.click();
		txtselectyear.click();
		txtselectyear.sendKeys(year);
		 Select month_drp= new Select(txtselectmonth);
         month_drp.selectByVisibleText(month);
         List<WebElement> alldate= txtselectdate;
         
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
	
	public void setamounttobepaid(String amo)
	{
		txtamount.sendKeys(amo);
	}
	
	
	
	public void setpaytouser(String name)
	{
		txtpayto.sendKeys(name);
	}
	
	public void setdescription(String des)
	{
		description.sendKeys(des);
	}
	
	public void clickonsavebutton()
	{
		savebutton.click();
	}
}
