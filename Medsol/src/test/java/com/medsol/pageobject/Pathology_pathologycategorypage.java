package com.medsol.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class Pathology_pathologycategorypage extends Baseclass {

	WebDriver ldriver;
	public Pathology_pathologycategorypage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Pathology']")
    WebElement Pathology;

	@FindBy(xpath="//a[normalize-space()='New Pathology Category']")
    WebElement NewPathologyCategory;
	
	@FindBy(xpath="//input[@id='pathologyCategoryName']")
    WebElement pathologyCategoryName;

	@FindBy(xpath="//button[@id='pathologyCategorySave']")
    WebElement pathologyCategorySave;
	
	@FindBy(xpath="//button[@id='editPathologyCategorySave']")
    WebElement editPathologyCategorySave;
	
	@FindBy(xpath="//input[@name='search']")
    WebElement search;
	
	@FindBy(xpath="//a[@title='Edit']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement editbutton;
	
	@FindBy(xpath="//input[@id='editPathologyCategoryName']")
    WebElement editPathologyCategoryName;
	
	@FindBy(xpath="//a[@title='Delete']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
    WebElement yesdeletebutton;
	
	
	public void clickonPathology()
	{
		Pathology.click();
	}
	
	public void clickonNewPathologyCategory()
	{
		NewPathologyCategory.click();
	}
	
	public void setpathologyCategoryName(String name)
	{
		pathologyCategoryName.click();
		pathologyCategoryName.sendKeys(name);
	}
	
	public void clickonpathologyCategorySave()
	{
		pathologyCategorySave.click();
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
	
	public void seteditPathologyCategoryName(String ename)
	{
		editPathologyCategoryName.click();
		editPathologyCategoryName.clear();
		editPathologyCategoryName.sendKeys(ename);
	}
	
	
	public void clickoneditPathologyCategorySave()
	{
		editPathologyCategorySave.click();
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
