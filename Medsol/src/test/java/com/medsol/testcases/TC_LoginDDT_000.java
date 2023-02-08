package com.medsol.testcases;

import java.io.IOException;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.XLUtils;

public class TC_LoginDDT_000 extends Baseclass
{
	
	@Test(dataProvider="LoginData")
  public void LoginDDT(String username, String password) throws InterruptedException {
		
		
	 Loginpage lp= new Loginpage(driver);
	
	 lp.clickonlogin();
	 lp.setemail(username);
	 lp.setpassword(password);
	 lp.clickonloginsubmit();
	 Thread.sleep(3000);
	 lp.clickonlogoutdropdown();
	 Thread.sleep(3000);
	 lp.clickonlogoutbutton();
  }
	
	@DataProvider(name="LoginData")
	public String[][] getData() throws IOException{
		String path=System.getProperty("user.dir")+"/src/test/java/com/medsol/testdata/LoginData.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colconut=XLUtils.getCellCount(path,"Sheet1", 1);
			String logindata[][]=new String[rownum][colconut];
			for(int i=1;i<=rownum;i++)
			{
				for(int j=0;j<colconut;j++)
				{
					logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i, j);
				}
			}
			
			return logindata;
	}
	
	
	
}
