package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessMaximizeIncognito {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions o1=new ChromeOptions();
		//o1.addArguments("--headless");
		o1.addArguments("--incognito");
		o1.addArguments("--start-maximized");
		ChromeDriver driver= new ChromeDriver(o1);
		driver.get("https://www.amazon.in");
		
		WebElement e1= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		e1.sendKeys("Laptop");
		Thread.sleep(1000);//mandatory here
		List<WebElement> e2=e1.findElements(By.xpath("(//div[@class='two-pane-results-container']/div/div)"));
		System.out.println(e2.size());

	}

}
