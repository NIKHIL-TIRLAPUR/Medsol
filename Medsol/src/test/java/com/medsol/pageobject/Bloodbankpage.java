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
	
	@FindBy(id="editBloodGroup")
    WebElement txteditbloodgroup;
	
	@FindBy(id="editBloodBankRemainedBags")
    WebElement txteditremainingbag;
	

	@FindBy(id="bloodBankRemainedBags")
    WebElement txtremainingbag;
	
	@FindBy(id="bloodBankSave")
    WebElement savebutton;
	
	@FindBy(id="editBloodBankSave")
    WebElement editsavebutton;
	
	@FindBy(xpath="//tbody/tr[1]/td[3]/div[1]/a[2]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
    WebElement yesdeletebutton;
	
	@FindBy(xpath="//tbody/tr[1]/td[3]/div[1]/a[1]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement editbutton;
	
	
	

	
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
	
	public void clickoneditsave()
	{
		editsavebutton.click();
	}
	
	public void clickonsave()
	{
		savebutton.click();
	}
	
	public void clickoneditbutton()
	{
		editbutton.click();
	}
	
	public void seteditbloodgroup(String editedgroup)
	{
		txteditbloodgroup.clear();
		txteditbloodgroup.sendKeys(editedgroup);
	}
	
	public void seteditremainingbloodbags(String editedbags)
	{
		txteditremainingbag.sendKeys(editedbags);
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
