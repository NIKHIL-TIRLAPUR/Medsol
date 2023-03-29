package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Medicine_medicinepage;
import com.medsol.utilities.Readconfig;

public class TC_Medicine_medicine_created  extends Baseclass {

	Readconfig config= new Readconfig();
	public String medicine=config.getmedicine();
	public String medicineCategoryId=config.getmedicineCategoryId();
	public String brand=config.getbrand();
	public String sideeffects=config.getsideeffects();
	public String buyingprice=config.getbuyingprice();
	public String sellingprice=config.getsellingprice();
	public String salt_composition=config.getsalt_composition();
	public String description=config.getdescription();
	public String brandname=config.getbrandname();
	
	@Test
	public void Medicine_medicinepagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Medicine_medicinepage med= new Medicine_medicinepage(driver);
	med.clickonMedicines();
	Thread.sleep(2000);
	med.clickonNewMedicine();
	Thread.sleep(2000);
	med.setmedicineNameId(medicine);
	med.setmedicineCategoryId(medicineCategoryId);
	med.setmedicineBrandId(brand);
	med.setsalt_composition(salt_composition);
	med.setbuying_price(buyingprice);
	med.setselling_price(sellingprice);
	med.setside_effects(sideeffects);
	med.setdescription(description);
	med.clickonmedicineSave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
