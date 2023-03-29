package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Inventories_itempage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Inventories_item_delete  extends Baseclass {
	
	
	Readconfig config= new Readconfig();
	public String itemCategoryNames=config.getitemCategoryNames();
	public String edititemName=config.getedititemName();
	public String edititemUnit=config.getedititemUnit();
	public String editdescription=config.geteditdescription();
	
	
	
	@Test
	public void Inventories_itempagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Inventories_itempage item = new Inventories_itempage(driver);
	item.clickonInventories();
	Thread.sleep(2000);
	item.clickonItems();
	Thread.sleep(2000);
	item.setItemNameinsearchbox(itemCategoryNames);
	item.clickondeletebutton();
	item.clickonyesdeletebutton();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
