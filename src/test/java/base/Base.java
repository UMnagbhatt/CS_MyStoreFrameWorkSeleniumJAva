package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

//	Create Global Property
	public Properties prop;

// Intialized Browser

	public WebDriver openbrowser(String browserName) {

		// Set a DATA Propertis
		prop = new Properties();
		File propFile = new File("src\\test\\resources\\Data.properties");

		try {
			FileInputStream fis = new FileInputStream(propFile);
			prop.load(fis);

		} catch (Throwable e)

		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebDriver driver = null;

//		   Browser

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge"))

		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		
		
		
//		 Maximaize Browser
		driver.manage().window().maximize();

// Global Wait for All Web element		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		
		driver.get(prop.getProperty("url"));
		return driver;

	}

}
