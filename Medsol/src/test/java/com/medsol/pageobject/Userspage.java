package com.medsol.pageobject;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.medsol.testcases.Baseclass;

public class Userspage extends Baseclass{

	WebDriver ldriver;
	public Userspage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//span[contains(@class,'aside-menu-title')][normalize-space()='Users']")
    WebElement Users;
	
	@FindBy(xpath="//a[normalize-space()='New User']")
    WebElement NewUser;
	
	@FindBy(xpath="//input[@id='first_name']")
    WebElement first_name;
	
	@FindBy(xpath="//input[@id='last_name']")
    WebElement last_name;
	
	@FindBy(xpath="//input[@id='userEmail']")
    WebElement userEmail;
	
	@FindBy(xpath="//span[@id='select2-userRole-container']")
    WebElement selectrole;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement searchbox;
	
	@FindBy(xpath="//input[@id='userPhoneNumber']")
    WebElement userPhoneNumber;
	
	@FindBy(xpath="//input[@id='usesFemale']")
    WebElement usesFemale;
	
	@FindBy(xpath="//input[@id='userAllowMarketing']")
    WebElement status;
	
	@FindBy(xpath="//input[@id='password']")
    WebElement password;
	
	@FindBy(xpath="//input[@id='password_confirmation']")
    WebElement password_confirmation;
	
	@FindBy(xpath="//input[@value='Save']")
    WebElement Save;
	
	@FindBy(xpath="//input[@id='userInstagramUrl']")
    WebElement userInstagramUrl;
	
	@FindBy(xpath="//input[@id='userFacebookUrl']")
    WebElement userFacebookUrl;
	
	@FindBy(xpath="//input[@id='userLinkedInUrl']")
    WebElement userLinkedInUrl;
	
	@FindBy(xpath="//input[@id='userTwitterUrl']")
    WebElement userTwitterUrl;
	
	@FindBy(xpath="//span[@title='Profile']//label//*[name()='svg']")
    WebElement Profile;
	
	@FindBy(xpath="//input[@id='userDob']")
    WebElement userDob;
	
	@FindBy(xpath="//div[@class='flatpickr-calendar animate arrowBottom arrowLeft open']")
    WebElement edituserDob;
	
	@FindBy(xpath="//select[@aria-label='Month']")
    WebElement Month;
	
	@FindBy(xpath="//input[@aria-label='Year']")
    WebElement Year;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/div[1]/span")
	List<WebElement> dates;
	
	@FindBy(xpath="//input[@name='search']")//input[@name='search']
    WebElement searchboxfordeleteoredit;
	
