package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Inventories_itempage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Inventories_item_created extends Baseclass
{

	
	Readconfig config= new Readconfig();
	public String itemCategoryName=config.getitemCategoryName();
	public String itemName=config.getitemName();
	public String itemUnit=config.getitemUnit();
	public String description=config.getdescription();
	
	
	
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
	item.clickonNewItem();
	Thread.sleep(2000);
	item.setitemName(itemName);
	item.setitemCategory(itemCategoryName);
	item.setitemUnit(itemUnit);
	item.setdescription(description);
	item.clickonitemSave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
