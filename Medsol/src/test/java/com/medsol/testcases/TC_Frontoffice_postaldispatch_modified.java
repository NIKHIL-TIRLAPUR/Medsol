package com.medsol.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medsol.pageobject.Frontoffice_postaldispatchpage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Frontoffice_postaldispatch_modified extends Baseclass 
{
	Readconfig config= new Readconfig();
	public String editfromtitle=config.geteditfromtitle();
	public String editreferencenumber=config.geteditreferencenumber();
	public String edittotitle=config.getedittotitle();
	public String month=config.getfmonth();
	public String year1=config.getyear1();
	public String date=config.getdate();
	public String editaddress=config.geteditaddress();

	@Test
	public void Frontoffice_postalreceivetest() throws InterruptedException, AWTException  {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Frontoffice_postaldispatchpage pdispatch= new Frontoffice_postaldispatchpage(driver);
	pdispatch.clickonfrontoffice();
	Thread.sleep(2000);
	pdispatch.clickonPostalDispatch();
	Thread.sleep(2000);
	pdispatch.clickoneditdispatchbutton();
	pdispatch.setedittotitle(edittotitle);
	pdispatch.seteditreferenceno(editreferencenumber);
	pdispatch.seteditdispatchdate(year1, month, date);
	pdispatch.seteditfromtitle(editfromtitle);
	pdispatch.seteditaddress(editaddress);
	pdispatch.clickoneditdispatchSave();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
