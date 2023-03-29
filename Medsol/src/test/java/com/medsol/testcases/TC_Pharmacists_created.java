package com.medsol.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Pharmacistspage;
import com.medsol.utilities.Readconfig;

public class TC_Pharmacists_created extends Baseclass {

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
	public void Pharmacistspagetest() throws InterruptedException, AWTException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Pharmacistspage phram= new Pharmacistspage(driver);
	phram.clickonPharmacists();
	Thread.sleep(2000);
	phram.clickondropdownMenuButton();
	Thread.sleep(2000);
	phram.clickonNewPharmacist();
	Thread.sleep(2000);
    phram.setfirst_name(firstname);
    phram.setlast_name(lastname);
    String email=randomstring()+"@gmail.com";
    phram.setpharmacistEmail(email);
    phram.setdesignation(designation);
    String number=randomnum();
	String phonenumber="99005"+ number;
    phram.setpharmacistPhoneNumber(phonenumber);
    phram.setqualification(qualification);
    phram.setpharmacistBirthDate(year, month, date);
    phram.setpharmacistBloodGroup(bloodgroup);
    phram.setpassword(password1);
    phram.setpassword_confirmation(password1);
    phram.setgender();
    phram.scrolldown();
    Thread.sleep(2000);
    phram.setattachment(path1);
    phram.setaddress1(address1);
    phram.setaddress2(address2);
    phram.setcity(city);
    phram.setzip(zipcode);
    phram.clickonSave();
    Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
}
