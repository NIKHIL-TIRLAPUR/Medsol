package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.FrontCms_cms_homepage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_FrontCms_cms_home_created extends Baseclass {

	Readconfig config= new Readconfig();

	public String homePageExperience=config.gethomePageExperience();
	public String homeTitleId=config.gethomeTitleId();
	public String homeShortDescription=config.gethomeShortDescription();
	public String homePageBoxTitle=config.gethomePageBoxTitle();
	public String homePageBoxDescription=config.gethomePageBoxDescription();
	public String homeDoctorTextId=config.gethomeDoctorTextId();
	public String homeDoctorTitleId=config.gethomeDoctorTitleId();
	public String homeDoctorDescription=config.gethomeDoctorDescription();
	public String homePageCerBoxTl=config.gethomePageCerBoxTl();
	public String homePageCerBoxDes=config.gethomePageCerBoxDes();
	public String homePageStep1Tl=config.gethomePageStep1Tl();
	public String homePageStep1Des=config.gethomePageStep1Des();
	public String homePageStep2Tl=config.gethomePageStep2Tl();
	public String homePageStep2Des=config.gethomePageStep2Des();
	public String homePageStep3Tl=config.gethomePageStep3Tl();
	public String homePageStep3Des=config.gethomePageStep3Des();
	public String homePageStep4Tl=config.gethomePageStep4Tl();
	public String homePageStep4Des=config.gethomePageStep4Des();
	
	
	
	@Test
	public void FrontCms_cms_homepagetest() throws InterruptedException {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	
	FrontCms_cms_homepage home= new FrontCms_cms_homepage(driver);
	home.clickonFrontCMS();
	Thread.sleep(2000);
	//home.clickonhomepageimage();
	//home.clickonhomepagecertifieddoctorimage();
	home.sethomePageExperience(homePageExperience);
	home.sethomeTitleId(homeTitleId);
	home.sethomeShortDescription(homeShortDescription);
	home.scrolldown1();
	Thread.sleep(2000);
	home.sethomePageBoxTitle(homePageBoxTitle);
	home.sethomePageBoxDescription(homePageBoxDescription);
	home.sethomeDoctorTextId(homeDoctorTextId);
	home.scrolldown1();
	Thread.sleep(2000);
	home.sethomeDoctorTitleId(homeDoctorTitleId);
	home.sethomeDoctorDescription(homeDoctorDescription);
	home.sethomePageCerBoxTl(homePageCerBoxTl);
	home.scrolldown1();
	Thread.sleep(2000);
	home.sethomePageCerBoxDes(homePageCerBoxDes);
	home.sethomePageStep1Tl(homePageStep1Tl);
	home.sethomePageStep1Des(homePageStep1Des);
	home.scrolldown1();
	Thread.sleep(2000);
	home.sethomePageStep2Tl(homePageStep2Tl);
	home.sethomePageStep2Des(homePageStep2Des);
	home.sethomePageStep3Tl(homePageStep3Tl);
	home.scrolldown1();
	Thread.sleep(2000);
	home.sethomePageStep3Des(homePageStep3Des);
	home.sethomePageStep4Tl(homePageStep4Tl);
	home.sethomePageStep4Des(homePageStep4Des);
	home.scrolldown();
	Thread.sleep(2000);
	//home.clickonSave();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
