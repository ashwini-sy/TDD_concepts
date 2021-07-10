package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paralleltest {
	WebDriver driver;
	public void test1()
	{
		System.getProperty("key", "chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
	}
	public void test2()
	{
		System.getProperty("key", "chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}

}
