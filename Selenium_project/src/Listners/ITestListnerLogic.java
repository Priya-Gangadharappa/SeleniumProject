package Listners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class ITestListnerLogic implements ITestListener
{
	static WebDriver driver;
	
	

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Test case is pass");
		TakesScreenshot t1= (TakesScreenshot) driver;
	       File source=t1.getScreenshotAs(OutputType.FILE);
	       File destination=new File("C:\\Users\\priya\\OneDrive\\Desktop\\PassTestcase\\grotech"+Math.random()+".png");       
			try {
				FileHandler.copy(source, destination);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		Reporter.log("Test case is fail");
		ITestListener.super.onTestSkipped(result);
		TakesScreenshot t1= (TakesScreenshot) driver;
	       File source=t1.getScreenshotAs(OutputType.FILE);
	       File destination=new File("C:\\Users\\priya\\OneDrive\\Desktop\\FailTestcase\\grotech"+Math.random()+".png");
			try {
				FileHandler.copy(source, destination);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	
}
