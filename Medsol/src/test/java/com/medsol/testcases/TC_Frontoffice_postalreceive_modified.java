package com.medsol.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medsol.pageobject.Frontoffice_postalreceivepage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Frontoffice_postalreceive_modified  extends Baseclass
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
	
	Frontoffice_postalreceivepage preceive = new Frontoffice_postalreceivepage(driver);
	preceive.clickonfrontoffice();
	Thread.sleep(2000);
	preceive.clickonPostalReceive();
	Thread.sleep(2000);
	preceive.clickoneditreceivebutton();
	Thread.sleep(2000);
	preceive.seteditfromtitle(editfromtitle);
	preceive.seteditreceivedate(year1, month, date);
	preceive.seteditreferenceno(editreferencenumber);
	preceive.setedittotitle(edittotitle);
	preceive.seteditaddress(editaddress);
	preceive.clickoneditreceivesave();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
