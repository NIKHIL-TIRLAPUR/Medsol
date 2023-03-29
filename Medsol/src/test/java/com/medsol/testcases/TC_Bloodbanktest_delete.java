package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Bloodbankpage;
import com.medsol.pageobject.Loginpage;

public class TC_Bloodbanktest_delete extends Baseclass  {
	
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
	//bank.clickondeletebutton();
	//bank.clickonyesdeletebutton();
	
	
	
	
	
	
	
	
	
	
	
	}
}
