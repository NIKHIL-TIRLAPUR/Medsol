package com.medsol.testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.XLUtils;


public class TC_LoginDDT_000 extends Baseclass
{
	
   /* @DataProvider
	public Object[][] getLoginData() throws InvalidFormatException  {
		Object data [][] = Testutils.getTestData("login");
		return data;
	}*/
	
	
	
	@Test(dataProvider="LoginData")
  public void LoginDDT(String user,String pwd) throws InterruptedException {
		
		Thread.sleep(3000);
	 Loginpage lp= new Loginpage(driver);
	
	 lp.clickonlogin();
	 lp.setemail(user);
	 lp.setpassword(pwd);
	 lp.clickonloginsubmit();
	 Thread.sleep(3000);
	 lp.clickonlogoutdropdown();
	 Thread.sleep(3000);
	 lp.clickonlogoutbutton();
  }
	
	
	@DataProvider(name="LoginData")
	public String[][] getData() throws IOException{
		String path=System.getProperty("user.dir")+"/src/test/java/com/medsol/testdata/LoginData.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "login");
		int colconut=XLUtils.getCellCount(path,"login", 1);
			String logindata[][]=new String[rownum][colconut];
			for(int i=1;i<=rownum;i++)
			{
				for(int j=0;j<colconut;j++)
				{
					logindata[i-1][j]=XLUtils.getCellData(path,"login", i, j);
				}
			}
			
			return logindata;
			
	}
	
	
	
	
}
