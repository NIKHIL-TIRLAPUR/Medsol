package com.medsol.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Billings_accountpage {

WebDriver ldriver;
	
	public Billings_accountpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/div[3]/ul[1]/li[5]/a[1]")
    WebElement billings;
	
	@FindBy(xpath="//a[normalize-space()='New Account']")
    WebElement newaccount;
	
	@FindBy(xpath="//input[@id='name']")
    WebElement txtaccount;
	
	@FindBy(xpath="//textarea[@id='description']")
    WebElement txtdescription;
	
	@FindBy(xpath="//input[@id='createDebitAccount']")
    WebElement accounttype;
	
	@FindBy(xpath="//button[@id='btnSave']")
    WebElement savebutton1;
	
	@FindBy(xpath="//tbody/tr[1]/td[4]/a[2]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
    WebElement yesdeletebutton;
	
	@FindBy(xpath="//tbody/tr[1]/td[4]/a[1]//*[name()='svg']")
    WebElement editbutton;
	
	@FindBy(id="editName")
    WebElement editname;
	
	@FindBy(id="editDescription")
    WebElement editdescription;
	
	public void clickonbillings()
	{
		billings.click();
	}
	
	public void clickonnewaccount()
	{
		newaccount.click();
	}
	
	public void setaccount(String name)
	{
		txtaccount.sendKeys(name);
	}
	
	public void setdescription(String des)
	{
		txtdescription.sendKeys(des);
	}
	
	public void setaccounttype()
	{
		accounttype.click();
	}
	
	public void clickonsavebutton()
	{
		savebutton1.click();
	}	
	
	public void clickondeletebutton()
	{
		deletebutton.click();
	}	
	
	public void clickonyesdeletebutton()
	{
		yesdeletebutton.click();
	}	
	
	public void clickoneidtbutton()
	{
		editbutton.click();
	}	
	
	public void setchangedbillingname(String changedbillingname)
	{
		editname.clear();
		editname.sendKeys("changedbillingname");
	}	

	public void setchangedbillingdescription(String changedbillingdescription)
	{
		editdescription.clear();
		editdescription.sendKeys("changedbillingdescription");
	}	
	
}
