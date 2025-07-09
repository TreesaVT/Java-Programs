package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsamApplicationwithTagnamelinktextpartial {

	public static void main(String[] args) {
		// As this application containsonly 1 link,tagname will be unique and can find element by tagnamelocator"a"
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/User/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		driver.findElement(By.tagName("a")).click();
		WebElement e1= driver.findElement(By.linkText("Click to know about us"));
		e1.click();
		WebElement e2= driver.findElement(By.linkText("ick to know ab"));
		e2.click();

	}

}
