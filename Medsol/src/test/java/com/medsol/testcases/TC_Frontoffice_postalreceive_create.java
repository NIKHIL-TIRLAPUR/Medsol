package com.medsol.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medsol.pageobject.Frontoffice_postalreceivepage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Frontoffice_postalreceive_create extends Baseclass  {
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
	
	Frontoffice_postalreceivepage preceive = new Frontoffice_postalreceivepage(driver);
	preceive.clickonfrontoffice();
	Thread.sleep(2000);
	preceive.clickonPostalReceive();
	Thread.sleep(2000);

	preceive.clickonPostalReceivedropdownMenuButton();
	Thread.sleep(2000);
	preceive.clickonNewReceive();
	Thread.sleep(2000);
	preceive.setfromtitle(fromtitle);
	preceive.setreferenceno(referencenumber);
	preceive.setreceivedate(year1, fmonth, date);
	preceive.settotitle(totitle);
	preceive.setaddress(address);
	preceive.clickonreceivesave();
	Thread.sleep(3000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
