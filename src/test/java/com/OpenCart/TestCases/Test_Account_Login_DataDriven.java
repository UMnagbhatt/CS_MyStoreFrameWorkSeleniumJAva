package com.OpenCart.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.OpenCart.PageObject.IndexPage;
import com.OpenCart.PageObject.UserAccount;
import com.OpenCart.PageObject.UserSingUp;
import com.OpenCart.Utilities.ReadExcelFile;


//-------------------------------------------------------- Data Driven Provider ------------------------------------

public class Test_Account_Login_DataDriven extends Base
{
	
	
	@Test (dataProvider = "LoginDataProvider",enabled=false)
	public void verifyLogin1(String userEmail, String userPass , String expectedUsername) throws IOException
	
	{
		logger.info("Verify Login test executuion Start.............");
		
//		Index Page
		IndexPage pg = new IndexPage(driver);
		pg.ClickonMySingup();
		logger.info("Cilck on MySingup");
		
		UserSingUp Us=new UserSingUp (driver);
		
		Us.EnterLogEmail(userEmail);
		logger.info("Enter Email on Login");
		
		Us.EnterLogPassword(userPass);
		logger.info("Enter Password on Login");
		
		Us.ClickLogbutton();
		logger.info("Cilck on Login");
		
		
		UserAccount Account = new UserAccount (driver);
		String username = Account.getuserName();
		
		if(username.equals(expectedUsername))
			
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
		logger.info("Singout");
				
		
	}
	
	@DataProvider(name="LoginDataProvider")
	public String [][] LoginDataProvider()
	{
//		  System.out.println(System.getProperty("user.dir"));
		String  fileName = System.getProperty("user.dir")+ "\\TestData\\MyStoreData.xlsx";
	
		int ttlrow = ReadExcelFile.getRowCount(fileName, "LoginTestData");
		int ttlcol = ReadExcelFile.getColCount(fileName, "LoginTestData");
		
		
		String data[][] = new String[ttlrow-1][ttlcol];
		
		for (int i=1; i<ttlrow; i++) // row = 1,2
		{
			for (int j=0; j<ttlcol; j++) // col = 0,1,2
			{
				data[i-1][j] = ReadExcelFile.getCellValue(fileName, "LoginTestData", i, j);
			}
		}
		return data;
	}
	
	
	
	
	
	
	
	
	
	
}
