package test;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Util.DataUtil;
import Util.MyXLSReader;
import base.Base;
import pageobject.Dashboard;
import pageobject.HomePage;
import pageobject.LoginPage;

public class Login extends Base {
	
	WebDriver driver;
	MyXLSReader excelReader;
	
//	@AfterMethod
//	public void teardown()
//	{
//		driver.quit();
//	}
//	
	
	
	@Test(dataProvider="dataSupplier")
	public void logintest(HashMap<String,String> hMap)
	
	{
		if(!DataUtil.isRunnable(excelReader,"LoginTest","TestCases")||hMap.get("RunMode").equals("N"))
			
		{
			throw new SkipException("Run mode is set to N,hence not executed");
		}
		
		driver=openbrowser(hMap.get("Browser"));
		
		HomePage homepage=new HomePage(driver);
		homepage.clickonLogin();
		
		
		LoginPage  Login=new LoginPage(driver);
		Login.USERNAME(hMap.get("UserName"));
		Login.Password(hMap.get("Password"));
		Login.LoginButton();
		
		Dashboard dashboard=new Dashboard(driver);
	
	

		
	
		

		
		
		String expectedResult=hMap.get("ExpectedResult");
		
		boolean expectedConvertResult=false;
		if(expectedResult.equalsIgnoreCase("Success"))
		{
			expectedConvertResult=true;
		}else if(expectedResult.equalsIgnoreCase("Failure"))
		{
			expectedConvertResult=false;
		}
		boolean actualResult= false;
		
			actualResult=dashboard.VerifyTheDispalyedOfTwoWheeler();
	
		Assert.assertEquals(actualResult,expectedConvertResult);
		
	}


		
		@DataProvider
		public Object[][] dataSupplier()
		{
			Object[][] data = null;
//			Object[][] data= {{"inscom","inscom@123"},
//					          {"auto","AUAT#12"},
//					           {"9960487654","1bc1m6Cq"},
//			{"gmcadmin","gmc@dmin"},
//			{"8955022314","jLTGKkoc"}};
//			return data;
			
			try {
			 excelReader=new MyXLSReader("src\\test\\resources\\EfficientLogin.xlsx");
			
			
					data=DataUtil.getTestData(excelReader, "LoginTest", "DATA");
			}catch(Throwable e)
			{
				e.printStackTrace();
			}
			return data;
			
		}
		
	}

