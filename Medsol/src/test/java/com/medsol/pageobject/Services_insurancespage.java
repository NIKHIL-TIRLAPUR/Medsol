package com.medsol.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class Services_insurancespage extends Baseclass{

	WebDriver ldriver;
	public Services_insurancespage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[contains(@class,'aside-menu-title')][normalize-space()='Services']")
    WebElement Services;
	
	@FindBy(xpath="//a[normalize-space()='Insurances']")
    WebElement Insurances;
	
	@FindBy(xpath="//a[normalize-space()='New Insurance']")
    WebElement NewInsurance;
	
	@FindBy(xpath="//input[@id='name']")
    WebElement name;
	
	@FindBy(xpath="//input[@id='service_tax']")
    WebElement service_tax;
	
	@FindBy(xpath="//input[@id='insuranceDiscountId']")//input[@id='insuranceDiscountId']
    WebElement insuranceDiscountId;
	
	@FindBy(xpath="//input[@id='insurance_no']")
    WebElement insurance_no;
	
	@FindBy(xpath="//input[@id='insurance_code']")
    WebElement insurance_code;
	
	@FindBy(xpath="//input[@id='hospital_rate']")
    WebElement hospital_rate;
	
	@FindBy(xpath="//textarea[@id='remark']")
    WebElement remark;
	
	@FindBy(xpath="//input[@name='status']")
    WebElement status;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[9]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
    WebElement diseasesname;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[9]/div[2]/table[1]/tbody[1]/tr[1]/td[3]/input[1]")
    WebElement diseasescharge;
	
	@FindBy(xpath="//button[@id='addInsuranceItem']")
    WebElement addInsuranceItem;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[9]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/input[1]")
    WebElement diseasesname1;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[9]/div[2]/table[1]/tbody[1]/tr[2]/td[3]/input[1]")
    WebElement diseasescharge1;
	
	@FindBy(xpath="//input[@id='insuranceSaveBtn']")
    WebElement insuranceSaveBtn;
	
	@FindBy(xpath="//a[@title='Edit']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement editbutton;
	
	@FindBy(xpath="//input[@name='search']")//input[@name='search']
    WebElement searchboxfordeleteoredit;
	
	@FindBy(xpath="//a[@title='Delete']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
    WebElement yesdeletebutton;
	
	
	public void clickonServices()
	{
		Services.click();
	}
	
	public void clickonInsurances()
	{
		Insurances.click();
	}
	
	public void clickonNewInsurance()
	{
		NewInsurance.click();
	}
	
	public void setname(String nam)
	{
		name.click();
		name.sendKeys(nam);
	}
	
	public void setservice_tax(String tax)
	{
		service_tax.click();
		service_tax.sendKeys(tax);
	}
	
	public void setinsuranceDiscount()
	{
		insuranceDiscountId.click();
		insuranceDiscountId.clear();
		
	}
	
	
	public void setinsuranceDiscountId(String id)
	{
		insuranceDiscountId.click();
		insuranceDiscountId.clear();
		insuranceDiscountId.sendKeys(id);
	}
	
	public void setinsurance_no(String no)
	{
		insurance_no.click();
		insurance_no.sendKeys(no);
	}
	
	public void setinsurance_code(String no)
	{
		insurance_code.click();
		insurance_code.sendKeys(no);
	}
	
	public void sethospital_rate(String no)
	{
		hospital_rate.click();
		hospital_rate.sendKeys(no);
	}
	
	public void setremark(String no)
	{
		remark.click();
		remark.sendKeys(no);
	}
	
	public void clickonstatus()
	{
		status.click();
	}
	
	public void setdiseasesname(String no)
	{
		diseasesname.click();
		diseasesname.sendKeys(no);
	}
	
	public void setdiseasescharge(String no)
	{
		diseasescharge.click();
		diseasescharge.sendKeys(no);
	}
	
	public void clickonaddInsuranceItem()
	{
		addInsuranceItem.click();
	}
	
	public void setdiseasesname1(String no)
	{
		diseasesname1.click();
		diseasesname1.sendKeys(no);
	}
	
	public void setdiseasescharge1(String no)
	{
		diseasescharge1.click();
		diseasescharge1.sendKeys(no);
	}
	
	public void clickoninsuranceSaveBtn()
	{
		insuranceSaveBtn.click();
	}
	
	public void scrolldown()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,8000)", "");
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
	
	
	public void seteditname(String nam)
	{
		name.click();
		name.clear();
		name.sendKeys(nam);
	}
	
	public void seteditservice_tax(String tax)
	{
		service_tax.click();
		service_tax.clear();
		service_tax.sendKeys(tax);
	}
	
	public void seteditinsuranceDiscount()
	{
		insuranceDiscountId.click();
		insuranceDiscountId.clear();
		
	}
	
	
	public void seteditinsuranceDiscountId(String id)
	{
		insuranceDiscountId.click();
		insuranceDiscountId.clear();
		insuranceDiscountId.sendKeys(id);
	}
	
	public void seteditinsurance_no(String no)
	{
		insurance_no.click();
		insurance_no.clear();
		insurance_no.sendKeys(no);
	}
	
	public void seteditinsurance_code(String no)
	{
		insurance_code.click();
		insurance_code.clear();
		insurance_code.sendKeys(no);
	}
	
	public void setedithospital_rate(String no)
	{
		hospital_rate.click();
		hospital_rate.clear();
		hospital_rate.sendKeys(no);
	}
	
	public void seteditremark(String no)
	{
		remark.click();
		remark.clear();
		remark.sendKeys(no);
	}
	
	
	public void seteditdiseasesname(String no)
	{
		diseasesname.click();
		diseasesname.clear();
		diseasesname.sendKeys(no);
	}
	
	public void seteditdiseasescharge(String no)
	{
		diseasescharge.click();
		diseasescharge.clear();
		diseasescharge.sendKeys(no);
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
