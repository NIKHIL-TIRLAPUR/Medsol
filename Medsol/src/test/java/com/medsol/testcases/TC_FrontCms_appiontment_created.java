package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.FrontCms_appointmentpage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_FrontCms_appiontment_created extends Baseclass {

	
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
	
	FrontCms_appointmentpage appiontment= new FrontCms_appointmentpage(driver);
	appiontment.clickonFrontCMS();
	Thread.sleep(2000);
	appiontment.clickonAppointment();
	Thread.sleep(2000);
	appiontment.setappointment_title(homePageBoxTitle);
	appiontment.setappointment_description(homeShortDescription);
	//appiontment.clickonSave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
