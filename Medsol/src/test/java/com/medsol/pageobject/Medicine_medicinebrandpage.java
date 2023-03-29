package com.medsol.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class Medicine_medicinebrandpage extends Baseclass  {
	
	WebDriver ldriver;
	public Medicine_medicinebrandpage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//span[contains(@class,'aside-menu-title')][normalize-space()='Medicines']")
    WebElement Medicines;
	
	@FindBy(xpath="//a[normalize-space()='Medicine Brands']")
    WebElement MedicineBrands;
	
	@FindBy(xpath="//a[normalize-space()='New Medicine Brand']")
    WebElement NewMedicineBrand;
	
	@FindBy(xpath="//input[@id='brandName']")
    WebElement brandName;
	
	@FindBy(xpath="//input[@id='brandPhoneNumber']")
    WebElement brandPhoneNumber;
	
	@FindBy(xpath="//input[@id='brandEmail']")
    WebElement brandEmail;
	
	@FindBy(xpath="//input[@id='brandSave']")
    WebElement brandSave;
	
	@FindBy(xpath="//tbody/tr[1]/td[4]/div[1]/a[1]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement editbutton;
	
	@FindBy(xpath="//input[@name='search']")
    WebElement search;
	
	@FindBy(xpath="//a[@title='Delete']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
    WebElement yesdeletebutton;
	
	
	
	public void clickonMedicines()
	{
		Medicines.click();
	}
	
	public void clickonMedicineBrands()
	{
		MedicineBrands.click();
	}
	
	public void clickonNewMedicineBrand()
	{
		NewMedicineBrand.click();
	}
	
	public void setbrandName(String name)
	{
		brandName.click();
		brandName.sendKeys(name);
	}
	
	public void setbrandPhoneNumber(String phonenum)
	{
		brandPhoneNumber.click();
		brandPhoneNumber.sendKeys(phonenum);
	}
	
	public void setbrandEmail(String email)
	{
		brandEmail.click();
		brandEmail.sendKeys(email);
	}
	
	
	public void clickonbrandSave()
	{
		brandSave.click();
	}
	
	public void clickoneditbutton()
	{
		editbutton.click();
	}
	
	public void seteditbrandName(String name)
	{
		brandName.click();
		brandName.clear();
		brandName.sendKeys(name);
	}
	
	public void seteditbrandPhoneNumber(String phonenum)
	{
		brandPhoneNumber.click();
		brandPhoneNumber.clear();
		brandPhoneNumber.sendKeys(phonenum);
	}
	
	public void seteditbrandEmail(String email)
	{
		brandEmail.click();
		brandEmail.clear();
		brandEmail.sendKeys(email);
	}
	
	public void setnameinsearchbox(String name)
	{
		search.click();
		search.sendKeys(name);
		search.sendKeys(Keys.ENTER);
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
