package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Billings_Advancepaymentpage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Billings_Advancepayment_modified extends Baseclass{
	
Readconfig config= new Readconfig();
	
	public String editamounttobepaid=config.geteditamounttobepaid();
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
        billad.clickoneditadvancedPaymentbutton();
        Thread.sleep(2000);
	    billad.seteditamount(editamounttobepaid);
	    billad.clickoneditsavebutton();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 }
}
