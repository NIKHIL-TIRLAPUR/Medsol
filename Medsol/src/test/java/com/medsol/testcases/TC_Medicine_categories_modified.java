package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Medicine_categoriespage;
import com.medsol.utilities.Readconfig;

public class TC_Medicine_categories_modified extends Baseclass  {
	
	
	Readconfig config= new Readconfig();
	public String editmedicineCategoryName=config.geteditmedicineCategoryName();
	
	
	
	
	
	@Test
	public void Medicine_categoriespagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Medicine_categoriespage med= new Medicine_categoriespage(driver);
	med.clickonMedicines();
	Thread.sleep(2000);
	med.clickonMedicineCategories();
	Thread.sleep(2000);
	med.clickoneditbutton();
	med.seteditmedicineCategoryName(editmedicineCategoryName);
	med.clickoneditCategoryIsActive();
	med.clickoneditCategorySave();
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
