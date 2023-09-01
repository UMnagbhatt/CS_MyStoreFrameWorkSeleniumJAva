package com.OpenCart.TestCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OpenCart.PageObject.CheckOut_9;
import com.OpenCart.PageObject.IndexPage;
import com.OpenCart.PageObject.OrderPaced_Congratulation_11;
import com.OpenCart.PageObject.Payment_10;
import com.OpenCart.PageObject.Product_Deatis_7;
import com.OpenCart.PageObject.Productpage;
import com.OpenCart.PageObject.UserAccount;
import com.OpenCart.PageObject.UserSingUp;
import com.OpenCart.PageObject.View_Cart_8;

public class SerachProduct extends Base
{

	@Test(enabled=false)
	
	public void VeriySearchProduct() throws IOException
	{
		
		String SearchKey = "Jeans";
logger.info("Verify Login test executuion Start.............");
		
//		Index Page
		IndexPage pg = new IndexPage(driver);
		pg.ClickonMySingup();
		logger.info("Cilck on MySingup");
		
		UserSingUp Us=new UserSingUp (driver);
		
		Us.EnterLogEmail(emailAddress);
		logger.info("Enter Email on Login");
		
		Us.EnterLogPassword(password);
		logger.info("Enter Password on Login");
		
		Us.ClickLogbutton();
		logger.info("Cilck on Login");
		UserAccount uA=new UserAccount(driver);
		
		uA.ClickProducts();
		logger.info("Cilck Product link on UserAccount");
		
		Productpage product = new Productpage(driver);
		product.EnterserachProduct(SearchKey);
		logger.info("Search  Product  on ProductPage");
		
		product.ClickBtn();
		logger.info("Click SearchProduct button  on ProductPage");
		
		String Searchprodcuts = product.getProductName();
		
		
		if(Searchprodcuts.contains(SearchKey))
		{
			logger.info("Search Product testcase - Passed"); 
			Assert.assertTrue(true);

			
		}
		else
			
		{
			logger.info("Search Product testcase - Failed");
			capturedScreenShot(driver,"VerifySearchProduct");
			Assert.assertTrue(false);
		}
		
		product.ClickSingout();
		
		
		logger.info("***************TestCase Search Product ends*****************"); 
	}
	
	@Test
	public void AddViewCart() throws IOException, InterruptedException
	{
		
		String SearchKey = "Stretch Jeans";
		String ConGratulationMessage = "Congratulations! Your order has been confirmed!";
logger.info("Verify Login test executuion Start.............");
		
//		Index Page
		IndexPage pg = new IndexPage(driver);
		pg.ClickonMySingup();
		logger.info("Cilck on MySingup");
		
		UserSingUp Us=new UserSingUp (driver);
		
		Us.EnterLogEmail(emailAddress);
		logger.info("Enter Email on Login");
		
		Us.EnterLogPassword(password);
		logger.info("Enter Password on Login");
		
		Us.ClickLogbutton();
		logger.info("Cilck on Login");
		
		Thread.sleep(5000);
		UserAccount uA=new UserAccount(driver);
		
		uA.ClickProducts();
		logger.info("Cilck Product link on UserAccount");
		
		Productpage product = new Productpage(driver);
		product.EnterserachProduct(SearchKey);
		logger.info("Search  Product  on ProductPage");
		
		product.ClickBtn();
		logger.info("Click SearchProduct button  on ProductPage");
		
		
		product.ClickonVeiwProduct();
		logger.info("Click VeiwProduct button  on ProductPage");
		
		Product_Deatis_7 PD = new Product_Deatis_7(driver);
		
		PD.EnterQuanitiy("2");
		logger.info("Enter Quanitity on Product Deatis");
		
		PD.ClickAddCart();
		logger.info("Click AddCart button  on ProductDetils");
		
		PD.ClickViewCart();
		logger.info("Click ViewCartlink button  on ProductDetils");
		
		
		View_Cart_8 viewC = new View_Cart_8(driver);
		
		viewC.ClickCheckout();


		
		CheckOut_9 Checkout = new CheckOut_9(driver);
		
		Checkout.ClickPlaceOrder();
		
		logger.info("Click Place Order button  on CheckOut");
		
		
		Payment_10 payment = new Payment_10 (driver);
		payment.EnterCardNAme("test");
		
		payment.EnterCardNumber("4242420100058007");
		payment.EnterCardCVC("123");
		payment.EnterCardEXEMonth("12");
		payment.EnterCardEXEYear("2029");
		payment.ClickonCardPayBtn();
		
		logger.info("Click On PayBtn After Of Paymnet Details");
		
		
		OrderPaced_Congratulation_11 Congratulation = new OrderPaced_Congratulation_11(driver);
		
		String CongoMessge = Congratulation.DisplayrdCongratiulationMessage();
		
		if(CongoMessge.equals(ConGratulationMessage))
		{
			logger.info("CongoMessge is displayed ---- Passed"); 
			Assert.assertTrue(true);

			
		}
		else
			
		{
			logger.info("CongoMessge is Notdisplayed - Failed");
			capturedScreenShot(driver,"VerifySearchProduct");
			Assert.assertTrue(false);
		}
	}
	
	
}
