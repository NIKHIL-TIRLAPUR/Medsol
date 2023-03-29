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
	
	public String getnameinsearchbox()
	{
		String name =pro.getProperty("name");
		return name;
	}
	
	public String getnumeberforpagedropdown()
	{
		String numeber =pro.getProperty("numeber");
		return numeber;
	}
	
	public String getvalueinfiltersearchbox()
	{
		String value =pro.getProperty("value");
		return value;
	}
	
	public String getchangefirstname()
	{
		String changefirstname =pro.getProperty("changefirstname");
		return changefirstname;
	}
	
	public String getchangelasttname()
	{
		String changelastname =pro.getProperty("changelastname");
		return changelastname;
	}
	
	public String getchangebillingname()
	{
		String changebillingname =pro.getProperty("changebillingname");
		return changebillingname;
	}
	
	public String getchangebillingdescription()
	{
		String changebillingdescription =pro.getProperty("changebillingdescription");
		return changebillingdescription;
	}
	
	public String geteditedbloodgroupinbloodbank()
	{
		String editedbloodgroupinbloodbank =pro.getProperty("editedbloodgroupinbloodbank");
		return editedbloodgroupinbloodbank;
	}
	
	public String geteditedremainingbag()
	{
		String editedremainingbag =pro.getProperty("editedremainingbag");
		return editedremainingbag;
	}
	
	public String geteditedbedtype()
	{
		String editedbedtype =pro.getProperty("editedbedtype");
		return editedbedtype;
	}
	
	public String geteditbeddescription()
	{
		String editbeddescription =pro.getProperty("editbeddescription");
		return editbeddescription;
	}
	
	public String geteditpaytouser()
	{
		String editpaytouser =pro.getProperty("editpaytouser");
		return editpaytouser;
	}
	
	public String geteditamounttobepaid()
	{
		String editamounttobepaid =pro.getProperty("editamounttobepaid");
		return editamounttobepaid;
	}
	
	public String geteditdescription()
	{
		String editdescription =pro.getProperty("editdescription");
		return editdescription;
	}
	
	public String getselectdocument()
	{
		String selectdocument =pro.getProperty("selectdocument");
		return selectdocument;
	}
	
	public String getnote()
	{
		String note =pro.getProperty("note");
		return note;
	}
	
	public String geteditnote()
	{
		String editnote =pro.getProperty("editnote");
		return editnote;
	}
	
	
	public String getpath()
	{
		String path =pro.getProperty("path");
		return path;
	}
	
	public String getepath()
	{
		String epath =pro.getProperty("epath");
		return epath;
	}
	
	public String getedittitle()
	{
		String edittitle =pro.getProperty("edittitle");
		return edittitle;
	}
	
	
	public String geteditselectdocument()
	{
		String editselectdocument =pro.getProperty("editselectdocument");
		return editselectdocument;
	}
	
	public String getdocumenttype()
	{
		String documenttype =pro.getProperty("documenttype");
		return documenttype;
	}
	
	public String geteditdocumenttype()
	{
		String editdocumenttype =pro.getProperty("editdocumenttype");
		return editdocumenttype;
	}
	
	public String getdepartment()
	{
		String department=pro.getProperty("department");
		return department;
	}
	
	public String getspecialist()
	{
		String specialist=pro.getProperty("specialist");
		return specialist;
	}
	
	public String getfacebookurl()
	{
		String facebookurl=pro.getProperty("facebookurl");
		return facebookurl;
	}
	
	public String gettwitterurl()
	{
		String twitterurl=pro.getProperty("twitterurl");
		return twitterurl;
	}
	
	public String getinstagramurl()
	{
		String instagramurl=pro.getProperty("instagramurl");
		return instagramurl;
	}
	
	public String getlinkedinurl()
	{
		String linkedinurl=pro.getProperty("linkedinurl");
		return linkedinurl;
	}
	
	public String getdepartment1()
	{
		String department1=pro.getProperty("department1");
		return department1;
	}
	
	public String geteditdepartment()
	{
		String editdepartment=pro.getProperty("editdepartment");
		return editdepartment;
	}
	
	public String geteditdescription1()
	{
		String editdescription1=pro.getProperty("editdescription1");
		return editdescription1;
	}
	
	public String gettextsearchbox()
	{
		String textsearchbox=pro.getProperty("textsearchbox");
		return textsearchbox;
	}
	
	public String getdonorname()
	{
		String donorname=pro.getProperty("donorname");
		return donorname;
	}
	
	public String getdonorage()
	{
		String donorage=pro.getProperty("donorage");
		return donorage;
	}
	
	public String geteditdonorname()
	{
		String editdonorname=pro.getProperty("editdonorname");
		return editdonorname;
	}
	
	public String geteditdonorage()
	{
		String editdonorage=pro.getProperty("editdonorage");
		return editdonorage;
	}
	
	public String geteditbloodgroup()
	{
		String editbloodgroup=pro.getProperty("editbloodgroup");
		return editbloodgroup;
	}
	
	public String getdonortextsearchbox()
	{
		String donortextsearchbox=pro.getProperty("donortextsearchbox");
		return donortextsearchbox;
	}
	
	public String getbloodbags()
	{
		String bloodbags=pro.getProperty("bloodbags");
		return bloodbags;
	}
	
	public String geteditdonortextsearchbox()
	{
		String editdonortextsearchbox=pro.getProperty("editdonortextsearchbox");
		return editdonortextsearchbox;
	}
	
	public String geteditbloodbags()
	{
		String editbloodbags=pro.getProperty("editbloodbags");
		return editbloodbags;
	}
	
	public String getdiagnosiscategory()
	{
		String diagnosiscategory=pro.getProperty("diagnosiscategory");
		return diagnosiscategory;
	}
	
	public String geteditdiagnosiscategory()
	{
		String editdiagnosiscategory=pro.getProperty("editdiagnosiscategory");
		return editdiagnosiscategory;
	}
	
	public String getdiagnosiscategorytextsearchbox()
	{
		String diagnosiscategorytextsearchbox=pro.getProperty("diagnosiscategorytextsearchbox");
		return diagnosiscategorytextsearchbox;
	}
	
	public String getdiagnosiscategorychbox()
	{
		String diagnosiscategory=pro.getProperty("diagnosiscategory");
		return diagnosiscategory;
	}
	
	
	
	public String getweight()
	{
		String weight=pro.getProperty("weight");
		return weight;
	}
	
	public String getheight()
	{
		String height=pro.getProperty("height");
		return height;
	}
	
	public String getaverageglucose()
	{
		String averageglucose=pro.getProperty("averageglucose");
		return averageglucose;
	}
	
	public String getfastingbloodsugar()
	{
		String fastingbloodsugar=pro.getProperty("fastingbloodsugar");
		return fastingbloodsugar;
	}
	
	public String geturinesugar()
	{
		String urinesugar=pro.getProperty("urinesugar");
		return urinesugar;
	}
	
	public String getbloodpressure()
	{
		String bloodpressure=pro.getProperty("bloodpressure");
		return bloodpressure;
	}
	
	public String getdiabetes()
	{
		String diabetes=pro.getProperty("diabetes");
		return diabetes;
	}
	
	public String getcholesterol()
	{
		String cholesterol=pro.getProperty("cholesterol");
		return cholesterol;
	}
	
	public String getpropertyname()
	{
		String propertyname=pro.getProperty("propertyname");
		return propertyname;
	}
	
	public String getpropertyvalue()
	{
		String propertyvalue=pro.getProperty("propertyvalue");
		return propertyvalue;
	}
	
	public String getincomehead()
	{
		String incomehead=pro.getProperty("incomehead");
		return incomehead;
	}
	
	public String getinvoicenumber()
	{
		String invoicenumber=pro.getProperty("invoicenumber");
		return invoicenumber;
	}
	
	public String geteditincomehead()
	{
		String editincomehead=pro.getProperty("editincomehead");
		return editincomehead;
	}
	
	public String geteditinvoicenumber()
	{
		String editinvoicenumber=pro.getProperty("editinvoicenumber");
		return editinvoicenumber;
	}
	
	public String getexpanseinvoicenumber()
	{
		String expanseinvoicenumber=pro.getProperty("expanseinvoicenumber");
		return expanseinvoicenumber;
	}
	
	public String getexpansehead()
	{
		String expansehead=pro.getProperty("expansehead");
		return expansehead;
	}
	
	public String geteditexpansehead()
	{
		String editexpansehead=pro.getProperty("editexpansehead");
		return editexpansehead;
	}
	
	public String geteditexpanseinvoicenumber()
	{
		String editexpanseinvoicenumber=pro.getProperty("editexpanseinvoicenumber");
		return editexpanseinvoicenumber;
	}
	
	public String getfdate()
	{
		String fdate=pro.getProperty("fdate");
		return fdate;
	}
	
	public String getfmonth()
	{
		String fmonth=pro.getProperty("fmonth");
		return fmonth;
	}
	
	public String getcountryname()
	{
		String countryname=pro.getProperty("countryname");
		return countryname;
	}
	
	public String getselectpurpose()
	{
		String selectpurpose=pro.getProperty("selectpurpose");
		return selectpurpose;
	}
	
	public String getidcard()
	{
		String idcard=pro.getProperty("idcard");
		return idcard;
	}
	
	public String getnumberofperson()
	{
		String numberofperson=pro.getProperty("numberofperson");
		return numberofperson;
	}
	
	public String getintimehour()
	{
		String intimehour=pro.getProperty("intimehour");
		return intimehour;
	}
	
	public String getintimeminute()
	{
		String intimeminute=pro.getProperty("intimeminute");
		return intimeminute;
	}
	
	public String getintimesecond()
	{
		String intimesecond=pro.getProperty("intimesecond");
		return intimesecond;
	}
	
	public String getouttimehour()
	{
		String outtimehour=pro.getProperty("outtimehour");
		return outtimehour;
	}
	
	public String getouttimeminute()
	{
		String outtimeminute=pro.getProperty("outtimeminute");
		return outtimeminute;
	}
	
	public String getouttimesecond()
	{
		String outtimesecond=pro.getProperty("outtimesecond");
		return outtimesecond;
	}
	
	public String getfromtitle()
	{
		String fromtitle=pro.getProperty("fromtitle");
		return fromtitle;
	}
	
	public String getreferencenumber()
	{
		String referencenumber=pro.getProperty("referencenumber");
		return referencenumber;
	}
	
	public String gettotitle()
	{
		String totitle=pro.getProperty("totitle");
		return totitle;
	}
	
	public String getaddress()
	{
		String address=pro.getProperty("address");
		return address;
	}
	
	public String geteditfromtitle()
	{
		String editfromtitle=pro.getProperty("editfromtitle");
		return editfromtitle;
	}
	
	public String geteditreferencenumber()
	{
		String editreferencenumber=pro.getProperty("editreferencenumber");
		return editreferencenumber;
	}
	
	public String getedittotitle()
	{
		String edittotitle=pro.getProperty("edittotitle");
		return edittotitle;
	}
	
	public String geteditaddress()
	{
		String editaddress=pro.getProperty("editaddress");
		return editaddress;
	}
	
	public String getreferencenoinsearchboxfordelete()
	{
		String referencenoinsearchboxfordelete=pro.getProperty("referencenoinsearchboxfordelete");
		return referencenoinsearchboxfordelete;
	}
	
	public String getservicename()
	{
		String servicename=pro.getProperty("servicename");
		return servicename;
	}
	
	public String getshortdescription()
	{
		String shortdescription=pro.getProperty("shortdescription");
		return shortdescription;
	}
	
	public String getchargetype()
	{
		String chargetype=pro.getProperty("chargetype");
		return chargetype;
	}
	
	public String geteditchargetype()
	{
		String editchargetype=pro.getProperty("editchargetype");
		return editchargetype;
	}
	
	public String getchargecategory()
	{
		String chargecategory=pro.getProperty("chargecategory");
		return chargecategory;
	}
	
	public String getcode()
	{
		String code=pro.getProperty("code");
		return code;
	}
	
	public String getstandardcharge()
	{
		String standardcharge=pro.getProperty("standardcharge");
		return standardcharge;
	}
	
	public String geteditchargecategory()
	{
		String editchargecategory=pro.getProperty("editchargecategory");
		return editchargecategory;
	}
	
	public String geteditcode()
	{
		String editcode=pro.getProperty("editcode");
		return editcode;
	}
	
	public String geteditstandardcharge()
	{
		String editstandardcharge=pro.getProperty("editstandardcharge");
		return editstandardcharge;
	}
	
	public String getipdbloodpressure()
	{
		String ipdbloodpressure=pro.getProperty("ipdbloodpressure");
		return ipdbloodpressure;
	}
	
	public String getipdheight()
	{
		String ipdheight=pro.getProperty("ipdheight");
		return ipdheight;
	}
	
	
	public String getipdweight()
	{
		String ipdweight=pro.getProperty("ipdweight");
		return ipdweight;
	}
	
	public String getsymptoms()
	{
		String symptoms=pro.getProperty("symptoms");
		return symptoms;
	}
	
	public String getpaymentmode()
	{
		String paymentmode=pro.getProperty("paymentmode");
		return paymentmode;
	}
	
	public String getitemCategoryName()
	{
		String itemCategoryName=pro.getProperty("itemCategoryName");
		return itemCategoryName;
	}
	
	public String geteditItemCategoryName()
	{
		String editItemCategoryName=pro.getProperty("editItemCategoryName");
		return editItemCategoryName;
	}
	
	public String getitemName()
	{
		String itemName=pro.getProperty("itemName");
		return itemName;
	}
	
	public String getitemUnit()
	{
		String itemUnit=pro.getProperty("itemUnit");
		return itemUnit;
	}
	
	public String getitemCategoryNames()
	{
		String itemCategoryNames=pro.getProperty("itemCategoryNames");
		return itemCategoryNames;
	}
	
	public String getedititemName()
	{
		String edititemName=pro.getProperty("edititemName");
		return edititemName;
	}
	
	public String getedititemUnit()
	{
		String edititemUnit=pro.getProperty("edititemUnit");
		return edititemUnit;
	}
	
	public String getstockSupplierName()
	{
		String stockSupplierName=pro.getProperty("stockSupplierName");
		return stockSupplierName;
	}
	
	public String geteditstockSupplierName()
	{
		String editstockSupplierName=pro.getProperty("editstockSupplierName");
		return editstockSupplierName;
	}
	
	
	public String getstockStoreName()
	{
		String stockStoreName=pro.getProperty("stockStoreName");
		return stockStoreName;
	}
	
	public String geteditstockStoreName()
	{
		String editstockStoreName=pro.getProperty("editstockStoreName");
		return editstockStoreName;
	}
	
	public String getstockQuantity()
	{
		String stockQuantity=pro.getProperty("stockQuantity");
		return stockQuantity;
	}
	
	public String geteditstockQuantity()
	{
		String editstockQuantity=pro.getProperty("editstockQuantity");
		return editstockQuantity;
	}
	
	public String getstockPurchasePrice()
	{
		String stockPurchasePrice=pro.getProperty("stockPurchasePrice");
		return stockPurchasePrice;
	}
	
	public String geteditstockPurchasePrice()
	{
		String editstockPurchasePrice=pro.getProperty("editstockPurchasePrice");
		return editstockPurchasePrice;
	}
	
	
	public String getyear2()
	{
		String year2=pro.getProperty("year2");
		return year2;
	}
	
	public String getmonth2()
	{
		String month2=pro.getProperty("month2");
		return month2;
	}
	
	public String getdate2()
	{
		String date2=pro.getProperty("date2");
		return date2;
	}
	
	public String getusertype()
	{
		String usertype=pro.getProperty("usertype");
		return usertype;
	}
	
	public String getissueby()
	{
		String issueby=pro.getProperty("issueby");
		return issueby;
	}
	
	public String getitemcategory()
	{
		String itemcategory=pro.getProperty("itemcategory");
		return itemcategory;
	}
	
	public String getitemnameinsearchbox()
	{
		String itemnameinsearchbox=pro.getProperty("itemnameinsearchbox");
		return itemnameinsearchbox;
	}
	
	public String getmedicineCategoryName()
	{
		String medicineCategoryName=pro.getProperty("medicineCategoryName");
		return medicineCategoryName;
	}
	
	public String geteditmedicineCategoryName()
	{
		String editmedicineCategoryName=pro.getProperty("editmedicineCategoryName");
		return editmedicineCategoryName;
	}
	
	public String getbrandname()
	{
		String brandname=pro.getProperty("brandname");
		return brandname;
	}
	
	public String getmedicine()
	{
		String medicine=pro.getProperty("medicine");
		return medicine;
	}
	
	public String getmedicineCategoryId()
	{
		String medicineCategoryId=pro.getProperty("medicineCategoryId");
		return medicineCategoryId;
	}
	
	public String getbrand()
	{
		String brand=pro.getProperty("brand");
		return brand;
	}
	
	public String getsideeffects()
	{
		String sideeffects=pro.getProperty("sideeffects");
		return sideeffects;
	}
	
	public String getbuyingprice()
	{
		String buyingprice=pro.getProperty("buyingprice");
		return buyingprice;
	}
	
	public String getsellingprice()
	{
		String sellingprice=pro.getProperty("sellingprice");
		return sellingprice;
	}
	
	public String getsalt_composition()
	{
		String salt_composition=pro.getProperty("salt_composition");
		return salt_composition;
	}
	
	
	public String geteditmedicineCategoryId()
	{
		String editmedicineCategoryId=pro.getProperty("editmedicineCategoryId");
		return editmedicineCategoryId;
	}
	
	public String geteditbrand()
	{
		String editbrand=pro.getProperty("editbrand");
		return editbrand;
	}
	
	public String geteditsideeffects()
	{
		String editsideeffects=pro.getProperty("editsideeffects");
		return editsideeffects;
	}
	
	public String geteditbuyingprice()
	{
		String editbuyingprice=pro.getProperty("editbuyingprice");
		return editbuyingprice;
	}
	
	public String geteditsellingprice()
	{
		String editsellingprice=pro.getProperty("editsellingprice");
		return editsellingprice;
	}
	
	public String geteditsalt_composition()
	{
		String editsalt_composition=pro.getProperty("editsalt_composition");
		return editsalt_composition;
	}
	
	public String getradiologyCategoryName()
	{
		String radiologyCategoryName=pro.getProperty("radiologyCategoryName");
		return radiologyCategoryName;
	}
	
	public String geteditradiologyCategoryName()
	{
		String editradiologyCategoryName=pro.getProperty("editradiologyCategoryName");
		return editradiologyCategoryName;
	}
	
	public String gettestname()
	{
		String testname=pro.getProperty("testname");
		return testname;
	}
	
	public String getshortname()
	{
		String shortname=pro.getProperty("shortname");
		return shortname;
	}
	
	public String gettesttype()
	{
		String testtype=pro.getProperty("testtype");
		return testtype;
	}
	
	public String getcategoryname()
	{
		String categoryname=pro.getProperty("categoryname");
		return categoryname;
	}
	
	public String getsubcategory()
	{
		String subcategory=pro.getProperty("subcategory");
		return subcategory;
	}
	
	public String getreportdays()
	{
		String reportdays=pro.getProperty("reportdays");
		return reportdays;
	}
	
	public String getradiologychargecategory()
	{
		String chargecategory=pro.getProperty("chargecategory");
		return chargecategory;
	}
	
	public String getedittestname()
	{
		String edittestname=pro.getProperty("edittestname");
		return edittestname;
	}
	
	public String geteditshortname()
	{
		String editshortname=pro.getProperty("editshortname");
		return editshortname;
	}
	
	public String getedittesttype()
	{
		String edittesttype=pro.getProperty("edittesttype");
		return edittesttype;
	}
	
	public String geteditcategoryname()
	{
		String editcategoryname=pro.getProperty("editcategoryname");
		return editcategoryname;
	}
	
	public String geteditsubcategory()
	{
		String editsubcategory=pro.getProperty("editsubcategory");
		return editsubcategory;
	}
	
	public String geteditreportdays()
	{
		String editreportdays=pro.getProperty("editreportdays");
		return editreportdays;
	}
	
	public String geteditradiologychargecategory()
	{
		String editchargecategory=pro.getProperty("editchargecategory");
		return editchargecategory;
	}
	
	public String getpathologyCategoryName()
	{
		String pathologyCategoryName=pro.getProperty("pathologyCategoryName");
		return pathologyCategoryName;
	}
	
	public String geteditpathologyCategoryName()
	{
		String editpathologyCategoryName=pro.getProperty("editpathologyCategoryName");
		return editpathologyCategoryName;
	}
	
	public String getunit()
	{
		String unit=pro.getProperty("unit");
		return unit;
	}
	
	public String geteditunit()
	{
		String editunit=pro.getProperty("editunit");
		return editunit;
	}
	
	public String getmethod()
	{
		String method=pro.getProperty("method");
		return method;
	}
	
	public String geteditmethod()
	{
		String editmethod=pro.getProperty("editmethod");
		return editmethod;
	}
	
	public String getpathologyCategories()
	{
		String pathologyCategories=pro.getProperty("pathologyCategories");
		return pathologyCategories;
	}
	
	public String geteditpathologyCategories()
	{
		String editpathologyCategories=pro.getProperty("editpathologyCategories");
		return editpathologyCategories;
	}
	
	public String geteditservicename()
	{
		String editservicename=pro.getProperty("editservicename");
		return editservicename;
	}
	
	public String getrate()
	{
		String rate=pro.getProperty("rate");
		return rate;
	}
	
	public String geteditrate()
	{
		String editrate=pro.getProperty("editrate");
		return editrate;
	}
	
	public String geteditquantity()
	{
		String editquantity=pro.getProperty("editquantity");
		return editquantity;
	}
	
	public String getInsurancename()
	{
		String Insurancename=pro.getProperty("Insurancename");
		return Insurancename;
	}
	
	public String geteditInsurancename()
	{
		String editInsurancename=pro.getProperty("editInsurancename");
		return editInsurancename;
	}
	
	public String getservicetax()
	{
		String servicetax=pro.getProperty("servicetax");
		return servicetax;
	}
	
	public String geteditservicetax()
	{
		String editservicetax=pro.getProperty("editservicetax");
		return editservicetax;
	}
	
	public String geteditdiscount()
	{
		String editdiscount=pro.getProperty("editdiscount");
		return editdiscount;
	}
	
	public String getinsuranceno()
	{
		String insuranceno=pro.getProperty("insuranceno");
		return insuranceno;
	}
	
	public String geteditinsuranceno()
	{
		String editinsuranceno=pro.getProperty("editinsuranceno");
		return editinsuranceno;
	}
	
	public String getinsurancecode()
	{
		String insurancecode=pro.getProperty("insurancecode");
		return insurancecode;
	}
	
	public String geteditinsurancecode()
	{
		String editinsurancecode=pro.getProperty("editinsurancecode");
		return editinsurancecode;
	}
	
	public String gethospitalrate()
	{
		String hospitalrate=pro.getProperty("hospitalrate");
		return hospitalrate;
	}
	
	public String getedithospitalrate()
	{
		String edithospitalrate=pro.getProperty("edithospitalrate");
		return edithospitalrate;
	}
	
	public String getremark()
	{
		String remark=pro.getProperty("remark");
		return remark;
	}
	
	public String geteditremark()
	{
		String editremark=pro.getProperty("editremark");
		return editremark;
	}
	
	public String getdiseasesname()
	{
		String diseasesname=pro.getProperty("diseasesname");
		return diseasesname;
	}
	
	public String geteditdiseasesname()
	{
		String editdiseasesname=pro.getProperty("editdiseasesname");
		return editdiseasesname;
	}
	
	public String getdiseasescharge()
	{
		String diseasescharge=pro.getProperty("diseasescharge");
		return diseasescharge;
	}
	
	public String geteditdiseasescharge()
	{
		String editdiseasescharge=pro.getProperty("editdiseasescharge");
		return editdiseasescharge;
	}
	
	public String getdiseasesname1()
	{
		String diseasesname1=pro.getProperty("diseasesname1");
		return diseasesname1;
	}
	
	public String getdiseasescharge1()
	{
		String diseasescharge1=pro.getProperty("diseasescharge1");
		return diseasescharge1;
	}
	
	public String getPackagename()
	{
		String Packagename=pro.getProperty("Packagename");
		return Packagename;
	}
	
	public String geteditPackagename()
	{
		String editPackagename=pro.getProperty("editPackagename");
		return editPackagename;
	}
	
	public String geteditselectservice()
	{
		String editselectservice=pro.getProperty("editselectservice");
		return editselectservice;
	}
	
	public String getselectservice()
	{
		String selectservice=pro.getProperty("selectservice");
		return selectservice;
	}
	
	public String getselectservice2()
	{
		String selectservice2=pro.getProperty("selectservice2");
		return selectservice2;
	}
	
	public String geteditselectservice2()
	{
		String editselectservice2=pro.getProperty("editselectservice2");
		return editselectservice2;
	}
	
	public String getquantity1()
	{
		String quantity1=pro.getProperty("quantity1");
		return quantity1;
	}
	
	public String geteditquantity1()
	{
		String editquantity1=pro.getProperty("editquantity1");
		return editquantity1;
	}
	
	public String getrate1()
	{
		String rate1=pro.getProperty("rate1");
		return rate1;
	}
	
	public String geteditrate1()
	{
		String editrate1=pro.getProperty("editrate1");
		return editrate1;
	}
	
	public String getvehicle_number()
	{
		String vehicle_number=pro.getProperty("vehicle_number");
		return vehicle_number;
	}
	
	public String geteditvehicle_number()
	{
		String editvehicle_number=pro.getProperty("editvehicle_number");
		return editvehicle_number;
	}
	
	public String getvehicle_model()
	{
		String vehicle_model=pro.getProperty("vehicle_model");
		return vehicle_model;
	}
	
	public String geteditvehicle_model()
	{
		String editvehicle_model=pro.getProperty("editvehicle_model");
		return editvehicle_model;
	}
	
	public String getyear_made()
	{
		String year_made=pro.getProperty("year_made");
		return year_made;
	}
	
	public String getedityear_made()
	{
		String edityear_made=pro.getProperty("edityear_made");
		return edityear_made;
	}
	
	public String getdriver_name()
	{
		String driver_name=pro.getProperty("driver_name");
		return driver_name;
	}
	
	public String geteditdriver_name()
	{
		String editdriver_name=pro.getProperty("editdriver_name");
		return editdriver_name;
	}
	
	public String getdriver_license()
	{
		String driver_license=pro.getProperty("driver_license");
		return driver_license;
	}
	
	public String geteditdriver_license()
	{
		String editdriver_license=pro.getProperty("editdriver_license");
		return editdriver_license;
	}
	
	public String getVehicleType()
	{
		String VehicleType=pro.getProperty("VehicleType");
		return VehicleType;
	}
	
	public String geteditVehicleType()
	{
		String editVehicleType=pro.getProperty("editVehicleType");
		return editVehicleType;
	}
	
	public String getvehiclemodel()
	{
		String vehiclemodel=pro.getProperty("vehiclemodel");
		return vehiclemodel;
	}
	
	public String geteditvehiclemodle()
	{
		String editvehiclemodle=pro.getProperty("editvehiclemodle");
		return editvehiclemodle;
	}
	
	public String geteditselectpatient()
	{
		String editselectpatient=pro.getProperty("editselectpatient");
		return editselectpatient;
	}
	
	
	public String getvaccinationName()
	{
		String vaccinationName=pro.getProperty("vaccinationName");
		return vaccinationName;
	}
	
	public String geteditvaccinationName()
	{
		String editvaccinationName=pro.getProperty("editvaccinationName");
		return editvaccinationName;
	}
	
	public String getvaccinationManufacturedBy()
	{
		String vaccinationManufacturedBy=pro.getProperty("vaccinationManufacturedBy");
		return vaccinationManufacturedBy;
	}
	
	public String geteditvaccinationManufacturedBy()
	{
		String editvaccinationManufacturedBy=pro.getProperty("editvaccinationManufacturedBy");
		return editvaccinationManufacturedBy;
	}
	
	public String getvaccinationBrand()
	{
		String vaccinationBrand=pro.getProperty("vaccinationBrand");
		return vaccinationBrand;
	}
	
	public String geteditvaccinationBrand()
	{
		String editvaccinationBrand=pro.getProperty("editvaccinationBrand");
		return editvaccinationBrand;
	}
	
	public String getselectvaccination()
	{
		String selectvaccination=pro.getProperty("selectvaccination");
		return selectvaccination;
	}
	
	public String geteditselectvaccination()
	{
		String editselectvaccination=pro.getProperty("editselectvaccination");
		return editselectvaccination;
	}
	
	public String getPatientSerialNo()
	{
		String PatientSerialNo=pro.getProperty("PatientSerialNo");
		return PatientSerialNo;
	}
	
	public String geteditPatientSerialNo()
	{
		String editPatientSerialNo=pro.getProperty("editPatientSerialNo");
		return editPatientSerialNo;
	}
	
	public String getdoseNo()
	{
		String doseNo=pro.getProperty("doseNo");
		return doseNo;
	}
	
	public String geteditdoseNo()
	{
		String editdoseNo=pro.getProperty("editdoseNo");
		return editdoseNo;
	}
	
	public String getselectpatient1()
	{
		String selectpatient1=pro.getProperty("selectpatient1");
		return selectpatient1;
	}
	
	
	public String geteditselectpatient1()
	{
		String editselectpatient1=pro.getProperty("editselectpatient1");
		return editselectpatient1;
	}
	
	
	public String getrole()
	{
		String role=pro.getProperty("role");
		return role;
	}
	
	
	
	
	
	public String geteditfacebookurl()
	{
		String editfacebookurl=pro.getProperty("editfacebookurl");
		return editfacebookurl;
	}
	
	public String getedittwitterurl()
	{
		String edittwitterurl=pro.getProperty("edittwitterurl");
		return edittwitterurl;
	}
	
	
	public String geteditinstagramurl()
	{
		String editinstagramurl=pro.getProperty("editinstagramurl");
		return editinstagramurl;
	}
	
	
	public String geteditlinkedinurl()
	{
		String editlinkedinurl=pro.getProperty("editlinkedinurl");
		return editlinkedinurl;
	}
	
	public String geteditrole()
	{
		String editrole=pro.getProperty("editrole");
		return editrole;
	}
	
	public String geteditlastname()
	{
		String editlastname=pro.getProperty("editlastname");
		return editlastname;
	}
	
	public String geteditfirstname()
	{
		String editfirstname=pro.getProperty("editfirstname");
		return editfirstname;
	}
	
	public String getfname()
	{
		String fname=pro.getProperty("fname");
		return fname;
	}
	
	public String gethomePageExperience()
	{
		String homePageExperience=pro.getProperty("homePageExperience");
		return homePageExperience;
	}
	
	public String gethomeTitleId()
	{
		String homeTitleId=pro.getProperty("homeTitleId");
		return homeTitleId;
	}
	
	
	public String gethomeShortDescription()
	{
		String homeShortDescription=pro.getProperty("homeShortDescription");
		return homeShortDescription;
	}
	
	
	public String gethomePageBoxTitle()
	{
		String homePageBoxTitle=pro.getProperty("homePageBoxTitle");
		return homePageBoxTitle;
	}
	
	public String gethomePageBoxDescription()
	{
		String homePageBoxDescription=pro.getProperty("homePageBoxDescription");
		return homePageBoxDescription;
	}
	
	public String gethomeDoctorTextId()
	{
		String homeDoctorTextId=pro.getProperty("homeDoctorTextId");
		return homeDoctorTextId;
	}
	
	public String gethomeDoctorTitleId()
	{
		String homeDoctorTitleId=pro.getProperty("homeDoctorTitleId");
		return homeDoctorTitleId;
	}
	
	public String gethomeDoctorDescription()
	{
		String homeDoctorDescription=pro.getProperty("homeDoctorDescription");
		return homeDoctorDescription;
	}
	
	
	
	
	
	
	
	
	
	
	
	public String gethomePageCerBoxTl()
	{
		String homePageCerBoxTl=pro.getProperty("homePageCerBoxTl");
		return homePageCerBoxTl;
	}
	
	public String gethomePageCerBoxDes()
	{
		String homePageCerBoxDes=pro.getProperty("homePageCerBoxDes");
		return homePageCerBoxDes;
	}
	
	
	public String gethomePageStep1Tl()
	{
		String homePageStep1Tl=pro.getProperty("homePageStep1Tl");
		return homePageStep1Tl;
	}
	
	
	public String gethomePageStep1Des()
	{
		String homePageStep1Des=pro.getProperty("homePageStep1Des");
		return homePageStep1Des;
	}
	
	public String gethomePageStep2Tl()
	{
		String homePageStep2Tl=pro.getProperty("homePageStep2Tl");
		return homePageStep2Tl;
	}
	
	public String gethomePageStep2Des()
	{
		String homePageStep2Des=pro.getProperty("homePageStep2Des");
		return homePageStep2Des;
	}
	
	public String gethomePageStep3Tl()
	{
		String homePageStep3Tl=pro.getProperty("homePageStep3Tl");
		return homePageStep3Tl;
	}
	
	public String gethomePageStep3Des()
	{
		String homePageStep3Des=pro.getProperty("homePageStep3Des");
		return homePageStep3Des;
	}
	
	
	public String gethomePageStep4Tl()
	{
		String homePageStep4Tl=pro.getProperty("homePageStep4Tl");
		return homePageStep4Tl;
	}
	
	public String gethomePageStep4Des()
	{
		String homePageStep4Des=pro.getProperty("homePageStep4Des");
		return homePageStep4Des;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getselectpackage()
	{
		String selectpackage=pro.getProperty("selectpackage");
		return selectpackage;
	}
	
	public String getselectinsurance()
	{
		String selectinsurance=pro.getProperty("selectinsurance");
		return selectinsurance;
	}
	
	public String getselectbed()
	{
		String selectbed=pro.getProperty("selectbed");
		return selectbed;
	}
	
	public String getpolicyno()
	{
		String policyno=pro.getProperty("policyno");
		return policyno;
	}
	
	public String getagentname()
	{
		String agentname=pro.getProperty("agentname");
		return agentname;
	}
	
	
	public String getguardianname()
	{
		String guardianname=pro.getProperty("guardianname");
		return guardianname;
	}
	
	public String getguardianrelation()
	{
		String guardianrelation=pro.getProperty("guardianrelation");
		return guardianrelation;
	}
	
	public String getguardianaddress()
	{
		String guardianaddress=pro.getProperty("guardianaddress");
		return guardianaddress;
	}
	
	public String getinvestigationStatus()
	{
		String investigationStatus=pro.getProperty("investigationStatus");
		return investigationStatus;
	}
	
	public String gettitle()
	{
		String title=pro.getProperty("title");
		return title;
	}
	
	public String getpath1()
	{
		String path1=pro.getProperty("path1");
		return path1;
	}
	
	public String getsr_no()
	{
		String sr_no=pro.getProperty("sr_no");
		return sr_no;
	}
	
	public String getpayrollstatus()
	{
		String payrollstatus=pro.getProperty("payrollstatus");
		return payrollstatus;
	}
	
	public String getbasicsalary()
	{
		String basicsalary=pro.getProperty("basicsalary");
		return basicsalary;
	}
	
	public String getallowance()
	{
		String allowance=pro.getProperty("allowance");
		return allowance;
	}
	
	public String getdeductions()
	{
		String deductions=pro.getProperty("deductions");
		return deductions;
	}
	
	public String getbed()
	{
		String bed=pro.getProperty("bed");
		return bed;
	}
	
	public String geteditbed()
	{
		String editbed=pro.getProperty("editbed");
		return editbed;
	}
	
	public String geteditbedtype()
	{
		String editbedtype=pro.getProperty("editbedtype");
		return editbedtype;
	}
	
	public String gethospital_from_day()
	{
		String hospital_from_day=pro.getProperty("hospital_from_day");
		return hospital_from_day;
	}
	
	public String gethospital_from_time()
	{
		String hospital_from_time=pro.getProperty("hospital_from_time");
		return hospital_from_time;
	}
	
	public String getcurrentcurrency()
	{
		String currentcurrency=pro.getProperty("currentcurrency");
		return currentcurrency;
	}
	
	public String getstarttime()
	{
		String starttime=pro.getProperty("starttime");
		return starttime;
	}
	
	public String getendtime()
	{
		String endtime=pro.getProperty("endtime");
		return endtime;
	}
	
	public String getset()
	{
		String set=pro.getProperty("set");
		return set;
	}
	
	public String getmodulename()
	{
		String modulename=pro.getProperty("modulename");
		return modulename;
	}
	
	public String getcurrencyName()
	{
		String currencyName=pro.getProperty("currencyName");
		return currencyName;
	}
	
	public String getcurrencyCode()
	{
		String currencyCode=pro.getProperty("currencyCode");
		return currencyCode;
	}
	
	public String getcurrencyIcon()
	{
		String currencyIcon=pro.getProperty("currencyIcon");
		return currencyIcon;
	}
	
	public String geteditcurrencyName()
	{
		String editcurrencyName=pro.getProperty("editcurrencyName");
		return editcurrencyName;
	}
	
	public String geteditcurrencyCode()
	{
		String editcurrencyCode=pro.getProperty("editcurrencyCode");
		return editcurrencyCode;
	}
	
	public String geteditcurrencyIcon()
	{
		String editcurrencyIcon=pro.getProperty("editcurrencyIcon");
		return editcurrencyIcon;
	}
	
	public String getliveConsultationTitle()
	{
		String liveConsultationTitle=pro.getProperty("liveConsultationTitle");
		return liveConsultationTitle;
	}
	
	public String getliveConsultationDurationMinutes()
	{
		String liveConsultationDurationMinutes=pro.getProperty("liveConsultationDurationMinutes");
		return liveConsultationDurationMinutes;
	}
	
	public String getselecttype()
	{
		String selecttype=pro.getProperty("selecttype");
		return selecttype;
	}
	
	public String getstafflist()
	{
		String stafflist=pro.getProperty("stafflist");
		return stafflist;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
