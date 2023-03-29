package com.medsol.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medsol.pageobject.Finances_expansespage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Finances_expanses_modified extends Baseclass
{
	Readconfig config= new Readconfig();
	public String editdonorname=config.geteditdonorname();
	public String path=config.getpath();
	public String editexpansehead=config.geteditexpansehead();
	public String editexpanseinvoicenumber=config.geteditexpanseinvoicenumber();
	public String editamounttobepaid=config.geteditamounttobepaid();
	public String editdescription=config.geteditdescription();
	public String month=config.getmonth();
	public String date=config.getdate();
	
	@Test
	public void Finances_expansepagetest() throws InterruptedException, AWTException  {
		

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
	fexpanses.clickoneditexpansesbutton();
	Thread.sleep(2000);
	fexpanses.seteditexpanseheaddropdown(editexpansehead);
	fexpanses.seteditname(editdonorname);
	fexpanses.seteditexpansedate(month, date);
	fexpanses.seteditinvoicenumber(editexpanseinvoicenumber);
	fexpanses.seteditamount(editamounttobepaid);
	fexpanses.seteditdescription(editdescription);
	fexpanses.clickoneditexpansesavebutton();
	Thread.sleep(2000);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
