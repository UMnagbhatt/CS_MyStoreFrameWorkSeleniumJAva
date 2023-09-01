package com.OpenCart.PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage 
{
  

	static WebDriver ldriver;
	
	public Productpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@id='search_product']")
	WebElement Searchproduct;
	
	@FindBy(id="submit_search")
	WebElement SubitBtn;
	
	@FindBy(xpath="//p[contains(text(), 'Jeans')]" )
	WebElement Text;
	
	@FindBy(xpath="//*[text()='View Product']" )
	WebElement ViewProduct;
	
	@FindBy(xpath="//*[text()=' Logout']")
	WebElement Logoff;
	
	
	
	
	public void EnterserachProduct(String SearchKey)
	{
		Searchproduct.sendKeys(SearchKey);
	}
	
	
	
	public void ClickBtn()
	{
		SubitBtn.click();
	}
	
	public String getProductName()
	{
		
		
		return (Text.getText());
	}
	
	
	public void ClickonVeiwProduct()
	{
		 ViewProduct.click();;
	}
	
	public void ClickSingout()
	{
		Logoff.click();
	}
	
}
