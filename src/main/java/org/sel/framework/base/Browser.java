package org.sel.framework.base;

import org.openqa.selenium.WebDriver;

public class Browser {
	
	private WebDriver localDriver;
	public Browser(WebDriver driver) {
		this.localDriver=driver;
	}

}
