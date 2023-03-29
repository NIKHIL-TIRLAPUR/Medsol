package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Billings_Paymentspage;
import com.medsol.utilities.Readconfig;

public class TC_Billings_Payments_created extends Baseclass{
	
	Readconfig config= new Readconfig();
	
	public String selectaccount=config.getselectaccount();
	public String year1=config.getyear1();
	public String month1=config.getmonth1();
	public String date1=config.getdate1();
	public String paytouser=config.getpaytouser();
	public String amounttobepaid=config.getamounttobepaid();
	public String description=config.getdescription();
	
	
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
	pay.clickonActions();
	Thread.sleep(2000);
	pay.clickonNewpayment();
	Thread.sleep(2000);
	pay.clickonselectaccount();
	Thread.sleep(2000);
	pay.setselectaccount(selectaccount);
	pay.setpaymentdate(year1, month1, date1);
	pay.setpaytouser(paytouser);
	pay.setamounttobepaid(amounttobepaid);
	pay.setdescription(description);
    pay.clickonsavebutton();
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
