package com.medsol.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class Medicine_categoriespage extends Baseclass{

	WebDriver ldriver;
	public Medicine_categoriespage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[contains(@class,'aside-menu-title')][normalize-space()='Medicines']")
    WebElement Medicines;
	
	@FindBy(xpath="//a[normalize-space()='Medicine Categories']")
    WebElement MedicineCategories;
	
	@FindBy(xpath="//a[normalize-space()='New Medicine Category']")
    WebElement NewMedicineCategory;
	
	@FindBy(xpath="//input[@id='medicineCategoryName']")
    WebElement medicineCategoryName;
	
	@FindBy(xpath="//input[@id='editCategoryName']")
    WebElement editmedicineCategoryName;
	
	@FindBy(xpath="//div[contains(@class,'form-group col-sm-2 col-md-2')]//input[contains(@name,'is_active')]")
    WebElement status_is_active;
	
	@FindBy(xpath="//input[@id='editCategoryIsActive']")
    WebElement editCategoryIsActive;
	
	@FindBy(xpath="//button[@id='medicineCategorySave']")
    WebElement medicineCategorySave;
	
	@FindBy(xpath="//button[@id='editCategorySave']")
    WebElement editCategorySave;
	
	@FindBy(xpath="//tbody/tr[1]/td[3]/div[1]/a[1]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement editbutton;
	
	@FindBy(xpath="//input[@name='search']")
    WebElement search;
	
	@FindBy(xpath="//tbody/tr[1]/td[3]/div[1]/a[2]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
    WebElement yesdeletebutton;
	
	
	
	public void clickonMedicines()
	{
		Medicines.click();
	}
	
	public void clickonMedicineCategories()
	{
		MedicineCategories.click();
	}
	
	public void clickonNewMedicineCategory()
	{
		NewMedicineCategory.click();
	}
	
	public void setmedicineCategoryName(String name)
	{
		medicineCategoryName.click();
		
		medicineCategoryName.sendKeys(name);
		
		
	}
	
	
	public void clickonmedicineCategorySave()
	{
		medicineCategorySave.click();
	}
	
	
	public void clickoneditbutton()
	{
		editbutton.click();
	}
	
	public void seteditmedicineCategoryName(String ename)
	{
		editmedicineCategoryName.click();
		editmedicineCategoryName.clear();
		editmedicineCategoryName.sendKeys(ename);
		
		
	}
	
	public void clickoneditCategoryIsActive()
	{
		editCategoryIsActive.click();
	}
	
	public void clickoneditCategorySave()
	{
		editCategorySave.click();
	}
	
	public void setnameinsearchbox(String name)
	{
		search.click();
		search.sendKeys(name);
		search.sendKeys(Keys.ENTER);
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
