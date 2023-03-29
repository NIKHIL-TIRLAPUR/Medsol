package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Services_ambulancespage;
import com.medsol.utilities.Readconfig;

public class TC_Services_ambulances_delete extends Baseclass{

	Readconfig config= new Readconfig();

	public String driver_name=config.getdriver_name();
	public String editvehicle_number=config.geteditvehicle_number();
	
	
	
	
	@Test
	public void Services_ambulancespagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	
	Services_ambulancespage sambulance= new Services_ambulancespage(driver);
	
	sambulance.clickonServices();
	Thread.sleep(2000);
	sambulance.clickonAmbulances();
	Thread.sleep(2000);
	sambulance.setnameinsearchboxfordeleteoredit(editvehicle_number);
	sambulance.clickondeletebutton();
	Thread.sleep(2000);
	sambulance.clickonyesdeletebutton();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
