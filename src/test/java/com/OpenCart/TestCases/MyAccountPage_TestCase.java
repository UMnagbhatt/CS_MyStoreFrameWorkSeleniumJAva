package com.OpenCart.TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.OpenCart.PageObject.Account_Created;
import com.OpenCart.PageObject.Account_Delete;

import com.OpenCart.PageObject.IndexPage;
import com.OpenCart.PageObject.RegisterPage;
import com.OpenCart.PageObject.UserAccount;
import com.OpenCart.PageObject.UserSingUp;
import com.OpenCart.Utilities.ReadExcelFile;

public class MyAccountPage_TestCase extends Base
{

	String SingUpText ="New User Signup!";
	String HomeTitle="Automation Exercise";
	
	@Test()
	
	        public void VerifyRegistration() throws IOException, InterruptedException 
	      {
		logger.info("Verify Registration test executuion Start.............");
		
//		String HomeTittle ="AutomationExercise";
		
    String AccountInformation = "ENTER ACCOUNT INFORMATION";
	    String accountCreated = "ACCOUNT CREATED!";
	    String LoginAsName = "Rahul";
	    String AccountDeletedInformatiom = "ACCOUNT DELETED!";

	   
		
//		Index Page
		
		IndexPage pg = new IndexPage(driver);
		
//		Dispalyed Home Page Tittle
		
		Thread.sleep(5000);
		String title = pg.Gettittle();
		
		if(title.equals(HomeTitle))
		{
			logger.info("Home Page Titile ----- Displayed");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Home page Titile ----- NotDisplayed");
			capturedScreenShot(driver,"verfiyRegisrion");
			Assert.assertTrue(false);
		}
		
		
		
		pg.ClickonMySingup();
		logger.info("Cilck on MySingup");
		
		
		UserSingUp Us=new UserSingUp (driver);
		
		String Text = Us.VisableSingUpText();
		
		if(Text.equals(SingUpText))
		{
			logger.info("Sinup Visbale Text ----- Displayed");
			Assert.assertTrue(true);
		}
		
		else
		{
			
			logger.info("Sinup Visbale Text ----- NotDisplayed");
			capturedScreenShot(driver,"verfiyRegisrion");
			Assert.assertTrue(false);
		}
		
		Us.EnterSingupName("Rahul");
		logger.info("Enter  Name on UserSingup");
		
		Us.EnterSingupEmail("punkajaa.automated@gmail.com");
		logger.info("Enter  Eamil Address on UserSingup");
		
		Us.ClickSingupbutton();		
		logger.info("Cilck Sinupbutton on usersingup");
		
		
	
//		Registrion Page
		
		RegisterPage RP = new RegisterPage(driver);
	String informationAcccount = RP.VisableAccountInformationText();
		
	if(informationAcccount.equals(AccountInformation))
	{
			logger.info("Account Inforamtion Visbale Text ----- Displayed");
              Assert.assertTrue(true);		
               }
		
		else
		{
			
			logger.info("Account Inforamtion Visbale Text ----- NotDisplayed");
			capturedScreenShot(driver,"verfiyRegisrion");
			Assert.assertTrue(false);
		}
			
		
		RP.ClickMr();
		logger.info("Enter Gender  on Register Page");
		
		RP.EnterPassword("Boss@123");
		logger.info("Enter Password on Register Page");
		
		RP.SelectDays("9");
		RP.SelectMonts("April");
		RP.SelectYears("2018");
		logger.info("Enter Date of Birth on Register Page");
		
		RP.NewsletterCheckIn();
		logger.info(" Check In Sign up for our newsletter on Register Page");
		
		RP.RecivedCheckIn();
		logger.info(" Check In Receive special offers from our partners on Register Page");
		
		
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("label.form-check-label[for=input-newsletter-yes]")));
		RP.EnterFirstName("Rahul");
		logger.info("Enter FirstNmae  on Register Page");
		
		
		RP.EnterLastName("Joshi");
		logger.info(" Enter LastNmae on Register Page");
		
		RP.EnterComapnyName("SUrekha");
		logger.info(" Enter Company on Register Page");
		
		
		
		
		
