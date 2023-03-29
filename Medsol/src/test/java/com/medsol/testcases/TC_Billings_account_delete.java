package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Billings_accountpage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Billings_account_delete extends Baseclass
{
	
	
Readconfig config= new Readconfig();
	
	

	@Test
	public void Billingsdelete() throws InterruptedException
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
	bil.clickondeletebutton();
	bil.clickonyesdeletebutton();
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
