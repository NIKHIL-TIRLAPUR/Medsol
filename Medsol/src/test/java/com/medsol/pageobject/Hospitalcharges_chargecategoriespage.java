package com.medsol.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class Hospitalcharges_chargecategoriespage extends Baseclass
{

	WebDriver ldriver;
	public Hospitalcharges_chargecategoriespage (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Hospital Charges']")
    WebElement HospitalCharges;
	
	@FindBy(xpath="//a[normalize-space()='New Charge Category']")
    WebElement NewChargeCategory;
	
	@FindBy(xpath="//input[@id='name']")
    WebElement txtname;
	
	@FindBy(xpath="//textarea[@id='description']")
    WebElement txtdescription;
	
	@FindBy(xpath="//span[@id='select2-chargeCategoryTypeId-container']")
    WebElement dropdown;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement txtsearchbox;
	
	@FindBy(xpath="//button[@id='chargeCategorySave']")
    WebElement chargeCategorySave;
	
	@FindBy(xpath="//tbody/tr[1]/td[4]/a[1]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement editbutton;
	
	@FindBy(xpath="//input[@id='editChargeCategoryName']")
    WebElement editChargeCategoryName;
	
	@FindBy(xpath="//textarea[@id='editChargeCategoryDescription']")
    WebElement editChargeCategoryDescription;
	
	@FindBy(xpath="//span[@id='select2-editChargeCategoryTypeId-container']")
    WebElement editdropdown;
	
	@FindBy(xpath="//button[@id='editChargeCategorySave']")
    WebElement editChargeCategorySave;
	
	@FindBy(xpath="//input[@name='search']")
    WebElement searchbox;
	
	
	@FindBy(xpath="//tbody/tr[1]/td[4]/a[2]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
    WebElement yesdeletebutton;
	
	
	
	public void clickonHospitalCharges()
	{
		HospitalCharges.click();
	}
	
	public void clickonNewChargeCategory()
	{
		NewChargeCategory.click();
	}
	
	
	public void setnameinchargecategories(String name)
	{
		txtname.click();
		txtname.sendKeys(name);
	}
	
	public void setdescriptionofchargecategories(String des)
	{
		txtdescription.click();
		txtdescription.sendKeys(des);
	}
	
	public void setchargetype(String charge)
	{
		dropdown.click();
		txtsearchbox.click();
		txtsearchbox.sendKeys(charge);
		txtsearchbox.sendKeys(Keys.ENTER);
		
	}
	
	public void clickonchargeCategorySave()
	{
		chargeCategorySave.click();
	}
	
	public void seteditChargeCategoryName(String etitle)
	{
		editChargeCategoryName.click();
		editChargeCategoryName.clear();
		editChargeCategoryName.sendKeys(etitle);
	}
	
	
	public void seteditChargeCategoryDescription(String edes)
	{
		editChargeCategoryDescription.click();
		editChargeCategoryDescription.clear();
		editChargeCategoryDescription.sendKeys(edes);
	}
	
	public void seteditchargetype(String echarge)
	{
		editdropdown.click();
		txtsearchbox.click();
		txtsearchbox.sendKeys(echarge);
		txtsearchbox.sendKeys(Keys.ENTER);
		
	}
	
	
	
	public void clickoneditChargeCategorySave()
	{
		editChargeCategorySave.click();
	}
	
	public void clickoneditbutton()
	{
		editbutton.click();
	}
	
	public void setnamesearchbox(String name)
	{
		searchbox.click();
		searchbox.sendKeys(name);
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
