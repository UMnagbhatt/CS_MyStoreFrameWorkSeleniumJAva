package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	
	WebDriver driver;
	
	public Dashboard(WebDriver driver)
	{
		this .driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(linkText="Two Wheeler Insurance")
	private WebElement TwoWheeler;

	
	public boolean VerifyTheDispalyedOfTwoWheeler() 
	{
		
		boolean displayStatus=false;
		try
		{
			displayStatus= TwoWheeler.isDisplayed();
		}catch(Throwable e)
		{
			displayStatus= false;
		}
		return displayStatus;
	}
}
