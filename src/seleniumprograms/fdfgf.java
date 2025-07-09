package seleniumprograms;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class fdfgf {
	

	public static void main(String[] args)  {
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//button[@class='desktop-login position-find btn btn-primary login-btn hide-in-mobileApp ng-scope']"));
		Actions a1= new Actions(driver);
		a1.moveToElement(e1).perform();
		WebElement signin=driver.findElement(By.linkText("NetBanking"));
		signin.click();
		Set<String> ids= driver.getWindowHandles();
		Iterator<String> id=ids.iterator();
		String parentid=id.next();
		String childid=id.next();
		driver.switchTo().window(childid);
		WebElement iframe= driver.findElement(By.xpath("//frame[@name='login_page'"));
		driver.switchTo().frame(iframe);
//		WebElement username= driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
//		username.sendKeys("56678909");
		WebElement customerid=driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		customerid.sendKeys("123456");
	}
	

}
