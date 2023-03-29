package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Reports_deathReportspage;
import com.medsol.utilities.Readconfig;

public class TC_Reports_deathReports_created extends Baseclass{

	Readconfig config= new Readconfig();
	public String description=config.getdescription();
	public String year=config.getyear();
	public String month=config.getmonth();
	public String date=config.getdate();
	
	
	@Test
	public void Reports_deathReportspagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Reports_deathReportspage dreports= new Reports_deathReportspage(driver);
	
	dreports.clickonReports();
	Thread.sleep(2000);
	dreports.clickonDeathReports();
	Thread.sleep(2000);
	dreports.clickonNewDeathReport();
	Thread.sleep(2000);
	dreports.setdescription(description);
	dreports.setdeathDate(month, date);
	dreports.clickondeathReportSave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
