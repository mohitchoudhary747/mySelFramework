package org.sel.framework.base;

import org.sel.framework.reporting.ExtentManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentTest;

public class BaseTest extends FrameWorkIntialize{
	
	public ExtentTest extentTest;
	@BeforeSuite
	public void	setUpSuite(){
		ExtentManager.createExtentReports();
		
	}
	@AfterSuite
	public void tearDownSuite()
	{
		ExtentManager.publishExtentReport();
		
	}

	@BeforeMethod()
	public void setUpBrowser()
	{
		intializeBrowser(BrowserType.chrome);
	}
	@AfterMethod
	public void cleanUp()
	{
		if(!(DriverContext.driver==null))
		{
			DriverContext.driver.quit();
		}
	}
}
