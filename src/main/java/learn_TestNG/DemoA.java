package learn_TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoA {
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][2];
		data[0][0] = "user1";
		data[0][1] = "password1";
		data[1][0] = "user2";
		data[1][1] = "password2";
		return data;
	}
	
	@Test(priority = 1, dataProvider = "getData")
	public void m1(String usr, String pwd)
	{
		System.out.println("m1");
		System.out.println("user:"+usr+"password:"+pwd);
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
