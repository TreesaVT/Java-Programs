package seleniumprograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopParentChildWindowBrowserPopupOnNaukari {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/nlogin/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1=driver.findElement(By.linkText("Register"));
		e1.click();
		Thread.sleep(3000);
		WebElement e2=driver.findElement(By.xpath("//span[@class='google-text']"));
		e2.click();
		Thread.sleep(3000);
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> id=ids.iterator();
		String parentid=id.next();
		String childid=id.next();
		driver.switchTo().window(childid);
		WebElement e3=driver.findElement(By.id("identifierId"));
		e3.sendKeys("treesa.jincy43@gmail.com");

	}

}
