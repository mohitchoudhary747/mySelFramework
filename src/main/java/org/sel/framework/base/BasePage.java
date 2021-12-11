package org.sel.framework.base;

public class BasePage  extends Base{

	
	@SuppressWarnings("unchecked")
	public <TPage extends BasePage> TPage AS (Class<TPage> instancePage)
	{
		try
		{
			return(TPage)this;
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		return null;
	}
}
