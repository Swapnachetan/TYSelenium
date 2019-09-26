package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import learn_TestNG.Base;

public class actiTimeloginpage extends Base
{
	@FindBy(id="username") private WebElement txt_usrname;
	@FindBy(name = "pwd") private WebElement password;
	@FindBy(id = "loginButton") private WebElement login;
	@FindBy(xpath = "//a[@id='loginButton']//div[contains(text(),'Login')]") private WebElement error;

	public void userName(String name)
	{
		txt_usrname.sendKeys("admin");
	}
	
	public void password(String pwd)
	{
		password.sendKeys("manager");
	}
	
	public void login()
	{
		login.click();
	}
	
}

