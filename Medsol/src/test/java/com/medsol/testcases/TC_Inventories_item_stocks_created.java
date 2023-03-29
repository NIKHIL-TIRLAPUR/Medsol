package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Inventories_item_stockspage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Inventories_item_stocks_created extends Baseclass {
	
	Readconfig config= new Readconfig();
	public String itemCategoryNames=config.getitemCategoryNames();
	public String stockSupplierName=config.getstockSupplierName();
	public String stockStoreName=config.getstockStoreName();
	public String stockQuantity=config.getstockQuantity();
	public String description=config.getdescription();
	public String stockPurchasePrice=config.getstockPurchasePrice();
	
	@Test
	public void Inventories_item_stockspagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Inventories_item_stockspage itemstock = new Inventories_item_stockspage(driver);
	itemstock.clickonInventories();
	Thread.sleep(2000);
	itemstock.clickonItemStocks();
	Thread.sleep(2000);
	itemstock.clickonNewItemStock();
	Thread.sleep(2000);
	itemstock.setitemCategory(itemCategoryNames);
	itemstock.setstockSupplierName(stockSupplierName);
	itemstock.setstockStoreName(stockStoreName);
	itemstock.setstockQuantity(stockQuantity);
	itemstock.setstockPurchasePrice(stockPurchasePrice);
	itemstock.setdescription(description);
	itemstock.clickonstockSave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
