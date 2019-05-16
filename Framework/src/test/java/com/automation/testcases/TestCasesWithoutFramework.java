package com.automation.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCasesWithoutFramework {
	WebDriver driver;

	@Test
	public void test1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ui.freecrm.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("email")).sendKeys("vinaydev1982@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Abcd@9876");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		

		
				
		
	
	}
}
