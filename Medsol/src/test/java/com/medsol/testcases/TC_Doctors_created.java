package com.medsol.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medsol.pageobject.Doctorspage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Doctors_created extends Baseclass {

	
Readconfig config= new Readconfig();
	
	public String firstname=config.getfirstname();
	public String lastname=config.getlastname()	;
	public String password1=config.getpassword();
	public String bloodgroup=config.getbloodgroup();
	public String designation=config.getdesignation();
	public String qualification=config.getqualification();
	public String year=config.getyear();
	public String month=config.getmonth();
	public String date=config.getdate();
	public String address1=config.getaddress1();
	public String address2=config.getaddress2();
	public String city=config.getcity();
	public String zipcode=config.getzipcode();
	public String department=config.getdepartment();
	public String specialist=config.getspecialist();
	public String facebookurl=config.getfacebookurl();
	public String twitterurl=config.gettwitterurl();
	public String instagramurl=config.getinstagramurl();
	public String linkedinurl=config.getlinkedinurl();
	public String path1=config.getpath1();

	
	
	
	@Test
	public void Doctorstest() throws InterruptedException, AWTException {
		
		Thread.sleep(3000);
		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Doctorspage doct= new Doctorspage(driver);
	doct.clickondoctors();
	Thread.sleep(2000);
	doct.clickondropdownbutton();
	Thread.sleep(2000);
	doct.clickonnewdoctorbutton();
	Thread.sleep(2000);
	doct.setfirstname(firstname);
	doct.setlastname(lastname);
	Thread.sleep(2000);
	//doct.setdoctordepartment(department);
	Thread.sleep(2000);
	String email=randomstring()+"@gmail.com";
	doct.setemail(email);
	doct.setdesignation(designation);
	String number=randomnum();
	String phonenumber="99005"+ number;
	doct.setphoneNumber(phonenumber);
	doct.setqualification(qualification);
	//Thread.sleep(2000);
	doct.setdob(year, month, date);
	//Thread.sleep(2000);
	doct.setbloodgroup(bloodgroup);
	//Thread.sleep(2000);
	doct.setgenderofdoctor();
	Thread.sleep(2000);
	doct.setspecialist(specialist);
	Thread.sleep(2000);
	doct.setpassword(password1);
	Thread.sleep(2000);
	doct.setconfirmpassword(password1);
	Thread.sleep(2000);
	doct.scrolldown();
	Thread.sleep(2000);
	doct.setattachment(path1);
	doct.setaddress1(address1);
	
	doct.setaddress2(address2);
	Thread.sleep(2000);
	doct.setcity(city);
	doct.setzip(zipcode);
	Thread.sleep(2000);
	//doct.setdoctorsfacebookurl(facebookurl);
	//doct.setdoctorstwitterurl(twitterurl);
	//doct.setdoctorsinstagramurl(instagramurl);
	
	//doct.setdoctorslinkedinurl(linkedinurl);
	doct.clickonsavebutton();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
	
}