//		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='d-inline-block pt-2 pd-2 w-100']/div/button[text()='Continue']")));
		RP.EnterAddress1("Gali Number 6");
		logger.info("Enter Address1 on Register Page");
		
		RP.EnterAddress1("Behind Rajpth");
		logger.info("Enter Address2 on Register Page");
		
		
		RP.EnterCountry("India");
		logger.info("Enter Country on Register Page");
		
		RP.EnterSate("Rajasthan");
		logger.info("Enter State on Register Page");
		
		RP.EnterCity("Banswara");
		logger.info("Enter City on Register Page");
		
		
		RP.EnterZip("327001");
		logger.info("Enter ZipCode on Register Page");
		
		RP.EnterMobileNumber("9898856525");
		logger.info("Enter Phone number on Register Page");
		
		RP.ClickonCreateAxxount();
		
		logger.info("Click Create Account  on Register Page");
		
		
		
		Account_Created Created =new Account_Created(driver);
		String visavb = Created.VisbaleText();
		
		if(visavb.equals(accountCreated))
		{
			logger.info("Account Created Visbale Text ----- Displayed");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Account Created Visbale Text ----- NotDisplayed");
			capturedScreenShot(driver,"verfiyRegisrion");
			Assert.assertTrue(false);
		}
	
//		Assert.assertEquals("ACCOUNT CREATED!", visavb);
//		logger.info("Verify Account on Account_Crated");
		
		Created.ClickCtnBtn();
		
		logger.info("Click Countinue button on Account_Crated");
		
		
		UserAccount Account = new UserAccount (driver);
		String LoggingName = Account.getuserName();
		
		if(LoggingName.equals(LoginAsName))
		{
			logger.info("Loging As ----- Passed");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Loging As  ----- Failed");
			capturedScreenShot(driver,"verfiyRegisrion");
			Assert.assertTrue(false);
		}
			
		Account.ClickDeleteAccount();
		logger.info("Click  Account Delete Link  on  UserAccount");
		
	
		Account_Delete inforamtion = new Account_Delete(driver);
		String informationDeleteAcccount = inforamtion.DeleteAccountInformationText();
		
		if(informationDeleteAcccount.equals(AccountDeletedInformatiom))
		{
			logger.info("Account Delete Inforamtion is  ----- Visibale");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Account Delete Inforamtion is  ----- Not Visibale");
			capturedScreenShot(driver,"verfiyRegisrion");
			Assert.assertTrue(false);
		}
	
		inforamtion.ClickonContinue();
		logger.info("Continuee button on Account Delete");
		
	

	}
	
	
	
	
	@Test (priority=1)
	public void verifyLogin() throws IOException, InterruptedException
	
	{
		Thread.sleep(5000);
		logger.info("Verify Login test executuion Start.............");
		
//		Index Page
		IndexPage pg = new IndexPage(driver);
		
		Thread.sleep(5000);
		
		String title = pg.Gettittle();
		
		if (title.equals(HomeTitle))
		{
			logger.info("Home page Tittle is visible successfully");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Home page Tittle is Not visible ");
			capturedScreenShot(driver, "verifyLogin");
			Assert.assertTrue(false);
		}
		
		
		pg.ClickonMySingup();
		logger.info("Cilck on MySingup");
		
		UserSingUp Us=new UserSingUp (driver);
		String LText = Us.VisableLoginText();
		
		if(LText.equals("Login to your account"))
		{
			logger.info("Login to your account' HeadLine is visible");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Login to your account' HeadLine is Not visible");
			capturedScreenShot(driver, LText);
			Assert.assertTrue(false);
		}
		
		Us.EnterLogEmail("Rakesh.automated@gmail.com");
		logger.info("Enter Email on Login");
		
		Us.EnterLogPassword("Boss@123");
		logger.info("Enter Password on Login");
		
		Us.ClickLogbutton();
		logger.info("Cilck on Login");
		
		
		UserAccount Account = new UserAccount (driver);
		String username = Account.getuserName();
		
		if(username.equals("Rakesh"))
			
		{

			logger.info("Verify Logging -  Passed");
			
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Verify Logging -  Failed");
			capturedScreenShot(driver,"verifyLogin");
			Assert.assertTrue(false);
		}
		
		Account.ClickSingout(); 
		logger.info("Verify LogOut for Login test executuion Finished  .............");

		logger.info("                                                                     ");
		
		Us.clickHome();		
		
	}
	
	
	@Test (priority=2)
	public void verifySinOut() throws IOException, InterruptedException
	
	{
		
		Thread.sleep(10000);
	
		String Title = "Automation Exercise - Signup / Login";
				
		logger.info("Verify SinOut test executuion Start.............");
		
//		Index Page
		IndexPage pg = new IndexPage(driver);
		
		Thread.sleep(8000);
          String title = pg.Gettittle();
		
		if (title.equals("Automation Exercise"))
		{
			logger.info("Home page Tittle is visible successfully");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Home page Tittle is Not visible ");
			capturedScreenShot(driver, "verifySinOut");
			Assert.assertTrue(false);
		}
		
		
		Thread.sleep(3000);
		pg.ClickonMySingup();
		logger.info("Cilck on MySingup");
		
		UserSingUp Us=new UserSingUp (driver);
         String LText = Us.VisableLoginText();
		
		if(LText.equals("Login to your account"))
		{
			logger.info("Login to your account' HeadLine is visible");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Login to your account' HeadLine is Not visible");
			capturedScreenShot(driver, LText);
			Assert.assertTrue(false);
		}
		
		
		
		
		Us.EnterLogEmail(emailAddress);
		logger.info("Enter Email on Login");
		
		Us.EnterLogPassword(password);
		logger.info("Enter Password on Login");
		
		Us.ClickLogbutton();
		logger.info("Cilck on Login");
		
		
		UserAccount Account = new UserAccount (driver);
		
		Account.ClickSingout();
		
		logger.info("Click SingOut ");
		
	
		
		if(Us.gettittle().equals(Title))
			
			
		{

			logger.info("Verify SingOut -  Passed");
			
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Verify SingOut -  Failed");
			capturedScreenShot(driver,"Verify SingOut");
			Assert.assertTrue(false);
		}
	
		Us.clickHome();	
		
	}
	
	
		
	
