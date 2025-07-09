package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CssSelectorsGoogleSearch {
	public static void main(String[] args) {
	EdgeDriver driver= new EdgeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	//WebElement e1=driver.findElement(By.cssSelector("#APjFqb"));
	//WebElement e1=driver.findElement(By.cssSelector(".gLFyf"));
	//WebElement e1=driver.findElement(By.cssSelector("textarea[class='gLFyf']"));
	//WebElement e1=driver.findElement(By.cssSelector("textarea.gLFyf[name='q']"));//textarea.gLFyf[class='gLFyf']
	//WebElement e1=driver.findElement(By.cssSelector("textarea.gLFyf"));
	WebElement e1=driver.findElement(By.cssSelector("textarea[class^='g']"));
	e1.sendKeys("shoes");
	}

}
