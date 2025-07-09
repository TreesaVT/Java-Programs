package testNgAnnotationsBMAMusage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestCase4 extends LaunchQuit
{
	@Test
	public void logintoAmazon()
	{
		driver.findElement(By.name("q")).sendKeys("Holiday List"+Keys.ENTER);
	}
	

}
