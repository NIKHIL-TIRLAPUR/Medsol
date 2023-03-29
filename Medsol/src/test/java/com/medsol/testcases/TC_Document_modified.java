package com.medsol.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medsol.pageobject.Documentpage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Document_modified extends Baseclass {
	Readconfig config= new Readconfig();
	public String editselectdocument=config.geteditselectdocument();
	public String edittitle=config.getedittitle();
	public String epath=config.getepath();
	public String editnote=config.geteditnote();
	
	 @Test
		public void Documenttest() throws InterruptedException, AWTException  {

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
		doc.clickoneditbutton();
		Thread.sleep(2000);
		doc.setedittitle(edittitle);
		Thread.sleep(3000);
		doc.clickoneditdocumenttype();
		doc.setdocumenttype(editselectdocument);
		Thread.sleep(3000);
		doc.clickontxteditattachment();
		Thread.sleep(3000);
		doc.seteditattachment(epath);
		Thread.sleep(3000);
		doc.seteditnotes(editnote);
		doc.clickoneditdocumentsave();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	 }
}
