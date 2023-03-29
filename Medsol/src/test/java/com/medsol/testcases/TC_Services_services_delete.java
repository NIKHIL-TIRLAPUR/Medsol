package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Services_servicespage;
import com.medsol.utilities.Readconfig;

public class TC_Services_services_delete extends Baseclass {

	Readconfig config= new Readconfig();

	public String servicename=config.getservicename();
	public String editrate=config.geteditrate();
	public String editservicename=config.geteditservicename();	
	public String editquantity=config.geteditquantity();
	public String editdescription=config.geteditdescription();
	

	@Test
	public void Services_servicespagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	
	Services_servicespage service= new Services_servicespage(driver);
	service.clickonServices();
	Thread.sleep(2000);
	service.clickonsearchboxfordeleteoredit(editservicename);
	service.clickondeletebutton();
	Thread.sleep(2000);
	service.clickonyesdeletebutton();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
