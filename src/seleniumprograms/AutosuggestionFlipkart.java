package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutosuggestionFlipkart {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1=driver.findElement(By.name("q"));
		e1.sendKeys("cycle");
		Thread.sleep(3000);
		List<WebElement> e2=e1.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));//Hy6F9O header-form-search
		Thread.sleep(2000);
		e2.get(e2.size()-2).click();

	}

}
