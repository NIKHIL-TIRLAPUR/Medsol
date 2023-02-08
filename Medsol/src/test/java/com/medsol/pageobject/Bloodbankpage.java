package com.medsol.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bloodbankpage  {
	
WebDriver ldriver;
	
	public Bloodbankpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Blood Banks']")
    WebElement Bloodbankbutton;
	
	@FindBy(xpath="//a[normalize-space()='New Blood Group']")
    WebElement Newbloodgroup;
	
	@FindBy(id="bloodGroup")
    WebElement txtbloodgroup;
	
	@FindBy(id="bloodBankRemainedBags")
    WebElement txtremainingbag;
	
	@FindBy(id="bloodBankSave")
    WebElement savebutton;
	
	public void clickonBloodbank()
	{
		Bloodbankbutton.click();
	}
	
	public void clickonNewbloodgroup()
	{
		Newbloodgroup.click();
	}
	
	public void setbloodgroup(String blood)
	{
		txtbloodgroup.sendKeys(blood);
	}
	
	public void setremainingbloodbag(String num)
	{
		txtremainingbag.sendKeys(num);
	}
	
	public void clickonsave()
	{
		savebutton.click();
	}
	
	
	
	
}
