package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Reports_birthreportspage;
import com.medsol.utilities.Readconfig;

public class TC_Reports_birthreports_created extends Baseclass {

	
	Readconfig config= new Readconfig();
	public String description=config.getdescription();
	public String year=config.getyear();
	public String month=config.getmonth();
	public String date=config.getdate();
	
	
	@Test
	public void Reports_birthreportspagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Reports_birthreportspage breport= new Reports_birthreportspage(driver);
	
	breport.clickonReports();
	Thread.sleep(2000);
	breport.clickonNewBirthReport();
	Thread.sleep(2000);
	//breport.setselectdoctor(date);
	//breport.setselectcase(date);
	breport.setdescription(description);
	breport.setbirthDate(month, date);
	breport.clickonbtnBirthSave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
}
