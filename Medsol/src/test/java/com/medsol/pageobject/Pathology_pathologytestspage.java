package com.medsol.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class Pathology_pathologytestspage extends Baseclass {

	WebDriver ldriver;
	public Pathology_pathologytestspage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Pathology']")
    WebElement Pathology;

	@FindBy(xpath="//a[normalize-space()='Pathology Tests']")
    WebElement PathologyTests;
	
	@FindBy(xpath="//a[normalize-space()='New Pathology Test']")
    WebElement NewPathologyTest;

	@FindBy(xpath="//input[@id='test_name']")//input[@id='test_name']
    WebElement test_name;
	
	@FindBy(xpath="//input[@id='short_name']")//input[@id='short_name']
    WebElement short_name;
	
	@FindBy(xpath="//input[@id='test_type']")//input[@id='test_type']
    WebElement test_type;
	
	@FindBy(xpath="//span[@id='select2-pathologyCategories-container']")//span[@id='select2-pathologyCategories-container']
    WebElement pathologyCategories;
	
	@FindBy(xpath="//span[@id='select2-editPathologyCategories-container']")//span[@id='select2-pathologyCategories-container']
    WebElement editPathologyCategories;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement searchbox;
	
	@FindBy(xpath="//input[@id='unit']")
    WebElement unit;
	
	@FindBy(xpath="//input[@id='subcategory']")
    WebElement subcategory;
	
	@FindBy(xpath="//input[@id='method']")
    WebElement method;
	
	@FindBy(xpath="//input[@id='report_days']")
    WebElement report_days;
	
	@FindBy(xpath="//span[@id='select2-pathologyChargeCategories-container']")
    WebElement pathologyChargeCategories;
	
	@FindBy(xpath="//span[@id='select2-editPathologyChargeCategories-container']")
    WebElement editPathologyChargeCategories;
	
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
	
	
	
	public void clickonPathology()
	{
		Pathology.click();
	}
	
	public void clickonPathologyTests()
	{
		PathologyTests.click();
	}
	
	public void clickonNewPathologyTest()
	{
		NewPathologyTest.click();
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
	
	public void setpathologyCategories(String sname)
	{
		pathologyCategories.click();
		searchbox.click();
		searchbox.sendKeys(sname);
		searchbox.sendKeys(Keys.ENTER);
	}
	
	public void setunit(String uni)
	{
		unit.click();
		unit.sendKeys(uni);
	}
	
	public void setsubcategory(String sname)
	{
		subcategory.click();
		subcategory.sendKeys(sname);
	}
	
	public void setmethod(String meth)
	{
		method.click();
		method.sendKeys(meth);
	}
	
	public void setreport_days(String sname)
	{
		report_days.click();
		report_days.sendKeys(sname);
	}
	
	public void setpathologyChargeCategories(String sname)
	{
		pathologyChargeCategories.click();
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
	
	public void clickonsearchboxfordeleteoredit(String name)
	{
		searchboxfordeleteoredit.click();
		searchboxfordeleteoredit.sendKeys(name);
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
	
	public void seteditPathologyCategories(String sname)
	{
		editPathologyCategories.click();
		searchbox.click();
		searchbox.sendKeys(sname);
		searchbox.sendKeys(Keys.ENTER);
	}
	
	public void seteditunit(String sname)
	{
		unit.click();
		unit.clear();
		unit.sendKeys(sname);
	}
	
	public void seteditmethod(String sname)
	{
		method.click();
		method.clear();
		method.sendKeys(sname);
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
	
	public void seteditPathologyChargeCategories(String sname)
	{
		editPathologyChargeCategories.click();
		searchbox.click();
		searchbox.sendKeys(sname);
		searchbox.sendKeys(Keys.ENTER);
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
