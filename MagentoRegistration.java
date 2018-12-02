package com.ibm.seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MagentoRegistration {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(driver, 60);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://magento.com");
		driver.manage().window().maximize();
		
		WebElement myAccountEle=driver.findElement(By.xpath("//span[text()='Account']//ancestor::a"));
		myAccountEle.click();
		
		WebElement regEle=driver.findElement(By.xpath("//span[text()='Register']//ancestor::button"));
		regEle.click();
		
		
		WebElement firstnameEle=driver.findElement(By.xpath("//input[@id='firstname']"));
		firstnameEle.sendKeys("Syeda");
		
		//Thread.sleep(10000);
		
		WebElement lastnameEle=driver.findElement(By.xpath("//input[@id='lastname']"));
		lastnameEle.sendKeys("Tayyaba");
		
		WebElement emailEle=driver.findElement(By.xpath("//input[@id='email_address']"));
		emailEle.sendKeys("hajirahussain786@gmail.com");
		
		WebElement passEle1=driver.findElement(By.xpath("//input[@id='password']"));
		passEle1.sendKeys("Welcome123");
		
		WebElement passEle2=driver.findElement(By.xpath("//input[@id='confirmation']"));
		passEle2.sendKeys("Welcome123");
		
		WebElement checkEle=driver.findElement(By.xpath("//input[@id='agree_terms']"));
		checkEle.click();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		
	}

}
