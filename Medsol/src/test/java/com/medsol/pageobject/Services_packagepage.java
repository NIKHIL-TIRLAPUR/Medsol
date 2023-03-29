package com.medsol.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class Services_packagepage extends Baseclass{

	WebDriver ldriver;
	public Services_packagepage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[contains(@class,'aside-menu-title')][normalize-space()='Services']")
    WebElement Services;
	
	@FindBy(xpath="//a[normalize-space()='Packages']")
    WebElement Packages;
	
	@FindBy(xpath="//a[normalize-space()='New Package']")
    WebElement NewPackage;
	
	@FindBy(xpath="//input[@id='name']")
    WebElement Packagename;
	
	@FindBy(xpath="//input[@id='packageDiscountId']")
    WebElement packageDiscountId;
	
	@FindBy(xpath="//textarea[@id='description']")
    WebElement packagedescription;
	
	@FindBy(xpath="//span[@class='select2-selection__placeholder']")
    WebElement selectservice;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[4]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/span[1]/span[1]/span[1]/span[1]")//span[@id='select2-service_id-c3-container']
    WebElement editselectservice;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement searchbox;
	
	@FindBy(xpath="//tbody/tr[1]/td[3]/input[1]")//tbody/tr[1]/td[3]/input[1]
    WebElement quantity;
	
	@FindBy(xpath="//tbody/tr[1]/td[4]/input[1]")//tbody/tr[1]/td[4]/input[1]
    WebElement rate;
	
	@FindBy(xpath="//input[@id='packageSaveBtn']")
    WebElement packageSaveBtn;
	
	@FindBy(xpath="//button[@id='addPackageItem']")
    WebElement addPackageItem;
	
	@FindBy(xpath="//span[@id='select2-enquiry-medicine-id_-container']")
    WebElement selectservice2;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[4]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/span[1]/span[1]/span[1]/span[1]")//span[@id='select2-service_id-68-container']
    WebElement editselectservice2;
	
	@FindBy(xpath="//tbody/tr[2]/td[3]/input[1]")//tbody/tr[2]/td[3]/input[1]
    WebElement quantity1;
	
	@FindBy(xpath="//tbody/tr[2]/td[4]/input[1]")//tbody/tr[2]/td[4]/input[1]
    WebElement rate1;
	
	@FindBy(xpath="//a[@title='Edit']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement editbutton;
	
	@FindBy(xpath="//input[@name='search']")//input[@name='search']
    WebElement searchboxfordeleteoredit;
	
	@FindBy(xpath="//a[@title='Delete']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
    WebElement yesdeletebutton;
	
	@FindBy(xpath="//tbody/tr[2]/td[6]/a[1]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deleteservicerow;
	
	public void clickonServices()
	{
		Services.click();
	}
	
	public void clickonPackages()
	{
		Packages.click();
	}
	
	public void clickonNewPackage()
	{
		NewPackage.click();
	}
	
	public void setPackagename(String nam)
	{
		Packagename.click();
		Packagename.sendKeys(nam);
	}
	
	public void setpackageDiscountId(String tax)
	{
		packageDiscountId.click();
		packageDiscountId.sendKeys(tax);
	}
	
	public void setpackagedescription(String nam)
	{
		packagedescription.click();
		packagedescription.sendKeys(nam);
	}
	
	public void setselectservice(String tax)
	{
		selectservice.click();
		searchbox.click();
		searchbox.sendKeys(tax);
		searchbox.sendKeys(Keys.ENTER);
	}
	
	public void setquantity(String tax)
	{
		quantity.click();
		quantity.sendKeys(tax);
	}
	
	public void setrate(String nam)
	{
		rate.click();
		rate.sendKeys(nam);
	}
	
	public void clickonaddPackageItem()
	{
		addPackageItem.click();
	}
	
	public void setselectservice2(String tax)
	{
		selectservice2.click();
		searchbox.click();
		searchbox.sendKeys(tax);
		searchbox.sendKeys(Keys.ENTER);
	}
	
	public void setquantity1(String tax)
	{
		quantity1.click();
		quantity1.sendKeys(tax);
	}
	
	public void setrate1(String nam)
	{
		rate1.click();
		rate1.sendKeys(nam);
	}
	
	public void clickonpackageSaveBtn()
	{
		packageSaveBtn.click();
	}
	
	public void scrolldown()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,8000)", "");
	}
	
	
	public void seteditPackagename(String nam)
	{
		Packagename.click();
		Packagename.clear();
		Packagename.sendKeys(nam);
	}
	
	public void seteditpackageDiscountId(String tax)
	{
		packageDiscountId.click();
		packageDiscountId.clear();
		packageDiscountId.sendKeys(tax);
	}
	
	public void seteditpackagedescription(String nam)
	{
		packagedescription.click();
		packagedescription.clear();
		packagedescription.sendKeys(nam);
	}
	
	public void seteditselectservice(String tax)
	{
		editselectservice.click();
		searchbox.click();
		searchbox.sendKeys(tax);
		searchbox.sendKeys(Keys.ENTER);
	}
	
	public void seteditquantity(String tax)
	{
		quantity.click();
		quantity.clear();
		quantity.sendKeys(tax);
	}
	
	public void seteditrate(String nam)
	{
		rate.click();
		rate.clear();
		rate.sendKeys(nam);
	}
	
	public void seteditselectservice2(String tax)
	{
		editselectservice2.click();
		searchbox.click();
		searchbox.sendKeys(tax);
		searchbox.sendKeys(Keys.ENTER);
	}
	
	public void seteditquantity1(String tax)
	{
		quantity1.click();
		quantity1.clear();
		quantity1.sendKeys(tax);
	}
	
	public void seteditrate1(String nam)
	{
		rate1.click();
		rate1.clear();
		rate1.sendKeys(nam);
	}
	
	public void clickondeleteservicerow()
	{
		deleteservicerow.click();
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
