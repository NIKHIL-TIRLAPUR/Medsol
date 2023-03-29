package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Document_Documenttypepage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Document_Documenttype_delete extends Baseclass
{
Readconfig config= new Readconfig();
	
	public String documenttype=config.getdocumenttype();
	public String editdocumenttype=config.geteditdocumenttype();
	
	 @Test
		public void Document_Documenttypetest() throws InterruptedException  {

			Thread.sleep(3000);
			Loginpage lp=new Loginpage(driver);
		lp.clickonlogin();
		lp.setemail(username);
		lp.setpassword(password);
		lp.clickonloginsubmit();
		Thread.sleep(3000);
	
		Document_Documenttypepage docty= new Document_Documenttypepage(driver);
		docty.clickondocument();
		Thread.sleep(2000);
	    docty.clickondocumenttypes();
	    Thread.sleep(2000);
	    docty.clickondeletebutton();
	    Thread.sleep(2000);
	    docty.clickonyesdeletebutton();
	    Thread.sleep(2000);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	 }
}
