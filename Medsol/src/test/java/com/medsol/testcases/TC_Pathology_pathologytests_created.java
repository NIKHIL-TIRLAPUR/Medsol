package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Pathology_pathologytestspage;
import com.medsol.utilities.Readconfig;

public class TC_Pathology_pathologytests_created extends Baseclass {

Readconfig config= new Readconfig();

	public String pathologyCategoryName=config.getpathologyCategoryName();
	public String testname=config.gettestname();
	public String shortname=config.getshortname();
	public String testtype=config.gettesttype();
	public String categoryname=config.getcategoryname();
	public String subcategory=config.getsubcategory();
	public String reportdays=config.getreportdays();
	public String chargecategory=config.getchargecategory();
	public String unit=config.getunit();
	public String method=config.getmethod();
	public String pathologyCategories=config.getpathologyCategories();
	
	
	
	
	
	@Test
	public void Pathology_pathologytestspagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Pathology_pathologytestspage pathotest= new Pathology_pathologytestspage(driver);
	pathotest.clickonPathology();
	Thread.sleep(2000);
	pathotest.clickonPathologyTests();
	Thread.sleep(2000);
	pathotest.clickonNewPathologyTest();
	Thread.sleep(2000);
	pathotest.settest_name(testname);
	pathotest.setshort_name(shortname);
	pathotest.settest_type(testtype);
	pathotest.setpathologyCategories(pathologyCategories);
	pathotest.setunit(unit);
	pathotest.setsubcategory(subcategory);
	pathotest.setmethod(method);
	pathotest.setreport_days(reportdays);
	pathotest.setpathologyChargeCategories(chargecategory);
	Thread.sleep(2000);
	pathotest.clickonSave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
}
