package com.automation.testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import com.automation.pages.BaseClass;
import com.automation.pages.LoginPage;



public class AdminLoginTestBIR extends BaseClass{

	//added a comment to check in github
	@Test(priority=1)
	
	//@Parameters({"ApplicationUserName","ApplicationPassword"})
	//String ApplicationUserName, String ApplicationPassword
	public void loginApp()
	{
		logger=report.createTest("Login to CRM");
								
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		
		logger.info("Starting Application");
		
		//excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1 )
		//"admin@itwinetech.com", "1234a"
		//Config.getAdminUName(), Config.getAdminPass()
			
		loginPage.loginToBIR(Config.getAdminUName(), Config.getAdminPass());
		
		logger.pass("Login Success");
		/*WebElement textVer=driver.findElement(By.xpath("//h3[text()='BET INDIA RACES']"));
		String bir=textVer.getText();
		SoftAssert assertion =new SoftAssert();
				assertion.assertEquals("Login ailed, Incorrect email id or password.", bir);*/

	}
	
	/*@Test(priority=2)
	public void loginApp1()
	{
		logger=report.createTest("Logout");
		
		logger.info("Starting Application");
		
	
		logger.fail("Logout failed");
	}*/
	
}
