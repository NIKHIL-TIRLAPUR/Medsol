package com.medsol.testcases;



import org.testng.annotations.Test;

import com.medsol.pageobject.Billings_Advancepaymentpage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Billings_Advancepayment_created extends Baseclass{
	
	
Readconfig config= new Readconfig();
	
	public String amounttobepaid=config.getamounttobepaid();
	public String selectpatient=config.getselectpatient();
	
	
	 @Test
		public void Billings_Advancepaymenttest() throws InterruptedException  {

			Thread.sleep(3000);
			Loginpage lp=new Loginpage(driver);
		lp.clickonlogin();
		lp.setemail(username);
		lp.setpassword(password);
		lp.clickonloginsubmit();
		Thread.sleep(3000);
		Billings_Advancepaymentpage billad = new Billings_Advancepaymentpage(driver);
		
		billad.clickonbillings();
		Thread.sleep(2000);
		billad.clickonadvancepayment();
		Thread.sleep(2000);
		billad.clickonnewadvancepayment();
		Thread.sleep(2000);
		billad.clickonselectpatientdropdown();
		billad.setpatient(selectpatient);
		Thread.sleep(2000);
		billad.setamount(amounttobepaid);
		billad.clickonsavebutton();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	 }
	 
	 
	 
}
