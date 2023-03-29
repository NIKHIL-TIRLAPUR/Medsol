package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.FrontCms_aboutuspage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_FrontCms_aboutus_created extends Baseclass {

	
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
	
	
	FrontCms_aboutuspage about= new FrontCms_aboutuspage(driver);
	about.clickonFrontCMS();
	Thread.sleep(2000);
	about.clickonAboutUs();
	Thread.sleep(2000);
	about.setaboutUsTitle(homeTitleId);
	about.setaboutUsDes(homeShortDescription);
	about.setaboutUsMission(homePageBoxTitle);
	about.scrolldown1();
	Thread.sleep(2000);
	about.clickonimage();
	Thread.sleep(2000);
	//about.clickonSave();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
}
