package com.medsol.pageobject;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.medsol.testcases.Baseclass;

public class Frontoffice_postaldispatchpage extends Baseclass 
{
	WebDriver ldriver;
	public Frontoffice_postaldispatchpage (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/div[3]/ul[1]/li[13]/a[1]")
    WebElement frontoffice;
	
	@FindBy(xpath="//a[normalize-space()='Postal Dispatch']")
    WebElement PostalDispatch;
	
	@FindBy(xpath="//a[@id='dropdownMenuButton']")
    WebElement PostaldispatchdropdownMenuButton;
	
	@FindBy(xpath="//a[normalize-space()='New Dispatch']")
    WebElement NewDispatch;
	
	@FindBy(xpath="//form[@id='addDispatchForm']//input[@name='to_title']")
    WebElement fromtitle;
	
	@FindBy(xpath="//input[@id='editDispatchToTitle']")
    WebElement editfromtitle;
	
	@FindBy(xpath="//form[@id='addDispatchForm']//input[@name='reference_no']")
    WebElement referenceno;
	
	@FindBy(xpath="//input[@id='editDispatchReferenceNumber']")
    WebElement editreferenceno;
	
	@FindBy(xpath="//input[@id='dispatchDate']")
    WebElement dispatchDate;
	
	@FindBy(xpath="//input[@id='editDispatchDate']")
    WebElement editdispatchDate;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/span[2]")//body/div[3]/div[1]/div[1]/div[1]/div[1]/span[1]
    WebElement yeardispatchin;
	
	@FindBy(xpath="//body/div[3]/div[1]/div[1]/div[1]/div[1]/span[1]")
    WebElement edityeardispatchin;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/select[1]")//body/div[2]/div[1]/div[1]/div[1]/select[1]
    WebElement monthdispatchin;
	
	@FindBy(xpath="//body/div[3]/div[1]/div[1]/div[1]/select[1]")
    WebElement editmonthdispatchin;
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[2]/div[1]/span")//body/div[2]/div[2]/div[1]/div[2]/div[1]/span
    List<WebElement>  datedispatchon;
	
	@FindBy(xpath="//body/div[3]/div[2]/div[1]/div[2]/div[1]/span")//body/div[3]/div[2]/div[1]/div[2]/div[1]/span
    List<WebElement>  editdatedispatchon;
	
	@FindBy(xpath="//form[@id='addDispatchForm']//input[@name='from_title']")
    WebElement totitle;
	
	@FindBy(xpath="//input[@id='editDispatchFromTitle']")
    WebElement edittotitle;
	
	@FindBy(xpath="//span[@title='Attachment']//label//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement attachment;
	
	
	
	@FindBy(xpath="//textarea[@class='form-control']")
    WebElement address;
	
	@FindBy(xpath="//textarea[@id='editDispatchAddress']")
    WebElement editaddress;
	
	@FindBy(xpath="//button[@id='dispatchSave']")
    WebElement dispatchSave;
	
	@FindBy(xpath="//button[@id='editDispatchSave']")
    WebElement editdispatchSave;
	
	@FindBy(xpath="//tbody/tr[1]/td[6]/div[1]/a[1]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement editdispatchbutton;
	
	@FindBy(xpath="//input[@name='search']")
    WebElement searchboxfordelete;
	
	@FindBy(xpath="//tbody/tr[1]/td[6]/div[1]/a[2]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")//button[normalize-space()='Yes, Delete']
    WebElement yesdeletebutton;
	
	
	public void clickonfrontoffice()
	{
		frontoffice.click();
	}
	
	
	public void clickonPostalDispatch()
	{
		PostalDispatch.click();
	}
	
	public void clickonPostaldispatchdropdownMenuButton()
	{
		PostaldispatchdropdownMenuButton.click();
	}
	
	
	public void clickonNewDispatch()
	{
		NewDispatch.click();
	}
	
	public void setfromtitle(String title)
	{
		fromtitle.click();
		fromtitle.sendKeys(title);
	}
	
	public void setreferenceno(String reference)
	{
		referenceno.click();
		referenceno.sendKeys(reference);
	}
	
	public void setdispatchdate(String year,String month,String date)
	{
		dispatchDate.click();
		yeardispatchin.click();
		//txtyear.sendKeys(year);
		 Select month_drp= new Select(monthdispatchin);
         month_drp.selectByVisibleText(month);
         List<WebElement> alldate= datedispatchon;
       
         for(WebElement ele:alldate)

         {

                       String dt= ele.getText();

                       if(dt.equals(date))

                       {

                                     ele.click();

                                     break;

                       }

         }
	}
	
	public void settotitle(String title)
	{
		totitle.click();
		totitle.sendKeys(title);
	}
	
	
	public void setaddress(String add)
	{
		address.click();
		address.sendKeys(add);
	}
	
	public void clickondispatchSave()
	{
		dispatchSave.click();
	}
	
	public void clickoneditdispatchbutton()
	{
		editdispatchbutton.click();
	}
	
	public void seteditfromtitle(String etitle)
	{
		editfromtitle.click();
		editfromtitle.clear();
		
		editfromtitle.sendKeys(etitle);
	}
	
	public void seteditreferenceno(String ereference)
	{
		editreferenceno.click();
		editreferenceno.clear();
		editreferenceno.sendKeys(ereference);
	}
	
	public void seteditdispatchdate(String year,String month,String date)
	{
		editdispatchDate.click();
		edityeardispatchin.click();
		//txtyear.sendKeys(year);
		 Select month_drp= new Select(editmonthdispatchin);
         month_drp.selectByVisibleText(month);
         List<WebElement> alldate= editdatedispatchon;
       
         for(WebElement ele:alldate)

         {

                       String dt= ele.getText();

                       if(dt.equals(date))

                       {

                                     ele.click();

                                     break;

                       }

         }
	}
	
	public void setedittotitle(String title)
	{
		edittotitle.click();
		edittotitle.clear();
		edittotitle.sendKeys(title);
	}
	
	
	public void seteditaddress(String add)
	{
		editaddress.click();
		editaddress.clear();
		editaddress.sendKeys(add);
	}
	
	public void clickoneditdispatchSave()
	{
		editdispatchSave.click();
	}
	
	public void setreferencenoinsearchboxfordelete(String name)
	{
		searchboxfordelete.click();
		searchboxfordelete.sendKeys(name);
		searchboxfordelete.sendKeys(Keys.ENTER);
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
