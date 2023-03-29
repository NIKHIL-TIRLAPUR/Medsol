package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Patients_patientadmissionspage;
import com.medsol.utilities.Readconfig;

public class TC_Patients_patientadmissions_created extends Baseclass {

	
	Readconfig config= new Readconfig();
	public String selectpackage=config.getselectpackage();
	public String year1=config.getyear1();
	public String month1=config.getmonth1();
	public String date1=config.getdate1();
	public String selectinsurance=config.getselectinsurance();
	public String selectbed=config.getselectbed();
	public String policyno=config.getpolicyno();
	public String agentname=config.getagentname();
	public String guardianname=config.getguardianname();
	public String guardianrelation=config.getguardianrelation();
	public String guardianaddress=config.getguardianaddress();
	public String selectpatient=config.getselectpatient();
	
	
	@Test
	public void Patients_patientadmissionspagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	
	Patients_patientadmissionspage patientad= new Patients_patientadmissionspage(driver);
	
	patientad.clickonPatients();
	Thread.sleep(2000);
	patientad.clickonPatientAdmissions();
	Thread.sleep(2000);
	patientad.clickondropdownMenuButton();
	Thread.sleep(2000);
	patientad.clickonNewPatientAdmission();
	Thread.sleep(2000);
	patientad.setselectpatient(selectpatient);
	patientad.setadmissionDate(year1, month1, date1);
	patientad.setselectpackage(selectpackage);
	patientad.setselectinsurance(selectinsurance);
	patientad.setselectbed(selectbed);
	patientad.setpolicy_no(policyno);
	patientad.setagent_name(agentname);
	patientad.setguardian_name(guardianname);
	patientad.setguardian_relation(guardianrelation);
	patientad.scrolldown();
	Thread.sleep(2000);
	String number=randomnum();
	String phonenumber="99005"+ number;
	patientad.setadmissionPhoneNumber(phonenumber);
	patientad.setguardian_address(guardianaddress);
	patientad.clickonstatus();
	patientad.clickonSave();
	Thread.sleep(2000);
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
