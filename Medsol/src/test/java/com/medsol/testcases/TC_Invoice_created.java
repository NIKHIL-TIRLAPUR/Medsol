package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Invoicepage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Invoice_created extends Baseclass{
	
	
	Readconfig config= new Readconfig();
	public String selectpatient=config.getselectpatient();
	public String discount=config.getdiscount();
	public String statusofbill=config.getstatusofbill();
	public String selectaccount=config.getselectaccount();
	public String quantity=config.getquantity();
	public String price=config.getprice();
	
	@Test
	public void invoicetest() throws InterruptedException {
		Thread.sleep(3000);
		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Invoicepage in = new Invoicepage(driver);
	in.clickonbillings();
	Thread.sleep(2000);
	in.clickoninvoice();
	Thread.sleep(2000);
	in.clickonnewinvoice();
	Thread.sleep(2000);
	in.clickonselectpatient();
	Thread.sleep(2000);
	in.clickontxtselectpatient(selectpatient);
	in.setdiscount(discount);
	in.clickonselectstatusofbill();
	Thread.sleep(2000);
	
	in.clickontxtselectstatusofbill(statusofbill);
	
	in.clickonselectaccount();
	Thread.sleep(2000);
	in.clickontxtselectaccount(selectaccount);
	in.setquantity(quantity);
	in.setprice(price);
	Thread.sleep(2000);
	in.clickonsave();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
