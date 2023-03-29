package com.medsol.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medsol.pageobject.Frontcms_Frontcmsservicespage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Frontcms_Frontcmsservices_created extends Baseclass {
	
	
	Readconfig config= new Readconfig();
	public String servicename=config.getservicename();
	public String shortdescription=config.getshortdescription();
	
	@Test
	public void Frontcms_Frontcmsservicespagetest() throws InterruptedException, AWTException  {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	Frontcms_Frontcmsservicespage fcmsservices= new Frontcms_Frontcmsservicespage(driver);
	fcmsservices.clickonfrontcms();
	Thread.sleep(2000);
	fcmsservices.clickonFrontCMSServices();
	Thread.sleep(2000);
	fcmsservices.clickonNewService();
	Thread.sleep(2000);
	fcmsservices.setnameinnewservice(servicename);
	fcmsservices.setshortdescription(shortdescription);
	fcmsservices.setclickontheicon();
	fcmsservices.clickonfrontServiceSave();
	Thread.sleep(6000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