@Test(priority=3)	
	public void VerifyInvalidLogin() throws IOException 
	{
		
logger.info("Verify InvalidLogin test executuion Start.............");
		
//		Index Page
		IndexPage pg = new IndexPage(driver);
		
//		Thread.sleep(10000);
		
		 String title = pg.Gettittle();
			
			if (title.equals(HomeTitle))
			{
				logger.info("Home page Tittle is visible successfully");
				Assert.assertTrue(true);
			}
			else
			{
				logger.info("Home page Tittle is Not visible ");
				capturedScreenShot(driver, "title");
				Assert.assertTrue(false);
			}
			
		
		pg.ClickonMySingup();
		logger.info("Cilck on MySingup");
		
		UserSingUp Us=new UserSingUp (driver);
		
		 String LText = Us.VisableLoginText();
			
			if(LText.equals("Login to your account"))
			{
				logger.info("Login to your account' HeadLine is visible");
				Assert.assertTrue(true);
			}
			else
			{
				logger.info("Login to your account' HeadLine is Not visible");
				capturedScreenShot(driver, LText);
				Assert.assertTrue(false);
			}
			
		
		
		
		Us.EnterLogEmail("Rakessh.automated@gmail.com");
		logger.info("Enter Email on Login");
		
		Us.EnterLogPassword("Bosss@123");
		logger.info("Enter Password on Login");
		
		Us.ClickLogbutton();
		logger.info("Cilck on Login");
		
		String msg =	Us.getPrompMessage();
		
		
if(msg.equals("Your email or password is incorrect!"))
			
		{

			logger.info("Verify Prompt Message -  Dispalyed");
			
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Verify Prompt Message-  Not Dispalyed");
			capturedScreenShot(driver,"VerifyInvalidLogin");
			Assert.assertTrue(false);
		}
	
        Us.clickHome();
		
		
	}

@Test(priority=4)

public void Verify_User_Existing_Email() throws IOException, InterruptedException
{
	logger.info("Verify erify_User_Existing_Email test executuion Start.............");
	
//	Index Page
	IndexPage pg = new IndexPage(driver);
	
	Thread.sleep(5000);
	
	 String title = pg.Gettittle();
	 
		
		if (title.equals(HomeTitle))
		{
			logger.info("Home page Tittle is visible successfully");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Home page Tittle is Not visible ");
			capturedScreenShot(driver, "Verify_User_Existing_Email");
			Assert.assertTrue(false);
		}
		
	
	pg.ClickonMySingup();
	logger.info("Cilck on MySingup");
	
	UserSingUp Us=new UserSingUp (driver);
	
	 String Text = Us.VisableSingUpText();
		
		if(Text.equals(SingUpText))
		{
			logger.info("Login to your account' HeadLine is visible");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Login to your account' HeadLine is Not visible");
			capturedScreenShot(driver, Text);
			Assert.assertTrue(false);
		}
		
	
	
		Us.EnterSingupName("Rakesh");
		logger.info("Enter Name on Login");
	Us.EnterSingupEmail("Rakesh.automated@gmail.com");
	logger.info("Enter Email on Login");
	

	
	Us.ClickSingupbutton();
	logger.info("Cilck on Login");
	
	
	
	String ExistEmail =	Us.EmailAlreadyExit();
	
	
if(ExistEmail.equals("Email Address already exist!"))
		
	{

		logger.info("Verify Email Address already exist Prompt Message -  Dispalyed");
		
		Assert.assertTrue(true);
	}
	else
	{
		logger.info("Verify Email Address already exist! Prompt Message-  Not Dispalyed");
		capturedScreenShot(driver,ExistEmail);
		Assert.assertTrue(false);
	}

	
	 
}
}
