package com.medsol.testcases;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.medsol.pageobject.Labtechnicianpage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Labtechnician_created extends Baseclass  {

	
	Readconfig config= new Readconfig();
	public String firstname=config.getfirstname();
	public String year=config.getyear();
	public String month=config.getmonth();
	public String date=config.getdate();
	public String lastname=config.getlastname();
	public String designation=config.getdesignation();
	public String qualification=config.getqualification();
	public String bloodgroup=config.getbloodgroup();
	public String password1=config.getpassword1();
	public String address1=config.getaddress1();
	public String address2=config.getaddress2();
	public String city=config.getcity();
	public String zipcode=config.getzipcode();
	public String path1=config.getpath1();

	
	
	@Test
	public void Labtechnicianpagetest() throws InterruptedException, AWTException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Labtechnicianpage labtech= new Labtechnicianpage(driver);
	labtech.clickonLabTechnicians();
	Thread.sleep(2000);
	labtech.clickondropdownMenuButton();
	Thread.sleep(2000);
	labtech.clickonNewLabTechnician();
	Thread.sleep(2000);
	labtech.setfirst_name(firstname);
	labtech.setlast_name(lastname);
	String email=randomstring()+"@gmail.com";
	labtech.settechnicianEmail(email);
	labtech.setdesignation(designation);
	String number=randomnum();
	String phonenumber="99005"+ number;
	labtech.settechnicianPhoneNumber(phonenumber);
	labtech.setqualification(qualification);
	labtech.settechnicianBirthDate(year, month, date);
	labtech.settechnicianBloodGroup(bloodgroup);
	labtech.setpassword(password1);
	labtech.setpassword_confirmation(password1);
	labtech.setgender();
	labtech.scrolldown();
	Thread.sleep(2000);
	labtech.setattachment(path1);
	labtech.setaddress1(address1);
	labtech.setaddress2(address2);
	labtech.setcity(city);
	labtech.setzip(zipcode);
	labtech.clickontechnicianSave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
}
