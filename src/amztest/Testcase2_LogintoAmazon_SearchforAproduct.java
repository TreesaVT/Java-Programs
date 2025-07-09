package amztest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import amzsource.HomePage;
import amzsource.LoginPage;

public class Testcase2_LogintoAmazon_SearchforAproduct 
{
	@Test
	public void validcredentials_searchingproduct() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		
		HomePage home=new HomePage(driver);
		home.acntndlst(driver);
		home.signin();
		
		LoginPage login=new LoginPage(driver);
		login.un();
		login.cont();
		login.pwd();
		login.signin();
		
		home.search();
		
		
	}

}
