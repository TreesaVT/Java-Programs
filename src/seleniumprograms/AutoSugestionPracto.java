package seleniumprograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.asserts.SoftAssert;

public class AutoSugestionPracto {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.practo.com/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("(//input)[2]"));
		e1.sendKeys("pcm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		List<WebElement> e2=driver.findElements(By.xpath("//div[@class='c-omni-suggestion-list']/div/div"));
		e2.get(1).click();
		
		
	

	}

}
