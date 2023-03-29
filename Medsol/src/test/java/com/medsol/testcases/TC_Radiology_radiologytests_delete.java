package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Radiology_radiologytestspage;
import com.medsol.utilities.Readconfig;

public class TC_Radiology_radiologytests_delete extends Baseclass {

	
	Readconfig config= new Readconfig();

    
	public String edittestname=config.getedittestname();
	
	
	
	@Test
	public void Radiology_radiologytestspagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	
	Radiology_radiologytestspage radiotest= new Radiology_radiologytestspage(driver);
	
	radiotest.clickonRadiology();
	Thread.sleep(2000);
	radiotest.clickonRadiologyTests();
	Thread.sleep(2000);
	radiotest.clickonsearchboxfordeleteoredit(edittestname);
	radiotest.clickondeletebutton();
	Thread.sleep(2000);
	radiotest.clickonyesdeletebutton();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
