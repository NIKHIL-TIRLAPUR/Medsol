package com.medsol.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medsol.pageobject.Frontcms_noticeboardpage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Frontcms_noticeboard_created extends Baseclass 
{
	Readconfig config= new Readconfig();
	public String totitle=config.gettotitle();
	public String description=config.getdescription();

	@Test
	public void Frontcms_noticeboardpagetest() throws InterruptedException, AWTException  {
		

		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	Frontcms_noticeboardpage noticeboard= new Frontcms_noticeboardpage(driver);
	noticeboard.clickonfrontcms();
	Thread.sleep(2000);
	noticeboard.clickonNoticeBoards();
	Thread.sleep(2000);
	noticeboard.clickonNewNoticeBoards();
	Thread.sleep(2000);
	noticeboard.settitleinnoticeboard(totitle);
	noticeboard.setdescriptionofnoticeboard(description);
	noticeboard.clickonnoticeBoardSave();
	
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
