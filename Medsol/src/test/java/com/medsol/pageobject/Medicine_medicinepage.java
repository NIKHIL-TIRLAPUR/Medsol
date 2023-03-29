package com.medsol.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.Baseclass;

public class Medicine_medicinepage extends Baseclass {
	
	WebDriver ldriver;
	public Medicine_medicinepage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//span[contains(@class,'aside-menu-title')][normalize-space()='Medicines']")
    WebElement Medicines;
	
	@FindBy(xpath="//a[normalize-space()='New Medicine']")
    WebElement NewMedicine;
	
	@FindBy(xpath="//input[@id='medicineNameId']")
    WebElement medicineNameId;
	
	@FindBy(xpath="//span[@id='select2-medicineCategoryId-container']")
    WebElement medicineCategoryId;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement searchbox;
	
	@FindBy(xpath="//span[@id='select2-medicineBrandId-container']")
    WebElement medicineBrandId;
	
	@FindBy(xpath="//input[@id='salt_composition']")
    WebElement salt_composition;
	
	@FindBy(xpath="//textarea[@id='side_effects']")
    WebElement side_effects;
	
	@FindBy(xpath="//input[@id='buying_price']")
    WebElement buying_price;
	
	@FindBy(xpath="//input[@id='selling_price']")
    WebElement selling_price;
	
	@FindBy(xpath="//textarea[@id='description']")
    WebElement description;
	
	@FindBy(xpath="//input[@id='medicineSave']")
    WebElement medicineSave;
	
	@FindBy(xpath="//tbody/tr[1]/td[5]/a[1]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement editbutton;
	
	@FindBy(xpath="//input[@name='search']")
    WebElement searchboxfordeleteoredit;
	
	@FindBy(xpath="//tbody/tr[1]/td[5]/a[2]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
    WebElement yesdeletebutton;
	
	
	
	public void clickonMedicines()
	{
		Medicines.click();
	}
	
	public void clickonNewMedicine()
	{
		NewMedicine.click();
	}
	
	public void setmedicineNameId(String name)
	{
		medicineNameId.click();
		medicineNameId.sendKeys(name);
	}
	
	public void setmedicineCategoryId(String medicinecata)
	{
		medicineCategoryId.click();
		searchbox.click();
		searchbox.sendKeys(medicinecata);
		searchbox.sendKeys(Keys.ENTER);
	}
	
	public void setmedicineBrandId(String brand)
	{
		medicineBrandId.click();
		searchbox.click();
		searchbox.sendKeys(brand);
		searchbox.sendKeys(Keys.ENTER);
	}
	
	public void setsalt_composition(String composition )
	{
		salt_composition.click();
		salt_composition.sendKeys(composition);
	}
	
	public void setbuying_price(String bprice )
	{
		buying_price.click();
		buying_price.sendKeys(bprice);
	}
	
	public void setselling_price(String sprice )
	{
		selling_price.click();
		selling_price.sendKeys(sprice);
	}
	
	public void setside_effects(String effects )
	{
		side_effects.click();
		side_effects.sendKeys(effects);
	}
	
	public void setdescription(String descriptions)
	{
		description.click();
		description.sendKeys(descriptions);
	}
	
	public void clickonmedicineSave()
	{
		medicineSave.click();
	}
	
	public void clickoneditbutton()
	{
		editbutton.click();
	}
	
	public void seteditmedicineNameId(String ename)
	{
		medicineNameId.click();
		medicineNameId.clear();
		medicineNameId.sendKeys(ename);
	}
	
	public void seteditmedicineCategoryId(String emedicinecata)
	{
		medicineCategoryId.click();
		searchbox.click();
		searchbox.sendKeys(emedicinecata);
		searchbox.sendKeys(Keys.ENTER);
	}
	
	public void seteditmedicineBrandId(String ebrand)
	{
		medicineBrandId.click();
		searchbox.click();
		searchbox.sendKeys(ebrand);
		searchbox.sendKeys(Keys.ENTER);
	}
	
	public void seteditsalt_composition(String composition )
	{
		salt_composition.click();
		salt_composition.clear();
		salt_composition.sendKeys(composition);
	}
	
	public void seteditbuying_price(String ebprice )
	{
		buying_price.click();
		buying_price.clear();
		buying_price.sendKeys(ebprice);
	}
	
	public void seteditselling_price(String esprice )
	{
		selling_price.click();
		selling_price.clear();
		selling_price.sendKeys(esprice);
	}
	
	public void seteditside_effects(String eeffects )
	{
		side_effects.click();
		side_effects.clear();
		side_effects.sendKeys(eeffects);
	}
	
	public void seteditdescription(String edescriptions)
	{
		description.click();
		description.clear();
		description.sendKeys(edescriptions);
	}
	
	public void clickonsearchboxfordeleteoredit(String name)
	{
		searchboxfordeleteoredit.click();
		searchboxfordeleteoredit.sendKeys(name);
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
