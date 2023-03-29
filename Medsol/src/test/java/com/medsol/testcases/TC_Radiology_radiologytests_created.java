package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Radiology_radiologytestspage;
import com.medsol.utilities.Readconfig;

public class TC_Radiology_radiologytests_created  extends Baseclass {
	
Readconfig config= new Readconfig();
	
	public String testname=config.gettestname();
	public String shortname=config.getshortname();
	public String testtype=config.gettesttype();
	public String categoryname=config.getcategoryname();
	public String subcategory=config.getsubcategory();
	public String reportdays=config.getreportdays();
	public String chargecategory=config.getchargecategory();
	
	
	
	
	
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
	radiotest.clickonNewRadiologyTest();
	Thread.sleep(2000);
	radiotest.settest_name(testname);
	radiotest.setshort_name(shortname);
	radiotest.settest_type(testtype);
	radiotest.setradiologyCategories(categoryname);
	radiotest.setsubcategory(subcategory);
	radiotest.setreport_days(reportdays);
	radiotest.setchargeCategories(chargecategory);
	Thread.sleep(2000);
	radiotest.clickonSave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
