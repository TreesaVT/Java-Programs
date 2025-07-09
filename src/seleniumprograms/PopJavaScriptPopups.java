package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopJavaScriptPopups {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1=driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
		e1.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		WebElement e2=driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
		e2.click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		WebElement e3=driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
		e3.click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("hello");
		driver.switchTo().alert().accept();

	}

}
