package com.OpenCart.TestCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;


import com.OpenCart.Utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base 

{
  
	ReadConfig readConfig = new ReadConfig();
	
	String url = readConfig.getBaseUrl();
	String browser = readConfig.getBrowser();
	
	public String emailAddress = readConfig.getEmail() ;
	String password = readConfig.getPassword();
	
	
	public static WebDriver driver;
	public static Logger logger;
	
	
	@BeforeClass
	public void Setup()
 
	{
		         
         switch(browser.toLowerCase())
         {
         case "chrome":
        	 WebDriverManager.chromedriver().setup();
        	 driver=new ChromeDriver();
        	 break;
        	
         case "msedge":
        	 WebDriverManager.edgedriver().setup();
        	 driver=new EdgeDriver();
        	 break;
        	 
         case "firefox":
        	 WebDriverManager.firefoxdriver().setup();
        	 driver=new FirefoxDriver();
        	 break;
        	 
        	 default:
        		 driver = null;
        		 break;
        	 
         }
         

         //         Implicit Wait of 10 Seconds 
         
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         driver.manage().window().maximize();
    

// for Logging 
         
         
         logger=LogManager.getLogger("MyStoreV1");
         
// 		Open Url
 		
 		driver.get(url);
 		logger.info("Url Oppened");
 		
         
		
	}
	
	
	@AfterClass
	public void tearDown()
	{
    	driver.close();
		driver.quit();
	}
	
	
	public void capturedScreenShot(WebDriver driver,String testName) throws IOException
	{
//		Step 1 : Convrt  Wbdriver  object to  TakeScreenShot interFace
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		
//		Step 2 : Call  getScreenshotAs  Method to  create image  file
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		File dest = new File(System.getProperty("user.dir")+ "//ScreenShots//" + testName +".png" );
		
//		Step 3 : Copy   imagefile   to  destination
		FileUtils.copyFile(src, dest);
		
	}
	
}
