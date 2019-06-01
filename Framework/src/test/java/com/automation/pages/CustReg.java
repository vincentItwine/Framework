package com.automation.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CustReg {

	WebDriver driver;
	
	public CustReg(WebDriver ldriver)
	{
	this.driver=ldriver;
	}
	@FindBy(linkText="Register") WebElement RegLink;
	@FindBy(xpath="//input[@formcontrolname='name']") WebElement Fname;
	@FindBy(xpath="//input[@placeholder='dd-mm-yyyy']") WebElement dob;
	@FindBy(xpath="//input[@formcontrolname='mobilenumber']") WebElement MobNum;
	@FindBy(xpath="//input[@formcontrolname='email']") WebElement EId;
	@FindBy(xpath="//select[@formcontrolname='cusreferences']") WebElement SelObj;
	@FindBy(xpath="//input[@formcontrolname='referralcode']") WebElement RefCode;
	@FindBy(xpath="//button[@type='submit']") WebElement subButton;
	@FindBy(xpath="//h4[text()='The basic registration is completed..!']") WebElement textVer;
	
	//@Optional("admin@itwinetech.com") String ApplicationUserName, @Optional("1234") String ApplicationPassword
	//@Parameters({"ApplicationUserName","ApplicationPassword"})

	public void registreToBir(String FullName, String NewDob, String MobileNum, String EmailId, String selectRef, String ReferalCode) throws InterruptedException
	
	{
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		RegLink.click();
		Fname.sendKeys(FullName);
		Thread.sleep(1000);
		dob.sendKeys(NewDob);
		Thread.sleep(1000);
		MobNum.sendKeys(MobileNum);
		Thread.sleep(1000);
		EId.sendKeys(EmailId);
		
		Select Sel=new Select(SelObj);
		Sel.selectByVisibleText(selectRef);
		RefCode.sendKeys(ReferalCode);
		subButton.click();
		
		//Verify Registered Successfully
		String CusRegVerify=textVer.getText();
		SoftAssert assertion =new SoftAssert();
				assertion.assertEquals("The basic registration is completed..!", CusRegVerify);
	}
	
}
