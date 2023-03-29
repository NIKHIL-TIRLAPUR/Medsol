package com.medsol.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pavan {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();

       

         driver.get("http://cls-medsol.in");

        driver.findElement(By.xpath("//a[@class='btn btn-success me-2 mb-3 mb-xl-0']")).click();

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nikhil.tirlapur@hms.com");

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password@123");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.findElement(By.xpath("//span[normalize-space()='Accountants']")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[normalize-space()='New Accountant']")).click();

        Thread.sleep(3000);

       

          

         

         String year= "1995";

        String date= "13";

       

         driver.findElement(By.xpath("//input[@id='birthDate']")).click();

        driver.findElement(By.xpath("//input[@aria-label='Year']")).click();

        driver.findElement(By.xpath("//input[@aria-label='Year']")).sendKeys("1995");

        /*while(true)

        {

                      String year1= driver.findElement(By.xpath("//input[contains(@class,'numInput cur-year')]")).getText();

                     

                      if(year.equals(year1))

                                    break;

                      else

                                    driver.findElement(By.xpath("//span[@class='arrowDown']")).click();

        }*/

       

         Select month_drp= new Select(driver.findElement(By.xpath("//select[@aria-label='Month']")));

        month_drp.selectByVisibleText("January");

       

        List<WebElement>alldates= driver.findElements(By.xpath("//div[@class='dayContainer']/span"));

       

        for(WebElement ele:alldates)

        {

                      String dt= ele.getText();

                      if(dt.equals(date))

                      {

                                    ele.click();

                                    break;

                      }

        }

        driver.findElement(By.xpath("//input[@id='first_name']")).click();
        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("pavan");
        Thread.sleep(3000);
       String yeartext= driver.findElement(By.xpath("//input[@aria-label='Year']")).getText();

       System.out.println(yeartext);

       driver.quit();


	}

}
