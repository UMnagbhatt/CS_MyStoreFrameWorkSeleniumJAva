package com.OpenCart.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account_Delete 
{
static WebDriver ldriver;

public Account_Delete(WebDriver rdriver)
{
	ldriver =rdriver;
	
	PageFactory.initElements(rdriver, this);
	
}



@FindBy(xpath="//h2/b")
WebElement AccountDeleteText;


@FindBy(xpath="//*[text()='Continue']")
WebElement CountinueBtn;


//public String  AccountDeleteVisableText()
//{
//	String AccountDeleteInforamtionText =	AccountDeleteText.getText();
//	return AccountDeleteInforamtionText;
//}

public void ClickonContinue()
{
	CountinueBtn.click();
}

public String DeleteAccountInformationText()
	{
		String informationDeleteAcccount=AccountDeleteText.getText();
		
		return informationDeleteAcccount;
	}


}
