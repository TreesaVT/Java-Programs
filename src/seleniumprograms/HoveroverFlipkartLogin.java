package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoveroverFlipkartLogin {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1=driver.findElement(By.xpath("//span[.='Login']"));
		Actions a1= new Actions(driver);
		a1.moveToElement(e1).perform();
		e1.click();
		WebElement e2=driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"));
		e2.sendKeys("8975432233");


	}

}
