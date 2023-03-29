package com.medsol.pageobject;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.medsol.testcases.Baseclass;

public class Frontoffice_calllogspage  extends Baseclass 
{

	WebDriver ldriver;
	public Frontoffice_calllogspage (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/div[3]/ul[1]/li[13]/a[1]")
    WebElement frontoffice;
	
	@FindBy(xpath="//a[@id='dropdownMenuButton']")
    WebElement calllogsdropdownMenuButton;
	
	@FindBy(xpath="//a[normalize-space()='New Call Log']")
    WebElement newcalllogButton;
	
	@FindBy(xpath="//input[@name='name']")
    WebElement txtname;
	
	@FindBy(xpath="//input[@id='callLogPhoneNumber']")//input[@id='phoneNumber']
    WebElement txtphonenumber;
	
	@FindBy(xpath="//input[@id='phoneNumber']")
    WebElement txteditphonenumber;
	
	
	@FindBy(xpath="//div[@class='iti__selected-dial-code']")
    WebElement countrydropdown;
	
	@FindBy(xpath="//div[@class='iti__flag-container']//ul//li")
    List<WebElement>  countriescodes;
	
	@FindBy(xpath="//input[@id='callLogDate']")//input[@id='callLogDate']
    WebElement receivedon;
	
	
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]")//body/div[3]/div[1]/div[1]/div[1]/div[1]/span[1]
    WebElement txtyearreceivedon;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/select[1]")//body/div[3]/div[1]/div[1]/div[1]/select[1]
    WebElement txtmonthreceivedon;
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[2]/div[1]/span")//body/div[3]/div[2]/div[1]/div[2]/div[1]/span
    List<WebElement>  txtreceivedondate;
	
	@FindBy(xpath="//input[@id='callLogFollowUpDate']")
    WebElement followup;
	

	@FindBy(xpath="//body/div[3]/div[1]/div[1]/div[1]/div[1]/span[1]")
    WebElement txtyearfollowup;
	
	@FindBy(xpath="//body/div[3]/div[1]/div[1]/div[1]/select[1]")
    WebElement txtmonthfollowup;
	
	@FindBy(xpath="//body/div[3]/div[2]/div[1]/div[2]/div[1]/span")
    List<WebElement>  txtfollowupdate;
	
	@FindBy(xpath="//textarea[@name='note']")
    WebElement txtnote;
	
	@FindBy(xpath="//input[@value='2']")
    WebElement outradiobutton;
	
	@FindBy(xpath="//div[@class='d-flex align-items-center']//div[1]//input[1]")
    WebElement inradiobutton;
	
	@FindBy(xpath="//input[@id='callLogSave']")
    WebElement callLogSavebutton;
	
	@FindBy(xpath="//a[@title='Edit']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement callLogeditbutton;
	
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
	
	public void clickoncalllogsdropdownMenuButton()
	{
		calllogsdropdownMenuButton.click();
	}
	
	public void clickonnewcalllogButton()
	{
		newcalllogButton.click();
	}
	
	public void setname(String name)
	{
		txtname.click();
		txtname.sendKeys(name);
	}
	
	public void seteditname(String ename)
	{
		txtname.click();
		txtname.clear();
		txtname.sendKeys(ename);
	}
	
	
	public void setcountry(String country)
	{
		countrydropdown.click();
        List<WebElement> countries= countriescodes;
        for(WebElement nation:countries)
        {
        	if(nation.getText().equals("Indonesia"))
        	{
        		nation.click();
        		break;
        	}
        		
        }

	}
	
	
	public void setphonenumber(String number)
	{
		txtphonenumber.click();
		txtphonenumber.sendKeys(number);
	}
	
	public void seteditphonenumber(String enumber)
	{
		txteditphonenumber.click();
		txteditphonenumber.clear();
		txteditphonenumber.sendKeys(enumber);
	}
	
	
	public void setreceivedondate(String month,String date)
	{
		receivedon.click();
		//txtlastdonationyear.click();
		//txtyearinexpanse.click();
		//txtyearindob.sendKeys(year);
		/*while(true)

        {
                      String year1= txtdonationyear.getText();

                      if(year.equals(year1))
                      
                                    break;
                      else
                    	  yeardownarrow.click();

        }*/
		 Select month_drp= new Select(txtmonthreceivedon);
         month_drp.selectByVisibleText(month);
         List<WebElement> alldate= txtreceivedondate;
       
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
	
	
	public void setfollowupdate(String month,String date)
	{
		followup.click();
		//txtlastdonationyear.click();
		txtyearfollowup.click();
		//txtyearindob.sendKeys(year);
		/*while(true)

        {
                      String year1= txtdonationyear.getText();

                      if(year.equals(year1))
                      
                                    break;
                      else
                    	  yeardownarrow.click();

        }*/
		 Select month_drp= new Select(txtmonthfollowup);
         month_drp.selectByVisibleText(month);
         List<WebElement> alldate= txtfollowupdate;
       
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
	
	
	public void setnote(String note)
	{
		txtnote.click();
		txtnote.sendKeys(note);
	}
	
	public void seteditnote(String enote)
	{
		txtnote.click();
		txtnote.clear();
		txtnote.sendKeys(enote);
	}
	
	
	public void clickonoutradiobutton()
	{
		outradiobutton.click();
	}
	
	public void clickoninradiobutton()
	{
		inradiobutton.click();
	}
	
	
	public void clickoncallLogSavebutton()
	{
		callLogSavebutton.click();
	}
	
	public void clickoncallLogeditbutton()
	{
		callLogeditbutton.click();
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
