package com.medsol.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class Settings_Modulessettingpage extends Baseclass{

	
	WebDriver ldriver;
	public Settings_Modulessettingpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Settings']")
    WebElement Settings;
	
	@FindBy(xpath="//a[normalize-space()='Modules Setting']")
    WebElement ModulesSetting;
	
	@FindBy(xpath="//input[@name='status' and contains(@type,'checkbox')]")
    WebElement statusbuttons;
	
	@FindBy(xpath="//input[@name='search']")
    WebElement search;
	
	@FindBy(xpath="//input[@name='status']")
    WebElement status;
	
	public void clickonSettings()
	{
		Settings.click();
	}
	
	public void clickonModulesSetting()
	{
		ModulesSetting.click();
	}
	
	
	public void setnamesearch(String name)
	{
		search.click();
		search.sendKeys(name);
		search.sendKeys(Keys.ENTER);
	}
	
	public void clickonstatus()
	{
		status.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
