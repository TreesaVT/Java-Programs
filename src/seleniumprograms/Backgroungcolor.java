package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Backgroungcolor {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("treesa.jincy43@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("asdd12345");
		WebElement e1=driver.findElement(By.id("loginbutton"));
		String s1=e1.getCssValue("background-color");
		System.out.println(s1);
	}

}
