package com.medsol.pageobject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.medsol.testcases.Baseclass;

public class Finances_incomepage extends Baseclass
{

	WebDriver ldriver;
	public Finances_incomepage (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Finances')]")
    WebElement finances;
	
	@FindBy(xpath="//a[@id='dropdownMenuButton']")
    WebElement dropdownMenuButton;
	
	@FindBy(xpath="//a[normalize-space()='New Income']")
    WebElement newincomeButton;
	
	@FindBy(xpath="//span[@id='select2-incomeId-container']")
    WebElement incomeheaddropdown;
	
	@FindBy(xpath="//span[@id='select2-editIncomeHeadId-container']")
    WebElement editincomeheaddropdown;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement txtsearchbox;
	
	
	
	
	@FindBy(xpath="//input[@id='name']")
    WebElement txtname;
	
	@FindBy(xpath="//input[@id='editIncomeName']")
    WebElement txteditname;
	
	
	@FindBy(xpath="//input[@id='invoice_number']")
    WebElement txtinvoicenumber;
	
	@FindBy(xpath="//input[@id='editIncomeInvoiceNumber']")
    WebElement txteditinvoicenumber;
	
	
	@FindBy(xpath="//input[@id='incomeAmount']")
    WebElement txtincomeAmount;
	
	@FindBy(xpath="//input[@id='editIncomeAmount']")
    WebElement txteditincomeAmount;
	
	@FindBy(xpath="//span[@title='Attachment']//label//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement attachmentbutton;
	
	@FindBy(xpath="//span[@title='Change attachment']//label//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement editattachmentbutton;
	
	
	@FindBy(xpath="//textarea[@id='description']")
    WebElement txtdescription;
	
	@FindBy(xpath="//textarea[@id='editIncomeDescription']")
    WebElement txteditdescription;
	
	@FindBy(xpath="//input[@id='incomeDate']")
    WebElement incomeDate;
	
	@FindBy(xpath="//input[@id='editIncomeDate']")
    WebElement editincomeDate;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/span[2]")//body/div[3]/div[1]/div[1]/div[1]/div[1]/span[2]
    WebElement txtyearinincome;
	
	@FindBy(xpath="//body/div[3]/div[1]/div[1]/div[1]/div[1]/span[2]")
    WebElement txtedityearinincome;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/select[1]")//body/div[3]/div[1]/div[1]/div[1]/select[1]
    WebElement txtmonthinincome;
	
	@FindBy(xpath="//body/div[3]/div[1]/div[1]/div[1]/select[1]")
    WebElement txteditmonthinincome;
	
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[2]/div[1]/span")//body/div[3]/div[2]/div[1]/div[2]/div[1]/span[14]
    List<WebElement>  txtdateinincome;
	
	@FindBy(xpath="//body/div[3]/div[2]/div[1]/div[2]/div[1]/span")
    List<WebElement>  txteditdateinincome;
	
	
	@FindBy(xpath="//button[@id='incomeSave']")
    WebElement incomesavebutton;
	
	@FindBy(xpath="//button[@id='editIncomeSave']")
    WebElement editincomesavebutton;
	
	
	@FindBy(xpath="//a[@title='Edit']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement editincomebutton;
	
	@FindBy(xpath="//input[@name='search']")
    WebElement searchboxfordelete;
	
	@FindBy(xpath="//a[@title='Delete']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
    WebElement yesdeletebutton;
	
	
	public void clickonfinances()
	{
		finances.click();
	}
	
	public void clickondropdownMenuButton()
	{
		dropdownMenuButton.click();
	}
	
	public void clickonnewincomeButton()
	{
		newincomeButton.click();
	}
	
	public void setincomeheaddropdown(String incomeheadtype)
	{
		incomeheaddropdown.click();
		txtsearchbox.click();
		txtsearchbox.sendKeys(incomeheadtype);
		txtsearchbox.sendKeys(Keys.ENTER);
	}
	
	public void setname(String name)
	{
		txtname.click();
		txtname.sendKeys(name);
	}
	
	public void setincomedate(String month,String date)
	{
		incomeDate.click();
		//txtlastdonationyear.click();
		txtyearinincome.click();
		//txtyearindob.sendKeys(year);
		/*while(true)

        {
                      String year1= txtdonationyear.getText();

                      if(year.equals(year1))
                      
                                    break;
                      else
                    	  yeardownarrow.click();

        }*/
		 Select month_drp= new Select(txtmonthinincome);
         month_drp.selectByVisibleText(month);
         List<WebElement> alldate= txtdateinincome;
       
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
	
	
	
	
	
	public void setinvoicenumber(String invoicenum)
	{
		txtinvoicenumber.click();
		txtinvoicenumber.sendKeys(invoicenum);
	}
	
	public void setamount(String amount)
	{
		txtincomeAmount.click();
		txtincomeAmount.sendKeys(amount);
	}
	
	public void clickonattachment()
	{
		attachmentbutton.click();
	}
	
	
	public void setattachment(String path) throws AWTException
	{
		Robot rb= new Robot();
		rb.delay(2000);
		
		StringSelection ss= new StringSelection(path);
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
	
	public void setdescription(String description)
	{
		txtdescription.click();
		txtdescription.sendKeys(description);
	}
	
	public void clickonincomesavebutton()
	{
		incomesavebutton.click();
	}
	
	public void clickoneditincomebutton()
	{
		editincomebutton.click();
	}
	
	public void seteditincomeheaddropdown(String eincomeheadtype)
	{
		editincomeheaddropdown.click();
		txtsearchbox.click();
		txtsearchbox.sendKeys(eincomeheadtype);
		txtsearchbox.sendKeys(Keys.ENTER);
	}
	
	public void seteditname(String ename)
	{
		txteditname.click();
		txteditname.clear();
		txteditname.sendKeys(ename);
	}
	
	public void seteditincomedate(String month,String date)
	{
		editincomeDate.click();
		//txtlastdonationyear.click();
		txtedityearinincome.click();
		//txtyearindob.sendKeys(year);
		/*while(true)

        {
                      String year1= txtdonationyear.getText();

                      if(year.equals(year1))
                      
                                    break;
                      else
                    	  yeardownarrow.click();

        }*/
		 Select month_drp= new Select(txteditmonthinincome);
         month_drp.selectByVisibleText(month);
         List<WebElement> alldate= txteditdateinincome;
       
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
	
	
	public void seteditinvoicenumber(String einvoicenum)
	{
		txteditinvoicenumber.click();
		txteditinvoicenumber.clear();
		txteditinvoicenumber.sendKeys(einvoicenum);
	}
	
	public void seteditamount(String eamount)
	{
		txteditincomeAmount.click();
		txteditincomeAmount.clear();
		txteditincomeAmount.sendKeys(eamount);
	}
	
	public void seteditdescription(String edescription)
	{
		txteditdescription.click();
		txteditdescription.clear();
		txteditdescription.sendKeys(edescription);
	}
	
	public void clickoneditincomesavebutton()
	{
		editincomesavebutton.click();
	}
	
	public void setnameinsearchboxfordelete(String name)
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
