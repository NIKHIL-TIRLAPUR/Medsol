package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Documentpage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Document_delete extends Baseclass  {
	
	Readconfig config= new Readconfig();
	
	 @Test
		public void Documenttest() throws InterruptedException  {

			Thread.sleep(3000);
			Loginpage lp=new Loginpage(driver);
		lp.clickonlogin();
		lp.setemail(username);
		lp.setpassword(password);
		lp.clickonloginsubmit();
		Thread.sleep(3000);
	
		Documentpage doc= new Documentpage(driver);
		doc.clickondocument();
		Thread.sleep(2000);
		//doc.clickoneditbutton();
		//Thread.sleep(2000);
        doc.clickondeletebutton();
        doc.clickonyesdeletebutton();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	 }
}
