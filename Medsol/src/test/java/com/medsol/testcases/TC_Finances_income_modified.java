package com.medsol.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medsol.pageobject.Finances_incomepage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Finances_income_modified extends Baseclass 
{
	Readconfig config= new Readconfig();
	public String editdonorname=config.geteditdonorname();
	public String path=config.getpath();
	public String editincomehead=config.geteditincomehead();
	public String editinvoicenumber=config.geteditinvoicenumber();
	public String editamounttobepaid=config.geteditamounttobepaid();
	public String editdescription=config.geteditdescription();
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
	fincome.clickoneditincomebutton();
	Thread.sleep(2000);	
	fincome.seteditincomeheaddropdown(editincomehead);
	fincome.seteditname(editdonorname);
	fincome.seteditincomedate(month, date);
	fincome.seteditinvoicenumber(editinvoicenumber);
	fincome.seteditamount(editamounttobepaid);
	fincome.seteditdescription(editdescription);
	fincome.clickoneditincomesavebutton();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
