package org.sel.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTests {
	
	
	@DataProvider(name="provider")
	public Object[][] getData()
	{
		Object[][] obj= new Object[][] {{"Mohit","Coudhary"},{"Yukti","Choudary"}};
		return obj;
		
	}
	@Test(dataProvider = "provider")
	public void runTestMultipleTime(String firstName, String lastName){
		System.out.println("First Name "+firstName+ " Last Name "+lastName);
		
	}
	

}
