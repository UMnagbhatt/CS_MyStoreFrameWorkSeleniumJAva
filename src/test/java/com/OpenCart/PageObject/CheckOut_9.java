package com.OpenCart.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut_9 
{
	static WebDriver ldriver;
	
	public CheckOut_9(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//*[@name='message']")
	WebElement MessageText;
	
	@FindBy(xpath="//*[text()='Place Order']")
	WebElement PlaceOrder;
	
	
	public void EnterTextMessage(String Text)
	
	{
		MessageText.sendKeys(Text);
		
	}

	
	public void ClickPlaceOrder()
	{
		PlaceOrder.click();
		
	}
}
