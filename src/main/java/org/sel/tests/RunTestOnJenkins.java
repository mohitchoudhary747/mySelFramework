package org.sel.tests;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.sel.framework.base.BaseTest;
import org.testng.annotations.Test;

public class RunTestOnJenkins extends BaseTest {
	
	
	
	@Test(priority=0, description = "This test will create a extent rpoer and should attach the screen shot to it")
	public void searchGoogle(Method method) throws IOException
	{
		/*
		 * ExtentTest test=ExtentTestManager.startTest(method.getName(),
		 * "Valid Serach Google.com"); test.log(Status.PASS, "Created a test...");
		 * DriverContext.driver.navigate().to("https://www.google.com");
		 * test.log(Status.PASS, "Created a test...");
		 * Reporter.log("testMyCodeOne has been run, i am inside the test method",true);
		 * Assert.assertTrue(true); Reporter.log(System.getProperty("user.dir"),true);
		 * String
		 * destPath=System.getProperty("user.dir")+"/ExtentReports/"+getTimeStamp()+
		 * "/myTest.png"; String path=
		 * CaptureScreenShot.takeScreenShot(DriverContext.driver, destPath);
		 */
	}
	
	
	@Test(priority=1, description = "This test will create a extent rpoer and should attach the screen shot to it")
	public void javaTPoint(Method method) throws IOException
	{
		/*
		 * // ExtentTest test=ExtentTestManager.startTest(method.getName(),
		 * "Naviage to Java T Point"); test.log(Status.PASS, "Created a test...");
		 * DriverContext.driver.navigate().to(
		 * "https://www.javatpoint.com/testng-listeners"); test.log(Status.PASS,
		 * "Naviaged to https://www.javatpoint.com/testng-listeners");
		 * 
		 * Assert.assertTrue(true); Reporter.log(System.getProperty("user.dir"),true);
		 * String
		 * destPath=System.getProperty("user.dir")+"/ExtentReports/"+getTimeStamp()+
		 * "/myTest.png"; CaptureScreenShot.takeScreenShot(DriverContext.driver,
		 * destPath);
		 */
	}
	
	public String getTimeStamp()
	{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy_h_m_a");
		String d=LocalDateTime.now().format(formatter);
		return d;
//		Output 10102021_12_55_am
		// Check how this is being displayed in eclipse
	}
	
	


}
