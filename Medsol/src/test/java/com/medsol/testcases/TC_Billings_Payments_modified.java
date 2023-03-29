package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Billings_Paymentspage;
import com.medsol.utilities.Readconfig;

public class TC_Billings_Payments_modified extends Baseclass {
	
Readconfig config= new Readconfig();
	
	public String selectaccount=config.getselectaccount();
	public String year1=config.getyear1();
	public String month1=config.getmonth1();
	public String date1=config.getdate1();
	public String editpaytouser=config.geteditpaytouser();
	public String editamounttobepaid=config.geteditamounttobepaid();
	public String editdescription=config.geteditdescription();
	
	
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
	pay.clickonselectaccount();
	Thread.sleep(2000);
	pay.setselectaccount(selectaccount);
	pay.seteditpaytouser(editpaytouser);
	pay.seteditamounttobepaid(editamounttobepaid);
	pay.seteditdescription(editdescription);
    pay.clickonsavebutton();
	
	
	
	
	
	
	
	
	
	
	
	
	
    }
}
