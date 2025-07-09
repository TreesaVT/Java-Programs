package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutosuggestionGoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.className("gLFyf"));
		e1.sendKeys("bangalore");
		Thread.sleep(1000);//if sleep not given it wont get time to check autosuggestion
		List<WebElement> l1=e1.findElements(By.xpath("(//div[@class='OBMEnb']/ul/li)"));
		System.out.println(l1.size());
		l1.get(9).click();

	}

}
