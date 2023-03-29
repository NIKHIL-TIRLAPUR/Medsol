package com.medsol.pageobject;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.medsol.testcases.Baseclass;

public class Frontoffice_postalreceivepage extends Baseclass
{
	WebDriver ldriver;
	public Frontoffice_postalreceivepage (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/div[3]/ul[1]/li[13]/a[1]")
    WebElement frontoffice;
	
	@FindBy(xpath="//a[normalize-space()='Postal Receive']")
    WebElement PostalReceive;
	
	@FindBy(xpath="//a[@id='dropdownMenuButton']")
    WebElement PostalReceivedropdownMenuButton;
	
	@FindBy(xpath="//a[normalize-space()='New Receive']")
    WebElement NewReceive;
	
	@FindBy(xpath="//form[@id='addReceiveForm']//input[@name='from_title']")
    WebElement fromtitle;
	
	@FindBy(xpath="//input[@id='editReceiveFromTitle']")
    WebElement editfromtitle;
	
	@FindBy(xpath="//form[@id='addReceiveForm']//input[@name='reference_no']")
    WebElement referenceno;
	
	@FindBy(xpath="//input[@id='editReceiveReferenceNumber']")
    WebElement editreferenceno;
	
	@FindBy(xpath="//input[@id='receiveDate']")
    WebElement receiveDate;
	
	@FindBy(xpath="//input[@id='editReceiveDate']")
    WebElement editreceiveDate;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/span[2]")
    WebElement yearreceivedon;
	
	@FindBy(xpath="//body/div[3]/div[1]/div[1]/div[1]/div[1]/span[1]")
    WebElement edityearreceivedon;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/select[1]")
    WebElement monthreceivedon;
	
	@FindBy(xpath="//body/div[3]/div[1]/div[1]/div[1]/select[1]")
    WebElement editmonthreceivedon;
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[2]/div[1]/span")
    List<WebElement>  datereceivedon;
	
	@FindBy(xpath="//body/div[3]/div[2]/div[1]/div[2]/div[1]/span")
    List<WebElement>  editdatereceivedon;
	
	@FindBy(xpath="//form[@id='addReceiveForm']//input[@name='to_title']")
    WebElement totitle;
	
	@FindBy(xpath="//input[@id='editReceiveToTitle']")
    WebElement edittotitle;
	
	@FindBy(xpath="//span[@title='Attachment']//label//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement attachment;
	
	
	@FindBy(xpath="//textarea[@class='form-control']")
    WebElement address;
	
	@FindBy(xpath="//textarea[@id='editReceiveAddress']")
    WebElement editaddress;
	
	@FindBy(xpath="//button[@id='receiveSave']")
    WebElement receivesave;
	
	@FindBy(xpath="//button[@id='editReceiveSave']")
    WebElement editreceivesave;
	
	@FindBy(xpath="//a[@title='Edit']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement editreceivebutton;
	
	@FindBy(xpath="//input[@name='search']")
    WebElement searchboxfordelete;
	
	@FindBy(xpath="//a[@title='Delete']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")//button[normalize-space()='Yes, Delete']
    WebElement yesdeletebutton;
	

	public void clickonfrontoffice()
	{
		frontoffice.click();
	}
	
	
	public void clickonPostalReceive()
	{
		PostalReceive.click();
	}
	
	public void clickonPostalReceivedropdownMenuButton()
	{
		PostalReceivedropdownMenuButton.click();
	}
	
	public void clickonNewReceive()
	{
		NewReceive.click();
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
	
	public void setreceivedate(String year,String month,String date)
	{
		receiveDate.click();
		yearreceivedon.click();
		//txtyear.sendKeys(year);
		 Select month_drp= new Select(monthreceivedon);
         month_drp.selectByVisibleText(month);
         List<WebElement> alldate= datereceivedon;
       
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
	
	public void clickonreceivesave()
	{
		receivesave.click();
	}
	
	public void clickoneditreceivebutton()
	{
		editreceivebutton.click();
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
	
	public void seteditreceivedate(String year,String month,String date)
	{
		editreceiveDate.click();
		edityearreceivedon.click();
		//txtyear.sendKeys(year);
		 Select month_drp= new Select(editmonthreceivedon);
         month_drp.selectByVisibleText(month);
         List<WebElement> alldate= editdatereceivedon;
       
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
	
	public void clickoneditreceivesave()
	{
		editreceivesave.click();
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
