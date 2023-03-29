package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Bloodbank_Bloodissuespage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Bloodbank_Bloodissues_created extends Baseclass {
	
	
	Readconfig config= new Readconfig();
	public String month=config.getmonth();
	public String date=config.getdate();
	public String selectpatient=config.getselectpatient();
	public String price=config.getprice();
	
	
	@Test
	public void Bloodbank_Bloodissuespagetest() throws InterruptedException  {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(2000);	
	Bloodbank_Bloodissuespage bissues= new Bloodbank_Bloodissuespage(driver);
	bissues.clickonBloodbank();
	Thread.sleep(2000);	
	bissues.clickonBloodissues();
	Thread.sleep(2000);	
	bissues.clickonnewBloodissues();
	Thread.sleep(2000);	
	bissues.setbloodissuedateandtime(month, date);
	bissues.setpatientname(selectpatient);
	//bissues.setdoctorname(bloodbags);
	bissues.setbloodissueamount(price);
	bissues.clickonbloodissuesavebutton();
	Thread.sleep(2000);	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
