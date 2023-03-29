package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Hospitalcharges_doctoropdchargespage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Hospitalcharges_doctoropdcharges_created extends Baseclass 
{
	Readconfig config= new Readconfig();
	public String editcode=config.geteditcode();
	public String editstandardcharge=config.geteditstandardcharge();
	public String shortdescription=config.getshortdescription();
	public String editchargetype=config.geteditchargetype();
	public String editchargecategory=config.geteditchargecategory();
	
	
	@Test
	public void Hospitalcharges_chargespagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Hospitalcharges_doctoropdchargespage dcharge = new Hospitalcharges_doctoropdchargespage(driver);
	
	dcharge.clickonHospitalCharges();
	Thread.sleep(2000);
	dcharge.clickonDoctoropdCharges();
	Thread.sleep(2000);
	dcharge.clickonnewdoctoropdCharge();
	Thread.sleep(2000);
	dcharge.setselectdoctor(editchargecategory);
	dcharge.setstandardcharge(editstandardcharge);
	dcharge.clickondoctorChargesSave();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
