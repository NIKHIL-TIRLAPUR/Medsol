package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Services_insurancespage;
import com.medsol.utilities.Readconfig;

public class TC_Services_insurances_created extends Baseclass {

	
	Readconfig config= new Readconfig();

	public String Insurancename=config.getInsurancename();
	public String servicetax=config.getservicetax();
	public String discount=config.getdiscount();	
	public String insuranceno=config.getinsuranceno();
	public String insurancecode=config.getinsurancecode();
	public String hospitalrate=config.gethospitalrate();
	public String remark=config.getremark();
	public String diseasesname=config.getdiseasesname();	
	public String diseasescharge=config.getdiseasescharge();
	public String diseasesname1=config.getdiseasesname1();
	public String diseasescharge1=config.getdiseasescharge1();
	
	
	
	
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
	insur.clickonNewInsurance();
	Thread.sleep(2000);
	insur.setname(Insurancename);
	insur.setservice_tax(servicetax);
	insur.setinsuranceDiscount();
	//insur.setinsuranceDiscountId(discount);
	
	insur.setinsurance_no(insuranceno);
	insur.setinsurance_code(insurancecode);
	insur.sethospital_rate(hospitalrate);
	insur.setremark(remark);
	insur.clickonstatus();
	
	insur.scrolldown();
	Thread.sleep(2000);
	insur.setdiseasesname(diseasesname);
	insur.setdiseasescharge(diseasescharge);
	Thread.sleep(2000);
	//insur.clickonaddInsuranceItem();
	//insur.setdiseasesname1(diseasesname1);
	//insur.setdiseasescharge1(diseasescharge1);
	insur.scrolldown();
	insur.clickoninsuranceSaveBtn();
	Thread.sleep(5000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
}
