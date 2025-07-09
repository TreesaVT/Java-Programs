package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HeadlessMaximizeInprivate
{

	public static void main(String[] args) throws InterruptedException {
		EdgeOptions o1=new EdgeOptions();
		o1.addArguments("--headless");
		//o1.addArguments("--inprivate");
		//o1.addArguments("--start-maximized");
		EdgeDriver driver= new EdgeDriver(o1);
		driver.get("https://www.amazon.in");
		
		WebElement e1= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		e1.sendKeys("Laptop");
		Thread.sleep(1000);//mandatory here
		List<WebElement> e2=e1.findElements(By.xpath("(//div[@class='two-pane-results-container']/div/div)"));
		System.out.println(e2.size());

	}

}
