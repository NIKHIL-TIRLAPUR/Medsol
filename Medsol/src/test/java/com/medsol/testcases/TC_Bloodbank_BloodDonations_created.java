package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Bloodbank_BloodDonationspage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Bloodbank_BloodDonations_created  extends Baseclass{
	
	Readconfig config= new Readconfig();
	public String donorname=config.getdonorname();
	public String bloodbags=config.getbloodbags();
	
	
	
	@Test
	public void Bloodbank_BloodDonationstest() throws InterruptedException  {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);	
	
	Bloodbank_BloodDonationspage bdonations= new Bloodbank_BloodDonationspage(driver);
	bdonations.clickonBloodbank();
	Thread.sleep(2000);
	bdonations.clickonBlooddonations();
	Thread.sleep(2000);
	bdonations.clickonNewBlooddonation();
	Thread.sleep(2000);
	bdonations.setdonorname(donorname);
	bdonations.setnumberofbloodbagdonated(bloodbags);
	bdonations.clickonsave();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
