package com.medsol.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class Diagnosis_Diagnosiscategorypage extends Baseclass{
	
	
WebDriver ldriver;
	
	public Diagnosis_Diagnosiscategorypage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Diagnosis']")
    WebElement Diagnosisbutton;
	
	@FindBy(xpath="//a[normalize-space()='New Diagnosis Category']")
    WebElement newDiagnosiscategory;
	
	@FindBy(xpath="//input[@id='diagnosisCatName']")
    WebElement txtDiagnosiscategoryname;
	
	@FindBy(xpath="//textarea[@id='diagnosisCatDescription']")
    WebElement txtDiagnosiscategorydescription;
	
	@FindBy(xpath="//button[@id='diagnosisCatSave']")
    WebElement Diagnosiscategorysavebutton;
	
	@FindBy(xpath="//tbody/tr[1]/td[2]/div[1]/a[1]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement Diagnosiscategoryeditbutton;
	
	@FindBy(xpath="//input[@id='editDiagnosisCatName']")
    WebElement txteditDiagnosiscategoryname;
	
	@FindBy(xpath="//textarea[@id='editDiagnosisCatDescription']")
    WebElement txteditDiagnosiscategorydescription;
	
	@FindBy(xpath="//button[@id='editDiagnosisCatSave']")
    WebElement Diagnosiscategoryeditsavebutton;
	
	@FindBy(xpath="//input[@name='search']")
    WebElement txtsearchboxfordelete;
	
	@FindBy(xpath="//tbody/tr[1]/td[2]/div[1]/a[2]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
    WebElement yesdeletebutton;
	
	
	
	public void clickonDiagnosisbutton()
	{
		Diagnosisbutton.click();
	}
	
	public void clickonnewDiagnosiscategory()
	{
		newDiagnosiscategory.click();
	}
	
	public void setDiagnosiscategoryname(String name)
	{
		txtDiagnosiscategoryname.click();
		txtDiagnosiscategoryname.sendKeys(name);
		

	}
	
	public void setDiagnosiscategorydescription(String des)
	{
		txtDiagnosiscategorydescription.click();
		txtDiagnosiscategorydescription.sendKeys(des);
		

	}
	
	public void clickonDiagnosiscategorysavebutton()
	{
		Diagnosiscategorysavebutton.click();
	}
	
	public void clickonDiagnosiscategoryeditbutton()
	{
		Diagnosiscategoryeditbutton.click();
	}
	
	public void seteditDiagnosiscategoryname(String ename)
	{
		txteditDiagnosiscategoryname.click();
		txteditDiagnosiscategoryname.clear();
		txteditDiagnosiscategoryname.sendKeys(ename);
		

	}
	
	public void seteditDiagnosiscategorydescription(String edes)
	{
		txteditDiagnosiscategorydescription.click();
		txteditDiagnosiscategorydescription.clear();
		txteditDiagnosiscategorydescription.sendKeys(edes);
		

	}
	
	public void clickonDiagnosiscategoryeditsavebutton()
	{
		Diagnosiscategoryeditsavebutton.click();
	}
	
	public void setnameinthesearchboxfordelete(String dname)
	{
		txtsearchboxfordelete.click();
		
		txtsearchboxfordelete.sendKeys(dname);
		txtsearchboxfordelete.sendKeys(Keys.ENTER);
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
