package seleniumprograms;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class KeysFunctionality {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.id("fname"));
		e1.sendKeys("Treesa"+Keys.CONTROL+"a");
		e1.sendKeys(Keys.CONTROL+"c");
		WebElement e2=driver.findElement(By.id("lname"));
		e2.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		e2.sendKeys(Keys.ARROW_LEFT);
		Thread.sleep(2000);
		e2.sendKeys(Keys.ARROW_LEFT);
		Thread.sleep(2000);
		e2.sendKeys(Keys.ARROW_LEFT);
		Thread.sleep(2000);
		e2.sendKeys(Keys.ARROW_LEFT);
		Thread.sleep(2000);
		e2.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		e2.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		e2.sendKeys(Keys.SHIFT+"Treesa");
	}}
