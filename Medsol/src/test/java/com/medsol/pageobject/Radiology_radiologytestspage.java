package com.medsol.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class Radiology_radiologytestspage extends Baseclass {
	
	WebDriver ldriver;
	public Radiology_radiologytestspage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Radiology']")
    WebElement Radiology;

	@FindBy(xpath="//a[normalize-space()='Radiology Tests']")
    WebElement RadiologyTests;
	
	@FindBy(xpath="//a[normalize-space()='New Radiology Test']")
    WebElement NewRadiologyTest;

	@FindBy(xpath="//input[@id='test_name']")
    WebElement test_name;
	
	@FindBy(xpath="//input[@id='short_name']")
    WebElement short_name;
	
	@FindBy(xpath="//input[@id='test_type']")
    WebElement test_type;
	
	@FindBy(xpath="//span[@id='select2-radiologyCategories-container']")
    WebElement radiologyCategories;
	
	@FindBy(xpath="//span[@id='select2-editRadiologyCategories-container']")
    WebElement editRadiologyCategories;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement searchbox;
	
	@FindBy(xpath="//span[@id='select2-chargeCategories-container']")
    WebElement chargeCategories;
	
	@FindBy(xpath="//span[@id='select2-editChargeCategories-container']")
    WebElement editChargeCategories;
	
	
	@FindBy(xpath="//input[@id='subcategory']")
    WebElement subcategory;
	
	@FindBy(xpath="//input[@id='report_days']")
    WebElement report_days;
	
	@FindBy(xpath="//input[@value='Save']")
    WebElement Save;
	
	@FindBy(xpath="//a[@title='Edit']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement editbutton;
	
	@FindBy(xpath="//input[@name='search']")
    WebElement searchboxfordeleteoredit;
	
	@FindBy(xpath="//a[@title='Delete']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
    WebElement yesdeletebutton;
	
	
	public void clickonRadiology()
	{
		Radiology.click();
	}
	
	public void clickonRadiologyTests()
	{
		RadiologyTests.click();
	}
	
	public void clickonNewRadiologyTest()
	{
		NewRadiologyTest.click();
	}
	
	public void settest_name(String name)
	{
		test_name.click();
		test_name.sendKeys(name);
	}
	
	public void setshort_name(String sname)
	{
		short_name.click();
		short_name.sendKeys(sname);
	}
	
	public void settest_type(String sname)
	{
		test_type.click();
		test_type.sendKeys(sname);
	}
	
	public void setradiologyCategories(String sname)
	{
		radiologyCategories.click();
		searchbox.click();
		searchbox.sendKeys(sname);
		searchbox.sendKeys(Keys.ENTER);
	}
	
	public void setsubcategory(String sname)
	{
		subcategory.click();
		subcategory.sendKeys(sname);
	}
	
	public void setreport_days(String sname)
	{
		report_days.click();
		report_days.sendKeys(sname);
	}
	
	public void setchargeCategories(String sname)
	{
		chargeCategories.click();
		searchbox.click();
		searchbox.sendKeys(sname);
		searchbox.sendKeys(Keys.ENTER);
	}
	
	
	public void clickonSave()
	{
		Save.click();
	}
	
	public void clickoneditbutton()
	{
		editbutton.click();
	}
	
	public void setedittest_name(String name)
	{
		test_name.click();
		test_name.clear();
		test_name.sendKeys(name);
	}
	
	public void seteditshort_name(String sname)
	{
		short_name.click();
		short_name.clear();
		short_name.sendKeys(sname);
	}
	
	public void setedittest_type(String sname)
	{
		test_type.click();
		test_type.clear();
		test_type.sendKeys(sname);
	}
	
	public void seteditradiologyCategories(String sname)
	{
		editRadiologyCategories.click();
		searchbox.click();
		searchbox.sendKeys(sname);
		searchbox.sendKeys(Keys.ENTER);
	}
	
	public void seteditsubcategory(String sname)
	{
		subcategory.click();
		subcategory.clear();
		subcategory.sendKeys(sname);
	}
	
	public void seteditreport_days(String sname)
	{
		report_days.click();
		report_days.clear();
		report_days.sendKeys(sname);
	}
	
	public void seteditchargeCategories(String sname)
	{
		editChargeCategories.click();
		searchbox.click();
		searchbox.sendKeys(sname);
		searchbox.sendKeys(Keys.ENTER);
	}
	
	public void clickonsearchboxfordeleteoredit(String name)
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
