package org.sel.framework.base;

import org.openqa.selenium.support.PageFactory;

public class Base {
	
	public <TPage extends BasePage> TPage GetInstance(Class<TPage> page)
	{
		Object obj=PageFactory.initElements(DriverContext.driver, page);
		return page.cast(obj);
	}

}
