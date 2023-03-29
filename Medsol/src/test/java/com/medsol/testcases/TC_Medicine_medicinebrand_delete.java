package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Medicine_medicinebrandpage;
import com.medsol.utilities.Readconfig;

public class TC_Medicine_medicinebrand_delete extends Baseclass {

	
	Readconfig config= new Readconfig();
	public String editstockSupplierName=config.geteditstockSupplierName();
	
	
	
	
	
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
	medb.setnameinsearchbox(editstockSupplierName);
	medb.clickondeletebutton();
	Thread.sleep(2000);
	medb.clickonyesdeletebutton();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
