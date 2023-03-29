package com.medsol.pageobject;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.medsol.testcases.Baseclass;

public class Bloodbank_Bloodissuespage extends Baseclass{
	
WebDriver ldriver;
	
	public Bloodbank_Bloodissuespage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Blood Banks']")
    WebElement Bloodbankbutton;
	
	@FindBy(xpath="//a[normalize-space()='Blood Issues']")
    WebElement Bloodissues;
	
	@FindBy(xpath="//a[normalize-space()='New Blood Issue']")
    WebElement newBloodissues;
	
	@FindBy(xpath="//div[@class='flatpickr-current-month']//span[@class='arrowDown']")
    WebElement yeardownarrow;
	
	@FindBy(xpath="//select[@aria-label='Month']")//select[@aria-label='Month']
    WebElement txtbloodissuemonth;
	
	@FindBy(xpath="//div[@class='dayContainer']/span")//div[@class='dayContainer']/span
    List<WebElement>  txtbloodissuedate;
	
	@FindBy(xpath="//body/div[2]/div[3]/div[1]/span[2]")//body/div[@class='flatpickr-calendar hasTime animate arrowTop arrowLeft open']/div[@class='flatpickr-time']/div[1]/span[2]
    WebElement hoursdownarrow;
	
	@FindBy(xpath="//body/div[2]/div[3]/div[2]/span[1]")//body/div[@class='flatpickr-calendar hasTime animate arrowTop arrowLeft open']/div[@class='flatpickr-time']/div[1]/span[2]
    WebElement minutesuparrow;
	
	@FindBy(xpath="//span[@title='Click to toggle']")
    WebElement amorpmbutton;
	
	@FindBy(xpath="//span[@id='select2-bloodIssuePatientName-container']")
    WebElement selectpatientname;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement patientsearchbox;
	
	@FindBy(xpath="//span[@id='select2-bloodIssueDoctorName-container']")
    WebElement selectdoctorname;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement doctorsearchbox;
	
	
	@FindBy(xpath="//span[@id='select2-donorName-container']")
    WebElement selectdonorname;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement donorsearchbox;
	
	@FindBy(xpath="//input[@id='bloodIssueAmount']")
    WebElement bloodissueamount;
	
	@FindBy(xpath="//textarea[@id='bloodIssueRemarks']")
    WebElement bloodissueremarks;
	
	@FindBy(xpath="//button[@id='bloodIssueSave']")
    WebElement bloodissuesavebutton;
	
	@FindBy(xpath="//form[@id='addBloodIssueForm']//div[@class='row']")
    WebElement random;
	
	
	public void clickonBloodbank()
	{
		Bloodbankbutton.click();
	}
	
	public void clickonBloodissues()
	{
		Bloodissues.click();
	}
	
	public void clickonnewBloodissues()
	{
		newBloodissues.click();
	}
	
	public void setbloodissuedateandtime(String month,String date)
	{
		//lastdonationdate.click();
		//txtlastdonationyear.click();
		yeardownarrow.click();
		//txtyearindob.sendKeys(year);
		/*while(true)

        {

                      String year1= txtdonationyear.getText();

                     

                      if(year.equals(year1))

                                    break;

                      else

                    	  yeardownarrow.click();

        }*/
		 Select month_drp= new Select(txtbloodissuemonth);
         month_drp.selectByVisibleText(month);
         List<WebElement> alldate= txtbloodissuedate;
       
         for(WebElement ele:alldate)

         {

                       String dt= ele.getText();

                       if(dt.equals(date))

                       {

                                     ele.click();

                                     break;

                       }

         }
         
         hoursdownarrow.click();
         minutesuparrow.click();
         amorpmbutton.click();
        random.click();
         
	}
	
	public void setpatientname(String patient)
	{
		selectpatientname.click();
		patientsearchbox.click();
		patientsearchbox.sendKeys(patient);
		patientsearchbox.sendKeys(Keys.ENTER);

	}
	
	public void setdoctorname(String doctor)
	{
		selectdoctorname.click();
		doctorsearchbox.click();
		doctorsearchbox.sendKeys(doctor);
		doctorsearchbox.sendKeys(Keys.ENTER);

	}
	
	public void setbloodissueamount(String amount)
	{
		bloodissueamount.click();
		bloodissueamount.sendKeys(amount);
		
	}
	
	public void setbloodissueremarks(String remark)
	{
		bloodissueremarks.click();
		bloodissueremarks.sendKeys(remark);
		
	}
	
	public void clickonbloodissuesavebutton()
	{
		bloodissuesavebutton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
