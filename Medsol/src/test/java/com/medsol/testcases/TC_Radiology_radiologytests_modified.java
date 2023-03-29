package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Radiology_radiologytestspage;
import com.medsol.utilities.Readconfig;

public class TC_Radiology_radiologytests_modified extends Baseclass {

Readconfig config= new Readconfig();

    public String testname=config.gettestname();
	public String edittestname=config.getedittestname();
	public String editshortname=config.geteditshortname();
	public String edittesttype=config.getedittesttype();
	public String editcategoryname=config.geteditcategoryname();
	public String editsubcategory=config.geteditsubcategory();
	public String editreportdays=config.geteditreportdays();
	public String editchargecategory=config.geteditchargecategory();
	
	
	
	
	
	@Test
	public void Radiology_radiologytestspagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	
	Radiology_radiologytestspage radiotest= new Radiology_radiologytestspage(driver);
	
	radiotest.clickonRadiology();
	Thread.sleep(2000);
	radiotest.clickonRadiologyTests();
	Thread.sleep(2000);
	radiotest.clickonsearchboxfordeleteoredit(testname);
	radiotest.clickoneditbutton();
	Thread.sleep(2000);
	radiotest.setedittest_name(edittestname);
	radiotest.seteditshort_name(editshortname);
	radiotest.setedittest_type(edittesttype);
	radiotest.seteditradiologyCategories(editcategoryname);
	radiotest.seteditsubcategory(editsubcategory);
	radiotest.seteditreport_days(editreportdays);
	radiotest.seteditchargeCategories(editchargecategory);
	Thread.sleep(2000);
	radiotest.clickonSave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
