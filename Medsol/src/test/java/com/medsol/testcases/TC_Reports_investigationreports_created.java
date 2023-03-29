package com.medsol.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Reports_investigationreportspage;
import com.medsol.utilities.Readconfig;

public class TC_Reports_investigationreports_created extends Baseclass {

	Readconfig config= new Readconfig();
	public String description=config.getdescription();
	public String year1=config.getyear1();
	public String month1=config.getmonth1();
	public String date1=config.getdate1();
	public String title=config.gettitle();
	public String selectpatient=config.getselectpatient();
	public String investigationStatus=config.getinvestigationStatus();
	public String path1=config.getpath1();
	
	

	@Test
	public void Reports_investigationreportspagetest() throws InterruptedException, AWTException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	
	Reports_investigationreportspage investigation = new Reports_investigationreportspage(driver);
	
	investigation.clickonReports();
	Thread.sleep(2000);
	investigation.clickonInvestigationReports();
	Thread.sleep(2000);
	investigation.clickonNewInvestigationReport();
	Thread.sleep(2000);
	investigation.settitle(title);
	investigation.setselectpatient(selectpatient);
	//investigation.setselectdoctor(date1);
	investigation.setinvestigationDate(year1, month1, date1);
	investigation.setattachment(path1);
	investigation.setinvestigationStatus(investigationStatus);
	investigation.setdescription(description);
	investigation.clickonSave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
