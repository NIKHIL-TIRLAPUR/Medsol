package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Userspage;
import com.medsol.utilities.Readconfig;

public class TC_Users_modified extends Baseclass{

	
	Readconfig config= new Readconfig();
	public String fname=config.getfname();
	public String firstname=config.getfirstname();
	public String editfirstname=config.geteditfirstname();
	public String year1=config.getyear1();
	public String month1=config.getmonth1();
	public String date1=config.getdate1();
	public String editlastname=config.geteditlastname();
	public String editfacebookurl=config.geteditfacebookurl();
	public String edittwitterurl=config.getedittwitterurl();
	public String editinstagramurl=config.geteditinstagramurl();
	public String editlinkedinurl=config.geteditlinkedinurl();
	public String password=config.getpassword();
	public String role=config.getrole();
	public String editrole=config.geteditrole();
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
	user.setnameinsearchboxfordeleteoredit(firstname);
	Thread.sleep(2000);
	user.clickoneditbutton();
	Thread.sleep(2000);
	user.seteditfirst_name(editfirstname);
	user.seteditlast_name(editlastname);
	String email=randomstring()+"@gmail.com";
	user.setedituserEmail(email);
	user.seteditselectrole(editrole);
	//String number=randomnum();
	//String phonenumber="99005"+ number;
	//user.setedituserPhoneNumber(phonenumber);
	user.setedituserBirthDate(year1, month1, date1);
	user.clickonusesFemale();
	user.clickonstatus();
	//user.seteditpassword(password);
	user.scrolldown();
	Thread.sleep(2000);
	//user.seteditpassword_confirmation(password);
	user.setedituserFacebookUrl(editfacebookurl);
	user.setedituserInstagramUrl(editinstagramurl);
	user.setedituserTwitterUrl(edittwitterurl);
	user.setedituserLinkedInUrl(editlinkedinurl);
	//user.clickonSave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
