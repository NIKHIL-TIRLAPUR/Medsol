package com.medsol.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medsol.pageobject.Live_consultationspage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Live_consultations_created extends Baseclass {

	
	Readconfig config= new Readconfig();
	public String liveConsultationTitle=config.getliveConsultationTitle();
	public String liveConsultationDurationMinutes=config.getliveConsultationDurationMinutes();
	public String selectpatient=config.getselectpatient();
	public String description=config.getdescription();
	public String selecttype=config.getselecttype();
	
	@Test
	public void Live_consultationspagetest() throws InterruptedException, AWTException {
		
	
		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);	
	
	Live_consultationspage livec=new Live_consultationspage(driver);
	
	livec.clickonLiveConsultations();
	Thread.sleep(2000);
	livec.clickonNewLiveConsultation();
	Thread.sleep(2000);
	livec.setliveConsultationTitle(liveConsultationTitle);
	livec.setliveConsultationDurationMinutes(liveConsultationDurationMinutes);
	livec.setselectpatientname(selectpatient);
	livec.setselecttype(selecttype);
	livec.clickonmeetingHostEnable();
	livec.clickonmeetingParticipantEnable();
	livec.setconsultationDescription(description);
	livec.clickonconsultationSave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
