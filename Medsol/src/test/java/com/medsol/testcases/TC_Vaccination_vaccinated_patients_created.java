package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Vaccinations_vaccinated_patientspage;
import com.medsol.utilities.Readconfig;

public class TC_Vaccination_vaccinated_patients_created extends Baseclass {

	
	Readconfig config= new Readconfig();

	public String selectvaccination=config.getselectvaccination();
	public String PatientSerialNo=config.getPatientSerialNo();
	public String doseNo=config.getdoseNo();
	public String selectpatient1=config.getselectpatient1();
	public String note=config.getnote();
	
	
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
	vaccpatient.clickondropdownMenuButton();
	Thread.sleep(2000);
	vaccpatient.clickonNewVaccinatedPatient();
	Thread.sleep(2000);
	vaccpatient.setselectpatient(selectpatient1);
	vaccpatient.setvaccine(selectvaccination);
	vaccpatient.setPatientSerialNo(PatientSerialNo);
	vaccpatient.setdoseNo(doseNo);
	vaccpatient.setnotes(note);
	vaccpatient.clickonPatientBtnSave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
