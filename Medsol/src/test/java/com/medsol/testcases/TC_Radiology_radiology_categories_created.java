package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Radiology_radiology_categoriespage;
import com.medsol.utilities.Readconfig;

public class TC_Radiology_radiology_categories_created extends Baseclass {

	
Readconfig config= new Readconfig();
	
	public String radiologyCategoryName=config.getradiologyCategoryName();
	
	
	@Test
	public void Medicine_medicinepagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	
	Radiology_radiology_categoriespage radio= new Radiology_radiology_categoriespage(driver);
	
	
	radio.clickonRadiology();
	Thread.sleep(2000);
	radio.clickonNewRadiologyCategory();
	Thread.sleep(2000);
	radio.setradiologyCategoryName(radiologyCategoryName);
	radio.clickonbtnRadiologyCategorySave();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
