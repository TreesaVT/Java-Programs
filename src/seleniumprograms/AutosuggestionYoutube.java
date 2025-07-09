package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AutosuggestionYoutube {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement e1= driver.findElement(By.xpath("//input[@name='search_query']"));
		Thread.sleep(1000);
		e1.sendKeys("Cartoon");
		Thread.sleep(1000);//mandatory here
		List<WebElement> e2=e1.findElements(By.xpath("//div[@class='ytSearchboxComponentSuggestionsContainer ytSearchboxComponentSuggestionsContainerDark']/div"));
		System.out.println(e2.size());
		e2.get(e2.size()-6).click();//5th suggestion
	}

}
