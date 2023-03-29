package com.medsol.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class Document_Documenttypepage extends Baseclass {
	
	WebDriver ldriver;
	public Document_Documenttypepage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//span[normalize-space()='Documents']")
    WebElement document;
	
	@FindBy(xpath="//a[normalize-space()='Document Types']")
    WebElement documenttypes;
	
	@FindBy(xpath="//a[normalize-space()='New Document Type']")
    WebElement newdocumenttypes;
	
	@FindBy(xpath="//input[@id='name' and @class='form-control']")
    WebElement txtdocumenttypes;
	
	@FindBy(xpath="//input[@id='editDocTypeName']")
    WebElement txteditdocumenttypes;
	
	@FindBy(xpath="//button[@id='docTypeSave']")
    WebElement documenttypesave;
	
	@FindBy(xpath="//input[@id='editDocTypeName']")
    WebElement editdocumenttypesave;
	
	@FindBy(xpath="//tbody/tr[1]/td[2]/div[1]/a[1]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement editbutton;
	
	@FindBy(xpath="//tbody/tr[1]/td[2]/div[1]/a[2]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
    WebElement yesdeletebutton;
	
	public void clickondocument()
	{
		document.click();
	}
	
	public void clickondocumenttypes()
	{
		documenttypes.click();
	}
	
	
	public void clickonnewdocumenttype()
	{
		newdocumenttypes.click();
	}
	
	
	public void setdocumenttype(String doc)
	{
		txtdocumenttypes.click();
		txtdocumenttypes.sendKeys(doc);
	}
	
	public void clickondocumenttypesave()
	{
		documenttypesave.click();
	}
	
	public void clickoneditdocumenttypesave()
	{
		editdocumenttypesave.click();
	}
	
	
	public void clickondocumenteditbutton()
	{
	      editbutton.click();
	}
	
	public void seteditdocumenttype(String edoc)
	{
		txteditdocumenttypes.click();
		txteditdocumenttypes.clear();
		txteditdocumenttypes.sendKeys(edoc);
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
