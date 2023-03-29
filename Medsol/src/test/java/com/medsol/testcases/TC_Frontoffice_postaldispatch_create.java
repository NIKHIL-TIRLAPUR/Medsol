package com.medsol.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medsol.pageobject.Frontoffice_postaldispatchpage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Frontoffice_postaldispatch_create extends Baseclass
{
	Readconfig config= new Readconfig();
	public String fromtitle=config.getfromtitle();
	public String referencenumber=config.getreferencenumber();
	public String totitle=config.gettotitle();
	public String fmonth=config.getfmonth();
	public String year1=config.getyear1();
	public String date=config.getdate();
	public String address=config.getaddress();
	
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
	pdispatch.clickonPostaldispatchdropdownMenuButton();
	Thread.sleep(2000);
	pdispatch.clickonNewDispatch();
	Thread.sleep(2000);
	pdispatch.settotitle(totitle);
	pdispatch.setfromtitle(fromtitle);
	pdispatch.setreferenceno(referencenumber);
	pdispatch.setdispatchdate(year1, fmonth, date);
	pdispatch.setaddress(address);
	pdispatch.clickondispatchSave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
