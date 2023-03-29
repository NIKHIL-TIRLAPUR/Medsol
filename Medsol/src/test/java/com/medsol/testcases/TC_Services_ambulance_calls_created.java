package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Services_ambulance_callspage;
import com.medsol.utilities.Readconfig;

public class TC_Services_ambulance_calls_created extends Baseclass {

	Readconfig config= new Readconfig();

	public String year1=config.getyear1();
	public String month1=config.getmonth1();
	public String date1=config.getdate1();
	public String selectpatient=config.getselectpatient();
	public String vehiclemodel=config.getvehiclemodel();	
	public String editvehiclemodle=config.geteditvehiclemodle();
	public String rate1=config.getrate1();
	
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
	calls.clickonNewAmbulanceCall();
	Thread.sleep(2000);
	calls.setselectpatient(selectpatient);
	calls.setselectambulance(vehiclemodel);
	calls.setambulanceCallDate(year1, month1, date1);
	calls.setamount(rate1);
	calls.clickonambulanceCallSaveBtn();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
