package org.sel.framework.listners;

import java.io.IOException;

import org.sel.framework.base.DriverContext;
import org.sel.framework.utilities.CaptureScreenShot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listner implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Starting Test.. "+result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		try {
			CaptureScreenShot.takeScreenShot(DriverContext.driver, System.getProperty("user.dir")+"/myframework/ExtentReports/test.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		ExtentTestManager.getTest().pass("Test Failed", MediaEntityBuilder.createScreenCaptureFromBase64String(CaptureScreenShot.takeScreenShotAsBase64(DriverContext.driver)));
//				ExtentTestManager.getTest() .add .addScreenCaptureFromBase64String(CaptureScreenShot.takeScreenShotAsBase64(DriverContext.driver)).getModel().getMedia().get(0));
////		ExtentTestManager.getTest().addScreenCaptureFromBase64String(base64)
////		.pass("Base64 event", MediaEntityBuilder.createScreenCaptureFromBase64String(base64).build());
//		ExtentTestManager.extent.flush();
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
