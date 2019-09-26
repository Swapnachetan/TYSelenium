package learn_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base {
	
	public WebDriver driver = new ChromeDriver(); ;
	
	static 
	{
		System.setProperty("CHROME_KEY", "CHROME_VALUE");
	}
	
	@BeforeMethod
	public void initialize()
	{
		driver.get("URL");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void logout()
	{
		driver.close();
	}

	@BeforeSuite
	public void bs()
	{
		System.out.println("@BeforeSuite");
	}
	
	@BeforeTest
	public void bt()
	{
		System.out.println("@BeforeTest");
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("@BeforeClass");
	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("@BeforeMethod");
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("@AfterMethod");
	}
	
	@AfterClass
	public void ac()
	{
		System.out.println("@AfterClass");
	}
	
	@AfterTest
	public void at()
	{
		System.out.println("@AfterTest");
	}
	
	@AfterSuite
	public void as()
	{
		System.out.println("@AfterSuite");
	}
	
	
	
}
