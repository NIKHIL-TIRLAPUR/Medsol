package com.medsol.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class Frontcms_noticeboardpage extends Baseclass 
{

	WebDriver ldriver;
	public Frontcms_noticeboardpage (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/div[3]/ul[1]/li[14]/a[1]")
    WebElement frontcms;
	
	@FindBy(xpath="//a[normalize-space()='Notice Boards']")
    WebElement NoticeBoards;
	
	@FindBy(xpath="//a[normalize-space()='New Notice Board']")
    WebElement NewNoticeBoards;
	
	@FindBy(xpath="//input[@id='title']")
    WebElement txttitle;
	
	@FindBy(xpath="//textarea[@id='description']")
    WebElement txtdescription;
	
	@FindBy(xpath="//button[@id='noticeBoardSave']")
    WebElement noticeBoardSave;
	
	
	@FindBy(xpath="//a[@title='Edit']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement editbutton;
	
	@FindBy(xpath="//input[@id='editNoticeBoardTitle']")
    WebElement txtedittitle;
	
	@FindBy(xpath="//textarea[@id='editNoticeBoardDescription']")
    WebElement txteditdescription;
	
	@FindBy(xpath="//button[@id='editNoticeBoardSave']")
    WebElement editnoticeBoardSave;
	
	@FindBy(xpath="//input[@name='search']")
    WebElement searchbox;
	
	
	@FindBy(xpath="//a[@title='Delete']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
    WebElement yesdeletebutton;
	
	
	public void clickonfrontcms()
	{
		frontcms.click();
	}
	
	public void clickonNoticeBoards()
	{
		NoticeBoards.click();
	}
	
	public void clickonNewNoticeBoards()
	{
		NewNoticeBoards.click();
	}
	
	public void settitleinnoticeboard(String title)
	{
		txttitle.click();
		txttitle.sendKeys(title);
	}
	
	public void setdescriptionofnoticeboard(String des)
	{
		txtdescription.click();
		txtdescription.sendKeys(des);
	}
	
	
	public void clickonnoticeBoardSave()
	{
		noticeBoardSave.click();
	}
	
	public void setedittitleinnoticeboard(String etitle)
	{
		txtedittitle.click();
		txtedittitle.clear();
		txtedittitle.sendKeys(etitle);
	}
	
	
	public void seteditdescriptionofnoticeboard(String edes)
	{
		txteditdescription.click();
		txteditdescription.clear();
		txteditdescription.sendKeys(edes);
	}
	
	public void clickoneditnoticeBoardSave()
	{
		editnoticeBoardSave.click();
	}
	
	public void clickoneditbutton()
	{
		editbutton.click();
	}
	
	public void setnamesearchbox(String name)
	{
		searchbox.click();
		searchbox.sendKeys(name);
		searchbox.sendKeys(Keys.ENTER);
	}
	
	
	
	public void clickondeletebutton()
	{
		deletebutton.click();
		
	}
	
	public void clickonyesdeletebutton()
	{
		yesdeletebutton.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
