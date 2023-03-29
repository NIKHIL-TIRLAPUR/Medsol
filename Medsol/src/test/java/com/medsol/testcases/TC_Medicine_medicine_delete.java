package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Medicine_medicinepage;
import com.medsol.utilities.Readconfig;

public class TC_Medicine_medicine_delete extends Baseclass{

Readconfig config= new Readconfig();
	
	public String editmedicineCategoryId=config.geteditmedicineCategoryId();
	public String editbrand=config.geteditbrand();
	public String editsideeffects=config.geteditsideeffects();
	public String editbuyingprice=config.geteditbuyingprice();
	public String editsellingprice=config.geteditsellingprice();
	public String editsalt_composition=config.geteditsalt_composition();
	public String editdescription=config.geteditdescription();
	public String brandname=config.getbrandname();
	
	@Test
	public void Medicine_medicinepagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Medicine_medicinepage med= new Medicine_medicinepage(driver);
	med.clickonMedicines();
	Thread.sleep(2000);
	med.clickonsearchboxfordeleteoredit(brandname);
	Thread.sleep(2000);
	med.clickondeletebutton();
	med.clickonyesdeletebutton();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
