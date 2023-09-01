package com.OpenCart.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserSingUp 
{
	
	static WebDriver ldriver;
	
	public  UserSingUp(WebDriver rdriver)
	{
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver,this);
	}

	
	@FindBy(xpath="//*[text()='New User Signup!']")
	WebElement VisableSinupText ;
	
//	User Singup Element
	@FindBy(name="name")
	WebElement Name;
	
	
	@FindBy(xpath="//form[@action='/signup']/input[@name='email']")
	WebElement Email  ;
	
	
	@FindBy(xpath ="//button[text()='Signup']" )
	WebElement SingUpButton;
	
	@FindBy(xpath ="//*[text()='Email Address already exist!']" )
	WebElement PrompMsgSingup;
	
//	String message = driver.findElement(By.name("usrname")).getAttribute("validationMessage"); 
	
	@FindBy(xpath = "//form/p[text()='Email Address already exist!']")
	WebElement EmailExist;
	
	
//	 User Login Eelement
	
	@FindBy(xpath="//*[text()='Login to your account']")
	WebElement VisableLoginText ;
	
	@FindBy(xpath="//form[@action='/login']/input[@name='email']")
	WebElement LoginEmail;
	
	@FindBy(name="password")
	WebElement LoginPWd;
	
	
	@FindBy(xpath ="//button[text()='Login']" )
	WebElement LoginButton;
	
	
	@FindBy(xpath="//p[text()='Your email or password is incorrect!']")
	WebElement Promp;
	
	@FindBy(xpath = "//*[text()=' Home']")
	WebElement HomeClick;
	
	
//	 User Singup Method
	
	public String VisableSingUpText()
	{
		String Text=VisableSinupText.getText();
		
		return Text;
	}
	
	
	public void EnterSingupName(String name)
	{
		Name.sendKeys(name);
	}
	
	
	public void EnterSingupEmail(String email)
	{
		Email.sendKeys(email);
	}
	
	public void ClickSingupbutton()
	{
		SingUpButton.click();
	}
	
	
	public String getSingupPrompMessage()
	{
	String SingPromp =	PrompMsgSingup.getText();
		return SingPromp;
	}
	
	
//	 User Login Method
	public void EnterLogEmail(String mail)
	{
		LoginEmail.sendKeys(mail);
	}
	
	
	public void EnterLogPassword(String Pass)
	{
		LoginPWd.sendKeys(Pass);
	}
	
	
	
	public void ClickLogbutton()
	{
		LoginButton.click();
	}
	
	public String VisableLoginText()
	{
		String LText=VisableLoginText.getText();
		
		return LText;
	}
	
	
	public String getPrompMessage()
	{
	String msg =	Promp.getText();
		return msg;
	}
	
	
	public String gettittle()
	{
		return(ldriver.getTitle());
	}
	
	public void clickHome()
	{
		HomeClick.click();
	}
	
	
	public String EmailAlreadyExit()
	{
		String ExistEmail = EmailExist.getText();
		return ExistEmail;
	}
	
}
