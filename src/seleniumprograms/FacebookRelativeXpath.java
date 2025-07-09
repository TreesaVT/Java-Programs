package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRelativeXpath {
	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("(//input)[15]")).sendKeys("treesa.jincy43@gmail.com");//(//input)[@name='email']
		//driver.findElement(By.xpath("(//input)[16]")).sendKeys("rygddff");
		WebElement e1=driver.findElement(By.xpath("(//input)[@name='email']"));
		e1.sendKeys("treesa.jincy43@gmail.com");
		WebElement e2=driver.findElement(By.xpath("(//input)[@name='pass']"));
				e2.sendKeys("password");
		WebElement e3=driver.findElement(By.xpath("//button"));//relative xpath
		e3.click();
		
	}

}
