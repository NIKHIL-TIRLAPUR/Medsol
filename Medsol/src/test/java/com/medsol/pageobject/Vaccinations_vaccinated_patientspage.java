package com.medsol.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class Vaccinations_vaccinated_patientspage extends Baseclass {
	
	WebDriver ldriver;
	public Vaccinations_vaccinated_patientspage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//span[normalize-space()='Vaccinations']")
    WebElement Vaccinations;
	
	@FindBy(xpath="//a[@id='dropdownMenuButton']")
    WebElement dropdownMenuButton;
	
	@FindBy(xpath="//a[normalize-space()='New Vaccinated Patient']")
    WebElement NewVaccinatedPatient;
	
	@FindBy(xpath="//span[@id='select2-vPatientName-container']")
    WebElement selectpatient;
	
	@FindBy(xpath="//span[@id='select2-editVPatientName-container']")
    WebElement editselectpatient;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement searchbox;
	
	@FindBy(xpath="//span[@id='select2-vPatientVaccinationName-container']")
    WebElement vaccine;
	
	@FindBy(xpath="//span[@id='select2-editVPatientVaccinationName-container']")
    WebElement editvaccine;
	
	
	@FindBy(xpath="//input[@id='vPatientSerialNo']")
    WebElement PatientSerialNo;
	
	@FindBy(xpath="//input[@id='editVPatientSerialNo']")
    WebElement editPatientSerialNo;
	
	@FindBy(xpath="//input[@id='vPatientBrand']")
    WebElement doseNo;
	
	@FindBy(xpath="//input[@id='editVPatientDoseNumber']")
    WebElement editdoseNo;
	
	@FindBy(xpath="//input[@id='vPatientDoesGivenDate']")
    WebElement PatientDoesGivenDate;
	
	@FindBy(xpath="//textarea[@id='description']")
    WebElement notes;
	
	@FindBy(xpath="//textarea[@id='editVPatientDescription']")
    WebElement editnotes;
	
	@FindBy(xpath="//button[@id='vPatientBtnSave']")
    WebElement PatientBtnSave;
	
	@FindBy(xpath="//button[@id='editVPatientBtnSave']")
    WebElement editPatientBtnSave;
	
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
	
	public void clickondropdownMenuButton()
	{
		dropdownMenuButton.click();
	}
	
	public void clickonNewVaccinatedPatient()
	{
		NewVaccinatedPatient.click();
	}
	
	public void setselectpatient(String Type)
	{
		selectpatient.click();
		searchbox.click();
		searchbox.sendKeys(Type);
		searchbox.sendKeys(Keys.ENTER);
	}
	
	public void setvaccine(String Type)
	{
		vaccine.click();
		searchbox.click();
		searchbox.sendKeys(Type);
		searchbox.sendKeys(Keys.ENTER);
	}
	
	public void setPatientSerialNo(String license)
	{
		PatientSerialNo.click();
		PatientSerialNo.sendKeys(license);
	}
	
	public void setdoseNo(String license)
	{
		doseNo.click();
		doseNo.sendKeys(license);
	}
	
	public void setnotes(String license)
	{
		notes.click();
		notes.sendKeys(license);
	}
	
	public void clickonPatientBtnSave()
	{
		PatientBtnSave.click();
	}
	
	
	
	public void seteditselectpatient(String Type)
	{
		editselectpatient.click();
		searchbox.click();
		searchbox.sendKeys(Type);
		searchbox.sendKeys(Keys.ENTER);
	}
	
	public void seteditvaccine(String Type)
	{
		editvaccine.click();
		searchbox.click();
		searchbox.sendKeys(Type);
		searchbox.sendKeys(Keys.ENTER);
	}
	
	public void seteditPatientSerialNo(String license)
	{
		editPatientSerialNo.click();
		editPatientSerialNo.clear();
		editPatientSerialNo.sendKeys(license);
	}
	
	public void seteditdoseNo(String license)
	{
		editdoseNo.click();
		editdoseNo.clear();
		editdoseNo.sendKeys(license);
	}
	
	public void seteditnotes(String license)
	{
		editnotes.click();
		editnotes.clear();
		editnotes.sendKeys(license);
	}
	
	public void clickoneditPatientBtnSave()
	{
		editPatientBtnSave.click();
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
