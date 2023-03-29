package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.FrontCms_termsandconditionspage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_FrontCms_termsandconditions_created extends Baseclass{

	
    Readconfig config= new Readconfig();
	
	public String homeTitleId=config.gethomeTitleId();
	public String homeShortDescription=config.gethomeShortDescription();
	public String homePageBoxTitle=config.gethomePageBoxTitle();
	
	@Test
	public void FrontCms_cms_homepagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	FrontCms_termsandconditionspage tc=new FrontCms_termsandconditionspage(driver);
	tc.clickonFrontCMS();
	Thread.sleep(2000);
	tc.clickonTermsandConditions();
	Thread.sleep(2000);
	tc.setterms_conditions(homePageBoxTitle);
	Thread.sleep(2000);
	tc.setprivacy_policy(homeShortDescription);
	Thread.sleep(2000);
	//tc.clickonSave();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
