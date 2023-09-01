package com.OpenCart.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPaced_Congratulation_11 
{

static WebDriver ldriver;
	
	public OrderPaced_Congratulation_11(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//*[text()='Congratulations! Your order has been confirmed!']")
	WebElement CongMessage;
	
	@FindBy(xpath="//*[text()='Download Invoice']")
	WebElement DownloadInvoice;
	
	@FindBy(xpath="//*[text()='Continue']")
	WebElement Cont;
	
	
	public String DisplayrdCongratiulationMessage()
	{
	String msg =	CongMessage.getText();
		return msg;
	}
	
	public void ClickOnDWNLOADInvoice()
	{
		DownloadInvoice.click();
		
	}
	public void ClickOnContinue()
	{
		Cont.click();
		
	}
	
}
