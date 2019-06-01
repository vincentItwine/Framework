package com.automation.testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.automation.pages.BaseClass;
import com.automation.pages.CustReg;

import com.automation.pages.LoginPage;
import com.automation.utility.BrowserFactory;

public class CustRegistrationTest extends BaseClass{
	
	@Test(priority=1)
		public void RegApp() throws InterruptedException
		{
			
			logger=report.createTest("Customer Registration");
									
			CustReg regPage=PageFactory.initElements(driver, CustReg.class);
			
			logger.info("Starting Application");
			
			//excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1 )
			//"admin@itwinetech.com", "1234a"
				
			//"From an existing customer", 
			//driver.findElement(By.linkText("Register")).click();
			
			regPage.registreToBir("Vinnaay Dev", "01-10-1982", "8907011674", "alkmnl22@gmail.com", "Others", "acppvfa");
			

		}

}
