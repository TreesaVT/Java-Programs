package facebooktest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import facebooksource.Loginpage;

public class Testcase1_LoginToFacebook 
{
	@Test
	public void validcredentials() 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Loginpage loginpage=new Loginpage(driver);
		loginpage.un();
		loginpage.pwd();
		loginpage.login();
		
	}

}
