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

public class Doctorspage extends Baseclass {
	WebDriver ldriver;
	
	public Doctorspage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/div[3]/ul[1]/li[9]/a[1]")
    WebElement doctors;
	
	@FindBy(xpath="//a[@id='dropdownMenuButton']")
    WebElement dropdownbutton;
	
	@FindBy(xpath="//a[normalize-space()='New Doctor']")
    WebElement newdoctorbutton;
	
	@FindBy(xpath="//input[@id='first_name']")
    WebElement txtfirstname;
	
	@FindBy(xpath="//input[@id='last_name']")
    WebElement txtlastname;
	
	@FindBy(xpath="//span[@id='select2-doctorsDepartmentId-container' and @title='Select Department']")  //span[@id='select2-doctorsDepartmentId-container']
    WebElement txtdoctordepartment;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement txtsearchboxdoctordepartment;
	
	@FindBy(xpath="//input[@id='createAccountantEmail']")
    WebElement txtemail;
	
	@FindBy(xpath="//input[@id='designation']")
    WebElement txtdesignation;
	
	@FindBy(xpath="//input[@id='phoneNumber']")
    WebElement txtphoneNumber;
	
	@FindBy(xpath="//input[@id='qualification']")
    WebElement txtqualification;
	
	@FindBy(xpath="//input[@id='doctorBirthDate']")
    WebElement txtdob;
	
	@FindBy(xpath="//input[@aria-label='Year']")   //input[@aria-label='Year']
    WebElement txtyearindob;
	
	@FindBy(xpath="//select[@aria-label='Month']") //select[@aria-label='Month']
    WebElement txtmonthindob;
	
	@FindBy(xpath="//div[@class='dayContainer']/span")   //div[@class='dayContainer']/span
    List<WebElement>  txtdateindob;
	
	@FindBy(xpath="//span[@id='select2-doctorBloodGroup-container']")
    WebElement txtbloodgroup;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement txtsearchboxbloodgroup;
	
	@FindBy(xpath="//input[@id='doctorFemale']")
    WebElement femaleradiobutton;
	
	@FindBy(xpath="//input[@id='specialist']")
    WebElement txtspecialist;
	
	@FindBy(xpath="//input[@id='password']")
    WebElement txtpassword;
	
	@FindBy(xpath="//input[@id='password_confirmation']")
    WebElement txtconfirmpassword;
	
	@FindBy(xpath="//input[@id='address1']")
    WebElement txtaddress1;
	
	@FindBy(xpath="//input[@id='address2']")
    WebElement txtaddress2;
	
	@FindBy(xpath="//input[@id='city']")
    WebElement txtcity;
	
	@FindBy(xpath="//input[@id='zip']")
    WebElement txtzip;
	
	@FindBy(xpath="//input[@id='doctorFacebookUrl']")
    WebElement txtdoctorsfacebookurl;
	
	@FindBy(xpath="//input[@id='doctorTwitterUrl']")
    WebElement txtdoctorstwitterurl;
	
	@FindBy(xpath="//input[@id='doctorInstagramUrl']")
    WebElement txtdoctorsinstagramurl;
	
	@FindBy(xpath="//input[@id='doctorLinkedInUrl']")
    WebElement txtdoctorslinkedinurl;
	
	@FindBy(xpath="//input[@value='Save']")
    WebElement txtsavebutton;
	
	@FindBy(xpath="//span[@title='Profile']//label//*[name()='svg']")
    WebElement Profile;
	
	
	public void clickondoctors()
	{
		doctors.click();
	}
	
	public void clickondropdownbutton()
	{
		dropdownbutton.click();
	}
	
	public void clickonnewdoctorbutton()
	{
		newdoctorbutton.click();
	}
	
	public void setfirstname(String fname)
	{
		txtfirstname.click();
		txtfirstname.sendKeys(fname);
	}
	
	public void setlastname(String lname)
	{
		txtlastname.click();
		txtlastname.sendKeys(lname);
	}
	
	public void setdoctordepartment(String dpt)
	{
		txtdoctordepartment.click();
		txtsearchboxdoctordepartment.click();
		txtsearchboxdoctordepartment.sendKeys(dpt);
		txtsearchboxdoctordepartment.sendKeys(Keys.ENTER);
		
		
	}
	
	public void setemail(String id)
	{
		txtemail.click();
		txtemail.sendKeys(id);
	}
	
	public void setdesignation(String desig)
	{
		txtdesignation.click();
		txtdesignation.sendKeys(desig);
	}
	
	public void setphoneNumber(String num)
	{
		txtphoneNumber.click();
		txtphoneNumber.sendKeys(num);
	}
	
	public void setqualification(String qual)
	{
		txtqualification.click();
		txtqualification.sendKeys(qual);
	}
	
	public void setdob(String year,String month,String date)
	{
		txtdob.click();
		txtyearindob.click();
		txtyearindob.sendKeys(year);
		 Select month_drp= new Select(txtmonthindob);
         month_drp.selectByVisibleText(month);
         List<WebElement> alldate= txtdateindob;
       
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
	
	
	public void setbloodgroup(String blood)
	{
		txtbloodgroup.click();
		txtsearchboxbloodgroup.click();
		txtsearchboxbloodgroup.sendKeys(blood);
		txtsearchboxbloodgroup.sendKeys(Keys.ENTER);
		
		
	}
	
	
	public void setgenderofdoctor()
	{
		femaleradiobutton.click();
	}
	
	public void setspecialist(String spl)
	{
		txtspecialist.click();
		txtspecialist.sendKeys(spl);
	}
	
	public void setpassword(String pass)
	{
		txtpassword.click();
		txtpassword.sendKeys(pass);
	}
	
	public void setconfirmpassword(String cpass)
	{
		txtconfirmpassword.click();
		txtconfirmpassword.sendKeys(cpass);
	}
	
	
	public void setaddress1(String add1)
	{
		txtaddress1.click();
		txtaddress1.sendKeys(add1);
	}
	
	public void setaddress2(String add2)
	{
		txtaddress2.click();
		txtaddress2.sendKeys(add2);
	}
	
	public void setcity(String city)
	{
		txtcity.click();
		txtcity.sendKeys(city);
	}
	
	public void setdoctorsfacebookurl(String furl)
	{
		txtdoctorsfacebookurl.click();
		txtdoctorsfacebookurl.sendKeys(furl);
	}
	
	public void setzip(String zip)
	{
		txtzip.click();
		txtzip.sendKeys(zip);
	}
	
	public void setdoctorstwitterurl(String turl)
	{
		txtdoctorstwitterurl.click();
		txtdoctorstwitterurl.sendKeys(turl);
	}
	
	public void setdoctorsinstagramurl(String iurl)
	{
		txtdoctorsinstagramurl.click();
		txtdoctorsinstagramurl.sendKeys(iurl);
	}
	
	
	public void setdoctorslinkedinurl(String lurl)
	{
		txtdoctorslinkedinurl.click();
		txtdoctorslinkedinurl.sendKeys(lurl);
	}
	
	public void clickonsavebutton()
	{
		txtsavebutton.click();
	}
	
	
	public void setattachment(String path) throws AWTException
	{
		Profile.click();
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
