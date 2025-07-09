package testNgRetry;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase 
{
	@Test(retryAnalyzer=RetryLogic.class)
	public void logintoAmazon()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("tre")).sendKeys("Holiday List");//purposfully failing to retry
	}
	

}
