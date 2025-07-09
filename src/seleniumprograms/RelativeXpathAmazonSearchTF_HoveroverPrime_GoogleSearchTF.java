package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class RelativeXpathAmazonSearchTF_HoveroverPrime_GoogleSearchTF {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e1= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		e1.sendKeys("Bag");
		Thread.sleep(3000);
		WebElement e2= driver.findElement(By.xpath("//span[.='Prime']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(e2).perform();
		Thread.sleep(3000);
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.google.com");
		WebElement e3= driver1.findElement(By.xpath("//textarea[@class='gLFyf']"));
		e3.sendKeys("Bag");

	}

}
