package util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.TestBase;

public class ITestResultListener extends TestBase implements ITestListener{

	
	@Override
	 public void onFinish(ITestContext arg0) {
	  // TODO Auto-generated method stub
	  
	 }

	 @Override
	 public void onStart(ITestContext arg0) {
	  // TODO Auto-generated method stub
	  
	 }

	 @Override
	 public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	  // TODO Auto-generated method stub
	  
	 }

	 @Override
	 public void onTestFailure(ITestResult arg0) {
	  // TODO Auto-generated method stub
		 
		 //in below code, "SampleTest.driver" is used to get same driver from sample test class.
		 File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  try {
		   FileUtils.copyFile(srcFile, new File("./ScreenShots/"+arg0.getName()+".jpg"));
		  } catch (IOException e) {
		   e.printStackTrace();
		  }
	  
	 }

	 @Override
	 public void onTestSkipped(ITestResult arg0) {
	  // TODO Auto-generated method stub
	  
	 }

	 @Override
	 public void onTestStart(ITestResult arg0) {
	  // TODO Auto-generated method stub
	  
	 }

	 @Override
	 public void onTestSuccess(ITestResult arg0) {
	  // TODO Auto-generated method stub
	  
	 }

}
