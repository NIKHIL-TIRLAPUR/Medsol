package com.medsol.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medsol.pageobject.Frontcms_testimonialspage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Frontcms_testimonials_created  extends Baseclass 
{
	Readconfig config= new Readconfig();
	public String totitle=config.gettotitle();
	public String description=config.getdescription();

	@Test
	public void Frontcms_testimonialspagetest() throws InterruptedException, AWTException  {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Frontcms_testimonialspage testimonals= new Frontcms_testimonialspage(driver);
	testimonals.clickonfrontcms();
	Thread.sleep(2000);
	testimonals.clickonTestimonials();
	Thread.sleep(2000);
	testimonals.clickonNewTestimonial();
	Thread.sleep(2000);
	testimonals.setnameintestimonials(totitle);
	testimonals.setdescriptionoftestimonials(description);
	testimonals.setprofileattachment();
	Thread.sleep(2000);
	testimonals.clickontestimonialSave();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
