package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Util.ExtentReporter;

public class MyListeners implements ITestListener
{
	ExtentReports extentReport = ExtentReporter.getExtentReport();
	ExtentTest extentTest;
	
	
	public void onTestStart(ITestResult result) 
	
	{
	 extentTest = extentReport.createTest(result.getName());
	 
	}

	public void onTestSuccess(ITestResult result) 
	
	{
	
		extentTest.log(Status.PASS, "Test got Pass");
	}

	public void onTestFailure(ITestResult result)
	
	{
		extentTest.log(Status.FAIL, "Test got FAILED");
		extentTest.fail("Test got FAILED");
	}

	public void onTestSkipped(ITestResult result) {
	
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) 
	
	{
		extentReport.flush();
	}

}
