package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Inventories_issued_itemspage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Inventories_issued_items_modified extends Baseclass {

	
	Readconfig config= new Readconfig();
	public String itemnameinsearchbox=config.getitemnameinsearchbox();
	public String year1=config.getyear1();
	public String month1=config.getmonth1();
	public String date1=config.getdate1();
	public String year2=config.getyear2();
	public String month2=config.getmonth2();
	public String date2=config.getdate2();
	public String usertype=config.getusertype();
	public String issueby=config.getissueby();
	public String quantity=config.getquantity();
	public String description=config.getdescription();
	
	
	
	
	
	@Test
	public void Inventories_issued_itemspagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Inventories_issued_itemspage issueditem= new Inventories_issued_itemspage(driver);
	issueditem.clickonInventories();
	Thread.sleep(2000);
	issueditem.clickonIssuedItems();
	Thread.sleep(2000);
	issueditem.setnameinsearchbox(itemnameinsearchbox);
	issueditem.clickonReturnItem();
	Thread.sleep(2000);
	issueditem.clickonyesReturnItem();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
