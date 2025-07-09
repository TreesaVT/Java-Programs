package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartHoweroverFashionSearchmentshirt {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//WebElement e1=driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));//div[@class='_1ch8e_'])[1](xpath i got,not able to get manishs xpath,but when coped same its working)
		WebElement e1=driver.findElement(By.xpath("(//div[@class='_1ch8e_'])[1]"));
		Actions a1= new Actions(driver);
		a1.moveToElement(e1).perform();
		WebElement e2=driver.findElement(By.linkText("Men's T-Shirts"));//("//a[text()='Men's T-Shirts']"));(xpath not working here)
		e2.click();

	}

}
