package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Google_searchClassnamelocator {

	public static void main(String[] args) {
		//classname should be unique to make use of classname locator
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.className("gLFyf"));
		e1.sendKeys("Sunitha"+Keys.ARROW_DOWN);
		e1.sendKeys(Keys.ARROW_DOWN);//for loop also can be used
		e1.sendKeys(Keys.ARROW_DOWN);
		e1.sendKeys(Keys.ARROW_DOWN);
		e1.sendKeys(Keys.ARROW_DOWN);
		e1.sendKeys(Keys.ARROW_DOWN);
		e1.sendKeys(Keys.ENTER);

	}

}
