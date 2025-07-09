package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class PopJSAMAbsoluteXpathAndHandlingJavaScriptPopup {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver= new EdgeDriver();
		driver.get("file:///C:/Users/User/Downloads/learningHTML1.html");
		driver.switchTo().alert().accept();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1=driver.findElement(By.xpath("(/html/body/input)[1]"));
		e1.sendKeys("abfcdwer");
		WebElement e2=driver.findElement(By.xpath("(/html/body/input)[2]"));
		e2.sendKeys("efgh");
		WebElement e3=driver.findElement(By.xpath("(/html/body/input)[3]"));
		e3.sendKeys("@pasword");
		WebElement e4=driver.findElement(By.xpath("(/html/body/form)[1]/input[1]"));
		e4.sendKeys("treesa");
		WebElement e11=driver.findElement(By.xpath("(/html/body/form)[2]/input[1]"));
		e11.click();
		Thread.sleep(3000);
		WebElement e5=driver.findElement(By.xpath("(/html/body/form)[2]/input[2]"));
		e5.click();
		Thread.sleep(3000);
		WebElement e6=driver.findElement(By.xpath("(/html/body/form)[2]/input[3]"));
		e6.click();
		Thread.sleep(3000);
		WebElement e7=driver.findElement(By.xpath("/html/body/input[4]"));
		e7.click();
		Thread.sleep(3000);
		WebElement e8=driver.findElement(By.xpath("/html/body/input[5]"));
		e8.click();
		Thread.sleep(3000);
		WebElement e9=driver.findElement(By.xpath("/html/body/input[6]"));
		e9.click();
		Thread.sleep(3000);
		WebElement e10=driver.findElement(By.xpath("/html/body/a"));
		e10.click();

	}

}
