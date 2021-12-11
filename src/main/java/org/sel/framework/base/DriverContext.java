package org.sel.framework.base;

import org.openqa.selenium.WebDriver;
import org.sel.framework.reporting.ExtentManager;

public class DriverContext {

	public static WebDriver driver;
	public static Browser browser;
	public static ExtentManager extent;
	
	public static void setDriver(WebDriver localDriver)
	{
		driver=localDriver;
	}
	
}
