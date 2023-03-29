package com.medsol.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Nursespage;
import com.medsol.utilities.Readconfig;

public class TC_Nurses_created extends Baseclass {

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
	public void Nursespagetest() throws InterruptedException, AWTException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Nursespage nurse= new Nursespage(driver);
	nurse.clickonNurses();
	Thread.sleep(2000);
	nurse.clickondropdownMenuButton();
	Thread.sleep(2000);
	nurse.clickonNewNurse();
	Thread.sleep(2000);
	nurse.setfirst_name(firstname);
	nurse.setlast_name(lastname);
	String email=randomstring()+"@gmail.com";
	nurse.setnurseEmail(email);
	nurse.setdesignation(designation);
	String number=randomnum();
	String phonenumber="99005"+ number;
	nurse.setnursePhoneNumber(phonenumber);
	nurse.setgender();
	nurse.setqualification(qualification);
	nurse.setNurseBirthDate(year, month, date);
	nurse.setpassword(password1);
	nurse.setpassword_confirmation(password1);
	nurse.scrolldown();
	Thread.sleep(2000);
	nurse.setattachment(path1);
	nurse.setaddress1(address1);
	nurse.setaddress2(address2);
	nurse.setcity(city);
	nurse.setzip(zipcode);
	nurse.clickonSave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
