package com.medsol.testcases;

import org.testng.annotations.Test;


import com.medsol.pageobject.Bedmanagement_bedtypepage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Bedmanagement_bedtype_created extends Baseclass {
	
	Readconfig config= new Readconfig();
	public String bedtype=config.getbedtype();
	public String beddescription=config.getbeddescription();
	
	
	
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
		bed.clickonnewbedtype();
		Thread.sleep(2000);
		bed.setbedtype(bedtype);
		bed.setbeddescription(beddescription);
		bed.clickonsave();
		
		
		
		
		
	}

}
