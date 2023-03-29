package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Services_ambulancespage;
import com.medsol.utilities.Readconfig;

public class TC_Services_ambulances_created extends Baseclass{

	Readconfig config= new Readconfig();

	public String vehicle_number=config.getvehicle_number();
	public String vehicle_model=config.getvehicle_model();
	public String year_made=config.getyear_made();	
	public String driver_name=config.getdriver_name();
	public String driver_license=config.getdriver_license();
	public String VehicleType=config.getVehicleType();
	public String note=config.getnote();
	
	
	
	
	
	@Test
	public void Services_ambulancespagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	
	Services_ambulancespage sambulance= new Services_ambulancespage(driver);
	
	sambulance.clickonServices();
	Thread.sleep(2000);
	sambulance.clickonAmbulances();
	Thread.sleep(2000);
	sambulance.clickondropdownMenuButton();
	Thread.sleep(2000);
	sambulance.clickonNewAmbulance();
	Thread.sleep(2000);
	sambulance.setvehicle_number(vehicle_number);
	sambulance.setvehicle_model(vehicle_model);
	sambulance.setyear_made(year_made);
	sambulance.setdriver_name(driver_name);
	String number=randomnum();
	String phonenumber="99005"+ number;
	sambulance.setambulancePhoneNumber(phonenumber);
	sambulance.setdriver_license(driver_license);
	sambulance.setnote(note);
	sambulance.setVehicleType(VehicleType);
	sambulance.clickonis_available();
	sambulance.clickonambulanceBtnSave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
