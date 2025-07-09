package testNgListners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerLogic.class)
public class TestcasewithLogic extends ListenerLogic
{
	
	@Test
	public void testcase1()
	{
		 driver= new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e1= driver.findElement(By.id("nav-link-amazonprime"));
		//WebElement e1= driver.findElement(By.id("link-amazonprime"));
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();

	}
	
}
