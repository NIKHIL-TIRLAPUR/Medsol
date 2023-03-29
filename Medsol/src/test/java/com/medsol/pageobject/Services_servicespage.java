package com.medsol.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class Services_servicespage extends Baseclass{

	WebDriver ldriver;
	public Services_servicespage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[contains(@class,'aside-menu-title')][normalize-space()='Services']")
    WebElement Services;

	@FindBy(xpath="//a[normalize-space()='New Service']")
    WebElement NewService;
	
	@FindBy(xpath="//input[@id='name']")
    WebElement name;
	
	@FindBy(xpath="//input[@id='quantity']")
    WebElement quantity;
	
	@FindBy(xpath="//input[@id='rate']")
    WebElement rate;
	
	@FindBy(xpath="//textarea[@id='description']")
    WebElement description;
	
	@FindBy(xpath="//input[@name='status']")
    WebElement status;
	
	@FindBy(xpath="//input[@id='serviceBtnSave']")
    WebElement serviceBtnSave;
	
	@FindBy(xpath="//input[@name='search']")
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
	
	public void clickonNewService()
	{
		NewService.click();
	}
	
	public void setname(String nam)
	{
		name.click();
		name.sendKeys(nam);
	}
	
	public void setquantity(String quan)
	{
		quantity.click();
		quantity.sendKeys(quan);
	}
	
	public void setrate(String srate)
	{
		rate.click();
		rate.sendKeys(srate);
	}
	
	public void setdescription(String sdescription)
	{
		description.click();
		description.sendKeys(sdescription);
	}
	
	public void clickonstatus()
	{
		status.click();
	}
	
	public void clickonserviceBtnSave()
	{
		serviceBtnSave.click();
	}
	
	public void clickonsearchboxfordeleteoredit(String name)
	{
		searchboxfordeleteoredit.click();
		searchboxfordeleteoredit.sendKeys(name);
	}
	
	public void clickoneditbutton()
	{
		editbutton.click();
	}
	
	public void seteditname(String nam)
	{
		name.click();
		name.clear();
		name.sendKeys(nam);
	}
	
	public void seteditquantity(String quan)
	{
		quantity.click();
		quantity.clear();
		quantity.sendKeys(quan);
	}
	
	public void seteditrate(String srate)
	{
		rate.click();
		rate.clear();
		rate.sendKeys(srate);
	}
	
	public void seteditdescription(String sdescription)
	{
		description.click();
		description.clear();
		description.sendKeys(sdescription);
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
