package com.medsol.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medsol.pageobject.Frontoffice_visitorspage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Frontoffice_visitors_create extends Baseclass
{
	Readconfig config= new Readconfig();
	public String donorname=config.getdonorname();
	public String selectpurpose=config.getselectpurpose();
	public String fdate=config.getfdate();
	public String fmonth=config.getfmonth();
	public String idcard=config.getidcard();
	public String numberofperson=config.getnumberofperson();
	public String intimehour=config.getintimehour();
	public String intimeminute=config.getintimeminute();
	public String intimesecond=config.getintimesecond();
	public String outtimehour=config.getouttimehour();
	public String outtimeminute=config.getouttimeminute();
	public String outtimesecond=config.getouttimesecond();
	public String year1=config.getyear1();
	public String note=config.getnote();
	
	
	@Test
	public void Frontoffice_visitorspagetest() throws InterruptedException, AWTException  {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Frontoffice_visitorspage fovisitor= new Frontoffice_visitorspage(driver);
	fovisitor.clickonfrontoffice();
	Thread.sleep(2000);

	fovisitor.clickonfrontofficevisitors();
	Thread.sleep(2000);

	fovisitor.clickonfrontofficevisitorsdropdown();
	Thread.sleep(2000);

	fovisitor.clickonfrontofficenewvisitor();
	Thread.sleep(2000);

	
	fovisitor.setpurposedropdown(selectpurpose);
	fovisitor.setnameofvisitor(donorname);
	String number=randomnum();
	String phonenumber="99005"+ number;
	fovisitor.setphonenumber(phonenumber);
	fovisitor.setvisitorIdCard(idcard);
	fovisitor.setnumberofvisitor(numberofperson);

	//fovisitor.setdateofvisitors(year1, fmonth, fdate);
	Thread.sleep(2000);
	fovisitor.setintimeofvisitor(intimehour, intimeminute, intimesecond);
	Thread.sleep(2000);

	fovisitor.setouttimeofvisitor(outtimehour, outtimeminute, outtimesecond);
	Thread.sleep(2000);

	fovisitor.setvisitornote(note);
	Thread.sleep(2000);
	fovisitor.clickonvisitorSavebutton();
	Thread.sleep(2000);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
