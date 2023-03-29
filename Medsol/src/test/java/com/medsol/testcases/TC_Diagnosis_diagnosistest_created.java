package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Diagnosis_diagnosistestpage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;



public class TC_Diagnosis_diagnosistest_created extends Baseclass {

	

	Readconfig config= new Readconfig();
	public String selectpatient=config.getselectpatient();
	public String diagnosiscategory=config.getdiagnosiscategory();

	public String donorage=config.getdonorage();
	public String weight=config.getweight();
	public String height=config.getheight();
	public String averageglucose=config.getaverageglucose();
	public String fastingbloodsugar=config.getfastingbloodsugar();
	public String urinesugar=config.geturinesugar();
	public String bloodpressure=config.getbloodpressure();
	public String diabetes=config.getdiabetes();
	public String cholesterol=config.getcholesterol();
	public String propertyname=config.getpropertyname();
	public String propertyvalue=config.getpropertyvalue();


	
	@Test
	public void logintest() throws InterruptedException {
		
		
		
		Thread.sleep(3000);
		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	Diagnosis_diagnosistestpage diagnosistest= new Diagnosis_diagnosistestpage(driver);
	diagnosistest.clickonDiagnosisbutton();
	Thread.sleep(3000);
	diagnosistest.clickonDiagnosisTests();
	Thread.sleep(3000);
	diagnosistest.clickonnewpatientdiagnosisTest();
	Thread.sleep(3000);
	diagnosistest.setpatientinselectpatienttxt(selectpatient);
	//diagnosistest.setdoctorinselectdoctortxt("doctor");
	diagnosistest.setselectdiagnosiscategorytxt("diagnosiscategory");
	diagnosistest.setpatientsage(donorage);
	diagnosistest.setpatientsweight(weight);
	diagnosistest.setpatientsheight(height);
	diagnosistest.setpatientsaverageglucose(averageglucose);
	diagnosistest.setpatientsfastingbloodsugar(fastingbloodsugar);
	diagnosistest.setpatientsurinesugar(urinesugar);
	diagnosistest.setpatientsbloodpressure(bloodpressure);
	diagnosistest.setpatientsdiabetes(diabetes);
	diagnosistest.setpatientscholesterol(cholesterol);
	diagnosistest.clickontxtaddDiagnosisTestItembutton();
	diagnosistest.setnewDiagnosisTestpropertyname(propertyname);
	diagnosistest.setnewDiagnosisTestpropertyvalue(propertyvalue);
	diagnosistest.clickonDiagnosisTestsave();
	Thread.sleep(3000);
	}
}
