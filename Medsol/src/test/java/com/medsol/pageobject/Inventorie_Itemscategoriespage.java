package com.medsol.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class Inventorie_Itemscategoriespage extends Baseclass {
	
	WebDriver ldriver;
	public Inventorie_Itemscategoriespage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Inventories']")
    WebElement Inventories;
	
	@FindBy(xpath="//a[normalize-space()='New Item Category']")
    WebElement NewItemCategory;
	
	@FindBy(xpath="//input[@id='itemCategoryName']")
    WebElement itemCategoryName;
	
	@FindBy(xpath="//button[@id='itemCategorySave']")
    WebElement itemCategorySave;
	
	@FindBy(xpath="//a[@title='Edit']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement editbutton;
	
	@FindBy(xpath="//input[@id='editItemCategoryName']")
    WebElement editItemCategoryName;

	@FindBy(xpath="//button[@id='editItemCategorySave']")
    WebElement editItemCategorySave;
	
	@FindBy(xpath="//input[@name='search']")
    WebElement searchbox;
	
	@FindBy(xpath="//a[@title='Delete']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
    WebElement yesdeletebutton;
	
	
	public void clickonInventories()
	{
		Inventories.click();
	}
	
	public void clickonNewItemCategory()
	{
		NewItemCategory.click();
	}
	
	public void setitemCategoryName(String item)
	{
		itemCategoryName.click();
		itemCategoryName.sendKeys(item);
	}
	
	public void clickonitemCategorySave()
	{
		itemCategorySave.click();
	}
	
	public void clickoneditbutton()
	{
		editbutton.click();
	}
	
	public void seteditItemCategoryName(String eitem)
	{
		editItemCategoryName.click();
		editItemCategoryName.clear();
		editItemCategoryName.sendKeys(eitem);
	}
	
	public void clickoneditItemCategorySave()
	{
		editItemCategorySave.click();
	}
	
	public void setItemCategoryNameinsearchbox(String itemname)
	{
		searchbox.click();
		searchbox.sendKeys(itemname);
		searchbox.sendKeys(Keys.ENTER);
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
