package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Bedmanagement_bedspage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Bedmanagement_beds_modified extends Baseclass{

	
	Readconfig config= new Readconfig();
	public String bed=config.getbed();
	public String editdescription=config.geteditdescription();
	public String editbed=config.geteditbed();
	public String editbedtype=config.geteditbedtype();
	public String editstandardcharge=config.geteditstandardcharge();
	
	
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
	beds.setnameinsearchbox(bed);
	beds.clickoneditbutton();
	Thread.sleep(2000);
	beds.seteditBedName(editbed);
	beds.seteditselectbedType(editbedtype);
	Thread.sleep(2000);
	beds.seteditbedCharges(editstandardcharge);
	beds.seteditBedDescription(editdescription);
	beds.clickonbtnEditSave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
}
