package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Diagnosis_Diagnosiscategorypage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Diagnosis_Diagnosiscategory_delete extends Baseclass {
	
	
	Readconfig config= new Readconfig();
	public String diagnosiscategorytextsearchbox=config.getdiagnosiscategorytextsearchbox();
	
	@Test
	public void Diagnosis_Diagnosiscategorypagetest() throws InterruptedException  {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(2000);	
	
	Diagnosis_Diagnosiscategorypage dcategory=new Diagnosis_Diagnosiscategorypage(driver);
	dcategory.clickonDiagnosisbutton();
	Thread.sleep(2000);	
	dcategory.setnameinthesearchboxfordelete(diagnosiscategorytextsearchbox);
	dcategory.clickondeletebutton();
	dcategory.clickonyesdeletebutton();
	
	
	
	
	
	}

}
