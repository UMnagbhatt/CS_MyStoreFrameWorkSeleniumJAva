package com.OpenCart.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account_Created
{

	static WebDriver ldriver;
	
	public Account_Created(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//b[text()='Account Created!']")
	WebElement Text;
	
	
	@FindBy(xpath="//a[text()='Continue']")
	WebElement ContinueBtn;
	
	
	
	public String  VisbaleText()
	{
		String text =	Text.getText();
		return text;
	}
	
	public void ClickCtnBtn()
	{
		ContinueBtn.click();
	}
	
	
	
}
