package com.OpenCart.PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Product_Deatis_7 
{
 
	static WebDriver ldriver;
	
	public Product_Deatis_7(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@id='quantity']")
	WebElement Quantity ;
	
	@FindBy(xpath="//button[@class='btn btn-default cart']")
	WebElement AddCart ;
	
	
	@FindBy(xpath="//*[text()='View Cart']")
	WebElement View ;
	
	
	
	public void EnterQuanitiy(String value)
	{
		Quantity.clear();
		Quantity.sendKeys(value);
	}
	
	public void ClickAddCart()
	{
		AddCart.click();
	}
	
	  public void ClickViewCart()
	{
		
		  View.click();
	}
	
	
}
