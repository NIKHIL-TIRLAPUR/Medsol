package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Ipdpage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_ipd_created  extends Baseclass {


	Readconfig config= new Readconfig();
	public String note=config.getnote();
	public String bedtype=config.getbedtype();
	public String ipdheight=config.getipdheight();
	public String ipdweight=config.getipdweight();
	public String ipdbloodpressure=config.getipdbloodpressure();
	public String selectpatient=config.getselectpatient();
	public String symptoms=config.getsymptoms();
	

	@Test
	public void Ipdpagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Ipdpage ipd = new Ipdpage(driver);
	ipd.clickonipd_opd();
	Thread.sleep(2000);
	ipd.clickonNewIPDPatient();
	Thread.sleep(2000);
	ipd.setselectpatient(selectpatient);
	Thread.sleep(2000);
	ipd.setheight(ipdheight);
	ipd.setweight(ipdweight);
	ipd.setbloodpressure(ipdbloodpressure);
	ipd.setselectbedtype(bedtype);
	ipd.setsymptoms(symptoms);
	ipd.setnotes(note);
	ipd.clickonipdsave();
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
