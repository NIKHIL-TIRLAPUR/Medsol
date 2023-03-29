package com.medsol.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class Hospitalcharges_chargespage extends Baseclass 
{
	WebDriver ldriver;
	public Hospitalcharges_chargespage (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Hospital Charges']")
    WebElement HospitalCharges;
	
	@FindBy(xpath="//a[normalize-space()='Charges']")
    WebElement Charges;
	
	@FindBy(xpath="//a[normalize-space()='New Charge']")
    WebElement newCharge;
	
	@FindBy(xpath="//span[@id='select2-chargeTypeId-container']")
    WebElement chargetypedrp;
	
	@FindBy(xpath="//span[@id='select2-editChargeTypeId-container']")
    WebElement editchargetypedrp;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement txtsearchbox;
	
	@FindBy(xpath="//span[@id='select2-chargeCategoryId-container']")
    WebElement chargecategorydrp;
	
	@FindBy(xpath="//span[@id='select2-editChargeCategoryId-container']")
    WebElement editchargecategorydrp;
	
	
	@FindBy(xpath="//input[@id='code']")
    WebElement code;
	
	@FindBy(xpath="//input[@id='code']")//input[@id='editCode']
    WebElement editcode;
	
	@FindBy(xpath="//input[@id='standard_charge']")
    WebElement standardcharge;
	
	@FindBy(xpath="//input[@id='editStdCharge']")
    WebElement editstandardcharge;
	
	@FindBy(xpath="//textarea[@id='description']")
    WebElement description;
	
	@FindBy(xpath="//textarea[@id='editChargesDescription']")
    WebElement editdescription;
	
	@FindBy(xpath="//button[@id='chargesSave']")
    WebElement chargesSave;
	
	@FindBy(xpath="//button[@id='editChargesSave']")
    WebElement editchargesSave;
	
	@FindBy(xpath="//tbody/tr[1]/td[5]/div[1]/a[1]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement editbutton;
	
	@FindBy(xpath="//input[@name='search']")
    WebElement searchbox;
	
	
	@FindBy(xpath="//tbody/tr[1]/td[5]/div[1]/a[2]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
    WebElement yesdeletebutton;
	
	
	public void clickonHospitalCharges()
	{
		HospitalCharges.click();
	}
	
	public void clickonCharges()
	{
		Charges.click();
	}
	
	public void clickonnewCharge()
	{
		newCharge.click();
	}
	
	public void setchargetype(String chargetype)
	{
		chargetypedrp.click();
		txtsearchbox.click();
		txtsearchbox.sendKeys(chargetype);
		txtsearchbox.sendKeys(Keys.ENTER);
		
	}
	
	public void setchargecategory(String chargecategory)
	{
		chargecategorydrp.click();
		txtsearchbox.click();
		txtsearchbox.sendKeys(chargecategory);
		txtsearchbox.sendKeys(Keys.ENTER);
		
	}
	
	public void setcode(String ccode)
	{
		code.click();
		code.sendKeys(ccode);
	}
	
	public void setstandardcharge(String scharge)
	{
		standardcharge.click();
		standardcharge.sendKeys(scharge);
	}
	
	public void setdescription(String des)
	{
		description.click();
		description.sendKeys(des);
	}
	
	
	public void clickonchargesSave()
	{
		chargesSave.click();
	}
	
	public void clickoneditbutton()
	{
		editbutton.click();
	}
	
	public void seteditchargetype(String echargetype)
	{
		editchargetypedrp.click();
		txtsearchbox.click();
		txtsearchbox.sendKeys(echargetype);
		txtsearchbox.sendKeys(Keys.ENTER);
		
	}
	
	public void seteditchargecategory(String echargecategory)
	{
		editchargecategorydrp.click();
		txtsearchbox.click();
		txtsearchbox.sendKeys(echargecategory);
		txtsearchbox.sendKeys(Keys.ENTER);
		
	}
	
	public void seteditcode(String eccode)
	{
		editcode.click();
		editcode.clear();
		editcode.sendKeys(eccode);
	}
	
	public void seteditstandardcharge(String escharge)
	{
		editstandardcharge.click();
		editstandardcharge.clear();
		editstandardcharge.sendKeys(escharge);
	}
	
	public void seteditdescription(String edes)
	{
		editdescription.click();
		editdescription.clear();
		editdescription.sendKeys(edes);
	}
	
	public void clickoneditchargesSave()
	{
		editchargesSave.click();
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
