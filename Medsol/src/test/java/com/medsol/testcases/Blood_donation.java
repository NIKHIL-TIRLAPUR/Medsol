package com.medsol.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Blood_donation {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
         ChromeOptions options = new ChromeOptions();
 	    options.addArguments("--remote-allow-origins=*");

         WebDriver driver = new ChromeDriver(options);
         //WebDriver driver = new ChromeDriver();

         driver.manage().window().maximize();

        

          driver.get("http://cls-medsol.in");

         driver.findElement(By.xpath("//a[@class='btn btn-success me-2 mb-3 mb-xl-0']")).click();

         driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nikhil.tirlapur@hms.com");

         driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password@123");

         driver.findElement(By.xpath("//button[@type='submit']")).click();
         
         
         driver.findElement(By.xpath("//span[normalize-space()='Blood Banks']")).click();

         Thread.sleep(3000);
         
         driver.findElement(By.xpath("//a[normalize-space()='Blood Donations']")).click();
         Thread.sleep(3000);

         driver.findElement(By.xpath("//a[normalize-space()='New Blood Donation']")).click();

         Thread.sleep(3000);
         
         driver.findElement(By.xpath("//span[@id='select2-donationDonorName-container']")).click();
         driver.findElement(By.xpath("//input[@role='searchbox']")).click();
         driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("ravi");
         driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys(Keys.ENTER);
         
         driver.findElement(By.xpath("//input[@id='donationBags']")).click();
         driver.findElement(By.xpath("//input[@id='donationBags']")).clear();
         driver.findElement(By.xpath("//input[@id='donationBags']")).sendKeys("2");
         
         driver.findElement(By.xpath("//button[@id='bloodDonationSave']")).click();
         Thread.sleep(3000);

	}

}
