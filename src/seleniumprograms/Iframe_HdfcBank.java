package seleniumprograms;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframe_HdfcBank {

	public static void main(String[] args) throws InterruptedException {
//		EdgeOptions option=new EdgeOptions();
//		option.addArguments("--disable-notifications");
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//button[@class='onetrust-close-btn-handler banner-close-button ot-close-icon']")).click();
		//WebElement e1=driver.findElement(By.xpath("//button[contains(@class,'login-btn hide-in-mobileApp')]"));
		WebElement e1=driver.findElement(By.xpath("//button[@class='desktop-login position-find btn btn-primary login-btn hide-in-mobileApp ng-scope']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		WebElement e2=driver.findElement(By.linkText("NetBanking"));
	    //WebElement e2=driver.findElement(By.xpath("(//div[@class='login-button-new']/div/div)[1]"));
		e2.click();
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> id=ids.iterator();
		String parentid= id.next();
		String chilid1= id.next();
		driver.switchTo().window(chilid1);
		WebElement iframe=driver.findElement(By.name("login_page"));
		driver.switchTo().frame(iframe);
		WebElement customerid=driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		customerid.sendKeys("123456");

	}

}
