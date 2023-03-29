package com.medsol.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medsol.pageobject.Frontoffice_calllogspage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Frontoffice_calllogs_delete extends Baseclass
{
	Readconfig config= new Readconfig();
	public String editdonorname=config.geteditdonorname();
	
	
	@Test
	public void Frontoffice_calllogspagetest() throws InterruptedException, AWTException  {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Frontoffice_calllogspage calllogs= new Frontoffice_calllogspage(driver);
	calllogs.clickonfrontoffice();
	Thread.sleep(2000);
	calllogs.setnameinsearchboxfordelete(editdonorname);
	calllogs.clickondeletebutton();
	calllogs.clickonyesdeletebutton();
	Thread.sleep(2000);

	
	
	
	
	
	
	
	
	}
}
