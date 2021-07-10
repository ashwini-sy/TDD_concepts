package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerExample implements ITestListener{
	WebDriver driver=BaseClass.driver;
	@Override
    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub
		System.out.println("start the test through listenr class");
        
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void onTestFailure(ITestResult result) {
    	TakesScreenshot Tscobj=(TakesScreenshot)driver;
		File myfile=Tscobj.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(myfile, new File("test.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        // TODO Auto-generated method stub
        
    }
    @Override
    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void onStart(ITestContext context) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void onFinish(ITestContext context) {
        // TODO Auto-generated method stub
        
    }

}
