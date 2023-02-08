package com.medsol.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {

	Properties pro;
	
	public Readconfig()
	{
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro= new Properties();
			pro.load(fis);
			
		}catch(Exception e) {
			System.out.println("Exception is"+ e.getMessage());
		}
			
	}
	
	public String getapplicationurl()
	{
		String url =pro.getProperty("baseurl");
		return url;
	}
	
	public String getusername()
	{
		String username =pro.getProperty("username");
		return username;
	}
	
	public String getpassword()
	{
		String password =pro.getProperty("password");
		return password;
	}
	
	public String getChromepath()
	{
		String chromepath =pro.getProperty("chromepath");
		return chromepath;
	}
	
	public String getIEpath()
	{
		String iepath =pro.getProperty("iepath");
		return iepath;
	}
	public String getFirefoxpath()
	{
		String firefoxpath =pro.getProperty("firefoxpath");
		return firefoxpath;
	}
	
	public String getfirstname()
	{
		String firstname =pro.getProperty("firstname");
		return firstname;
	}
	
	public String getlastname()
	{
		String lastname =pro.getProperty("lastname");
		return lastname;
	}
	
	public String getpassword1()
	{
		String password =pro.getProperty("password");
		return password;
	}
	
	public String getconfirmpassword()
	{
		String confirmpassword =pro.getProperty("confirmpassword");
		return confirmpassword;
	}
	
	public String getbloodgroup()
	{
		String bloodgroup =pro.getProperty("bloodgroup");
		return bloodgroup;
	}
	
	public String getdesignation()
	{
		String designation =pro.getProperty("designation");
		return designation;
	}
	
	
	public String getqualification()
	{
		String qualification =pro.getProperty("qualification");
		return qualification;
	}
	
	public String getyear()
	{
		String year =pro.getProperty("year");
		return year;
	}
	
	public String getmonth()
	{
		String month =pro.getProperty("month");
		return month;
	}
	
	public String getdate()
	{
		String date =pro.getProperty("date");
		return date;
	}
	
	public String getyear1()
	{
		String year1 =pro.getProperty("year1");
		return year1;
	}
	
	public String getmonth1()
	{
		String month1 =pro.getProperty("month1");
		return month1;
	}
	
	public String getdate1()
	{
		String date1 =pro.getProperty("date1");
		return date1;
	}
	
	public String getaddress1()
	{
		String address1 =pro.getProperty("address1");
		return address1;
	}
	
	public String getaddress2()
	{
		String address2 =pro.getProperty("address2");
		return address2;
	}
	
	public String getcity()
	{
		String city =pro.getProperty("city");
		return city;
	}
	
	public String getzipcode()
	{
		String zipcode =pro.getProperty("zipcode");
		return zipcode;
	}
	
	public String getdescription()
	{
		String description =pro.getProperty("description");
		return description;
	}
	
	public String getbedtype()
	{
		String bedtype =pro.getProperty("bedtype");
		return bedtype;
	}
	
	public String getbeddescription()
	{
		String beddescription =pro.getProperty("beddescription");
		return beddescription;
	}
	
	public String getbloodgroupinbloodbank()
	{
		String bloodgroupinbloodbank =pro.getProperty("bloodgroupinbloodbank");
		return bloodgroupinbloodbank;
	}
	
	public String getremainingbag()
	{
		String remainingbag =pro.getProperty("remainingbag");
		return remainingbag;
	}
	
	public String getselectpatient()
	{
		String selectpatient =pro.getProperty("selectpatient");
		return selectpatient;
	}
	
	public String getdiscount()
	{
		String discount =pro.getProperty("discount");
		return discount;
	}
	
	public String getstatusofbill()
	{
		String statusofbill =pro.getProperty("statusofbill");
		return statusofbill;
	}
	
	public String getselectaccount()
	{
		String selectaccount =pro.getProperty("selectaccount");
		return selectaccount;
	}
	
	public String getquantity()
	{
		String quantity =pro.getProperty("quantity");
		return quantity;
	}
	
	public String getprice()
	{
		String price =pro.getProperty("price");
		return price;
	}
	
	public String getpaytouser()
	{
		String paytouser =pro.getProperty("paytouser");
		return paytouser;
	}
	
	public String getamounttobepaid()
	{
		String amounttobepaid =pro.getProperty("amounttobepaid");
		return amounttobepaid;
	}
	
	
	
	
	
	
	
	
	
}
