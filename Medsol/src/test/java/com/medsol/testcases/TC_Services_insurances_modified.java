package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Services_insurancespage;
import com.medsol.utilities.Readconfig;

public class TC_Services_insurances_modified extends Baseclass{

	Readconfig config= new Readconfig();

	public String Insurancename=config.getInsurancename();
	public String editInsurancename=config.geteditInsurancename();
	public String editservicetax=config.geteditservicetax();
	public String editdiscount=config.geteditdiscount();	
	public String editinsuranceno=config.geteditinsuranceno();
	public String editinsurancecode=config.geteditinsurancecode();
	public String edithospitalrate=config.getedithospitalrate();
	public String editremark=config.geteditremark();
	public String editdiseasesname=config.geteditdiseasesname();	
	public String editdiseasescharge=config.geteditdiseasescharge();
	
	
	
	
	
	@Test
	public void Services_insurancespagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Services_insurancespage insur= new Services_insurancespage(driver);
	
	insur.clickonServices();
	Thread.sleep(2000);
	insur.clickonInsurances();
	Thread.sleep(2000);
	insur.setnameinsearchboxfordeleteoredit(Insurancename);
	insur.clickoneditbutton();
	Thread.sleep(2000);
	insur.seteditname(editInsurancename);
	insur.seteditservice_tax(editservicetax);
	insur.seteditinsurance_no(editinsuranceno);
	insur.seteditinsurance_code(editinsurancecode);
	insur.setedithospital_rate(edithospitalrate);
	insur.seteditremark(editremark);
	insur.clickonstatus();
	insur.scrolldown();
	Thread.sleep(2000);
	insur.seteditdiseasesname(editdiseasesname);
	insur.seteditdiseasescharge(editdiseasescharge);
	insur.clickoninsuranceSaveBtn();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
}
