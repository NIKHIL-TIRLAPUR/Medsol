package com.medsol.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medsol.pageobject.Finances_incomepage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Finances_income_created extends Baseclass
{
	Readconfig config= new Readconfig();
	public String donorname=config.getdonorname();
	public String path=config.getpath();
	public String incomehead=config.getincomehead();
	public String invoicenumber=config.getinvoicenumber();
	public String amounttobepaid=config.getamounttobepaid();
	public String description=config.getdescription();
	public String month=config.getmonth();
	public String date=config.getdate();
	
	@Test
	public void Finances_incomepagetest() throws InterruptedException, AWTException  {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);	
	
	Finances_incomepage fincome= new Finances_incomepage(driver);
			
	fincome.clickonfinances();
	Thread.sleep(2000);	
	fincome.clickondropdownMenuButton();
	Thread.sleep(2000);	
	fincome.clickonnewincomeButton();
	Thread.sleep(2000);	

	fincome.setincomeheaddropdown(incomehead);
	Thread.sleep(2000);	

	fincome.setname(donorname);
	fincome.setincomedate(month, date);
	Thread.sleep(2000);	
	fincome.setinvoicenumber(invoicenumber);
	fincome.setamount(amounttobepaid);
	//fincome.clickonattachment();
	//fincome.setattachment(path);
	Thread.sleep(2000);	
	fincome.setdescription(description);
	fincome.clickonincomesavebutton();
	Thread.sleep(2000);	
	
	
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
