package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.Services_ambulancespage;
import com.medsol.utilities.Readconfig;

public class TC_Services_ambulances_modified extends Baseclass{

	
	Readconfig config= new Readconfig();

	public String driver_name=config.getdriver_name();
	public String editvehicle_number=config.geteditvehicle_number();
	public String editvehicle_model=config.geteditvehicle_model();
	public String edityear_made=config.getedityear_made();	
	public String editdriver_name=config.geteditdriver_name();
	public String editdriver_license=config.geteditdriver_license();
	public String editVehicleType=config.geteditVehicleType();
	public String editnote=config.geteditnote();
	
	
	
	
	
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
	sambulance.setnameinsearchboxfordeleteoredit(driver_name);
	sambulance.clickoneditbutton();
	Thread.sleep(2000);
	sambulance.seteditvehicle_number(editvehicle_number);
	sambulance.seteditvehicle_model(editvehicle_model);
	sambulance.setedityear_made(edityear_made);
	sambulance.seteditdriver_name(editdriver_name);
	String number=randomnum();
	String phonenumber="99005"+ number;
	sambulance.seteditAmbulancePhoneNumber(phonenumber);
	sambulance.seteditdriver_license(editdriver_license);
	sambulance.seteditnote(editnote);
	sambulance.seteditVehicleType(editVehicleType);
	sambulance.clickonis_available();
	sambulance.clickoneditAmbulanceBtnSave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
