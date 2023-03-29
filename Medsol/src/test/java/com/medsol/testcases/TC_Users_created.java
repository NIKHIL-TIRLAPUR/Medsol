package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Userspage;
import com.medsol.utilities.Readconfig;

public class TC_Users_created extends Baseclass  {
	Readconfig config= new Readconfig();
	public String firstname=config.getfirstname();
	public String year=config.getyear();
	public String month=config.getmonth();
	public String date=config.getdate();
	public String lastname=config.getlastname();
	public String facebookurl=config.getfacebookurl();
	public String twitterurl=config.gettwitterurl();
	public String instagramurl=config.getinstagramurl();
	public String linkedinurl=config.getlinkedinurl();
	public String password1=config.getpassword1();
	public String role=config.getrole();
	public String address2=config.getaddress2();
	
	
	@Test
	public void Userspagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	
	Userspage user= new Userspage(driver);
	
	user.clickonUsers();
	Thread.sleep(2000);
	user.clickonNewUser();
	Thread.sleep(2000);
	user.setfirst_name(firstname);
	user.setlast_name(lastname);
	String email=randomstring()+"@gmail.com";
	user.setuserEmail(email);
	user.setselectrole(role);
	String number=randomnum();
	String phonenumber="99005"+ number;
	user.setuserPhoneNumber(phonenumber);
	user.setuserBirthDate(year, month, date);
	user.setpassword(password1);
	user.scrolldown();
	Thread.sleep(2000);
	user.setpassword_confirmation(password1);
	Thread.sleep(2000);
	user.setuserFacebookUrl(facebookurl);
	Thread.sleep(2000);
	user.setuserTwitterUrl(twitterurl);
	Thread.sleep(2000);
	user.setuserInstagramUrl(instagramurl);
	Thread.sleep(2000);
	user.setuserLinkedInUrl(linkedinurl);
	Thread.sleep(2000);
	user.clickonSave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
