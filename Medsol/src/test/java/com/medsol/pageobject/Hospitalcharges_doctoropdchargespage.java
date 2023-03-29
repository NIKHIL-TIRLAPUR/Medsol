package com.medsol.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class Hospitalcharges_doctoropdchargespage extends Baseclass
{
	
	WebDriver ldriver;
	public Hospitalcharges_doctoropdchargespage (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	
	
	@FindBy(xpath="//span[normalize-space()='Hospital Charges']")
    WebElement HospitalCharges;
	
	@FindBy(xpath="//a[contains(text(),'Doctor OPD Charges')]")//a[normalize-space()='Doctor OPD Charges']
    WebElement DoctoropdCharges;
	
	@FindBy(xpath="//a[normalize-space()='New Doctor OPD Charge']")
    WebElement newdoctoropdCharge;
	
	@FindBy(xpath="//span[@id='select2-chargesDoctorId-container']")
    WebElement selectdoctor;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement txtsearchbox;
	
	@FindBy(xpath="//input[@id='standard_charge']")
    WebElement standardcharge;
	
	@FindBy(xpath="//button[@id='doctorChargesSave']")
    WebElement doctorChargesSave;
	
	public void clickonHospitalCharges()
	{
		HospitalCharges.click();
	}
	
	public void clickonDoctoropdCharges()
	{
		DoctoropdCharges.click();
	}
	
	public void clickonnewdoctoropdCharge()
	{
		newdoctoropdCharge.click();
	}
	
	public void setselectdoctor(String doctor)
	{
		selectdoctor.click();
		txtsearchbox.click();
		txtsearchbox.sendKeys(doctor);
		txtsearchbox.sendKeys(Keys.ENTER);
		
	}
	
	public void setstandardcharge(String scharge)
	{
		standardcharge.click();
		standardcharge.sendKeys(scharge);
	}
	
	public void clickondoctorChargesSave()
	{
		doctorChargesSave.click();
	}
	
}
