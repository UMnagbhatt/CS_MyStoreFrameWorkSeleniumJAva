package com.OpenCart.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserAccount 
{

	

	static WebDriver ldriver;
	
	public UserAccount(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a/b")
	WebElement LogAsText;
	
	@FindBy(xpath="//*[text()=' Delete Account']")
	WebElement DeleteAccount;
	
	
	@FindBy(xpath="//*[text()=' Products']")
	WebElement product;
	
	@FindBy(xpath="//*[text()=' Logout']")
	WebElement Logoff;
	
	
	
	
	
	
	public String getuserName()
	{
		String LoggingName = LogAsText.getText();
		
		return LoggingName;
	}
	
	public void ClickDeleteAccount()
	{
		DeleteAccount.click();
	}
	
	public void ClickSingout()
	{
		Logoff.click();
	}
	
	public void ClickProducts()
	{
		product.click();
	}
	
	
	
}
