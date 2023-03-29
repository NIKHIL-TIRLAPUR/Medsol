package com.medsol.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class FrontCms_cms_homepage extends Baseclass {

	WebDriver ldriver;
	public FrontCms_cms_homepage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//span[normalize-space()='Front CMS']")
    WebElement FrontCMS;
	
	@FindBy(xpath="//span[@title='Change home page image']//label//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement homepageimage;
	
	@FindBy(xpath="//span[@title='Change home page certified doctor image']//label//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement homepagecertifieddoctorimage;
	
	@FindBy(xpath="//input[@id='homePageExperience']")
    WebElement homePageExperience;
	
	
	@FindBy(xpath="//input[@id='homeTitleId']")
    WebElement homeTitleId;
	
	@FindBy(xpath="//textarea[@id='homeShortDescription']")
    WebElement homeShortDescription;
	
	@FindBy(xpath="//input[@id='homePageBoxTitle']")
    WebElement homePageBoxTitle;
	
	@FindBy(xpath="//textarea[@id='homePageBoxDes']")
    WebElement homePageBoxDescription;
	
	
	@FindBy(xpath="//input[@id='homeDoctorTextId']")
    WebElement homeDoctorTextId;
	
	@FindBy(xpath="//input[@id='homeDoctorTitleId']")
    WebElement homeDoctorTitleId;
	
	@FindBy(xpath="//textarea[@id='homeDoctorDescription']")
    WebElement homeDoctorDescription;
	
	@FindBy(xpath="//input[@id='homePageCerBoxTl']")
    WebElement homePageCerBoxTl;
	
	
	
	@FindBy(xpath="//textarea[@id='homePageCerBoxDes']")
    WebElement homePageCerBoxDes;
	
	@FindBy(xpath="//input[@id='homePageStep1Tl']")
    WebElement homePageStep1Tl;
	
	@FindBy(xpath="//textarea[@id='homePageStep1Des']")
    WebElement homePageStep1Des;
	
	@FindBy(xpath="//input[@id='homePageStep2Tl']")
    WebElement homePageStep2Tl;
	
	
	
	@FindBy(xpath="//textarea[@id='homePageStep2Des']")
    WebElement homePageStep2Des;
	
	@FindBy(xpath="//input[@id='homePageStep3Tl']")
    WebElement homePageStep3Tl;
	
	@FindBy(xpath="//textarea[@id='homePageStep3Des']")
    WebElement homePageStep3Des;
	
	@FindBy(xpath="//input[@id='homePageStep4Tl']")
    WebElement homePageStep4Tl;
	
	
	@FindBy(xpath="//textarea[@id='homePageStep4Des']")
    WebElement homePageStep4Des;
	
	@FindBy(xpath="//input[@value='Save']")
    WebElement Save;
	
	
	public void clickonFrontCMS()
	{
		FrontCMS.click();
	}
	
	public void clickonhomepageimage()
	{
		homepageimage.click();
	}
	
	public void clickonhomepagecertifieddoctorimage()
	{
		homepagecertifieddoctorimage.click();
	}
	
	public void sethomePageExperience(String license)
	{
		homePageExperience.click();
		homePageExperience.clear();
		homePageExperience.sendKeys(license);
	}
	
	public void sethomeTitleId(String license)
	{
		homeTitleId.click();
		homeTitleId.clear();
		homeTitleId.sendKeys(license);
	}
	
	public void sethomeShortDescription(String license)
	{
		homeShortDescription.click();
		homeShortDescription.clear();
		homeShortDescription.sendKeys(license);
	}
	
	
	
	public void sethomePageBoxTitle(String license)
	{
		homePageBoxTitle.click();
		homePageBoxTitle.clear();
		homePageBoxTitle.sendKeys(license);
	}
	
	public void sethomeDoctorDescription(String license)
	{
		homeDoctorDescription.click();
		homeDoctorDescription.clear();
		homeDoctorDescription.sendKeys(license);
	}
	
	public void sethomeDoctorTextId(String license)
	{
		homeDoctorTextId.click();
		homeDoctorTextId.clear();
		homeDoctorTextId.sendKeys(license);
	}
	
	
	
	public void sethomeDoctorTitleId(String license)
	{
		homeDoctorTitleId.click();
		homeDoctorTitleId.clear();
		homeDoctorTitleId.sendKeys(license);
	}
	
	public void sethomePageBoxDescription(String license)
	{
		homePageBoxDescription.click();
		homePageBoxDescription.clear();
		homePageBoxDescription.sendKeys(license);
	}
	
	public void sethomePageCerBoxTl(String license)
	{
		homePageCerBoxTl.click();
		homePageCerBoxTl.clear();
		homePageCerBoxTl.sendKeys(license);
	}
	
	
	
	
	public void sethomePageCerBoxDes(String license)
	{
		homePageCerBoxDes.click();
		homePageCerBoxDes.clear();
		homePageCerBoxDes.sendKeys(license);
	}
	
	public void sethomePageStep1Tl(String license)
	{
		homePageStep1Tl.click();
		homePageStep1Tl.clear();
		homePageStep1Tl.sendKeys(license);
	}
	
	public void sethomePageStep1Des(String license)
	{
		homePageStep1Des.click();
		homePageStep1Des.clear();
		homePageStep1Des.sendKeys(license);
	}
	
	
	
	
	
	public void sethomePageStep2Tl(String license)
	{
		homePageStep2Tl.click();
		homePageStep2Tl.clear();
		homePageStep2Tl.sendKeys(license);
	}
	
	public void sethomePageStep2Des(String license)
	{
		homePageStep2Des.click();
		homePageStep2Des.clear();
		homePageStep2Des.sendKeys(license);
	}
	
	public void sethomePageStep3Tl(String license)
	{
		homePageStep3Tl.click();
		homePageStep3Tl.clear();
		homePageStep3Tl.sendKeys(license);
	}
	
	
	
	public void sethomePageStep3Des(String license)
	{
		homePageStep3Des.click();
		homePageStep3Des.clear();
		homePageStep3Des.sendKeys(license);
	}
	
	public void sethomePageStep4Tl(String license)
	{
		homePageStep4Tl.click();
		homePageStep4Tl.clear();
		homePageStep4Tl.sendKeys(license);
	}
	
	public void sethomePageStep4Des(String license)
	{
		homePageStep4Des.click();
		homePageStep4Des.clear();
		homePageStep4Des.sendKeys(license);
	}
	
	
	public void clickonSave()
	{
		Save.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
