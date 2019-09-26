package learn_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoB extends Base {

	@Test(enabled = false)
	public void m1()
	{
		System.out.println("m1");
	}
	
	@Test(invocationCount = 2)
	public void m2()
	{
		System.out.println("m2"); 
	}
	
	@Test
	public void m3()
	{
		System.out.println("m3");
		Assert.fail();		
	}
	
	@Test(dependsOnMethods = "m3")
	public void m4()
	{
		System.out.println("m4");		
	}

	@Test(priority = 0)
	public void m5()
	{
		System.out.println("m5");
	}
}
