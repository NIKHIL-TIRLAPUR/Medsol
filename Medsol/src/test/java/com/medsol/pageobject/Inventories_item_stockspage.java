package com.medsol.pageobject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class Inventories_item_stockspage extends Baseclass {

	
	WebDriver ldriver;
	public Inventories_item_stockspage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Inventories']")
    WebElement Inventories;
	
	@FindBy(xpath="//a[normalize-space()='Item Stocks']")
    WebElement ItemStocks;
	
	@FindBy(xpath="//a[normalize-space()='New Item Stock']")
    WebElement NewItemStock;
	
	@FindBy(xpath="//span[@id='select2-stockItemCategory-container']")
    WebElement selectitemcategory;
	
	@FindBy(xpath="//span[@id='select2-editStockItemCategory-container']")
    WebElement editselectitemcategory;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement searchbox;
	
	@FindBy(xpath="//input[@id='stockSupplierName']")
    WebElement stockSupplierName;
	
	@FindBy(xpath="//input[@id='editStockSupplierName']")
    WebElement editStockSupplierName;
	
	
	@FindBy(xpath="//input[@id='stockStoreName']")
    WebElement stockStoreName;
	
	@FindBy(xpath="//input[@id='editStockStoreName']")
    WebElement editStockStoreName;
	
	@FindBy(xpath="//input[@id='stockQuantity']")
    WebElement stockQuantity;
	
	@FindBy(xpath="//input[@id='editStockQuantity']")
    WebElement editStockQuantity;
	
	@FindBy(xpath="//input[@id='stockPurchasePrice']")
    WebElement stockPurchasePrice;
	
	@FindBy(xpath="//input[@id='editStockPurchasePrice']")
    WebElement editStockPurchasePrice;
	
	@FindBy(xpath="//textarea[@id='description']")
    WebElement description;
	
	@FindBy(xpath="//span[@title='Attachment']//label//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement Attachment;
	
	@FindBy(xpath="//input[@id='stockSave']")
    WebElement stockSave;
	
	@FindBy(xpath="//input[@id='editStockSave']")
    WebElement editStockSave;
	
	@FindBy(xpath="//tbody/tr[2]/td[6]/div[1]/a[1]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement editbutton;
	
	
	@FindBy(xpath="//span[@id='select2-editStockItems-container']")
    WebElement edititemname;
	
	@FindBy(xpath="//input[@name='search']")//input[@name='search']
    WebElement txtsearchbox;
	
	@FindBy(xpath="//a[@title='Delete']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
    WebElement yesdeletebutton;
	
	
	public void clickonInventories()
	{
		Inventories.click();
	}
	
	public void clickonItemStocks()
	{
		ItemStocks.click();
	}
	
	public void clickonNewItemStock()
	{
		NewItemStock.click();
	}
	
	public void setitemCategory(String itemcate)
	{
		selectitemcategory.click();
		searchbox.click();
		searchbox.sendKeys(itemcate);
		searchbox.sendKeys(Keys.ENTER);
		
	}
	
	public void setstockSupplierName(String item)
	{
		stockSupplierName.click();
		stockSupplierName.sendKeys(item);
	}
	
	public void setstockStoreName(String item)
	{
		stockStoreName.click();
		stockStoreName.sendKeys(item);
	}
	
	public void setstockQuantity(String item)
	{
		stockQuantity.click();
		stockQuantity.sendKeys(item);
	}
	
	public void setstockPurchasePrice(String item)
	{
		stockPurchasePrice.click();
		stockPurchasePrice.sendKeys(item);
	}
	
	
	public void setdescription(String item)
	{
		description.click();
		description.sendKeys(item);
	}
	
	public void clickonstockSave()
	{
		stockSave.click();
	}
	
	public void clickoneditbutton()
	{
		editbutton.click();
	}
	
	
	public void setedititemCategory(String eitemcate)
	{
		editselectitemcategory.click();
		searchbox.click();
		searchbox.sendKeys(eitemcate);
		searchbox.sendKeys(Keys.ENTER);
		
	}
	
	public void setedititemname(String eitemname)
	{
		edititemname.click();
		searchbox.click();
		searchbox.sendKeys(eitemname);
		searchbox.sendKeys(Keys.ENTER);
		
	}
	
	
	public void seteditStockSupplierName(String eitem)
	{
		editStockSupplierName.click();
		editStockSupplierName.clear();
		editStockSupplierName.sendKeys(eitem);
	}
	
	public void seteditStockStoreName(String item)
	{
		editStockStoreName.click();
		editStockStoreName.clear();
		editStockStoreName.sendKeys(item);
	}
	
	public void seteditStockQuantity(String item)
	{
		editStockQuantity.click();
		editStockQuantity.clear();
		editStockQuantity.sendKeys(item);
	}
	
	public void seteditStockPurchasePrice(String item)
	{
		editStockPurchasePrice.click();
		editStockPurchasePrice.clear();
		editStockPurchasePrice.sendKeys(item);
	}
	
	public void seteditdescription(String item)
	{
		description.click();
		description.clear();
		description.sendKeys(item);
	}
	
	public void clickoneditStockSave()
	{
		editStockSave.click();
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
	
	
	public void setclickonAttachment() throws AWTException
	{
		Attachment.click();
		Robot rb= new Robot();
		rb.delay(2000);
		
		StringSelection ss= new StringSelection("C:\\Users\\user\\Desktop\\31-01-2023\\home");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(2000);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(2000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
