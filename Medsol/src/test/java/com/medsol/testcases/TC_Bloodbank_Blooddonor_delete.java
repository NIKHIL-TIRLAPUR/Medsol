package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Bloodbank_Blooddonorpage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Bloodbank_Blooddonor_delete extends Baseclass{
	
	Readconfig config= new Readconfig();
	public String donortextsearchbox=config.getdonortextsearchbox();
	
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
	blooddonor.setnameinsearchbox(donortextsearchbox);
	Thread.sleep(2000);
	blooddonor.clickondeletebutton();
	Thread.sleep(2000);
	blooddonor.clickonyesdeletebutton();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
