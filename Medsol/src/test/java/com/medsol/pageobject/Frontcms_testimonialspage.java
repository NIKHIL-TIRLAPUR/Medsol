package com.medsol.pageobject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class Frontcms_testimonialspage extends Baseclass 
{

	WebDriver ldriver;
	public Frontcms_testimonialspage (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/div[3]/ul[1]/li[14]/a[1]")
    WebElement frontcms;
	
	@FindBy(xpath="//a[normalize-space()='Testimonials']")
    WebElement Testimonials;
	
	@FindBy(xpath="//a[normalize-space()='New Testimonial']")
    WebElement NewTestimonial;
	
	@FindBy(xpath="//input[@id='name']")
    WebElement txtname;
	
	@FindBy(xpath="//textarea[@id='description']")
    WebElement txtdescription;
	
	@FindBy(xpath="//button[@id='testimonialSave']")
    WebElement testimonialSave;
	
	@FindBy(xpath="//span[@title='Profile']//label//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement profileattachment;
	
	
	
	@FindBy(xpath="//a[@title='Edit']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement editbutton;
	
	@FindBy(xpath="//input[@id='editTestimonialName']")
    WebElement editTestimonialName;
	
	@FindBy(xpath="//textarea[@id='editTestimonialDescription']")
    WebElement editTestimonialDescription;
	
	@FindBy(xpath="//button[@id='editTestimonialSave']")
    WebElement editTestimonialSave;
	
	@FindBy(xpath="//input[@name='search']")
    WebElement searchbox;
	
	
	@FindBy(xpath="//a[@title='Delete']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
    WebElement yesdeletebutton;
	
	
	public void clickonfrontcms()
	{
		frontcms.click();
	}
	
	public void clickonTestimonials()
	{
		Testimonials.click();
	}
	
	public void clickonNewTestimonial()
	{
		NewTestimonial.click();
	}
	
	public void setnameintestimonials(String name)
	{
		txtname.click();
		txtname.sendKeys(name);
	}
	
	public void setdescriptionoftestimonials(String des)
	{
		txtdescription.click();
		txtdescription.sendKeys(des);
	}
	
	
	public void clickontestimonialSave()
	{
		testimonialSave.click();
	}
	
	public void setprofileattachment() throws AWTException
	{
		profileattachment.click();
		Robot rb= new Robot();
		rb.delay(2000);
		
		StringSelection ss= new StringSelection("C:\\Users\\user\\Desktop\\31-01-2023\\home.jpg");
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
	
	
	public void setedittitleintestimonals(String etitle)
	{
		editTestimonialName.click();
		editTestimonialName.clear();
		editTestimonialName.sendKeys(etitle);
	}
	
	
	public void seteditdescriptionoftestimonals(String edes)
	{
		editTestimonialDescription.click();
		editTestimonialDescription.clear();
		editTestimonialDescription.sendKeys(edes);
	}
	
	public void clickoneditTestimonialSave()
	{
		editTestimonialSave.click();
	}
	
	public void clickoneditbutton()
	{
		editbutton.click();
	}
	
	public void setnamesearchbox(String name)
	{
		searchbox.click();
		searchbox.sendKeys(name);
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
