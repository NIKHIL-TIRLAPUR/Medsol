package com.medsol.pageobject;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.medsol.testcases.Baseclass;

public class Inventories_issued_itemspage extends Baseclass {
	WebDriver ldriver;
	public Inventories_issued_itemspage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Inventories']")
    WebElement Inventories;
	
	@FindBy(xpath="//a[normalize-space()='Issued Items']")
    WebElement IssuedItems;
	
	@FindBy(xpath="//a[normalize-space()='New Issued Item']")
    WebElement NewIssuedItem;
	
	@FindBy(xpath="//span[@id='select2-issueUserType-container']")
    WebElement issueUserType;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement searchbox;
	
	@FindBy(xpath="//input[@id='issuedBy']")
    WebElement issuedBy;
	
	@FindBy(xpath="//input[@id='issueDate']")
    WebElement issueDate;
	
	@FindBy(xpath="//body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]")
    WebElement issueyear;
	
	@FindBy(xpath="//body/div[3]/div[1]/div[1]/div[1]/select[1]")
    WebElement issuemonth;
	
	@FindBy(xpath="//body/div[3]/div[2]/div[1]/div[2]/div[1]/span")
	List<WebElement> issuedate;
	
	@FindBy(xpath="//input[@id='issueReturnDate']")
    WebElement issueReturnDate;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
    WebElement returnyear;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/select[1]")
    WebElement returnmonth;
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[2]/div[1]/span")
	List<WebElement> returndate;
	
	@FindBy(xpath="//span[@id='select2-issueItemCategory-container']")
    WebElement ItemCategory;
	
	@FindBy(xpath="//input[@id='itemQuantity']")
    WebElement itemQuantity;
	
	@FindBy(xpath="//textarea[@id='description']")
    WebElement description;
	
	@FindBy(xpath="//input[@id='issuedItemSave']")
    WebElement issuedItemSave;
	
	@FindBy(xpath="//a[normalize-space()='Return Item']")
    WebElement ReturnItem;
	
	@FindBy(xpath="//button[normalize-space()='Yes']")
    WebElement yesReturnItem;
	
	@FindBy(xpath="//input[@name='search']")
    WebElement nameinsearchbox;
	
	@FindBy(xpath="//a[@title='Delete']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
    WebElement yesdeletebutton;
	
	
	public void clickonInventories()
	{
		Inventories.click();
	}
	
	public void clickonIssuedItems()
	{
		IssuedItems.click();
	}
	
	public void clickonNewIssuedItem()
	{
		NewIssuedItem.click();
	}
	
	public void setissueUserType(String user)
	{
		issueUserType.click();
		searchbox.click();
		searchbox.sendKeys(user);
		searchbox.sendKeys(Keys.ENTER);
		
	}
	
	public void setissuedBy(String name)
	{
		issuedBy.click();
		issuedBy.sendKeys(name);
	}
	
	
	
	
	public void setissuedate(String year1,String month1,String date1)
	{
		issueDate.click();
		issueyear.click();
		issueyear.clear();
		issueyear.sendKeys(year1);
		 Select month_drp= new Select(issuemonth);
         month_drp.selectByVisibleText(month1);
         List<WebElement> alldate= issuedate;
       
         for(WebElement ele:alldate)

         {

                       String dt= ele.getText();

                       if(dt.equals(date1))

                       {

                                     ele.click();

                                     break;

                       }

         }
	}
	
	
	public void setissueReturnDate(String year2,String month2,String date2)
	{
		issueReturnDate.click();
		returnyear.click();
		returnyear.sendKeys(year2);
		 Select month_drp= new Select(returnmonth);
         month_drp.selectByVisibleText(month2);
         List<WebElement> alldate= returndate;
       
         for(WebElement ele:alldate)

         {

                       String dt= ele.getText();

                       if(dt.equals(date2))

                       {

                                     ele.click();

                                     break;

                       }

         }
	}
	
	
	
	public void setItemCategory(String itemcata)
	{
		ItemCategory.click();
		searchbox.click();
		searchbox.sendKeys(itemcata);
		searchbox.sendKeys(Keys.ENTER);
		
	}
	
	
	public void setitemQuantity(String quant)
	{
		itemQuantity.click();
		itemQuantity.sendKeys(quant);
	}
	
	public void setdescription(String des)
	{
		description.click();
		description.sendKeys(des);
	}
	
	public void clickonissuedItemSave()
	{
		issuedItemSave.click();
	}
	
	public void clickonReturnItem()
	{
		ReturnItem.click();
	}
	
	public void clickonyesReturnItem()
	{
		yesReturnItem.click();
	}
	
	public void setnameinsearchbox(String name)
	{
		nameinsearchbox.click();
		
		nameinsearchbox.sendKeys(name);
		nameinsearchbox.sendKeys(Keys.ENTER);
		
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
