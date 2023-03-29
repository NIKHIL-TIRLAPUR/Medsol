package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Inventories_item_stockspage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Inventories_item_stocks_modified extends Baseclass 
{


	Readconfig config= new Readconfig();
	public String itemCategoryName=config.getitemCategoryName();
	public String editstockSupplierName=config.geteditstockSupplierName();
	public String editstockStoreName=config.geteditstockStoreName();
	public String editstockQuantity=config.geteditstockQuantity();
	public String editdescription=config.geteditdescription();
	public String editstockPurchasePrice=config.geteditstockPurchasePrice();
	
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
	itemstock.clickoneditbutton();
	Thread.sleep(2000);
	itemstock.setedititemCategory(itemCategoryName);
	Thread.sleep(2000);
	itemstock.setedititemname(itemCategoryName);
	itemstock.seteditStockSupplierName(editstockSupplierName);
	itemstock.seteditStockStoreName(editstockStoreName);
	itemstock.seteditStockQuantity(editstockQuantity);
	itemstock.seteditStockPurchasePrice(editstockPurchasePrice);
	itemstock.seteditdescription(editdescription);
	itemstock.clickoneditStockSave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
