package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Bedmanagement_bedspage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Bedmanagement_beds_created extends Baseclass {

	
	Readconfig config= new Readconfig();
	public String bedtype=config.getbedtype();
	public String description=config.getdescription();
	public String bed=config.getbed();
	public String standardcharge=config.getstandardcharge();
	
	
	@Test
	public void Bedmanagementtest() throws InterruptedException {
		
	
		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);	
	
	
	
	Bedmanagement_bedspage beds=new Bedmanagement_bedspage(driver);
	
	beds.clickonbedmanagement();
	Thread.sleep(2000);
	beds.clickonBeds();
	Thread.sleep(2000);
	beds.clickondropdownMenuButton();
	Thread.sleep(2000);
	beds.clickonNewBed();
	Thread.sleep(2000);
	beds.setBedName(bed);
	beds.setselectbedType(bedtype);
	beds.setbedCharges(standardcharge);
	beds.setBedDescription(description);
	beds.clickonBedSaveBtn();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
