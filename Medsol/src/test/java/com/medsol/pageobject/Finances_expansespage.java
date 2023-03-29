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

public class Finances_expansespage extends Baseclass 
{
	WebDriver ldriver;
	public Finances_expansespage (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Finances')]")
    WebElement finances;
	
	@FindBy(xpath="//a[normalize-space()='Expenses']")
    WebElement financesexpanses;
	
	@FindBy(xpath="//a[@id='dropdownMenuButton']")//a[@id='dropdownMenuButton']
    WebElement dropdownMenuButton;
	
	@FindBy(xpath="//a[normalize-space()='New Expense']")//a[normalize-space()='New Expense']
    WebElement newexpansesButton;
	
	@FindBy(xpath="//span[@id='select2-expenseId-container']")
    WebElement expansesheaddropdown;
	
	@FindBy(xpath="//span[@id='select2-editExpenseHeadId-container']")
    WebElement editexpanseheaddropdown;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement txtsearchbox;
	
	
	
	
	@FindBy(xpath="//input[@id='name']")//input[@id='name']
    WebElement txtname;
	
	@FindBy(xpath="//input[@id='editExpenseName']")
    WebElement txteditname;
	
	
	@FindBy(xpath="//input[@id='invoice_number']")//input[@id='invoice_number']
    WebElement txtinvoicenumber;
	
	@FindBy(xpath="//input[@id='editExpenseInvoiceNumber']")
    WebElement txteditexpanseinvoicenumber;
	
	
	@FindBy(xpath="//input[@id='expenseAmount']")
    WebElement txtexpanseAmount;
	
	@FindBy(xpath="//input[@id='editExpenseAmount']")
    WebElement txteditexpanseAmount;
	
	@FindBy(xpath="//span[@title='Attachment']//label//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement attachmentbutton;
	
	@FindBy(xpath="//span[@title='Change attachment']//label//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement editattachmentbutton;
	
	
	@FindBy(xpath="//textarea[@id='description']")//textarea[@id='description']
    WebElement txtdescription;
	
	@FindBy(xpath="//textarea[@id='editExpenseDescription']")
    WebElement txteditexpansedescription;
	
	@FindBy(xpath="//input[@id='expenseDate']")
    WebElement expanseDate;
	
	@FindBy(xpath="//input[@id='editExpenseDate']")
    WebElement editexpanseDate;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/span[2]")//body/div[3]/div[1]/div[1]/div[1]/div[1]/span[2]
    WebElement txtyearinexpanse;
	
	@FindBy(xpath="//body/div[3]/div[1]/div[1]/div[1]/div[1]/span[1]")
    WebElement txtedityearinexpanse;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/select[1]")//body/div[3]/div[1]/div[1]/div[1]/select[1]
    WebElement txtmonthinexpanse;
	
	@FindBy(xpath="//body[1]/div[3]/div[1]/div[1]/div[1]/select[1]")
    WebElement txteditmonthinexpanse;
	
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[2]/div[1]/span")//body/div[3]/div[2]/div[1]/div[2]/div[1]/span[14]
    List<WebElement>  txtdateinexpanse;
	
	@FindBy(xpath="//body/div[3]/div[2]/div[1]/div[2]/div[1]/span")
    List<WebElement>  txteditdateinexpanse;
	
	
	@FindBy(xpath="//button[@id='expenseSave']")
    WebElement expansesavebutton;
	
	@FindBy(xpath="//button[@id='editExpenseSave']")
    WebElement editexpansesavebutton;
	
	
	@FindBy(xpath="//tbody/tr[1]/td[7]/a[1]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")//tbody/tr[1]/td[7]/a[1]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]
    WebElement editexpansesbutton;
	
	@FindBy(xpath="//input[@name='search']")
    WebElement searchboxfordelete;
	
	@FindBy(xpath="//tbody/tr[1]/td[7]/a[2]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")//button[normalize-space()='Yes, Delete']
    WebElement yesdeletebutton;
	
	
	public void clickonfinances()
	{
		finances.click();
	}
	
	public void clickonfinancesexpanses()
	{
		financesexpanses.click();
	}
	
	public void clickondropdownMenuButton()
	{
		dropdownMenuButton.click();
	}
	
	public void clickonnewexpansesButton()
	{
		newexpansesButton.click();
	}
	
	public void setexpansesheaddropdown(String expansesheadtype)
	{
		expansesheaddropdown.click();
		txtsearchbox.click();
		txtsearchbox.sendKeys(expansesheadtype);
		txtsearchbox.sendKeys(Keys.ENTER);
	}
	
	public void setname(String name)
	{
		txtname.click();
		txtname.sendKeys(name);
	}
	
	public void setexpansesdate(String month,String date)
	{
		expanseDate.click();
		//txtlastdonationyear.click();
		txtyearinexpanse.click();
		//txtyearindob.sendKeys(year);
		/*while(true)

        {
                      String year1= txtdonationyear.getText();

                      if(year.equals(year1))
                      
                                    break;
                      else
                    	  yeardownarrow.click();

        }*/
		 Select month_drp= new Select(txtmonthinexpanse);
         month_drp.selectByVisibleText(month);
         List<WebElement> alldate= txtdateinexpanse;
       
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
		txtexpanseAmount.click();
		txtexpanseAmount.sendKeys(amount);
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
	
	public void clickonexpansesavebutton()
	{
		expansesavebutton.click();
	}
	
	public void clickoneditexpansesbutton()
	{
		editexpansesbutton.click();
	}
	
	public void seteditexpanseheaddropdown(String expanseheadtype)
	{
		editexpanseheaddropdown.click();
		txtsearchbox.click();
		txtsearchbox.sendKeys(expanseheadtype);
		txtsearchbox.sendKeys(Keys.ENTER);
	}
	
	public void seteditname(String ename)
	{
		txteditname.click();
		txteditname.clear();
		txteditname.sendKeys(ename);
	}
	
	public void seteditexpansedate(String month,String date)
	{
		editexpanseDate.click();
		//txtlastdonationyear.click();
		txtedityearinexpanse.click();
		//txtyearindob.sendKeys(year);
		/*while(true)

        {
                      String year1= txtdonationyear.getText();

                      if(year.equals(year1))
                      
                                    break;
                      else
                    	  yeardownarrow.click();

        }*/
		 Select month_drp= new Select(txteditmonthinexpanse);
         month_drp.selectByVisibleText(month);
         List<WebElement> alldate= txteditdateinexpanse;
       
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
		txteditexpanseinvoicenumber.click();
		txteditexpanseinvoicenumber.clear();
		txteditexpanseinvoicenumber.sendKeys(einvoicenum);
	}
	
	public void seteditamount(String eamount)
	{
		txteditexpanseAmount.click();
		txteditexpanseAmount.clear();
		txteditexpanseAmount.sendKeys(eamount);
	}
	
	public void seteditdescription(String edescription)
	{
		txteditexpansedescription.click();
		txteditexpansedescription.clear();
		txteditexpansedescription.sendKeys(edescription);
	}
	
	
	
	public void clickoneditexpansesavebutton()
	{
		editexpansesavebutton.click();
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
