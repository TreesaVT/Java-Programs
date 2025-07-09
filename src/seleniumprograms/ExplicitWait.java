package seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait 
	{
		
		public static void main(String[] args) 
		{
			ChromeDriver driver=new ChromeDriver();
	        driver.get("https://www.amazon.in/");
	        driver.manage().window().maximize();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement e1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Mobiles']")));
	        e1.click();
		}
	}