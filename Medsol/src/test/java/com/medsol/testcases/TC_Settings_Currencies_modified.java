package com.medsol.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Settings_Currenciespage;
import com.medsol.utilities.Readconfig;

public class TC_Settings_Currencies_modified extends Baseclass {

	
	Readconfig config= new Readconfig();
	public String currencyName=config.getcurrencyName();
	public String editcurrencyCode=config.geteditcurrencyCode();
	public String editcurrencyIcon=config.geteditcurrencyIcon();
	public String editcurrencyName=config.geteditcurrencyName();
	
	
	
	@Test
	public void Settings_Currenciespagetest() throws InterruptedException, AWTException {
		
	
		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);	
	
	Settings_Currenciespage currencies= new Settings_Currenciespage(driver);
	currencies.clickonSettings();
	Thread.sleep(2000);
	currencies.clickonCurrencies();
	Thread.sleep(2000);
	currencies.clickonsearchboxfordeleteoredit(currencyName);
	
	currencies.clickoneditbutton();
	Thread.sleep(2000);
	currencies.seteditCurrencyName(editcurrencyName);
	currencies.seteditCurrencyIcon(editcurrencyIcon);
	currencies.seteditCurrencyCode(editcurrencyCode);
	currencies.clickoneditcurrencySave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
