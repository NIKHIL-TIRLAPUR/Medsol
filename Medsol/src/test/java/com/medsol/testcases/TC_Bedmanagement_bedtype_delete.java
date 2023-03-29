package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Bedmanagement_bedtypepage;
import com.medsol.pageobject.Loginpage;

public class TC_Bedmanagement_bedtype_delete extends Baseclass {
	
	
	
	
	
	
	@Test
	public void Bedmanagementtest() throws InterruptedException {
		
	
		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);	
	Bedmanagement_bedtypepage bed =new Bedmanagement_bedtypepage(driver);
		bed.clickonbedmanagement();	
		Thread.sleep(2000);
		bed.clickondeletebutton();
		Thread.sleep(2000);
		bed.clickonyesdeletebutton();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}		

}
