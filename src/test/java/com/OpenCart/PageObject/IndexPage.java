package com.OpenCart.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage 
{

//Create Object  of Webdriver	
	
	WebDriver ldriver;
	
	public IndexPage(WebDriver rdriver)
	{
		ldriver =  rdriver;
		PageFactory.initElements(rdriver, this);
		
		
	}
	

	@FindBy(xpath="//*[text()=' Signup / Login']")
	WebElement Sinup ;
	
	@FindBy(xpath="//*[text()=' Contact us']")
	WebElement ContentUSLink;
	
	
	@FindBy(xpath="//*[text()=' Test Cases']")
	WebElement TestCaseLink;

	
	
	
//	Identify action  on Webelement
	
	public void ClickonMySingup()
	{
		Sinup.click();
	}
	

	public String Gettittle()
	{
		String title = ldriver.getTitle();
		
		return title;
	}
	
	public void ClickContactUsLink()
	{
		ContentUSLink.click();
	}
	
	
	public void ClickTestCaseLink()
	{
		TestCaseLink.click();
	}
	
	
	
	
}
