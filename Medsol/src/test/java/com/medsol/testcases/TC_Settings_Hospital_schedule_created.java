package com.medsol.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Settings_Hospital_schedulepage;
import com.medsol.utilities.Readconfig;

public class TC_Settings_Hospital_schedule_created  extends Baseclass{

	Readconfig config= new Readconfig();
	public String starttime=config.getstarttime();
	public String endtime=config.getendtime();
	public String set=config.getset();

	@Test
	public void Settings_Hospital_schedulepagetest() throws InterruptedException, AWTException {
		
	
		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);	
	
	Settings_Hospital_schedulepage schedule= new Settings_Hospital_schedulepage(driver);
	
	schedule.clickonSettings(set);
	Thread.sleep(2000);
	schedule.clickonHospitalSchedule();
	Thread.sleep(2000);
	schedule.clickonWeekDays();
	Thread.sleep(2000);
	schedule.setstarttime(starttime);
	Thread.sleep(2000);
	schedule.setendtime(endtime);
	Thread.sleep(2000);
	//schedule.clickonhospitalScheduleBtnSave();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
