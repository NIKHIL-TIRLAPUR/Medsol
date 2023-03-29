package com.medsol.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class Ipdpage extends Baseclass {
	WebDriver ldriver;
	public Ipdpage (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//a[@title='IPD/OPD']")
    WebElement ipd_opd;
	
	@FindBy(xpath="//a[normalize-space()='New IPD Patient']")
    WebElement NewIPDPatient;
	
	@FindBy(xpath="//span[@id='select2-ipdPatientId-container']")
    WebElement selectpatientdrp;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement searchbox;
	
	@FindBy(xpath="//input[@id='height']")
    WebElement height;
	
	@FindBy(xpath="//input[@id='weight']")
    WebElement weight;
	
	@FindBy(xpath="//input[@id='bp']")
    WebElement bloodpressure;
	
	@FindBy(xpath="//span[@id='select2-ipdBedTypeId-container']")
    WebElement selectbedtype;
	
	@FindBy(xpath="//input[@id='ipdFlexSwitchDefault']")
    WebElement isoldpatient;
	
	@FindBy(xpath="//textarea[@id='symptoms']")
    WebElement symptoms;
	
	@FindBy(xpath="//textarea[@id='notes']")
    WebElement notes;
	
	@FindBy(xpath="//input[@id='ipdSave']")
    WebElement ipdsave;
	
	public void clickonipd_opd()
	{
		ipd_opd.click();
	}
	
	public void clickonNewIPDPatient()
	{
		NewIPDPatient.click();
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
	
	public void setselectbedtype(String bed)
	{
		selectbedtype.click();
		searchbox.click();
		searchbox.sendKeys(bed);
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
	
	public void clickonipdsave()
	{
		ipdsave.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
