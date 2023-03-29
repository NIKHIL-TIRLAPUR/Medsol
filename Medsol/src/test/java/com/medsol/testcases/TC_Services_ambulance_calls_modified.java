package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Services_ambulance_callspage;
import com.medsol.utilities.Readconfig;

public class TC_Services_ambulance_calls_modified extends Baseclass {

	Readconfig config= new Readconfig();

	public String year2=config.getyear2();
	public String month2=config.getmonth2();
	public String date2=config.getdate2();
	public String editselectpatient=config.geteditselectpatient();
	public String vehiclemodel=config.getvehiclemodel();	
	public String editvehiclemodle=config.geteditvehiclemodle();
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
	calls.setnameinsearchboxfordeleteoredit(vehiclemodel);
	Thread.sleep(2000);
	calls.clickoneditbutton();
	Thread.sleep(2000);
	calls.seteditselectpatient(editselectpatient);
	calls.seteditselectambulance(editvehiclemodle);
	Thread.sleep(2000);
	calls.seteditambulanceCallDate(year2, month2, date2);
	calls.seteditamount(editrate1);
	calls.clickonambulanceCallSaveBtn();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
}
