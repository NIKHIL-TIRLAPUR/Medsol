package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Opdpage;
import com.medsol.utilities.Readconfig;

public class TC_Opd_created extends Baseclass {
	
	Readconfig config= new Readconfig();
	public String note=config.getnote();
	public String standardcharge=config.getstandardcharge();
	public String ipdheight=config.getipdheight();
	public String ipdweight=config.getipdweight();
	public String ipdbloodpressure=config.getipdbloodpressure();
	public String selectpatient=config.getselectpatient();
	public String symptoms=config.getsymptoms();
	public String paymentmode=config.getpaymentmode();

	@Test
	public void Opdpagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);

	Opdpage opd = new Opdpage(driver);
	opd.clickonipd_opd();
	Thread.sleep(2000);
	opd.clickonOPDPatients();
	Thread.sleep(2000);
	opd.clickonNewOPDPatients();
	Thread.sleep(2000);
	opd.setselectpatient(selectpatient);
	opd.setheight(ipdheight);
	opd.setweight(ipdweight);
	opd.setbloodpressure(ipdbloodpressure);
	opd.setstandardcharge(standardcharge);
	opd.setpaymentmode(paymentmode);
	opd.setsymptoms(symptoms);
	opd.setnotes(note);
	opd.clickonopdsave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
