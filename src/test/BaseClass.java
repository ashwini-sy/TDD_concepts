package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import page.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;
	XSSFSheet sheet;
	XSSFWorkbook workbook;
	@BeforeMethod
	public void Login() throws IOException {
		// TODO Auto-generated method stub		
		System.getProperty("key", "chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		
		report=new ExtentReports("Extendreport.html");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		FileInputStream file=new FileInputStream("exceldata.xlsx");
		workbook=new  XSSFWorkbook(file);
		sheet=workbook.getSheetAt(0);
	}
	@AfterMethod
	public void teardown()
	{
		driver.close();
		report.endTest(test);
		report.flush();
	}
	

}
