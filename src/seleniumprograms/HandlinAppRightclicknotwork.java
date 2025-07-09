package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlinAppRightclicknotwork {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		e1.click();

	}

}
