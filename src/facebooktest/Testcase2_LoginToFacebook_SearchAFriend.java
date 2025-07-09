package facebooktest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import facebooksource.Homepage;
import facebooksource.Loginpage;

public class Testcase2_LoginToFacebook_SearchAFriend 
{
	@Test
	public void validcredentials() throws InterruptedException
	{
		ChromeOptions obj =new ChromeOptions();
		obj.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(obj);
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		//login
		Loginpage loginpage=new Loginpage(driver);
		loginpage.un();
		loginpage.pwd();
		loginpage.login();
		Thread.sleep(30000);
		
		//searchAfriend
		Homepage homepage=new Homepage(driver);
		homepage.srch();
	}

}
