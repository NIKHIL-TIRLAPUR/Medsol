package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Services_packagepage;
import com.medsol.utilities.Readconfig;

public class TC_Services_package_delete extends Baseclass {

	Readconfig config= new Readconfig();

	public String Packagename=config.getPackagename();
	public String editPackagename=config.geteditPackagename();
	
	
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
	spackage.setnameinsearchboxfordeleteoredit(editPackagename);
	spackage.clickondeletebutton();
	Thread.sleep(2000);
	spackage.clickonyesdeletebutton();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
