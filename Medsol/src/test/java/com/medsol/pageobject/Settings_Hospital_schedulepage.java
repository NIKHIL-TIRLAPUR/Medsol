package com.medsol.pageobject;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class Settings_Hospital_schedulepage extends Baseclass {

	WebDriver ldriver;
	public Settings_Hospital_schedulepage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Settings']")
    WebElement Settings;
	
	@FindBy(xpath="//a[normalize-space()='Hospital Schedule']")
    WebElement HospitalSchedule;
	

	@FindBy(xpath="//input[@type='checkbox' and contains(@id,'chkShortWeekDay')]")
	List<WebElement> WeekDays;
	

	@FindBy(xpath="//span[@title='00:00' and contains(@role,'textbox')]")
	List<WebElement> starttime;
	
	@FindBy(xpath="//span[@title='23:45' and contains(@role,'textbox')]")
	List<WebElement> endtime;
	
	@FindBy(xpath="//button[@id='hospitalScheduleBtnSave']")
    WebElement hospitalScheduleBtnSave;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement searchbox;
	
	@FindBy(xpath="//input[@id='menuSearch']")
    WebElement menuSearch;
	
	public void clickonSettings(String set)
	{
		menuSearch.click();
		menuSearch.sendKeys(set);
		Settings.click();
	}
	
	public void clickonHospitalSchedule()
	{
		HospitalSchedule.click();
	}
	
	public void clickonWeekDays()
	{
		for(int  i=0;i<WeekDays.size();i++)
		{
			WeekDays.get(i).click();
		}
		 
	}
	
	
	public void setstarttime(String bname)
	{
		for(int  i=0;i<starttime.size();i++)
		{
			starttime.get(i).click();
			searchbox.sendKeys(bname);
		    searchbox.sendKeys(Keys.ENTER);
		}
		
		
	}
	
	
	public void setendtime(String bname)
	{
		
		for(int  i=0;i<endtime.size();i++)
		{
			endtime.get(i).click();
			searchbox.sendKeys(bname);
		    searchbox.sendKeys(Keys.ENTER);
		}
		
	}
	
	public void clickonhospitalScheduleBtnSave()
	{
		hospitalScheduleBtnSave.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
