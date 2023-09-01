package com.OpenCart.PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage
{
public static WebDriver ldriver;

// static WebDriver driver;


  


  
  public RegisterPage(WebDriver rdriver)
  {
  
  ldriver = rdriver;
  
  PageFactory.initElements(rdriver, this);
  }

  
  @FindBy(xpath="//*[@id=\"form\"]/div/div/div/div[1]/h2/b")
  WebElement AccountVisableText;
 
  @FindBy(id ="id_gender1")
  WebElement tittleMr;

  @FindBy(id="password")
  WebElement Password;
  
  @FindBy(xpath="//*[@id='days']")
  WebElement Days;
  
  @FindBy(xpath="//*[@id='months']")
  WebElement Monts;
  
  
  @FindBy(xpath="//*[@id='years']")
  WebElement Years;
  
  
  @FindBy(xpath="//*[@id='newsletter']")
  WebElement NewsLetter;
  
  @FindBy(xpath="//*[@id='optin']")
  WebElement Recived;
  
 
  
  
  
  @FindBy(id="first_name")
  WebElement FirstNmae;
  
  @FindBy(id="last_name")
  WebElement LastNmae;
  
  @FindBy(xpath="//*[@id='company']")
  WebElement CompanyName;
  


  @FindBy(id="address1")
  WebElement Address1;
  
  
  @FindBy(xpath="//*[@id='address2']")
  WebElement Address2;
  
  @FindBy(id="country")
  WebElement CountryName;
  
  
  @FindBy(id="state")
  WebElement State;
  

  @FindBy(id="city")
  WebElement City;
  
  
  @FindBy(id="zipcode")
  WebElement ZipCode;
  
  
  @FindBy(id="mobile_number")
  WebElement Mnumber;
  
  @FindBy(xpath="//*[text()='Create Account']")
  WebElement CreateAccountSubmit;
  
  
  public String VisableAccountInformationText()
	{
		String informationAcccount=AccountVisableText.getText();
		
		return informationAcccount;
	}
  
  
  
  public void ClickMr()
  {
	  tittleMr.click();
  }

 
 
  
  public void EnterPassword(String pass)
  {
	  Password.sendKeys(pass);
  }
  
  
  
  
  public void SelectDays(String d)
  {
	  Select day = new Select(Days);
	  day.selectByVisibleText(d);  
  }
  
  public void SelectMonts(String m)
  {
	  Select month = new Select(Monts);
	  month.selectByVisibleText(m);  
  }
  
  public void SelectYears(String y)
  {
	  Select year = new Select(Years);
	  year.selectByVisibleText(y);  
  }
  
  
  public void NewsletterCheckIn()
  {
	  NewsLetter.click();
  }
  
  public void RecivedCheckIn()
  {
	  Recived.click(); 
  }
  
  
  public void EnterFirstName(String Fname)
  {
	  FirstNmae.sendKeys(Fname);
  }
  
  
  public void EnterLastName(String Lname)
  {
	  LastNmae.sendKeys(Lname);
  }
  
  public void EnterComapnyName(String CNmae)
  {
	  CompanyName.sendKeys(CNmae);
  }
  
  

  
  
  
  
  
  public void EnterAddress1(String Add1)
  {
	  Address1.sendKeys(Add1);
  }
  
  public void EnterAddress2(String Add2)
  {
	  Address2.sendKeys(Add2);
  }
  
  
  public void EnterCountry(String text)
  {
	  Select obj= new Select(CountryName);
	  obj.selectByVisibleText(text);
	
  }
  
  
  public void EnterSate(String state)
  {
	  State.sendKeys(state);
  }
  

  public void EnterCity(String city)
  {
	  City.sendKeys(city);
  }
  
  
  public void EnterZip(String zip)
  {
	  ZipCode.sendKeys(zip);
  }
  

  public void EnterMobileNumber(String NUMber)
  {
	  Mnumber.sendKeys(NUMber);
  }
  
  
  public void ClickonCreateAxxount()
  {
	  CreateAccountSubmit.click();
  }
  
  
}