	@FindBy(xpath="//tbody/tr[1]/td[5]/a[1]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement editbutton;
	
	@FindBy(xpath="//a[@title='Delete']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
    WebElement yesdeletebutton;
	
	
	public void clickonUsers()
	{
		Users.click();
	}
	
	public void clickonNewUser()
	{
		NewUser.click();
	}
	
	
	
	public void setfirst_name(String fname)
	{
		first_name.click();
		
		first_name.sendKeys(fname);
		
		
	}
	
	public void setlast_name(String lname)
	{
		last_name.click();
		
		last_name.sendKeys(lname);
		
		
	}
	
	
	public void setuserEmail(String email)
	{
		userEmail.click();
		userEmail.sendKeys(email);
	}
	
	public void setselectrole(String group)
	{
		selectrole.click();
		searchbox.click();
		searchbox.sendKeys(group);
		searchbox.sendKeys(Keys.ENTER);
		
	}
	
	public void setuserPhoneNumber(String desi)
	{
		userPhoneNumber.click();
		userPhoneNumber.sendKeys(desi);
	}
	
	public void setpassword(String phonenumber)
	{
		password.click();
		password.sendKeys(phonenumber);
	}
	
	public void setpassword_confirmation(String quali)
	{
		password_confirmation.click();
		password_confirmation.sendKeys(quali);
	}
	
	public void clickonusesFemale()
	{
		usesFemale.click();
	}

	public void clickonstatus()
	{
		status.click();
	}
	
	public void setuserInstagramUrl(String quali)
	{
		userInstagramUrl.click();
		userInstagramUrl.sendKeys(quali);
	}
	
	public void setuserFacebookUrl(String quali)
	{
		userFacebookUrl.click();
		userFacebookUrl.sendKeys(quali);
	}
	
	public void setuserLinkedInUrl(String quali)
	{
		userLinkedInUrl.click();
		userLinkedInUrl.sendKeys(quali);
	}
	
	public void setuserTwitterUrl(String quali)
	{
		userTwitterUrl.click();
		userTwitterUrl.sendKeys(quali);
	}
	
	public void clickonSave()
	{
		Save.click();
	}
	
	public void setuserBirthDate(String year,String month,String date)
	{
		userDob.click();
		Year.click();
		Year.clear();
		Year.sendKeys(year);
		 Select month_drp= new Select(Month);
         month_drp.selectByVisibleText(month);
         List<WebElement> alldate=dates;
       
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
	
	
	
	public void seteditfirst_name(String fname)
	{
		first_name.click();
		first_name.clear();
		first_name.sendKeys(fname);
	}
	
	public void seteditlast_name(String lname)
	{
		last_name.click();
		last_name.clear();
		last_name.sendKeys(lname);	
	}
	
	public void setedituserEmail(String email)
	{
		userEmail.click();
		userEmail.clear();
		userEmail.sendKeys(email);
	}
	
	public void seteditselectrole(String group)
	{
		selectrole.click();
		searchbox.click();
		searchbox.sendKeys(group);
		searchbox.sendKeys(Keys.ENTER);
		
	}
	
	public void setedituserPhoneNumber(String desi)
	{
		userPhoneNumber.click();
		userPhoneNumber.clear();
		userPhoneNumber.sendKeys(desi);
	}
	
	public void seteditpassword(String phonenumber)
	{
		password.click();
		password.clear();
		password.sendKeys(phonenumber);
	}
	
	public void seteditpassword_confirmation(String quali)
	{
		password_confirmation.click();
		password_confirmation.clear();
		password_confirmation.sendKeys(quali);
	}
	

	public void setedituserInstagramUrl(String quali)
	{
		userInstagramUrl.click();
		userInstagramUrl.clear();
		userInstagramUrl.sendKeys(quali);
	}
	
	public void setedituserFacebookUrl(String quali)
	{
		userFacebookUrl.click();
		userFacebookUrl.clear();
		userFacebookUrl.sendKeys(quali);
	}
	
	public void setedituserLinkedInUrl(String quali)
	{
		userLinkedInUrl.click();
		userLinkedInUrl.clear();
		userLinkedInUrl.sendKeys(quali);
	}
	
	public void setedituserTwitterUrl(String quali)
	{
		userTwitterUrl.click();
		userTwitterUrl.clear();
		userTwitterUrl.sendKeys(quali);
	}
	
	public void clickoneditbutton()
	{
		editbutton.click();
	}
	
	public void setnameinsearchboxfordeleteoredit(String name)
	{
		searchboxfordeleteoredit.click();
		searchboxfordeleteoredit.sendKeys(name);
	}
	
	public void clickondeletebutton()
	{
		deletebutton.click();
		
	}
	
	public void clickonyesdeletebutton()
	{
		yesdeletebutton.click();
		
	}
	
	
	public void setedituserBirthDate(String year1,String month1,String date1)
	{
		edituserDob.click();
		Year.click();
		Year.clear();
		Year.sendKeys(year1);
		 Select month_drp= new Select(Month);
         month_drp.selectByVisibleText(month1);
         List<WebElement> alldate=dates;
       
         for(WebElement ele:alldate)

         {

                       String dt= ele.getText();

                       if(dt.equals(date1))

                       {

                                     ele.click();

                                     break;

                       }

         }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
