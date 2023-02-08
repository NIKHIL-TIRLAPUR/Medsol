package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Bloodbankpage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Bloodbanktest_created extends Baseclass {
	
	
	Readconfig config= new Readconfig();
	public String bloodgroupinbloodbank=config.getbloodgroupinbloodbank();
	public String remainingbag=config.getremainingbag();
	
	@Test
	public void Bloodbanktest() throws InterruptedException  {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);	
	Bloodbankpage bank = new Bloodbankpage(driver);
	bank.clickonBloodbank();
	Thread.sleep(2000);
	bank.clickonNewbloodgroup();
	Thread.sleep(2000);
	bank.setbloodgroup(bloodgroupinbloodbank);
	bank.setremainingbloodbag(remainingbag);	
	bank.clickonsave();	
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
