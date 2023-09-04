package com.OpenCart.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCases 
{ 
	static WebDriver ldriver;
	public TestCases(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this );
		
	}
	
	@FindBy(xpath="//*[text()='Test Cases']")
	WebElement VisibaleTestCase;
	
	
	
	public String VisableTestcaseText()
	{
		String TextTestCase = VisibaleTestCase.getText();
		return TextTestCase;
	}

}
