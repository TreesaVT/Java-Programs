package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotatnLaunchingMultiple {
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void method1(String nameofbrowser)
	{
		if(nameofbrowser.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		if(nameofbrowser.equals("Edge"))
		{
			driver=new EdgeDriver();
		}
		if(nameofbrowser.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		WebElement e1=driver.findElement(By.className("gLFyf"));
		e1.sendKeys("Sunitha"+Keys.ARROW_DOWN+Keys.ENTER);
	}
	

}
