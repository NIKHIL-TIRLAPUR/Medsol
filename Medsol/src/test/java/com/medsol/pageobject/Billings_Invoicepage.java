package com.medsol.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Billings_Invoicepage {

WebDriver ldriver;
	
	public Billings_Invoicepage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/div[3]/ul[1]/li[5]/a[1]")
    WebElement billings;
	
	@FindBy(xpath="//a[normalize-space()='Invoices']")
    WebElement invoice;
	
	@FindBy(xpath="//a[normalize-space()='New Invoice']")
    WebElement Newinvoice;
	
	@FindBy(xpath="//span[@aria-labelledby='select2-patient_id-container']")
    WebElement selectpatient;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement txtselectpatient;
	
	@FindBy(xpath="//input[@id='discount']")
    WebElement txtdiscount;
	
	@FindBy(xpath="//span[@aria-labelledby='select2-status-container']")
    WebElement selectstatusofbill;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement txtselectstatusofbill;
	
	@FindBy(xpath="//button[@id='addInvoiceItem']")
    WebElement Addbutton;
	
	@FindBy(xpath="//tbody/tr[1]/td[2]/span[1]/span[1]/span[1]")
    WebElement selectaccount;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement txtselectaccount;
	
	@FindBy(name="quantity[]")
    WebElement txtquantity;
	
	@FindBy(name="price[]")
    WebElement txtprice;
	
	@FindBy(xpath="//input[contains(@class,'btn btn-primary me-3')]")
    WebElement savebutton;
	
	@FindBy(xpath="//a[@title='Delete']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
    WebElement yesdeletebutton;
	
	public void clickonbillings()
	{
		billings.click();
	}
	
	public void clickoninvoice()
	{
		invoice.click();
	}
	
	public void clickonnewinvoice()
	{
		Newinvoice.click();
	}
	
	public void clickonselectpatient()
	{
		selectpatient.click();
	}
	
	public void clickontxtselectpatient(String patient)
	{
		txtselectpatient.sendKeys(patient);
		txtselectpatient.sendKeys(Keys.ENTER);
	}
	
	public void setdiscount(String dis)
	{
		txtdiscount.sendKeys(dis);
	}
	
	public void clickonselectstatusofbill()
	{
		selectstatusofbill.click();
	}
	
	public void clickontxtselectstatusofbill(String bill)
	{
		txtselectpatient.sendKeys(bill);
		txtselectpatient.sendKeys(Keys.ENTER);
	}
	
	public void clickonselectaccount()
	{
		selectaccount.click();
	}
	
	public void clickontxtselectaccount(String account)
	{
		txtselectaccount.sendKeys(account);
		txtselectaccount.sendKeys(Keys.ENTER);
	}
	
	public void setquantity(String qua)
	{
		txtquantity.sendKeys(qua);
	}
	
	public void setprice(String price)
	{
		txtprice.sendKeys(price);
	}
	
	public void clickonsave()
	{
		savebutton.click();
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
