package com.medsol.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medsol.pageobject.Frontoffice_postaldispatchpage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Frontoffice_postaldispatch_delete extends Baseclass{
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
	
	Frontoffice_postaldispatchpage pdispatch= new Frontoffice_postaldispatchpage(driver);
	pdispatch.clickonfrontoffice();
	Thread.sleep(2000);
	pdispatch.clickonPostalDispatch();
	Thread.sleep(2000);
	pdispatch.setreferencenoinsearchboxfordelete(referencenoinsearchboxfordelete);
	Thread.sleep(2000);
	
	pdispatch.clickondeletebutton();
	pdispatch.clickonyesdeletebutton();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	}
}
