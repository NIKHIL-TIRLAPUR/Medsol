package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Inventorie_Itemscategoriespage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Inventorie_Itemscategories_modified extends Baseclass {

	Readconfig config= new Readconfig();
	public String editItemCategoryName=config.geteditItemCategoryName();
	
	
	@Test
	public void Inventorie_Itemscategoriespagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Inventorie_Itemscategoriespage item = new Inventorie_Itemscategoriespage(driver);
	item.clickonInventories();
	Thread.sleep(2000);
	item.clickoneditbutton();
	Thread.sleep(2000);
	item.seteditItemCategoryName(editItemCategoryName);
	item.clickoneditItemCategorySave();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
