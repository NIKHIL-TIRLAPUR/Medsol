package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Pathology_pathologycategorypage;
import com.medsol.utilities.Readconfig;

public class TC_Pathology_pathologycategory_created extends Baseclass {

	
Readconfig config= new Readconfig();

    
	public String pathologyCategoryName=config.getpathologyCategoryName();
	
	
	
	@Test
	public void Pathology_pathologycategorypagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Pathology_pathologycategorypage patho= new Pathology_pathologycategorypage(driver);
	patho.clickonPathology();
	Thread.sleep(2000);
	patho.clickonNewPathologyCategory();
	Thread.sleep(2000);
	patho.setpathologyCategoryName(pathologyCategoryName);
	patho.clickonpathologyCategorySave();
	Thread.sleep(2000);
	
	
	
	
	
	
	}	
}
