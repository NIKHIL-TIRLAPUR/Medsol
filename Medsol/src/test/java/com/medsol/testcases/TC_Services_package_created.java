package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Services_packagepage;
import com.medsol.utilities.Readconfig;

public class TC_Services_package_created extends Baseclass {

	Readconfig config= new Readconfig();

	public String Packagename=config.getPackagename();
	public String selectservice=config.getselectservice();
	public String discount=config.getdiscount();	
	public String description=config.getdescription();
	public String quantity=config.getquantity();
	public String rate=config.getrate();
	public String selectservice2=config.getselectservice2();
	public String quantity1=config.getquantity1();	
	public String rate1=config.getrate1();
	
	
	
	
	
	@Test
	public void Services_packagepagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	
	Services_packagepage spackage=new Services_packagepage(driver);
	
	spackage.clickonServices();
	Thread.sleep(2000);
	spackage.clickonPackages();
	Thread.sleep(2000);
	spackage.clickonNewPackage();
	Thread.sleep(2000);
	spackage.setPackagename(Packagename);
	spackage.setpackageDiscountId(discount);
	spackage.setpackagedescription(description);
	spackage.setselectservice(selectservice);
	spackage.setquantity(quantity);
	spackage.setrate(rate);
	spackage.scrolldown();
	Thread.sleep(2000);
	spackage.clickonaddPackageItem();
	spackage.setselectservice2(selectservice2);
	spackage.setquantity1(quantity1);
	spackage.setrate1(rate1);
	spackage.clickonpackageSaveBtn();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
