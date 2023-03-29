package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Services_ambulance_callspage;
import com.medsol.utilities.Readconfig;

public class TC_Services_ambulance_calls_delete extends Baseclass{

	Readconfig config= new Readconfig();

	public String year2=config.getyear2();
	public String editrate1=config.geteditrate1();
	
	@Test
	public void Services_ambulance_callspagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Services_ambulance_callspage calls= new Services_ambulance_callspage(driver);
	
	calls.clickonServices();
	Thread.sleep(2000);
	calls.clickonAmbulanceCalls();
	Thread.sleep(2000);
	calls.setnameinsearchboxfordeleteoredit(editrate1);
	calls.clickondeletebutton();
	Thread.sleep(2000);
	calls.clickonyesdeletebutton();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
}
