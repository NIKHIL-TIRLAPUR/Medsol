package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Patients_casehandlerspage;
import com.medsol.utilities.Readconfig;

public class TC_Patients_casehandlers_created extends Baseclass {

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
	
	
	
	@Test
	public void Patients_casehandlerspagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Patients_casehandlerspage caseh= new Patients_casehandlerspage(driver);
	caseh.clickonPatients();
	Thread.sleep(2000);
	caseh.clickonCaseHandlers();
	Thread.sleep(2000);
	caseh.clickondropdownMenuButton();
	Thread.sleep(2000);
	caseh.clickonNewCaseHandler();
	Thread.sleep(2000);
	caseh.setfirst_name(firstname);
	caseh.setlast_name(lastname);
	String email=randomstring()+"@gmail.com";
	caseh.setcaseHandlerEmail(email);
	caseh.setdesignation(designation);
	String number=randomnum();
	String phonenumber="99005"+ number;
	caseh.setcaseHandlerPhoneNumber(phonenumber);
	caseh.setgender();
	caseh.clickonstatus();
	caseh.setqualification(qualification);
	caseh.setcaseHandlerBirthDate(year, month, date);
	caseh.setcaseHandlerBloodGroup(bloodgroup);
	caseh.setpassword(password1);
	caseh.setpassword_confirmation(password1);
	caseh.scrolldown();
	Thread.sleep(2000);
	caseh.setaddress1(address1);
	caseh.setaddress2(address2);
	caseh.setcity(city);
	caseh.setzip(zipcode);
	caseh.clickonSave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
}
