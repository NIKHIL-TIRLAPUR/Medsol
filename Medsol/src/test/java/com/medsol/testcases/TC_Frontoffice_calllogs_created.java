package com.medsol.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medsol.pageobject.Frontoffice_calllogspage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Frontoffice_calllogs_created extends Baseclass
{
	Readconfig config= new Readconfig();
	public String donorname=config.getdonorname();
	public String note=config.getnote();
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
	calllogs.clickoncalllogsdropdownMenuButton();
	Thread.sleep(2000);
	calllogs.clickonnewcalllogButton();
	Thread.sleep(2000);
	calllogs.setname(donorname);
	//calllogs.setcountry(countryname);
	String number=randomnum();
	String phonenumber="99005"+ number;
	calllogs.setphonenumber(phonenumber);
	calllogs.setreceivedondate(month, date);
	calllogs.setfollowupdate(fmonth, fdate);
	calllogs.clickonoutradiobutton();
	calllogs.setnote(note);
	//calllogs.clickoncallLogSavebutton();
	Thread.sleep(2000);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
