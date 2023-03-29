package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Services_servicespage;
import com.medsol.utilities.Readconfig;

public class TC_Services_services_created extends Baseclass  {

	
	Readconfig config= new Readconfig();

	public String rate=config.getrate();
	public String servicename=config.getservicename();	
	public String quantity=config.getquantity();
	public String description=config.getdescription();
	

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
	service.clickonNewService();
	service.setname(servicename);
	service.setquantity(quantity);
	service.setrate(rate);
	service.setdescription(description);
	service.clickonstatus();
	service.clickonserviceBtnSave();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
