package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Adminpage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Admin_created extends Baseclass
{
Readconfig config= new Readconfig();
	
	public String firstname=config.getfirstname();
	public String lastname=config.getlastname()	;
	public String password1=config.getpassword();
		
	@Test
	public void Admintest() throws InterruptedException
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
		ad.clickonnewadmin();
		Thread.sleep(2000);
		ad.setfirstname(firstname);
		ad.setlastname(lastname);
		String email=randomstring()+"@gmail.com";
		ad.setemailid(email);
		/*ad.setdateofbirth();
		Thread.sleep(3000);	
		ad.setmonth("March","1995","15");*/
		
		String number=randomnum();
		String phonenumber="99005"+ number;
		ad.setphone(phonenumber);
		ad.setpassword(password1);
		ad.setconpassword(password1);
		ad.clickonfemaleradio();
		ad.clickonsave();
		Thread.sleep(3000);	
		
		
		
		
	}
	
	
	
	
	

}
