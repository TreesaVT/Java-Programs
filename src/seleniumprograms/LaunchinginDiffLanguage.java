package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchinginDiffLanguage {

	public static void main(String[] args) {
		ChromeOptions o1=new ChromeOptions();
		o1.addArguments("--lang=ar");
		ChromeDriver driver= new ChromeDriver(o1);
		driver.get("https://www.amazon.in");
		
		WebElement e1= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		e1.sendKeys("Laptop");
	}

}
