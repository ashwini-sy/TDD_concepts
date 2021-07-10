package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TestWebdriverExample {
	
	public static void main(String[] args) { 
	
	System.getProperty("key", "chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.simplilearn.com/");
	 EventFiringWebDriver  event = new EventFiringWebDriver(driver);
     
	 WebdriverListenrExample listenerObj =  new WebdriverListenrExample();
     
     event.register(listenerObj);
     
	}

}
