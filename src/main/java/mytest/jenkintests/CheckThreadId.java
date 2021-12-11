package mytest.jenkintests;


import org.testng.annotations.Test;

public class CheckThreadId {
	
	@Test(priority = 0)
	public void testOne()
	{
		System.out.println("Test 1> "+Thread.currentThread().getId());
	}

	
	@Test(priority = 1)
	public void testTwo()
	{
		System.out.println("Test 2: "+Thread.currentThread().getId());
	}
}
