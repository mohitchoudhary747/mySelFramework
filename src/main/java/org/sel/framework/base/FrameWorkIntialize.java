package org.sel.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameWorkIntialize extends BasePage{
	
	public static void intializeBrowser(BrowserType type)
	{
		
	WebDriver driver=null;
	
	switch (type) {
	case chrome:
		WebDriverManager.chromedriver().setup();;
		driver=new ChromeDriver();
		break;
	case firefox:
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	
	default:
		WebDriverManager.chromedriver().setup();;
		driver=new ChromeDriver();
		break;
	}
		
	
   driver.manage().window().maximize();
	
	//Setting Up Main Driver
	DriverContext.setDriver(driver);
	//Setting Up Browser
	DriverContext.browser=new Browser(driver);
	
	
	}
	
}
