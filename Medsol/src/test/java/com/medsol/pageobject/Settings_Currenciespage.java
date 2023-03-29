package com.medsol.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class Settings_Currenciespage extends Baseclass{

	WebDriver ldriver;
	public Settings_Currenciespage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Settings']")
    WebElement Settings;
	
	@FindBy(xpath="//a[normalize-space()='Currencies']")
    WebElement Currencies;
	
	@FindBy(xpath="//a[normalize-space()='New Currency']")
    WebElement NewCurrency;
	
	@FindBy(xpath="//input[@id='currencyName']")
    WebElement currencyName;
	
	@FindBy(xpath="//input[@id='editCurrencyName']")
    WebElement editCurrencyName;
	
	@FindBy(xpath="//input[@id='currencyCode']")
    WebElement currencyCode;
	
	@FindBy(xpath="//input[@id='editCurrencyIcon']")
    WebElement editCurrencyIcon;
	
	@FindBy(xpath="//input[@id='currencyIcon']")
    WebElement currencyIcon;
	
	@FindBy(xpath="//input[@id='editCurrencyCode']")
    WebElement editCurrencyCode;
	
	
	@FindBy(xpath="//button[@id='currencySave']")
    WebElement currencySave;
	
	@FindBy(xpath="//button[@id='editCurrencySaveBtn']")
    WebElement editcurrencySave;
	
	@FindBy(xpath="//a[@title='Edit']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement editbutton;
	
	@FindBy(xpath="//input[@name='search']")
    WebElement searchboxfordeleteoredit;
	
	@FindBy(xpath="//a[@title='Delete']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
    WebElement yesdeletebutton;
	
	
	public void clickonSettings()
	{
		Settings.click();
	}
	
	public void clickonCurrencies()
	{
		Currencies.click();
	}
	
	public void clickonNewCurrency()
	{
		NewCurrency.click();
	}
	
	
	public void setcurrencyName(String name)
	{
		currencyName.click();
		currencyName.sendKeys(name);
		
	}
	
	public void setcurrencyCode(String name)
	{
		currencyCode.click();
		currencyCode.sendKeys(name);
		
	}
	
	public void setcurrencyIcon(String name)
	{
		currencyIcon.click();
		currencyIcon.sendKeys(name);
		
	}
	
	public void clickoncurrencySave()
	{
		currencySave.click();
	}
	
	public void clickoneditbutton()
	{
		editbutton.click();
	}
	
	
	public void seteditCurrencyName(String name)
	{
		editCurrencyName.click();
		editCurrencyName.clear();
		editCurrencyName.sendKeys(name);
		
	}
	
	public void seteditCurrencyIcon(String name)
	{
		editCurrencyIcon.click();
		editCurrencyIcon.clear();
		editCurrencyIcon.sendKeys(name);
		
	}
	
	public void seteditCurrencyCode(String name)
	{
		editCurrencyCode.click();
		editCurrencyCode.clear();
		editCurrencyCode.sendKeys(name);
		
	}
	
	public void clickoneditcurrencySave()
	{
		editcurrencySave.click();
	}

	public void clickonsearchboxfordeleteoredit(String name)
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
