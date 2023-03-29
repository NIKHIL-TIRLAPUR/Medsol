package com.medsol.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Settings_Modulessettingpage;
import com.medsol.utilities.Readconfig;

public class TC_Settings_Modulessetting_created extends Baseclass{

	
	Readconfig config= new Readconfig();
	public String modulename=config.getmodulename();
	
	@Test
	public void Settings_Modulessettingpagetest() throws InterruptedException, AWTException {
		
	
		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);	
	
	
	
	Settings_Modulessettingpage module= new Settings_Modulessettingpage(driver);
	module.clickonSettings();
	Thread.sleep(2000);
	module.clickonModulesSetting();
	Thread.sleep(2000);
	module.setnamesearch(modulename);
	module.clickonstatus();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
