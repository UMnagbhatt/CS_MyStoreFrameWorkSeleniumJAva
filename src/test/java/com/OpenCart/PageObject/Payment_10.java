package com.OpenCart.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_10 

{
   
	
static WebDriver ldriver;
	
	public Payment_10(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//*[@name='name_on_card']")
	WebElement CarDName;
	
	@FindBy(xpath="//*[@name='card_number']")
	WebElement CardNumber;
	
	@FindBy(xpath="//*[@name='cvc']")
	WebElement CardCVC;
	
	@FindBy(xpath="//*[@name='expiry_month']")
	WebElement CardEXEMonth;
	
	@FindBy(xpath="//*[@name='expiry_year']")
	WebElement CardEXEYear;
	
	
	@FindBy(xpath="//*[@id='submit']")
	WebElement CardPayBtn;
	
	
	
	
	public void EnterCardNAme (String CNmae)
	{
		CarDName.sendKeys(CNmae);
	}
	
	public void EnterCardNumber(String CNumber)
	{
		CardNumber.sendKeys(CNumber);
	}
	
	public void EnterCardCVC(String CVCNuM)
	{
		CardCVC.sendKeys(CVCNuM);
	}
	
	public void EnterCardEXEMonth (String Month)
	{
		CardEXEMonth.sendKeys(Month);
	}
	
	public void EnterCardEXEYear (String Year)
	{
		CardEXEYear.sendKeys(Year);
	}
	
	public void ClickonCardPayBtn ()
	{
		CardPayBtn.click();
	}
	
}
