package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Billings_Advancepaymentpage;
import com.medsol.pageobject.Loginpage;

public class TC_Billings_Advancepayment_delete extends Baseclass
{
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
		
		billad.clickondeletebutton();
		Thread.sleep(2000);
		
		billad.clickonyesdeletebutton();
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
	 }
	 
	 
	 
	 
	 
	 
}
