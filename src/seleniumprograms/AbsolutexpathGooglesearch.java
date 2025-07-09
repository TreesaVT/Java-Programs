package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AbsolutexpathGooglesearch {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("/html/body/div/div/form/div/div/div/div/div/textarea"));
		e1.sendKeys("gold price today"+Keys.ENTER);
	}

}
