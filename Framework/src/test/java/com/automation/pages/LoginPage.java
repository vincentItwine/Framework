package com.automation.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver ldriver)
	{
	this.driver=ldriver;
	}
	@FindBy(xpath="//input[@formcontrolname='username']") WebElement uname;
	@FindBy(xpath="//input[@formcontrolname='password']") WebElement pass;
	@FindBy(xpath="//button[@class='btn btn-danger btn-block btn-lg']") WebElement loginButon;
	@FindBy(xpath="//h3[text()='BET INDIA RACES']") WebElement textVer;
	
	//@Optional("admin@itwinetech.com") String ApplicationUserName, @Optional("1234") String ApplicationPassword
	//@Parameters({"ApplicationUserName","ApplicationPassword"})
	
	public void loginToBIR(String ApplicationUserName, String ApplicationPassword)
	{
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		uname.sendKeys(ApplicationUserName);
		pass.sendKeys(ApplicationPassword);
		loginButon.click();
		
		//Verify successfully logged in
		String bir=textVer.getText();
		SoftAssert assertion =new SoftAssert();
				assertion.assertEquals("Login ailed, Incorrect email id or password.", bir);
	}
	
}
