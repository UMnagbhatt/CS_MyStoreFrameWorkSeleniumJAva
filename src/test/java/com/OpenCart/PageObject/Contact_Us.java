package com.OpenCart.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class Contact_Us 
{
	static WebDriver ldriver;
	
	public Contact_Us(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="//*[text()='Get In Touch']")
	WebElement VisableText;
	
	@FindBy(name ="name")
	WebElement NameOfContactUs;
	
	@FindBy(name ="email")
	WebElement EmailOfContactUs;
	
	
	@FindBy(name ="subject")
	WebElement SubjectOfContactUs;
	
	@FindBy(name ="message")
	WebElement MessageOfContactUs;
	
	@FindBy(name ="submit")
	WebElement SubmitOfContactUs;
	
	@FindBy(xpath="//div[@class='status alert alert-success']")
	WebElement AlertSucess;
	
	@FindBy(xpath="//a[@class='btn btn-success']")
	WebElement Home;
	
	
	public String GetTouchVisable()
	{
		String TochVisabel = VisableText.getText();
		return TochVisabel;
	}
 
	public void ContantUsName(String cNmae)
	{
		NameOfContactUs.sendKeys(cNmae);
	}
	
	public void ContantUsEmail(String cEmail)
	{
		EmailOfContactUs.sendKeys(cEmail);
	}
	
	public void ContantUsSubject(String cSub)
	{
		SubjectOfContactUs.sendKeys(cSub);
	}
	
	
	public void ContantUsMessage(String cMessgae)
	{
		MessageOfContactUs.sendKeys(cMessgae);
	}
	
	public void ContantUsButton()
	{
		SubmitOfContactUs.click();
	}
	
	public void Alert()
	
	{
		ldriver.switchTo().alert().accept();
		
	}
	
	public void ContantUsHomeButton()
	{
		Home.click();
	}
	
	
	public String SucessAlert()
	{
		String alert = AlertSucess.getText();
		return alert;
	}
	
}
