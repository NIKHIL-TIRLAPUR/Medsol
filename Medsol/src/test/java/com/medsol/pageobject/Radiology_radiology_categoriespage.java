package com.medsol.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class Radiology_radiology_categoriespage extends Baseclass {

	
	WebDriver ldriver;
	public Radiology_radiology_categoriespage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Radiology']")
    WebElement Radiology;

	@FindBy(xpath="//a[normalize-space()='New Radiology Category']")
    WebElement NewRadiologyCategory;
	
	@FindBy(xpath="//input[@id='editRadiologyCategoryName']")
    WebElement editRadiologyCategoryName;
	
	@FindBy(xpath="//input[@id='radiologyCategoryName']")
    WebElement radiologyCategoryName;
	
	@FindBy(xpath="//button[@id='btnRadiologyCategorySave']")
    WebElement btnRadiologyCategorySave;
	
	@FindBy(xpath="//button[@id='btnRadiologyCategoryEditSave']")
    WebElement btnRadiologyCategoryEditSave;
	
	@FindBy(xpath="//input[@name='search']")
    WebElement search;
	
	@FindBy(xpath="//a[@title='Edit']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement editbutton;
	
	@FindBy(xpath="//a[@title='Delete']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
    WebElement yesdeletebutton;
	
	
	public void clickonRadiology()
	{
		Radiology.click();
	}
	
	public void clickonNewRadiologyCategory()
	{
		NewRadiologyCategory.click();
	}
	
	public void setradiologyCategoryName(String name)
	{
		radiologyCategoryName.click();
		radiologyCategoryName.sendKeys(name);
	}
	
	public void clickonbtnRadiologyCategorySave()
	{
		btnRadiologyCategorySave.click();
	}
	
	public void clickoneditbutton()
	{
		editbutton.click();
	}
	
	
	
	public void setnameinthesearchbox(String name)
	{
		search.click();
		search.sendKeys(name);
		search.sendKeys(Keys.ENTER);
	}
	
	public void seteditradiologyCategoryName(String ename)
	{
		editRadiologyCategoryName.click();
		editRadiologyCategoryName.clear();
		editRadiologyCategoryName.sendKeys(ename);
	}
	
	public void clickonbtnRadiologyCategoryEditSave()
	{
		btnRadiologyCategoryEditSave.click();
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
