package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Patients_casespage;
import com.medsol.utilities.Readconfig;

public class TC_Patients_cases_created extends Baseclass{

	
	
	Readconfig config= new Readconfig();
	public String selectpatient=config.getselectpatient();
	public String year1=config.getyear1();
	public String month1=config.getmonth1();
	public String date1=config.getdate1();
	public String description=config.getdescription();
	public String standardcharge=config.getstandardcharge();
	
	
	@Test
	public void Patients_casespagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Patients_casespage cases = new Patients_casespage(driver);	
	
	cases.clickonPatients();
	Thread.sleep(2000);
	cases.clickonCases();
	Thread.sleep(2000);
	cases.clickonNewCase();
	Thread.sleep(2000);
	cases.setselectPatient(selectpatient);
	//cases.setselectdoctor(date1);
	cases.setcaseDate(year1, month1, date1);
	String number=randomnum();
	String phonenumber="99005"+ number;
	cases.setcasePhoneNumber(phonenumber);
	cases.clickonstatus();
	cases.setcasefee(standardcharge);
	cases.setcasedescription(description);
	cases.clickonsave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
