package com.medsol.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medsol.pageobject.Frontoffice_postalreceivepage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Frontoffice_postalreceive_delete extends Baseclass {
	
	Readconfig config= new Readconfig();
	public String referencenoinsearchboxfordelete=config.getreferencenoinsearchboxfordelete();

	
	@Test
	public void Frontoffice_postalreceivetest() throws InterruptedException, AWTException  {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Frontoffice_postalreceivepage preceive = new Frontoffice_postalreceivepage(driver);
	preceive.clickonfrontoffice();
	Thread.sleep(2000);
	preceive.clickonPostalReceive();
	Thread.sleep(2000);
	
	preceive.setreferencenoinsearchboxfordelete(referencenoinsearchboxfordelete);
	Thread.sleep(2000);
	
	preceive.clickondeletebutton();
	preceive.clickonyesdeletebutton();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
