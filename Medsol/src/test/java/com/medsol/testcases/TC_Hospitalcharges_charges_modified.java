package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Hospitalcharges_chargespage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Hospitalcharges_charges_modified extends Baseclass  {

	
	Readconfig config= new Readconfig();
	public String editcode=config.geteditcode();
	public String editstandardcharge=config.geteditstandardcharge();
	public String shortdescription=config.getshortdescription();
	public String editchargetype=config.geteditchargetype();
	public String editchargecategory=config.geteditchargecategory();
	
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
	hcharge.clickoneditbutton();
	Thread.sleep(2000);
	hcharge.seteditchargetype(editchargetype);
	Thread.sleep(2000);
	hcharge.seteditchargecategory(editchargecategory);
	Thread.sleep(2000);
	//hcharge.seteditcode(editcode);
	hcharge.seteditstandardcharge(editstandardcharge);
	hcharge.seteditdescription(shortdescription);
	hcharge.clickoneditchargesSave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
