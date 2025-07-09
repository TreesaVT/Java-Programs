package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookToUSETagname {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("treesa.jincy43@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("rygddff");
		driver.findElement(By.tagName("button")).click();//tagname can be used only when the tagname present in particular page is unique
	}
}
