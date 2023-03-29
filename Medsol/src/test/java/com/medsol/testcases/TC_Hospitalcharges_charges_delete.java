package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Hospitalcharges_chargespage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Hospitalcharges_charges_delete extends Baseclass
{
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
	hcharge.setnamesearchbox(editchargecategory);
	hcharge.clickondeletebutton();
	hcharge.clickonyesdeletebutton();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
