package com.medsol.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class Diagnosis_diagnosistestpage extends Baseclass {

	
	
	

	WebDriver ldriver;

	public Diagnosis_diagnosistestpage(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="//span[normalize-space()='Diagnosis']")
    WebElement Diagnosisbutton;
	
	@FindBy(xpath="//a[contains(text(),'Diagnosis Tests')]")
    WebElement DiagnosisTests;
	
	@FindBy(xpath="//a[normalize-space()='New Patient Diagnosis Test']")
    WebElement newpatientdiagnosisTest;
	
	@FindBy(xpath="//span[@id='select2-diagnosisTestPatientId-container']")
    WebElement selectpatient;
	
	@FindBy(xpath="//input[@role='searchbox']")//input[@role='searchbox']
    WebElement txtselectpatient;
	
	@FindBy(xpath="//span[@id='select2-diagnosisTestdoctorId-container']")
    WebElement selectdoctor;
	
	@FindBy(xpath="//input[@role='searchbox']")//input[@role='searchbox']
    WebElement txtselectdoctor;
	
	@FindBy(xpath="//span[@id='select2-diagnosisTestCategoryId-container']")//span[@id='select2-diagnosisTestCategoryId-container']
    WebElement selectdiagnosiscategory;
	
	@FindBy(xpath="//input[@role='searchbox']")//input[@role='searchbox']
    WebElement txtselectdiagnosiscategory;
	
	@FindBy(xpath="//input[@id='age']")
    WebElement txtpatientsage;
	
	@FindBy(xpath="//input[@id='height']")//input[@id='height']
    WebElement txtpatientsheight;
	
	@FindBy(xpath="//input[@id='weight']")
    WebElement txtpatientsweight;
	
	@FindBy(xpath="//input[@id='average_glucose']")
    WebElement txtpatientsaverageglucose;
	
	@FindBy(xpath="//input[@id='fasting_blood_sugar']")
    WebElement txtpatientsfastingbloodsugar;
	
	@FindBy(xpath="//input[@id='urine_sugar']")
    WebElement txtpatientsurinesugar;
	
	@FindBy(xpath="//input[@id='blood_pressure']")
    WebElement txtpatientsbloodpressure;
	
	@FindBy(xpath="//input[@id='diabetes']")
    WebElement txtpatientsdiabetes;
	
	@FindBy(xpath="//input[@id='cholesterol']")
    WebElement txtpatientscholesterol;

	@FindBy(xpath="//button[@id='addDiagnosisTestItem']")
    WebElement txtaddDiagnosisTestItembutton;
	
	@FindBy(xpath="//input[@name='property_name[]']")
    WebElement txtaddDiagnosisTestpropertyname;
	
	@FindBy(xpath="//input[@name='property_value[]']")
    WebElement txtaddDiagnosisTestpropertyvalue;
	
	@FindBy(xpath="//input[@id='diagnosisTestSave']")
    WebElement DiagnosisTestsave;
	
	public void clickonDiagnosisbutton()
	{
		Diagnosisbutton.click();
	}
	
	public void clickonDiagnosisTests()
	{
		DiagnosisTests.click();
	}
	
	public void clickonnewpatientdiagnosisTest()
	{
		newpatientdiagnosisTest.click();
	}
	
	public void setpatientinselectpatienttxt(String patient)
	{
		selectpatient.click();
		txtselectpatient.click();
		txtselectpatient.sendKeys(patient);
		txtselectpatient.sendKeys(Keys.ENTER);
	}
	
	public void setdoctorinselectdoctortxt(String doctor)
	{
		selectdoctor.click();
		txtselectdoctor.click();
		txtselectdoctor.sendKeys(doctor);
		txtselectdoctor.sendKeys(Keys.ENTER);
	}
	
	public void setselectdiagnosiscategorytxt(String category)
	{
		selectdiagnosiscategory.click();
		txtselectdiagnosiscategory.click();
		txtselectdiagnosiscategory.sendKeys(category);
		txtselectdiagnosiscategory.sendKeys(Keys.ENTER);
	}
	
	public void setpatientsage(String age)
	{
		txtpatientsage.click();
		txtpatientsage.sendKeys(age);
		
	}
	
	public void setpatientsheight(String height)
	{
		txtpatientsheight.click();
		txtpatientsheight.sendKeys(height);
		
	}
	
	public void setpatientsweight(String weight)
	{
		txtpatientsweight.click();
		txtpatientsweight.sendKeys(weight);
		
	}
	
	public void setpatientsaverageglucose(String averageglucose)
	{
		txtpatientsaverageglucose.click();
		txtpatientsaverageglucose.sendKeys(averageglucose);
		
	}
	
	public void setpatientsfastingbloodsugar(String fastingbloodsugar)
	{
		txtpatientsfastingbloodsugar.click();
		txtpatientsfastingbloodsugar.sendKeys(fastingbloodsugar);
		
	}
	
	public void setpatientsurinesugar(String urinesugar)
	{
		txtpatientsurinesugar.click();
		txtpatientsurinesugar.sendKeys(urinesugar);
		
	}
	
	public void setpatientsbloodpressure(String bloodpressure)
	{
		txtpatientsbloodpressure.click();
		txtpatientsbloodpressure.sendKeys(bloodpressure);
		
	}
	
	public void setpatientsdiabetes(String diabetes)
	{
		txtpatientsdiabetes.click();
		txtpatientsdiabetes.sendKeys(diabetes);
		
	}
	
	public void setpatientscholesterol(String cholesterol)
	{
		txtpatientscholesterol.click();
		txtpatientscholesterol.sendKeys(cholesterol);
		
	}
	
	
	public void clickontxtaddDiagnosisTestItembutton()
	{
		txtaddDiagnosisTestItembutton.click();
	}
	
	public void setnewDiagnosisTestpropertyname(String propertyname)
	{
		txtaddDiagnosisTestpropertyname.click();
		txtaddDiagnosisTestpropertyname.sendKeys(propertyname);
		
	}
	
	public void setnewDiagnosisTestpropertyvalue(String propertyvalue)
	{
		txtaddDiagnosisTestpropertyvalue.click();
		txtaddDiagnosisTestpropertyvalue.sendKeys(propertyvalue);
		
	}
	
	public void clickonDiagnosisTestsave()
	{
		DiagnosisTestsave.click();
	}
	
}
