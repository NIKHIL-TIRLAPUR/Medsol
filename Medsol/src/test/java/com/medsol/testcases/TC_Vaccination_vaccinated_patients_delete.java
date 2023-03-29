package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Vaccinations_vaccinated_patientspage;
import com.medsol.utilities.Readconfig;

public class TC_Vaccination_vaccinated_patients_delete extends Baseclass {

	
	Readconfig config= new Readconfig();
	public String editPatientSerialNo=config.geteditPatientSerialNo();
	
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
	vaccpatient.setnameinsearchboxfordeleteoredit(editPatientSerialNo);
	vaccpatient.clickondeletebutton();
	Thread.sleep(2000);
	vaccpatient.clickonyesdeletebutton();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
