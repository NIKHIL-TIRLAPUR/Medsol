package com.medsol.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Patients_patientspage;
import com.medsol.utilities.Readconfig;

public class TC_Patients_patients_created extends Baseclass {

	Readconfig config= new Readconfig();
	public String firstname=config.getfirstname();
	public String year=config.getyear();
	public String month=config.getmonth();
	public String date=config.getdate();
	public String lastname=config.getlastname();
	public String facebookurl=config.getfacebookurl();
	public String twitterurl=config.gettwitterurl();
	public String instagramurl=config.getinstagramurl();
	public String linkedinurl=config.getlinkedinurl();
	public String password1=config.getpassword1();
	public String role=config.getrole();
	public String address2=config.getaddress2();
	public String bloodgroup=config.getbloodgroup();
	public String address1=config.getaddress1();
	public String city=config.getcity();
	public String zipcode=config.getzipcode();
	public String path1=config.getpath1();

	
	
	
	@Test
	public void Patients_patientspagetest() throws InterruptedException, AWTException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Patients_patientspage  patient= new Patients_patientspage(driver);
	patient.clickonPatients();
	Thread.sleep(2000);
	patient.clickondropdownMenuButton();
	Thread.sleep(2000);
	patient.clickonNewPatient();
	Thread.sleep(2000);
	patient.setfirst_name(firstname);
	patient.setlast_name(lastname);
	String email=randomstring()+"@gmail.com";
	patient.setpatientsemail(email);
	patient.setpatientBirthDate(year, month, date);
	String number=randomnum();
	String phonenumber="99005"+ number;
	patient.setpatientPhoneNumber(phonenumber);
	patient.setgender();
	patient.setselectbloodgroup(bloodgroup);
	patient.setpassword(password1);
	patient.setpassword_confirmation(password1);
	patient.setattachment(path1);
	patient.scrolldown();
	Thread.sleep(2000);
	patient.setaddress1(address1);
	patient.setaddress2(address2);
	patient.setcity(city);
	patient.setzip(zipcode);
	patient.setpatientFacebookUrl(facebookurl);
	patient.setpatientTwitterUrl(twitterurl);
	patient.setpatientInstagramUrl(instagramurl);
	patient.setpatientLinkedInUrl(linkedinurl);
	patient.clickonSave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
