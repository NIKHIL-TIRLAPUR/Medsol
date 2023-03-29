package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Hospitalcharges_chargespage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Hospitalcharges_charges_created extends Baseclass 
{
	Readconfig config= new Readconfig();
	public String code=config.getcode();
	public String standardcharge=config.getstandardcharge();
	public String description=config.getdescription();
	public String chargetype=config.getchargetype();
	public String chargecategory=config.getchargecategory();
	
	@Test
	public void Hospitalcharges_chargespage() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Hospitalcharges_chargespage hcharge =new Hospitalcharges_chargespage(driver);
	hcharge.clickonHospitalCharges();
	Thread.sleep(2000);

	hcharge.clickonCharges();
	Thread.sleep(2000);

	hcharge.clickonnewCharge();
	Thread.sleep(2000);

	hcharge.setchargetype(chargetype);
	Thread.sleep(2000);

	hcharge.setchargecategory(chargecategory);
	Thread.sleep(2000);

	hcharge.setcode(code);
	hcharge.setstandardcharge(standardcharge);
	hcharge.setstandardcharge(chargecategory);
	hcharge.setdescription(description);
	hcharge.clickonchargesSave();
	Thread.sleep(2000);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
