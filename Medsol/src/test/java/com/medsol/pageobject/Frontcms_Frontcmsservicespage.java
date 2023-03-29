package com.medsol.pageobject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class Frontcms_Frontcmsservicespage extends Baseclass
{
	WebDriver ldriver;
	public Frontcms_Frontcmsservicespage (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/div[3]/ul[1]/li[14]/a[1]")
    WebElement frontcms;
	
	@FindBy(xpath="//a[normalize-space()='Front CMS Services']")
    WebElement FrontCMSServices;
	
	@FindBy(xpath="//a[normalize-space()='New Service']")
    WebElement NewService;
	
	@FindBy(xpath="//input[@id='name']")
    WebElement txtname;
	
	@FindBy(xpath="//textarea[@id='short_description']")
    WebElement shortdescription;
	
	@FindBy(xpath="//span[@title='Icon']//label//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement icon;
	
	@FindBy(xpath="//button[@id='frontServiceSave']")
    WebElement frontServiceSave;
	
	public void clickonfrontcms()
	{
		frontcms.click();
	}
	
	
	public void clickonFrontCMSServices()
	{
		FrontCMSServices.click();
	}
	
	public void clickonNewService()
	{
		NewService.click();
	}
	
	public void setnameinnewservice(String servicename)
	{
		txtname.click();
		txtname.sendKeys(servicename);
	}
	
	public void setshortdescription(String sdiscription)
	{
		shortdescription.click();
		shortdescription.sendKeys(sdiscription);
	}
	
	
	
	public void setclickontheicon() throws AWTException
	{
		icon.click();
		Robot rb= new Robot();
		rb.delay(2000);
		
		StringSelection ss= new StringSelection("C:\\Users\\user\\Desktop\\31-01-2023\\home");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(2000);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(2000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	public void clickonfrontServiceSave()
	{
		frontServiceSave.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
