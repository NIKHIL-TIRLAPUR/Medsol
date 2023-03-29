package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Billings_accountpage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Billings_account_created extends Baseclass {
	
	
	
	Readconfig config= new Readconfig();
	public String firstname=config.getfirstname();
	public String description=config.getdescription();
	
    @Test
	public void Billingstest() throws InterruptedException 
    {
		
		Thread.sleep(3000);
		Loginpage lp = new Loginpage(driver);
		lp.clickonlogin();
		Logger.info("clicked on login button");
		lp.setemail(username);
		Logger.info("entered user name");
		lp.setpassword(password);
		Logger.info("entered user password");
		lp.clickonloginsubmit();
		Logger.info("clicked on login button sumit");
		Thread.sleep(3000);

		Billings_accountpage bil= new Billings_accountpage(driver);
		bil.clickonbillings();
		Logger.info("clicked on billings button");
		Thread.sleep(2000);
		bil.clickonnewaccount();
		Logger.info("clicked on new account button");
		Thread.sleep(2000);
		bil.setaccount(firstname);
		Logger.info("entered account name");
		bil.setdescription(description);
		Logger.info("entered description");
		bil.setaccounttype();
		Logger.info("selected type of account");
		bil.clickonsavebutton();
		Thread.sleep(3000); 
		
		
		
		
		
	}

}
