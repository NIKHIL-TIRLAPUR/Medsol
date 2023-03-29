package com.medsol.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class Services_ambulancespage extends Baseclass {

	WebDriver ldriver;
	public Services_ambulancespage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[contains(@class,'aside-menu-title')][normalize-space()='Services']")
    WebElement Services;
	
	@FindBy(xpath="//a[normalize-space()='Ambulances']")
    WebElement Ambulances;
	
	@FindBy(xpath="//a[@id='dropdownMenuButton']")
    WebElement dropdownMenuButton;
	
	@FindBy(xpath="//a[normalize-space()='New Ambulance']")
    WebElement NewAmbulance;
	
	@FindBy(xpath="//input[@id='vehicle_number']")
    WebElement vehicle_number;
	
	@FindBy(xpath="//input[@id='vehicle_model']")
    WebElement vehicle_model;
	
	@FindBy(xpath="//input[@id='year_made']")
    WebElement year_made;
	
	@FindBy(xpath="//input[@id='driver_name']")
    WebElement driver_name;
	
	@FindBy(xpath="//input[@id='ambulancePhoneNumber']")
    WebElement ambulancePhoneNumber;
	
	@FindBy(xpath="//input[@id='editAmbulancePhoneNumber']")
    WebElement editAmbulancePhoneNumber;
	
	@FindBy(xpath="//input[@id='driver_license']")
    WebElement driver_license;
	
	@FindBy(xpath="//textarea[@id='note']")
    WebElement note;
	
	@FindBy(xpath="//span[@id='select2-ambulanceVehicleType-container']")
    WebElement VehicleType;
	
	@FindBy(xpath="//span[@id='select2-editAmbulanceVehicleType-container']")//span[@id='select2-editAmbulanceVehicleType-container']
    WebElement editVehicleType;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement searchbox;
	
	@FindBy(xpath="//input[@name='is_available']")
    WebElement is_available;
	
	@FindBy(xpath="//input[@id='ambulanceBtnSave']")
    WebElement ambulanceBtnSave;
	
	@FindBy(xpath="//input[@name='search']")//input[@name='search']
    WebElement searchboxfordeleteoredit;
	
	@FindBy(xpath="//a[@title='Edit']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement editbutton;
	
	@FindBy(xpath="//a[@title='Delete']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
    WebElement yesdeletebutton;
	
	@FindBy(xpath="//input[@id='editAmbulanceBtnSave']")
    WebElement editAmbulanceBtnSave;
	
	public void clickonServices()
	{
		Services.click();
	}
	
	public void clickonAmbulances()
	{
		Ambulances.click();
	}
	
	public void clickondropdownMenuButton()
	{
		dropdownMenuButton.click();
	}
	
	public void clickonNewAmbulance()
	{
		NewAmbulance.click();
	}
	
	public void setvehicle_number(String nam)
	{
		vehicle_number.click();
		vehicle_number.sendKeys(nam);
	}
	
	public void setvehicle_model(String model)
	{
		vehicle_model.click();
		vehicle_model.sendKeys(model);
	}
	
	public void setyear_made(String made)
	{
		year_made.click();
		year_made.sendKeys(made);
	}
	
	public void setdriver_name(String name)
	{
		driver_name.click();
		driver_name.sendKeys(name);
	}
	
	public void setambulancePhoneNumber(String name)
	{
		ambulancePhoneNumber.click();
		ambulancePhoneNumber.sendKeys(name);
	}
	
	public void seteditAmbulancePhoneNumber(String name)
	{
		editAmbulancePhoneNumber.click();
		editAmbulancePhoneNumber.clear();
		editAmbulancePhoneNumber.sendKeys(name);
	}
	
	public void setdriver_license(String license)
	{
		driver_license.click();
		driver_license.sendKeys(license);
	}
	
	public void setnote(String license)
	{
		note.click();
		note.sendKeys(license);
	}
	
	public void setVehicleType(String Type)
	{
		VehicleType.click();
		searchbox.click();
		searchbox.sendKeys(Type);
		searchbox.sendKeys(Keys.ENTER);
	}
	
	public void clickonis_available()
	{
		is_available.click();
	}
	
	public void clickonambulanceBtnSave()
	{
		ambulanceBtnSave.click();
	}
	
	public void seteditvehicle_number(String nam)
	{
		vehicle_number.click();
		vehicle_number.clear();
		vehicle_number.sendKeys(nam);
	}
	
	public void seteditvehicle_model(String model)
	{
		vehicle_model.click();
		vehicle_model.clear();
		vehicle_model.sendKeys(model);
	}
	
	public void setedityear_made(String made)
	{
		year_made.click();
		year_made.clear();
		year_made.sendKeys(made);
	}
	
	public void seteditdriver_name(String name)
	{
		driver_name.click();
		driver_name.clear();
		driver_name.sendKeys(name);
	}
	
	
	public void seteditdriver_license(String license)
	{
		driver_license.click();
		driver_license.clear();
		driver_license.sendKeys(license);
	}
	
	public void seteditnote(String license)
	{
		note.click();
		note.clear();
		note.sendKeys(license);
	}
	
	public void seteditVehicleType(String Type)
	{
		editVehicleType.click();
		searchbox.click();
		searchbox.sendKeys(Type);
		searchbox.sendKeys(Keys.ENTER);
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
	
	public void clickoneditAmbulanceBtnSave()
	{
		editAmbulanceBtnSave.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
