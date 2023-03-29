package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Hospitalcharges_chargecategoriespage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Hospitalcharges_chargecategories_created extends Baseclass 
{
	Readconfig config= new Readconfig();
	public String totitle=config.gettotitle();
	public String description=config.getdescription();
	public String chargetype=config.getchargetype();
	
	
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
	hcharge.clickonNewChargeCategory();
	hcharge.setnameinchargecategories(totitle);
	hcharge.setdescriptionofchargecategories(description);
	hcharge.setchargetype(chargetype);
	hcharge.clickonchargeCategorySave();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
