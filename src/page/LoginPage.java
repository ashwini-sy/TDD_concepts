package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import test.LoginTest;
public class LoginPage {
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	//===============Webelemtes========================//
	@FindBy(linkText="Log in")
	WebElement login;
	
	@FindBy(name="user_login")
	WebElement un;
	
	@FindBy(id="password")
	WebElement pwd;
	
	
	
	//================Constructor=====================//
	public LoginPage()
	{
		driver=LoginTest.driver;
		report=LoginTest.report;
		test=LoginTest.test;
		PageFactory.initElements(driver, this);
	}
	
	//======================Method====================//
	public void LoginPg(String username,String password) 
	{
		
		System.out.println("Loginpage");
		test=report.startTest("Login page");
	
		login.click();
		
		test.log(LogStatus.PASS,"Clicked login button successfully:");
		
		un.sendKeys(username);
	    test.log(LogStatus.PASS,"Clicked username enterd uccessfully:");
	    System.out.println("username");
	    pwd.sendKeys(password);
	    System.out.println("password");
	    test.log(LogStatus.PASS,"Clicked password enterd sccessfully:");
	}

}
