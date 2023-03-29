package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Reports_operationreportspage;
import com.medsol.utilities.Readconfig;

public class TC_Reports_operationreports_created extends Baseclass {

	Readconfig config= new Readconfig();
	public String description=config.getdescription();
	public String year=config.getyear();
	public String month=config.getmonth();
	public String date=config.getdate();
	
	
	@Test
	public void Reports_operationreportspagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Reports_operationreportspage operation = new Reports_operationreportspage(driver);
	
	
	operation.clickonReports();
	Thread.sleep(2000);
	operation.clickonOperationReports();
	Thread.sleep(2000);
	operation.clickonNewOperationReport();
	operation.setdescription(description);
	operation.setoperationDate(month, date);
	operation.clickonoperationReportSave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
