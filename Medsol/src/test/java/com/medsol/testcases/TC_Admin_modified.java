package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Adminpage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;




public class TC_Admin_modified extends Baseclass 
{
Readconfig config= new Readconfig();
	
	public String changefirstname=config.getnameinsearchbox();
	public String changelastname=config.getnumeberforpagedropdown()	;
	@Test
	public void Adminmodified() throws InterruptedException 
	{	
	
	Thread.sleep(3000);
	Loginpage lp=new Loginpage(driver);
lp.clickonlogin();
lp.setemail(username);
lp.setpassword(password);
lp.clickonloginsubmit();
Thread.sleep(3000);	
Adminpage ad= new Adminpage(driver)	;
ad.clickonadmin();
Thread.sleep(2000);	
ad.clickonstatusbutton();
ad.clickoneditbutton();
ad.clearfirstnameandsetnewname(changefirstname);
ad.clearlastnameandsetnewname(changelastname);
ad.clickonmaleradio();
ad.clickonsave();
	







































	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
