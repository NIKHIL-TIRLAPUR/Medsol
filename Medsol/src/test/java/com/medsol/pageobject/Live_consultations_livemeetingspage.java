package com.medsol.pageobject;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.medsol.testcases.Baseclass;

public class Live_consultations_livemeetingspage extends Baseclass {

	WebDriver ldriver;
	public Live_consultations_livemeetingspage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Live Consultations']")
    WebElement LiveConsultations;
	

	@FindBy(xpath="//a[normalize-space()='Live Meetings']")
    WebElement LiveMeetings;
	
	@FindBy(xpath="//a[normalize-space()='New Live Meeting']")
    WebElement NewLiveMeeting;
	
	@FindBy(xpath="//input[@id='consultation_title']")
    WebElement consultation_title;
	

	@FindBy(xpath="//input[@id='consultation_date']")
    WebElement consultation_date;
	
	@FindBy(xpath="//div[@class='flatpickr-calendar hasTime animate open arrowTop arrowLeft']//select[@aria-label='Month']")
    WebElement consultation_month;
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[2]/div[1]/span")
	List<WebElement> consultation_dates;
	
	@FindBy(xpath="//input[@id='consultation_duration_minutes']")
    WebElement consultation_duration_minutes;
	
	@FindBy(xpath="//body/div[2]/div[3]/div[1]/span[1]")
    WebElement hoursbutton;
	
	@FindBy(xpath="//body/div[2]/div[3]/div[2]/span[1]")
    WebElement minutesbutton;
	
	@FindBy(xpath="//body/div[2]/div[3]/span[2]")
    WebElement amorpm;
	
	@FindBy(xpath="//ul[@id='select2-meetingUserId-container']")
    WebElement stafflist;
	
	@FindBy(xpath="//span[@aria-expanded='true']//span[@class='select2-search select2-search--inline']")
    WebElement searchbox;
	
	@FindBy(xpath="//input[@id='meetingHostEnable']")//input[@id='meetingHostEnable']
    WebElement meetingHostEnable;
	
	@FindBy(xpath="//input[@id='meetingParticipantEnable']")//input[@id='meetingParticipantEnable']
    WebElement meetingParticipantEnable;
	
	@FindBy(xpath="//textarea[@id='description']")
    WebElement description;
	
	@FindBy(xpath="//button[@id='meetingSave']")
    WebElement meetingSave;
	
	public void clickonLiveConsultations()
	{
		LiveConsultations.click();
	}
	
	public void clickonLiveMeetings()
	{
		LiveMeetings.click();
	}
	
	public void clickonNewLiveMeeting()
	{
		NewLiveMeeting.click();
	}
	
	public void setconsultation_title(String bname)
	{
		consultation_title.click();
		consultation_title.sendKeys(bname);
	}
	
	public void setconsultation_duration_minutes(String bname)
	{
		consultation_duration_minutes.click();
		consultation_duration_minutes.sendKeys(bname);
	}
	
	public void setdescription(String bname)
	{
		description.click();
		description.sendKeys(bname);
	}
	
	public void setdateandtimeofmeeting(String month,String date)
	{
		consultation_date.click();
		//receptionistYear.click();
		//receptionistYear.clear();
		//receptionistYear.sendKeys(year);
		 Select month_drp= new Select(consultation_month);
         month_drp.selectByVisibleText(month);
         List<WebElement> alldate= consultation_dates;
       
         for(WebElement ele:alldate)

         {

                       String dt= ele.getText();

                       if(dt.equals(date))

                       {

                                     ele.click();

                                     break;

                       }

         }
         
         
         hoursbutton.click();
         minutesbutton.click();
         amorpm.click();
         
	}
	
	public void clickonmeetingHostEnable()
	{
		meetingHostEnable.click();
	}
	
	public void clickonmeetingParticipantEnable()
	{
		meetingParticipantEnable.click();
	}
	
	public void clickonmeetingSave()
	{
		meetingSave.click();
	}
	
	public void setstafflist(String bname)
	{
		stafflist.click();
		searchbox.click();
		searchbox.sendKeys(bname);
		searchbox.sendKeys(Keys.ENTER);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
