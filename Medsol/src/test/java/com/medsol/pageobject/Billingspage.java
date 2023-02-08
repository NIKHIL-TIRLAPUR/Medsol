package com.medsol.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Billingspage {

WebDriver ldriver;
	
	public Billingspage(WebDriver rdriver)
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
	
	
	
	
	
	
	
	
}
