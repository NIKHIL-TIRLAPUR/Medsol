package com.medsol.pageobject;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.medsol.testcases.Baseclass;

public class Patients_patientadmissionspage extends Baseclass {

	WebDriver ldriver;
	public Patients_patientadmissionspage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//span[normalize-space()='Patients']")
    WebElement Patients;
	
	@FindBy(xpath="//a[normalize-space()='Patient Admissions']")
    WebElement PatientAdmissions;
	
	@FindBy(xpath="//a[@id='dropdownMenuButton']")
    WebElement dropdownMenuButton;
	
	@FindBy(xpath="//a[normalize-space()='New Patient Admission']")
    WebElement NewPatientAdmission;
	
	@FindBy(xpath="//span[@id='select2-admissionPatientId-container']")
    WebElement selectpatient;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement searchbox;
	
	@FindBy(xpath="//span[@id='select2-admissionDoctorId-container']")
    WebElement selectdoctor;
	
	@FindBy(xpath="//input[@id='admissionDate']")
    WebElement admissionDate;
	
	@FindBy(xpath="//input[@aria-label='Year']")
    WebElement admissionYear;
	
	@FindBy(xpath="//select[@aria-label='Month']")
    WebElement admissionMonth;
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[2]/div[1]/span")
	List<WebElement> admissiondates;
	
	@FindBy(xpath="//span[@id='select2-admissionPackageId-container']")
    WebElement selectpackage;
	
	@FindBy(xpath="//span[@id='select2-admissionInsuranceId-container']")
    WebElement selectinsurance;
	
	@FindBy(xpath="//span[@id='select2-admissionBedId-container']")
    WebElement selectbed;
	
	@FindBy(xpath="//input[@id='policy_no']")
    WebElement policy_no;
	
	@FindBy(xpath="//input[@id='agent_name']")
    WebElement agent_name;
	
	@FindBy(xpath="//input[@id='guardian_name']")
    WebElement guardian_name;
	
	@FindBy(xpath="//input[@id='guardian_relation']")
    WebElement guardian_relation;
	
	@FindBy(xpath="//input[@id='admissionPhoneNumber']")
    WebElement admissionPhoneNumber;
	
	@FindBy(xpath="//input[@id='guardian_address']")
    WebElement guardian_address;
	
	@FindBy(xpath="//input[@name='status']")
    WebElement status;
	
	@FindBy(xpath="//input[@id='admissionSaveBtn']")
    WebElement admissionSaveBtn;
	
	
	public void clickonPatients()
	{
		Patients.click();
	}
	
	public void clickonPatientAdmissions()
	{
		PatientAdmissions.click();
	}
	
	public void clickondropdownMenuButton()
	{
		dropdownMenuButton.click();
	}
	
	public void clickonNewPatientAdmission()
	{
		NewPatientAdmission.click();
	}
	
	public void setselectpatient(String group)
	{
		//selectpatient.click();
		searchbox.click();
		searchbox.sendKeys(group);
		searchbox.sendKeys(Keys.ENTER);
		
	}
	
	public void setselectdoctor(String group)
	{
		selectdoctor.click();
		searchbox.click();
		searchbox.sendKeys(group);
		searchbox.sendKeys(Keys.ENTER);
		
	}
	
	
	public void setadmissionDate(String year,String month,String date)
	{
		admissionDate.click();
		admissionYear.click();
		admissionYear.clear();
		admissionYear.sendKeys(year);
		 Select month_drp= new Select(admissionMonth);
         month_drp.selectByVisibleText(month);
         List<WebElement> alldate= admissiondates;
       
         for(WebElement ele:alldate)

         {

                       String dt= ele.getText();

                       if(dt.equals(date))

                       {

                                     ele.click();

                                     break;

                       }

         }
	}
	
	
	public void setselectpackage(String group)
	{
		selectpackage.click();
		searchbox.click();
		searchbox.sendKeys(group);
		searchbox.sendKeys(Keys.ENTER);
		
	}
	
	public void setselectinsurance(String group)
	{
		selectinsurance.click();
		searchbox.click();
		searchbox.sendKeys(group);
		searchbox.sendKeys(Keys.ENTER);
		
	}
	
	public void setselectbed(String group)
	{
		selectbed.click();
		searchbox.click();
		searchbox.sendKeys(group);
		searchbox.sendKeys(Keys.ENTER);
		
	}
	
	public void setpolicy_no(String phonenumber)
	{
		policy_no.click();
		policy_no.sendKeys(phonenumber);
	}
	
	public void setagent_name(String quali)
	{
		agent_name.click();
		agent_name.sendKeys(quali);
	}
	
	public void setguardian_name(String phonenumber)
	{
		guardian_name.click();
		guardian_name.sendKeys(phonenumber);
	}
	
	public void setguardian_relation(String quali)
	{
		guardian_relation.click();
		guardian_relation.sendKeys(quali);
	}
	
	public void setadmissionPhoneNumber(String phonenumber)
	{
		admissionPhoneNumber.click();
		admissionPhoneNumber.sendKeys(phonenumber);
	}
	
	public void setguardian_address(String quali)
	{
		guardian_address.click();
		guardian_address.sendKeys(quali);
	}
	
	public void clickonstatus()
	{
		status.click();
	}
	
	public void clickonSave()
	{
		admissionSaveBtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
