package com.medsol.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class Inventories_itempage extends Baseclass {

	WebDriver ldriver;
	public Inventories_itempage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Inventories']")
    WebElement Inventories;
	
	@FindBy(xpath="//a[normalize-space()='Items']")
    WebElement Items;
	
	@FindBy(xpath="//a[normalize-space()='New Item']")
    WebElement NewItem;
	
	@FindBy(xpath="//input[@id='itemName']")
    WebElement itemName;
	
	@FindBy(xpath="//span[@id='select2-itemCategory-container']")
    WebElement itemCategory;
	
	@FindBy(xpath="//input[@role='searchbox']")//input[@name='search']
    WebElement searchbox;
	
	@FindBy(xpath="//input[@id='itemUnit']")
    WebElement itemUnit;
	
	@FindBy(xpath="//textarea[@id='description']")//textarea[@id='description']
    WebElement description;
	
	@FindBy(xpath="//input[@id='itemSave']")
    WebElement itemSave;
	
	@FindBy(xpath="//a[@title='Edit']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement editbutton;
	
	@FindBy(xpath="//input[@id='editItemName']")
    WebElement editItemName;
	
	@FindBy(xpath="//span[@id='select2-editItemCategory-container']")
    WebElement editItemCategory;
	
	@FindBy(xpath="//input[@id='editItemUnit']")
    WebElement editItemUnit;
	
	@FindBy(xpath="//input[@id='editItemSave']")
    WebElement editItemSave;
	
	@FindBy(xpath="//input[@name='search']")
    WebElement txtsearchbox;
	
	@FindBy(xpath="//a[@title='Delete']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
    WebElement yesdeletebutton;
	
	
	public void clickonInventories()
	{
		Inventories.click();
	}
	
	public void clickonItems()
	{
		Items.click();
	}
	
	public void clickonNewItem()
	{
		NewItem.click();
	}
	
	public void setitemName(String item)
	{
		itemName.click();
		itemName.sendKeys(item);
	}
	
	public void setitemCategory(String itemcate)
	{
		itemCategory.click();
		searchbox.click();
		searchbox.sendKeys(itemcate);
		searchbox.sendKeys(Keys.ENTER);
		
	}
	
	public void setitemUnit(String itemuni)
	{
		itemUnit.click();
		itemUnit.sendKeys(itemuni);
	}
	
	
	public void setdescription(String des)
	{
		description.click();
		description.sendKeys(des);
	}
	
	public void clickonitemSave()
	{
		itemSave.click();
	}
	
	public void clickoneditbutton()
	{
		editbutton.click();
	}
	
	public void seteditItemName(String eitem)
	{
		editItemName.click();
		editItemName.clear();
		editItemName.sendKeys(eitem);
	}
	
	public void seteditItemCategory(String eitemcate)
	{
		editItemCategory.click();
		searchbox.click();
		searchbox.sendKeys(eitemcate);
		searchbox.sendKeys(Keys.ENTER);
		
	}
	
	public void seteditItemUnit(String eitemuni)
	{
		editItemUnit.click();
		editItemUnit.clear();
		editItemUnit.sendKeys(eitemuni);
	}
	
	
	public void seteditdescription(String edes)
	{
		description.click();
		description.clear();
		description.sendKeys(edes);
	}
	
	public void clickoneditItemSave()
	{
		editItemSave.click();
	}
	
	public void setItemNameinsearchbox(String itemname)
	{
		txtsearchbox.click();
		txtsearchbox.sendKeys(itemname);
		txtsearchbox.sendKeys(Keys.ENTER);
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
