package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Hospitalcharges_chargecategoriespage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Hospitalcharges_chargecategories_modified extends Baseclass
{
	Readconfig config= new Readconfig();
	public String edittotitle=config.getedittotitle();
	public String shortdescription=config.getshortdescription();
	public String editchargetype=config.geteditchargetype();
	
	
	@Test
	public void Frontcms_testimonialspagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Hospitalcharges_chargecategoriespage hcharge= new Hospitalcharges_chargecategoriespage(driver);
	hcharge.clickonHospitalCharges();
	Thread.sleep(2000);
	hcharge.clickoneditbutton();
	Thread.sleep(2000);
	hcharge.seteditChargeCategoryName(edittotitle);
	hcharge.seteditChargeCategoryDescription(shortdescription);
	hcharge.seteditchargetype(editchargetype);
	Thread.sleep(2000);
	hcharge.clickoneditChargeCategorySave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
