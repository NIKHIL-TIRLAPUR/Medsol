package com.medsol.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Settings_Generalpage;
import com.medsol.utilities.Readconfig;

public class TC_Settings_General_created extends Baseclass{

	
	
	Readconfig config= new Readconfig();
	public String brandname=config.getbrandname();
	public String medicine=config.getmedicine();
	public String hospital_from_day=config.gethospital_from_day();
	public String hospital_from_time=config.gethospital_from_time();
	public String currentcurrency=config.getcurrentcurrency();
	public String homeShortDescription=config.gethomeShortDescription();
	public String homeDoctorDescription=config.gethomeDoctorDescription();
	public String facebookurl=config.getfacebookurl();
	public String linkedinurl=config.getlinkedinurl();
	public String twitterurl=config.gettwitterurl();
	public String instagramurl=config.getinstagramurl();
	public String path1=config.getpath1();
	
	
	
	
	
	@Test
	public void Settings_Generalpagetest() throws InterruptedException, AWTException {
		
	
		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);	
	
	Settings_Generalpage setting=new Settings_Generalpage(driver);
	setting.clickonSettings();
	setting.setapp_name(brandname);
	setting.setcompany_name(medicine);
	String email=randomstring()+"@gmail.com";
	setting.setEmail(email);
	String number=randomnum();
	String phonenumber="99005"+ number;
	setting.setgeneralPhoneNumber(phonenumber);
	setting.sethospital_from_day(hospital_from_day);
	setting.sethospital_from_time(hospital_from_time);
	setting.sethospital_address(homeShortDescription);
	setting.setselectcurrentcurrency(currentcurrency);
	//setting.setcountry_code();
	//setting.clickoniceland();
	setting.setabout_us(homeShortDescription);
	setting.scrolldown();
	Thread.sleep(2000);
	setting.setapplogo(path1);
	setting.setgeneralFacebookUrl(facebookurl);
	setting.setgeneralTwitterUrl(twitterurl);
	setting.setgeneralInstagramUrl(instagramurl);
	setting.setgeneralLinkedInUrl(linkedinurl);
	//setting.clickonSave();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
