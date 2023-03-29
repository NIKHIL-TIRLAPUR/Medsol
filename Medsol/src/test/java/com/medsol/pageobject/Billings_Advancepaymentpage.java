package com.medsol.pageobject;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class Billings_Advancepaymentpage extends Baseclass
{
WebDriver ldriver;

public  Billings_Advancepaymentpage(WebDriver rdriver) {
	
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);	
}

@FindBy(xpath="//body/div[1]/div[1]/div[1]/div[3]/ul[1]/li[5]/a[1]")
WebElement billings;

@FindBy(xpath="//a[normalize-space()='Advance Payments']")
WebElement advancepayment;

@FindBy(xpath="//a[normalize-space()='New Advance Payment']")
WebElement newadvancepayment;

@FindBy(xpath="//span[@id='select2-advancePaymentPatientId-container']")
WebElement selectpatient;

@FindBy(xpath="//input[@role='searchbox']")
WebElement txtsearchboxpatient;

@FindBy(xpath="//input[@id='amount']")
WebElement txtamount;

@FindBy(xpath="//input[@id='editAmount']")
WebElement txteditamount;


@FindBy(xpath="//button[@id='advancedPaymentSave']")
WebElement advancedPaymentSavebutton;

@FindBy(xpath="//button[@id='editAdvancedPaymentSave']")
WebElement editadvancedPaymentSavebutton;

@FindBy(xpath="//a[@title='Edit']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
WebElement editadvancedPaymentbutton;

@FindBy(xpath="//a[@title='Delete']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
WebElement deletebutton;

@FindBy(xpath="//button[normalize-space()='Yes, Delete']")//button[normalize-space()='Yes, Delete']
WebElement yesdeletebutton;

public void clickonbillings()
{
	billings.click();
}

public void clickoneditadvancedPaymentbutton()
{
	editadvancedPaymentbutton.click();
}

public void clickonadvancepayment()
{
	advancepayment.click();
}


public void clickonnewadvancepayment()
{
	newadvancepayment.click();
}

public void clickonselectpatientdropdown()
{
	selectpatient.click();
}

public void setpatient(String patient)
{
	txtsearchboxpatient.sendKeys(patient);
	txtsearchboxpatient.sendKeys(Keys.ENTER);
}

public void setamount(String amo)
{
	txtamount.sendKeys(amo);
}

public void seteditamount(String amot)
{
	txteditamount.click();
	txteditamount.clear();
	txteditamount.sendKeys(amot);
}


public void clickonsavebutton()
{
	advancedPaymentSavebutton.click();
}

public void clickoneditsavebutton()
{
	editadvancedPaymentSavebutton.click();
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
