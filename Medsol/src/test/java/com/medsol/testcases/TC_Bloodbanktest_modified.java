package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Bloodbankpage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Bloodbanktest_modified extends Baseclass {
	
	Readconfig config= new Readconfig();
	public String editedbloodgroupinbloodbank=config.geteditedbloodgroupinbloodbank();
	public String editedremainingbag=config.geteditedremainingbag();
	
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
	bank.clickoneditbutton();
	Thread.sleep(2000);
	bank.seteditbloodgroup(editedbloodgroupinbloodbank);
	bank.seteditremainingbloodbags(editedremainingbag);
	bank.clickoneditsave();
	
	
	}
}
