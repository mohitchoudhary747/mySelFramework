package org.sel.framework.reporting;

import org.sel.framework.base.BasePage;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager extends BasePage {
	
	
	  public static ExtentReports extentReports=null; // public
//	  public static ExtentTest extentTest=null;
	  
	  public  static  synchronized ExtentReports createExtentReports() {
		  extentReports=new ExtentReports();
		  String reportPath="./ExtentReports/index.html";
		  ExtentSparkReporter spark=new ExtentSparkReporter(reportPath);
			spark.config().setTheme(Theme.DARK);
			spark.config().setDocumentTitle("Mohit Report");;
			extentReports.attachReporter(spark);
			return extentReports; 
	  }
	  /**
	   * 
	   * @param testName
	   * @param testDescription
	   * @return newly created ExtentTest instance to log and other test steps info
	   */
	  public static synchronized ExtentTest startTest(String testName, String testDescription)
	  {
		 return extentReports.createTest(testName, testDescription);
	  }
	  
	  public static synchronized void publishExtentReport() {
		extentReports.flush();

	}

	 
}
