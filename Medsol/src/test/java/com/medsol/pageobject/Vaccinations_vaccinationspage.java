package com.medsol.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class Vaccinations_vaccinationspage extends Baseclass {

	WebDriver ldriver;
	public Vaccinations_vaccinationspage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Vaccinations']")
    WebElement Vaccinations;
	
	@FindBy(xpath="//a[normalize-space()='Vaccinations']")
    WebElement vaccinations;	
	
	@FindBy(xpath="//a[@id='dropdownMenuButton']")
    WebElement dropdownMenuButton;
	
	@FindBy(xpath="//a[normalize-space()='New Vaccination']")
    WebElement NewVaccination;
	
	@FindBy(xpath="//input[@id='vaccinationName']")
    WebElement vaccinationName;
	
	@FindBy(xpath="//input[@id='editVaccinationName']")
    WebElement editVaccinationName;
	
	@FindBy(xpath="//input[@id='vaccinationManufacturedBy']")
    WebElement vaccinationManufacturedBy;
	
	@FindBy(xpath="//input[@id='editVaccinationManufacturedBy']")
    WebElement editVaccinationManufacturedBy;
	
	@FindBy(xpath="//input[@id='vaccinationBrand']")
    WebElement vaccinationBrand;
	
	@FindBy(xpath="//input[@id='editVaccinationBrand']")
    WebElement editVaccinationBrand;
	
	@FindBy(xpath="//button[@id='vaccinationBtnSave']")
    WebElement vaccinationBtnSave;
	
	@FindBy(xpath="//button[@id='btnEditVaccinationSave']")
    WebElement btnEditVaccinationSave;
	
	@FindBy(xpath="//input[@name='search']")//input[@name='search']
    WebElement searchboxfordeleteoredit;
	
	@FindBy(xpath="//a[@title='Edit']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement editbutton;
	
	@FindBy(xpath="//a[@title='Delete']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
    WebElement yesdeletebutton;
	
	public void clickonVaccinations()
	{
		Vaccinations.click();
	}
	
	public void clickonvaccinations()
	{
		vaccinations.click();
	}
	
	public void clickondropdownMenuButton()
	{
		dropdownMenuButton.click();
	}
	
	public void clickonNewVaccination()
	{
		NewVaccination.click();
	}
	
	public void setvaccinationName(String Name)
	{
		vaccinationName.click();
		vaccinationName.sendKeys(Name);
	}
	
	public void setvaccinationManufacturedBy(String By)
	{
		vaccinationManufacturedBy.click();
		vaccinationManufacturedBy.sendKeys(By);
	}
	
	public void setvaccinationBrand(String Brand)
	{
		vaccinationBrand.click();
		vaccinationBrand.sendKeys(Brand);
	}
	
	public void clickonvaccinationBtnSave()
	{
		vaccinationBtnSave.click();
	}
	
	public void seteditvaccinationName(String Name)
	{
		editVaccinationName.click();
		editVaccinationName.clear();
		editVaccinationName.sendKeys(Name);
	}
	
	public void seteditvaccinationManufacturedBy(String By)
	{
		editVaccinationManufacturedBy.click();
		editVaccinationManufacturedBy.clear();
		editVaccinationManufacturedBy.sendKeys(By);
	}
	
	public void seteditvaccinationBrand(String Brand)
	{
		editVaccinationBrand.click();
		editVaccinationBrand.clear();
		editVaccinationBrand.sendKeys(Brand);
	}
	
	public void clickoneditvaccinationBtnSave()
	{
		btnEditVaccinationSave.click();
	}
	
	
	
	
	public void clickoneditbutton()
	{
		editbutton.click();
	}
	
	public void setnameinsearchboxfordeleteoredit(String name)
	{
		searchboxfordeleteoredit.click();
		searchboxfordeleteoredit.sendKeys(name);
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
