package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Billings_Invoicepage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Billings_Invoice_delete extends Baseclass 
{

Readconfig config= new Readconfig();
	
	

	@Test
	public void Invoicedelete() throws InterruptedException
	{
		Thread.sleep(3000);
		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);	
	
	Billings_Invoicepage in = new Billings_Invoicepage(driver);
	in.clickonbillings();
	Thread.sleep(2000);
	in.clickoninvoice();
	Thread.sleep(2000);
	in.clickondeletebutton();
	in.clickonyesdeletebutton();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
