package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Bloodbank_Blooddonorpage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Bloodbank_Blooddonor_created extends Baseclass {
	
	Readconfig config= new Readconfig();
	public String donorname=config.getdonorname();
	public String donorage=config.getdonorage();
	public String bloodgroup=config.getbloodgroup();
	public String year=config.getyear();
	public String month=config.getmonth();
	public String date=config.getdate();
	
	@Test
	public void Bloodbank_Blooddonortest() throws InterruptedException  {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);	
	
	Bloodbank_Blooddonorpage blooddonor= new Bloodbank_Blooddonorpage(driver);
	blooddonor.clickonBloodbank();
	Thread.sleep(2000);
	blooddonor.clickonblooddonor();
	Thread.sleep(2000);
	blooddonor.clickonnewblooddonor();
	Thread.sleep(2000);
	blooddonor.setblooddonorname(donorname);
	blooddonor.setblooddonorage(donorage);
	blooddonor.clickonblooddonorgender();
	blooddonor.setbloodgroupofdonor(bloodgroup);
	Thread.sleep(2000);
	blooddonor.setlastblooddonationdate(month, date);
	Thread.sleep(2000);
	blooddonor.clickonbloodDonorSavebutton();
	Thread.sleep(2000);
	
	
	
	}
}
