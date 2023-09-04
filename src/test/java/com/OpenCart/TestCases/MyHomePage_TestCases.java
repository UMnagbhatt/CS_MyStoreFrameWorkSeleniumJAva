package com.OpenCart.TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OpenCart.PageObject.Contact_Us;
import com.OpenCart.PageObject.IndexPage;
import com.OpenCart.PageObject.TestCases;

public class MyHomePage_TestCases extends Base
{

	
	
	@Test()
	public void Verify_ContatUS() throws IOException
	{

		logger.info("Verify_ContatUS test executuion Start.............");
		
		IndexPage pg = new IndexPage(driver);
		
String Tittle = pg.Gettittle();
		
		if (Tittle.equals("Automation Exercise"))
		{
			logger.info("Home page Tittle is visible successfully");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Home page Tittle is Not visible ");
			capturedScreenShot(driver, Tittle);
			Assert.assertTrue(false);
			
			
		}
		
		pg.ClickContactUsLink();
		logger.info("Click on contact us Button ");
		
		
		Contact_Us contact = new  Contact_Us(driver);
		String TochVisabel = contact.GetTouchVisable();
		
		if(TochVisabel.equals("GET IN TOUCH"))
		{
			logger.info("Get On Touch  is visible successfully");
			Assert.assertTrue(true);
		}
		
		else
		{
			logger.info("Get On Touch is Not visible ");
			capturedScreenShot(driver, TochVisabel);
			Assert.assertTrue(false);
		}
		
		contact.ContantUsName("Ram");
		logger.info("Emter Name On Contact Us  ");
		
		contact.ContantUsEmail("Rakesh@gmail.com");
		logger.info("Emter Email On Contact Us  ");
		
		
		contact.ContantUsSubject("Website not Working");
		logger.info("Emter Subject On Contact Us  ");
		
		
		contact.ContantUsMessage("Website not Working and Please check the website hai relase new Vesipn");
		logger.info("Emter Message On Contact Us  ");
		
		contact.ContantUsButton();
		logger.info("Click Submiit buttin on Contactus");
		
		contact.Alert();
		logger.info("Claick ok on Alert");
		
		
		String alert = contact.SucessAlert();
		
		if(alert.equals("Success! Your details have been submitted successfully."))
		{
			logger.info("Success! Your details have been submitted successfully.------Displayed");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Message Not Displayed");
			capturedScreenShot(driver, alert);
			Assert.assertTrue(false);
		}
		
		contact.ContantUsHomeButton();
		logger.info("Click Home Button on Contact Us");
		
		pg.Gettittle();
			
			if (Tittle.equals("Automation Exercise"))
			{
				logger.info("Home page Tittle is visible successfully");
				Assert.assertTrue(true);
			}
			else
			{
				logger.info("Home page Tittle is Not visible ");
				capturedScreenShot(driver, Tittle);
				Assert.assertTrue(false);
			}
		}
	
	
	@Test(priority=1)
	public void Verify_TestCase() throws IOException, InterruptedException
	{
                logger.info("Verify_TestCase test executuion Start.............");
		
		IndexPage pg = new IndexPage(driver);
		
		Thread.sleep(3000);
String title = pg.Gettittle();
		
		if (title.equals("Automation Exercise"))
		{
			logger.info("Home page Tittle is visible successfully");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Home page Tittle is Not visible ");
			capturedScreenShot(driver, title);
			Assert.assertTrue(false);
			
			
		}
		
		pg.ClickTestCaseLink();
		logger.info("Click on TestCase Link  ");
		
		
		
	Thread.sleep(3000);
		
		TestCases tc =new TestCases(driver);
		
		String TextTestCase = tc.VisableTestcaseText();
		
		
		if(TextTestCase.equals("TEST CASES"))
		{
			logger.info("TestCase Tittle is visible successfully");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("TestCase Tittle is Not visible ");
			capturedScreenShot(driver, TextTestCase);
			Assert.assertTrue(false);
			
			
		}
		
		
	}
	
}
