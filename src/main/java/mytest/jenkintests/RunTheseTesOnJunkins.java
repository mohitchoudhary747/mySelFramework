package mytest.jenkintests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunTheseTesOnJunkins {
	
	WebDriver driver=null;
	WebDriverWait _wait=null;
	@BeforeClass
	public void setUp() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		_wait=new WebDriverWait(driver, Duration.ofSeconds(30000));
	}
	@AfterClass
	public void tearDown() throws Exception {
		if(!(driver==null))
		{
			driver.quit();
			
		}
	}
	
	@Test(priority = 1, description = "This test will search mohit in google.com")
	public void searchAnItem() throws InterruptedException
	{
		driver.get("https://www.google.co.in/");
		By searchBox=new By.ByXPath("//input[@title=\"Search\"]");
		_wait.until(ExpectedConditions.presenceOfElementLocated(searchBox));
		driver.findElement(searchBox).sendKeys("wwe");
		Thread.sleep(10000);
		
	}

}
