package com.OpenCart.Utilities;

import java.io.File;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


//com.OpenCart.Utilities.ExtentListener
public class ExtentListener implements ITestListener


 {

	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	
	public void  ConfigReport()
	{
		ReadConfig readConfig = new ReadConfig();
		
		String TimeStamp = new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date());
		String reportName = "MyStoreTestRepoer - " + TimeStamp +".html";
		
		
		htmlReporter =new ExtentSparkReporter(System.getProperty("user.dir")+ "//Reports//" + reportName );
		reports =  new ExtentReports();
		reports.attachReporter(htmlReporter);
		
//		add System inforamtiomn/ Enviorment info report
		reports.setSystemInfo("Machine:", "testpc1");
		reports.setSystemInfo("Os:", "Wndows 10");
		reports.setSystemInfo("browser:", readConfig.getBrowser());
		reports.setSystemInfo("Username:", "Umang");
		
		
//		Configuratiom to change look and feel og report
		
		htmlReporter.config().setDocumentTitle("Extent  Listener Report Demo");
		htmlReporter.config().setReportName("This is my First Report ");
		htmlReporter.config().setTheme(Theme.DARK);
		
	}
	
	public  void  onStart(ITestContext Result)
	{
		ConfigReport();
		System.out.println("on Start Method invoke...........");
	}
	
	public  void  onFinish(ITestContext Result)
	{
		
		System.out.println("on Finish Method invoke...........");
		reports.flush();
	}
	
	public  void  onTestFailure(ITestResult Result)
	{
		
		System.out.println("Name of test method Failed :..........."+Result.getName());
		test = reports.createTest(Result.getName());
	
		test.log(Status.FAIL, MarkupHelper.createLabel("Name of failed  test case is :  "+Result.getName(),ExtentColor.RED));
	
		
		String screenShotPath = System.getProperty("user.dir")+"\\ScreenShots\\" + Result.getName()+".png";
		File screenShotFile = new File(screenShotPath);
		
		if(screenShotFile.exists())
			
		{
			test.fail("Captured Screeen Shot is below :" +test.addScreenCaptureFromPath(screenShotPath));
		}
//		test.addScreenCaptureFromPath(null)
	
	}
	
	public void onTestSkipped(ITestResult Result)					
	{		
		System.out.println("Name of test method skipped:" + Result.getName() );  		

		test = reports.createTest(Result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel("Name of the skip test case is: " + Result.getName() ,ExtentColor.YELLOW));
	}	
	
	public void onTestStart(ITestResult Result)					
	{		
		System.out.println("Name of test method started:" + Result.getName() );  		

	}	
	
	public void onTestSuccess(ITestResult Result)					
	{		
		System.out.println("Name of test method sucessfully executed:" + Result.getName() );  		

		test = reports.createTest(Result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel("Name of the passed test case is: " + Result.getName() ,ExtentColor.GREEN));
	}		
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result)					
	{		

	}		


	
	
}
