package com.medsol.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class Opdpage extends Baseclass {
	WebDriver ldriver;
	public Opdpage (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[@title='IPD/OPD']")
    WebElement ipd_opd;
	
	@FindBy(xpath="//a[normalize-space()='OPD Patients']")
    WebElement OPDPatients;
	
	@FindBy(xpath="//a[normalize-space()='New OPD Patient']")
    WebElement NewOPDPatients;
	
	@FindBy(xpath="//span[@id='select2-opdPatientId-container']")
    WebElement selectpatientdrp;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement searchbox;
	
	@FindBy(xpath="//input[@id='height']")
    WebElement height;
	
	@FindBy(xpath="//input[@id='weight']")
    WebElement weight;
	
	@FindBy(xpath="//input[@id='bp']")
    WebElement bloodpressure;
	
	@FindBy(xpath="//input[@id='opdStandardCharge']")
    WebElement opdStandardCharge;
	
	@FindBy(xpath="//span[@id='select2-opdPaymentMode-container']")
    WebElement opdPaymentMode;
	
	@FindBy(xpath="//textarea[@id='symptoms']")
    WebElement symptoms;
	
	@FindBy(xpath="//textarea[@id='notes']")
    WebElement notes;
	
	@FindBy(xpath="//input[@name='is_old_patient']")
    WebElement isoldpatient;
	
	@FindBy(xpath="//input[@id='btnOpdSave']")
    WebElement btnOpdSave;
	
	public void clickonipd_opd()
	{
		ipd_opd.click();
	}
	
	public void clickonOPDPatients()
	{
		OPDPatients.click();
	}
	
	public void clickonNewOPDPatients()
	{
		NewOPDPatients.click();
	}
	
	public void setselectpatient(String patient)
	{
		selectpatientdrp.click();
		searchbox.click();
		searchbox.sendKeys(patient);
		searchbox.sendKeys(Keys.ENTER);
		
	}
	
	public void setheight(String heigh)
	{
		height.click();
		height.clear();
		height.sendKeys(heigh);
	}
	
	public void setweight(String weigh)
	{
		weight.click();
		weight.clear();
		weight.sendKeys(weigh);
	}
	
	public void setbloodpressure(String bp)
	{
		bloodpressure.click();
		bloodpressure.sendKeys(bp);
	}
	
	
	public void setstandardcharge(String charge)
	{
		opdStandardCharge.click();
		opdStandardCharge.sendKeys(charge);
	}
	
	
	public void setpaymentmode(String pay)
	{
		opdPaymentMode.click();
		searchbox.click();
		searchbox.sendKeys(pay);
		searchbox.sendKeys(Keys.ENTER);
		
	}
	
	public void setsymptoms(String sym)
	{
		symptoms.click();
		symptoms.sendKeys(sym);
	}
	
	public void setnotes(String note)
	{
		notes.click();
		notes.sendKeys(note);
	}
	
	public void clickonopdsave()
	{
		btnOpdSave.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
