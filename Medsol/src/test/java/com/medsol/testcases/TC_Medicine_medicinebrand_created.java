package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Medicine_medicinebrandpage;
import com.medsol.utilities.Readconfig;

public class TC_Medicine_medicinebrand_created extends Baseclass {

	
	Readconfig config= new Readconfig();
	public String brandname=config.getbrandname();
	
	
	
	
	
	@Test
	public void Medicine_medicinebrandpagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Medicine_medicinebrandpage medb= new Medicine_medicinebrandpage(driver);
	medb.clickonMedicines();
	Thread.sleep(2000);
	medb.clickonMedicineBrands();
	Thread.sleep(2000);
	medb.clickonNewMedicineBrand();
	Thread.sleep(2000);
	medb.setbrandName(brandname);
	
	String number=randomnum();
	String phonenumber="99005"+ number;
	medb.setbrandPhoneNumber(phonenumber);
	String email=randomstring()+"@gmail.com";
	medb.setbrandEmail(email);
	medb.clickonbrandSave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
