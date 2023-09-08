package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='txtUserName']")
	private WebElement UsernameAddressFiled;
	
	@FindBy(xpath="//input[@name='txtPassword']")
	private WebElement PasswordAddressField;
	
	@FindBy(xpath="//button[text()='Confirm']")
	private WebElement LoginBTN;
	
	
	

	public void USERNAME(String eamilText)
	{
		UsernameAddressFiled.sendKeys(eamilText);
	}
	
	
	public void Password(String passText)
	{
		PasswordAddressField.sendKeys(passText);
	}
	
	public void LoginButton() 
	
	{
		LoginBTN.click();
	}
	
	
}

