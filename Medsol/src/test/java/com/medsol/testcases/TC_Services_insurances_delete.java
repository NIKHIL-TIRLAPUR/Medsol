package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Services_insurancespage;
import com.medsol.utilities.Readconfig;

public class TC_Services_insurances_delete extends Baseclass {

	Readconfig config= new Readconfig();

	public String Insurancename=config.getInsurancename();
	public String editInsurancename=config.geteditInsurancename();
	
	
	
	@Test
	public void Services_insurancespagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Services_insurancespage insur= new Services_insurancespage(driver);
	
	insur.clickonServices();
	Thread.sleep(2000);
	insur.clickonInsurances();
	Thread.sleep(2000);
	insur.setnameinsearchboxfordeleteoredit(Insurancename);
	insur.clickondeletebutton();
	Thread.sleep(2000);
	insur.clickonyesdeletebutton();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
