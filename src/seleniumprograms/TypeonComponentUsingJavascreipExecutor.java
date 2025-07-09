package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TypeonComponentUsingJavascreipExecutor {

	public static void main(String[] args) {
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.className("gLFyf"));
//		JavascriptExecutor j1=driver;
//		j1.executeScript("arguments[0].value='India'", e1);
		driver.executeScript("arguments[0].value='India'", e1);

	}

}
