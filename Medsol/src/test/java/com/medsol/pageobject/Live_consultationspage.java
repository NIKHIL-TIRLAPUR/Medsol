package com.medsol.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class Live_consultationspage extends Baseclass{

	
	WebDriver ldriver;
	public Live_consultationspage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Live Consultations']")
    WebElement LiveConsultations;
	

	@FindBy(xpath="//a[normalize-space()='New Live Consultation']")
    WebElement NewLiveConsultation;
	
	@FindBy(xpath="//input[@id='liveConsultationTitle']")
    WebElement liveConsultationTitle;
	
	@FindBy(xpath="//input[@id='liveConsultationDurationMinutes']")
    WebElement liveConsultationDurationMinutes;
	

	@FindBy(xpath="//span[@id='select2-consultationPatientName-container']")
    WebElement selectpatientname;
	
	@FindBy(xpath="//span[@id='select2-doctor_id-container']")
    WebElement selectdoctor;
	
	@FindBy(xpath="//span[@id='select2-type-container']")
    WebElement selecttype;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement searchbox;
	
	@FindBy(xpath="//input[@id='meetingHostEnable']")
    WebElement meetingHostEnable;
	

	@FindBy(xpath="//input[@id='meetingParticipantEnable']")
    WebElement meetingParticipantEnable;
	
	@FindBy(xpath="//textarea[@id='consultationDescription']")
    WebElement consultationDescription;
	
	@FindBy(xpath="//button[@id='consultationSave']")
    WebElement consultationSave;
	
	
	public void clickonLiveConsultations()
	{
		LiveConsultations.click();
	}
	
	public void clickonNewLiveConsultation()
	{
		NewLiveConsultation.click();
	}
	
	public void setliveConsultationTitle(String bname)
	{
		liveConsultationTitle.click();
		liveConsultationTitle.sendKeys(bname);
	}
	
	public void setliveConsultationDurationMinutes(String bname)
	{
		liveConsultationDurationMinutes.click();
		liveConsultationDurationMinutes.sendKeys(bname);
	}
	
	public void setselectpatientname(String bname)
	{
		selectpatientname.click();
		searchbox.click();
		searchbox.sendKeys(bname);
		searchbox.sendKeys(Keys.ENTER);
	}
	
	public void setselectdoctor(String bname)
	{
		selectdoctor.click();
		searchbox.click();
		searchbox.sendKeys(bname);
		searchbox.sendKeys(Keys.ENTER);
	}
	
	public void setselecttype(String bname)
	{
		selecttype.click();
		searchbox.click();
		searchbox.sendKeys(bname);
		searchbox.sendKeys(Keys.ENTER);
	}
	
	public void clickonmeetingHostEnable()
	{
		meetingHostEnable.click();
	}
	
	public void clickonmeetingParticipantEnable()
	{
		meetingParticipantEnable.click();
	}
	
	public void setconsultationDescription(String bname)
	{
		consultationDescription.click();
		consultationDescription.sendKeys(bname);
	}
	
	
	public void clickonconsultationSave()
	{
		consultationSave.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
