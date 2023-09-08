package Util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter 
{
	public static ExtentReports getExtentReport()
	{
		String extentReportFilePath=System.getProperty("user.dir")+"\\Reports\\extentreport.html";
		ExtentSparkReporter SparkReporter=new ExtentSparkReporter(extentReportFilePath);
		SparkReporter.config().setReportName("InsureEfficient Automation Results");
		SparkReporter.config().setDocumentTitle("InsureEfficient Test Automation Results ");
	
	ExtentReports extentReport = new ExtentReports();
	extentReport.attachReporter(SparkReporter);
	extentReport.setSystemInfo("Selenium Version","4.4.0" );
	extentReport.setSystemInfo("Operating System", "Windows 11");
	extentReport.setSystemInfo("Executed By  ", "Umang Bhatt");
	
	return  extentReport;
	
	
	}
	

}
