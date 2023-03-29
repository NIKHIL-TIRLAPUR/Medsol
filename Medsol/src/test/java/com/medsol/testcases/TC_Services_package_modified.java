package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Services_packagepage;
import com.medsol.utilities.Readconfig;

public class TC_Services_package_modified extends Baseclass{

	
	Readconfig config= new Readconfig();

	public String Packagename=config.getPackagename();
	public String editPackagename=config.geteditPackagename();
	public String editselectservice=config.geteditselectservice();
	public String editdiscount=config.geteditdiscount();	
	public String editdescription=config.geteditdescription();
	public String editquantity=config.geteditquantity();
	public String editrate=config.geteditrate();
	public String editselectservice2=config.geteditselectservice2();
	public String editquantity1=config.geteditquantity1();	
	public String editrate1=config.geteditrate1();
	
	
	
	
	
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
	spackage.setnameinsearchboxfordeleteoredit(Packagename);
	spackage.clickoneditbutton();
	Thread.sleep(2000);
	spackage.seteditPackagename(editPackagename);
	spackage.seteditpackageDiscountId(editdiscount);
	spackage.seteditpackagedescription(editdescription);
	
	
	spackage.seteditselectservice(editselectservice);
	spackage.seteditquantity(editquantity);
	spackage.seteditrate(editrate);
	spackage.scrolldown();
	Thread.sleep(2000);
	spackage.seteditselectservice2(editselectservice2);
	Thread.sleep(2000);
	spackage.seteditquantity1(editquantity1);
	Thread.sleep(2000);
	spackage.seteditrate1(editrate1);
	Thread.sleep(2000);
	//Thread.sleep(2000);
	spackage.clickondeleteservicerow();
	Thread.sleep(2000);
	
	
	spackage.clickonpackageSaveBtn();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
