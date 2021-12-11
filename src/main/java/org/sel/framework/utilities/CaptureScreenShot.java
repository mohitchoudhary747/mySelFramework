package org.sel.framework.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenShot {

	
	/***
	 * 
	 * @param localDriver
	 * @param fileNamePath
	 * @return screenshot path with fullName.png of the captured Screenshot
	 * @throws IOException  if source or destination is invalid
	 * @see #takeScreenShot(File, File, boolean)
	 */
	public static String takeScreenShot(WebDriver localDriver, String fileNamePath) throws IOException
	{
		File destFile=new File(fileNamePath);
		TakesScreenshot ss=(TakesScreenshot)localDriver;
		File srcFile=ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, destFile);
		return fileNamePath;
		
	}
	
	public static String takeScreenShotAsBase64(WebDriver localDriver)
	{
		return ((TakesScreenshot)localDriver).getScreenshotAs(OutputType.BASE64);
	}
		
	
}
