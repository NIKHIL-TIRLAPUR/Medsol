package com.medsol.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Receptionistspage;
import com.medsol.utilities.Readconfig;

public class TC_Receptionists_created extends Baseclass{

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
	public void Receptionistspagetest() throws InterruptedException, AWTException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Receptionistspage recep= new Receptionistspage(driver);
	recep.clickonReceptionists();
	Thread.sleep(2000);
	recep.clickondropdownMenuButton();
	Thread.sleep(2000);
	recep.clickonNewReceptionist();
	Thread.sleep(2000);
	recep.setfirst_name(firstname);
	recep.setlast_name(lastname);
	 String email=randomstring()+"@gmail.com";
	recep.setreceptionistEmail(email);
	recep.setdesignation(designation);
	String number=randomnum();
	String phonenumber="99005"+ number;
	recep.setreceptionistPhoneNumber(phonenumber);
	recep.setgender();
	recep.setqualification(qualification);
	recep.setpharmacistBirthDate(year, month, date);
	recep.setreceptionistBloodGroup(bloodgroup);
	recep.setpassword(password1);
	recep.setpassword_confirmation(password1);
	recep.scrolldown();
	Thread.sleep(2000);
	recep.setattachment(path1);
	recep.setaddress1(address1);
	recep.setaddress2(address2);
	recep.setcity(city);
	recep.setzip(zipcode);
	recep.clickonSave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
