package mytest.conceptTests;

import org.sel.framework.base.BaseTest;
import org.sel.framework.base.DriverContext;
import org.sel.framework.reporting.ExtentManager;
import org.sel.framework.utilities.CaptureScreenShot;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

public class ExtentReportsTest extends BaseTest {
	
	
	
	
	@Test
	public void firstTest()
	{
		System.out.println("Running First Test");
		extentTest=ExtentManager.startTest("First Test", "Will chekc if this is my first test");
		extentTest.assignAuthor("Mohit Author").assignCategory("Sanity").assignDevice("chrome");
		extentTest.pass("I am failing this test");
		extentTest.log(Status.SKIP, "Skipping the first line of code..");
		extentTest.log(Status.PASS,"Passing this test");
		extentTest.fail("Failing...");
		ExtentTest node = extentTest.createNode("Node");
		DriverContext.driver.get("https://www.google.com/");
		extentTest.log(Status.INFO, "Naviagted to https://www.google.com/");
		node.log(Status.WARNING, "Created a Node");
		extentTest.log(Status.INFO, "This is added after a node..");
		extentTest.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromBase64String(CaptureScreenShot.takeScreenShotAsBase64(DriverContext.driver)).build());
		Assert.assertTrue(true);
	}
	
	@Test 
	public void secondTest() {
		extentTest=ExtentManager.startTest("Second Test", "Check 2nd Test");
		DriverContext.driver.get("https://www.extentreports.com/docs/v5/wiki/spark/anchor1.png");
		System.out.println("Running Second Test");
		extentTest.assignAuthor("Mohit Author").assignCategory("Sanity").
		assignCategory("CMP").assignDevice("firefox");
		extentTest.pass("I am passing this test"); 
		extentTest.log(Status.SKIP, "Skipping the first line of code..");
		extentTest.log(Status.PASS,"Passing this test"); //
		extentTest.pass("Passing..."); // ExtentTest node =
		extentTest.createNode("Node"); // node.log(Status.WARNING, "Created a Node");
		// extentTest.log(Status.INFO, "This is added after a node..");
		extentTest.log(Status.FAIL,
				MediaEntityBuilder.createScreenCaptureFromBase64String(CaptureScreenShot.
						takeScreenShotAsBase64(DriverContext.driver), "Failed Image").build());
		extentTest.info("s"); Assert.assertTrue(true); 
	}
	 

}
