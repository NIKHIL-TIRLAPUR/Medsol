package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Vaccinations_vaccinationspage;
import com.medsol.utilities.Readconfig;

public class TC_Vaccinations_vaccinations_created extends Baseclass{

	Readconfig config= new Readconfig();

	public String vaccinationName=config.getvaccinationName();
	public String vaccinationManufacturedBy=config.getvaccinationManufacturedBy();
	public String vaccinationBrand=config.getvaccinationBrand();
	
	
	@Test
	public void Vaccinations_vaccinationspagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Vaccinations_vaccinationspage vacc= new Vaccinations_vaccinationspage(driver);
	
	vacc.clickonVaccinations();
	Thread.sleep(2000);
	vacc.clickonvaccinations();
	Thread.sleep(2000);
	vacc.clickondropdownMenuButton();
	Thread.sleep(2000);
	vacc.clickonNewVaccination();
	Thread.sleep(2000);
	vacc.setvaccinationName(vaccinationName);
	vacc.setvaccinationManufacturedBy(vaccinationManufacturedBy);
	vacc.setvaccinationBrand(vaccinationBrand);
	vacc.clickonvaccinationBtnSave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
