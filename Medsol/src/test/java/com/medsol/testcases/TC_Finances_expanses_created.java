package com.medsol.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medsol.pageobject.Finances_expansespage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Finances_expanses_created extends Baseclass
{
	Readconfig config= new Readconfig();
	public String donorname=config.getdonorname();
	public String path=config.getpath();
	public String expansehead=config.getexpansehead();
	public String expanseinvoicenumber=config.getexpanseinvoicenumber();
	public String amounttobepaid=config.getamounttobepaid();
	public String description=config.getdescription();
	public String month=config.getmonth();
	public String date=config.getdate();
	
	@Test
	public void Finances_expansespagetest() throws InterruptedException, AWTException  {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	Finances_expansespage fexpanses= new Finances_expansespage(driver);
	fexpanses.clickonfinances();
	Thread.sleep(2000);
	fexpanses.clickonfinancesexpanses();
	Thread.sleep(2000);
	fexpanses.clickondropdownMenuButton();
	Thread.sleep(2000);
	fexpanses.clickonnewexpansesButton();
	Thread.sleep(2000);
	fexpanses.setexpansesheaddropdown(expansehead);
	fexpanses.setname(donorname);
	fexpanses.setexpansesdate(month, date);
	fexpanses.setinvoicenumber(expanseinvoicenumber);
	fexpanses.setamount(amounttobepaid);
	//fexpanses.setattachment(path);
	fexpanses.setdescription(description);
	fexpanses.clickonexpansesavebutton();
	Thread.sleep(2000);

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
