package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TypeOnDisabledComponent {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver= new EdgeDriver();
		driver.get("file:///C:/Users/User/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e=driver.findElement(By.xpath("//input[@name='fname']"));
		e.sendKeys("abfcdwer");
		WebElement e1=driver.findElement(By.xpath("//input[@name='lname']"));
		driver.executeScript("arguments[0].removeAttribute('disabled')", e1);
		e1.sendKeys("Treesa");

	}

}
