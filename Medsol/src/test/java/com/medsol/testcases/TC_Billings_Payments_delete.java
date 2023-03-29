package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Billings_Paymentspage;

public class TC_Billings_Payments_delete extends Baseclass
{

	 @Test
		public void Paymentstest() throws InterruptedException {

			Thread.sleep(3000);
			Loginpage lp=new Loginpage(driver);
		lp.clickonlogin();
		lp.setemail(username);
		lp.setpassword(password);
		lp.clickonloginsubmit();
		Thread.sleep(3000);
		
		Billings_Paymentspage pay= new Billings_Paymentspage(driver);
		
		pay.clickonbillings();
		Thread.sleep(2000);
		pay.clickonpayments();
		Thread.sleep(2000);
		pay.clickoneditbutton();
		Thread.sleep(2000);
		
		pay.clickondeletebutton();
		pay.clickonyesdeletebutton();
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 }	
	
}
