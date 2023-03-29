package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Vaccinations_vaccinated_patientspage;
import com.medsol.utilities.Readconfig;

public class TC_Vaccination_vaccinated_patients_modified extends Baseclass {

	
	Readconfig config= new Readconfig();

	public String editselectpatient1=config.geteditselectpatient1();
	public String selectvaccination=config.getselectvaccination();
	public String editPatientSerialNo=config.geteditPatientSerialNo();
	public String editdoseNo=config.geteditdoseNo();
	public String editselectvaccination=config.geteditselectvaccination();
	public String editnote=config.geteditnote();
	
	
	@Test
	public void Vaccinations_vaccinated_patientspagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Vaccinations_vaccinated_patientspage vaccpatient= new Vaccinations_vaccinated_patientspage(driver);
	vaccpatient.clickonVaccinations();
	Thread.sleep(2000);
	vaccpatient.setnameinsearchboxfordeleteoredit(selectvaccination);
	vaccpatient.clickoneditbutton();
	Thread.sleep(2000);
	vaccpatient.seteditselectpatient(editselectpatient1);
	vaccpatient.seteditvaccine(editselectvaccination);
	vaccpatient.seteditPatientSerialNo(editPatientSerialNo);
	vaccpatient.seteditdoseNo(editdoseNo);
	vaccpatient.seteditnotes(editnote);
	vaccpatient.clickoneditPatientBtnSave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
