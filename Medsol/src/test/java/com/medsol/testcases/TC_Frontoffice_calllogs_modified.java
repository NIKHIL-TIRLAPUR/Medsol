package com.medsol.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medsol.pageobject.Frontoffice_calllogspage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Frontoffice_calllogs_modified extends Baseclass 
{

	Readconfig config= new Readconfig();
	public String editdonorname=config.geteditdonorname();
	public String editnote=config.geteditnote();
	public String fdate=config.getfdate();
	public String fmonth=config.getfmonth();
	public String month=config.getmonth();
	public String date=config.getdate();
	public String countryname=config.getcountryname();
	
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
	calllogs.clickoncallLogeditbutton();
	Thread.sleep(2000);
	calllogs.seteditname(editdonorname);
	String number=randomnum();
	String phonenumber="99005"+ number;
	calllogs.seteditphonenumber(phonenumber);
	calllogs.clickoninradiobutton();
	calllogs.setreceivedondate(month, date);
	calllogs.setfollowupdate(fmonth, fdate);
	
	calllogs.seteditnote(editnote);
	calllogs.clickoncallLogSavebutton();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
