package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Pathology_pathologytestspage;
import com.medsol.utilities.Readconfig;

public class TC_Pathology_pathologytests_delete extends Baseclass  {

	Readconfig config= new Readconfig();

	public String testname=config.gettestname();
	public String edittestname=config.getedittestname();	
	
	
	

	@Test
	public void Pathology_pathologytestspagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Pathology_pathologytestspage pathotest= new Pathology_pathologytestspage(driver);
	pathotest.clickonPathology();
	Thread.sleep(2000);
	pathotest.clickonPathologyTests();
	Thread.sleep(2000);
	pathotest.clickonsearchboxfordeleteoredit(edittestname);
	Thread.sleep(2000);
	pathotest.clickondeletebutton();
	Thread.sleep(2000);
	pathotest.clickonyesdeletebutton();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
