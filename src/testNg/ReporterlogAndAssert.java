package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class ReporterlogAndAssert {
	@Test
	public void logintoAmazon()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Holiday List");
		Reporter.log("Test Completed");
		Assert.assertEquals(false, true);
	}

}
