package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Billings_accountpage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Billings_account_modified extends Baseclass 
{
	
Readconfig config= new Readconfig();
	
	public String changebillingname=config.getchangebillingname();
	public String changebillingdescription=config.getchangebillingdescription();
	
	
	@Test
	public void Billingsmodified() throws InterruptedException
	{
		Thread.sleep(3000);
		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);	
	
	Billings_accountpage bil= new Billings_accountpage(driver);
	bil.clickonbillings();
	Thread.sleep(2000);
	bil.clickoneidtbutton();
	bil.setchangedbillingname(changebillingname);
	bil.setchangedbillingdescription(changebillingdescription);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
