package com.medsol.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medsol.pageobject.Documentpage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Document_created extends Baseclass {
	Readconfig config= new Readconfig();
	
	public String changefirstname=config.getchangefirstname();
	public String selectpatient=config.getselectpatient();
	public String selectdocument=config.getselectdocument();
	public String note=config.getnote();
	public String path=config.getpath();
	 @Test
		public void Documenttest() throws InterruptedException, AWTException {

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
		doc.clickonnewdocument();
		Thread.sleep(2000);
		doc.settitle(changefirstname);
		doc.clickondocumenttype();
		Thread.sleep(2000);
		doc.setdocumenttype(selectdocument);
		doc.clickonselectpatient();
		Thread.sleep(2000);
		doc.setpatient(selectpatient);
		doc.clickontxtattachment();
		Thread.sleep(3000);
		doc.setattachment(path);
		doc.setnote(note);
	    doc.clickondocumentsave();
	    Thread.sleep(2000);
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	 }
}
