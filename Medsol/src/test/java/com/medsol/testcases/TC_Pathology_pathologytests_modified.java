package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Pathology_pathologytestspage;
import com.medsol.utilities.Readconfig;

public class TC_Pathology_pathologytests_modified extends Baseclass {

	Readconfig config= new Readconfig();

	public String testname=config.gettestname();
	public String edittestname=config.getedittestname();
	public String editshortname=config.geteditshortname();
	public String edittesttype=config.getedittesttype();
	public String editcategoryname=config.geteditcategoryname();
	public String editsubcategory=config.geteditsubcategory();
	public String editreportdays=config.geteditreportdays();
	public String editchargecategory=config.geteditchargecategory();
	public String editunit=config.geteditunit();
	public String editmethod=config.geteditmethod();
	public String editpathologyCategories=config.geteditpathologyCategories();
	
	
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
	pathotest.clickonsearchboxfordeleteoredit(testname);
	Thread.sleep(2000);
	pathotest.clickoneditbutton();
	Thread.sleep(2000);
	pathotest.setedittest_name(edittestname);
	pathotest.seteditshort_name(editshortname);
	pathotest.setedittest_type(edittesttype);
	pathotest.seteditPathologyCategories(editpathologyCategories);
	pathotest.seteditunit(editunit);
	pathotest.seteditsubcategory(editsubcategory);
	pathotest.seteditmethod(editmethod);
	pathotest.seteditreport_days(editreportdays);
	pathotest.seteditPathologyChargeCategories(editchargecategory);
	Thread.sleep(2000);
	pathotest.clickonSave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
