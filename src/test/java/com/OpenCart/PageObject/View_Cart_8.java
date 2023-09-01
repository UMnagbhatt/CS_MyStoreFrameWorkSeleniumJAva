package com.OpenCart.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class View_Cart_8 
{
 
	
		 
		static WebDriver ldriver;
		
		public View_Cart_8(WebDriver rdriver)
		{
			ldriver = rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		@FindBy(xpath="//*[text()='Proceed To Checkout']")
		WebElement Checkout ;
		
		@FindBy(xpath="//*[@class='cart_quantity_delete']")
		WebElement CartDelete ;
		
		
		@FindBy(xpath="//*[text()='Soft Stretch Jeans']")
		WebElement DescrpitionLink ;
		
		
		
		
		public void ClickCheckout()
		{
			Checkout.click(); 
		}
		
		public void ClickonCartDeleteBtn()
		{
			CartDelete.click();
		}
		
		public void ClickonDescritionLink()
		{
			
			DescrpitionLink.click();
		}
}

