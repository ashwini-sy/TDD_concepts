package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import page.LoginPage;


@Listeners(ListnerExample.class)
public class LoginTest extends BaseClass{
	
	
	@Test(enabled=false)
	@Parameters({"username","password"})
	public void test(String Username,String Password) throws InterruptedException
	{
		LoginPage obj=new LoginPage();
		obj.LoginPg(Username, Password);
	}
	@Test
	public void logintest() 
	{
		LoginPage obj=new LoginPage();
		String username=sheet.getRow(1).getCell(0).getStringCellValue();
		String password=sheet.getRow(1).getCell(1).getStringCellValue();
		obj.LoginPg(username,password);
		
	}
	

}
