package seleniumprograms;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e1= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		e1.sendKeys("Shoes"+Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement e2= driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		e2.click();
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> id=ids.iterator();
		String parentid=id.next();
		String childid1=id.next();
		driver.switchTo().window(childid1);
		WebElement buynow= driver.findElement(By.xpath("//input[@id='buy-now-button']"));
		buynow.click();
		driver.findElement(By.id("ap_email_login")).sendKeys("treesa.jincy43@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Jincy@43");
		driver.findElement(By.id("signInSubmit")).click();
		WebElement card= driver.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[3]"));
		card.click();
		driver.findElement(By.linkText("Save Card")).click();
		WebElement iframe=driver.findElement(By.xpath("//iframe[@name='ApxSecureIframe']"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//input[@name='addCreditCardNumber']")).sendKeys("1234556788");

	}

}
