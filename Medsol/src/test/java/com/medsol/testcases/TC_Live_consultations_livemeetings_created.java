package com.medsol.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medsol.pageobject.Live_consultations_livemeetingspage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Live_consultations_livemeetings_created  extends Baseclass{

	
	Readconfig config= new Readconfig();
	public String liveConsultationTitle=config.getliveConsultationTitle();
	public String liveConsultationDurationMinutes=config.getliveConsultationDurationMinutes();
	public String selectpatient=config.getselectpatient();
	public String description=config.getdescription();
	public String stafflist=config.getstafflist();
	public String month=config.getmonth();
	public String date=config.getdate();
	
	@Test
	public void Live_consultations_livemeetingspagetest() throws InterruptedException, AWTException {
		
	
		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);	
	
	
	Live_consultations_livemeetingspage livem= new Live_consultations_livemeetingspage(driver);
	livem.clickonLiveConsultations();
	Thread.sleep(2000);
	livem.clickonLiveMeetings();
	Thread.sleep(2000);
	livem.clickonNewLiveMeeting();
	Thread.sleep(2000);
	livem.setconsultation_title(liveConsultationTitle);
	livem.setconsultation_duration_minutes(liveConsultationDurationMinutes);
	livem.setdateandtimeofmeeting(month, date);
	//livem.setstafflist(stafflist);
	//livem.clickonmeetingHostEnable();
	//livem.clickonmeetingParticipantEnable();
	livem.setdescription(description);
	livem.clickonmeetingSave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
