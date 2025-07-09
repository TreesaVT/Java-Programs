package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JsamRelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver= new EdgeDriver();
		driver.get("file:///C:/Users/User/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e=driver.findElement(By.xpath("//input[@name='fname']"));
		if(e.isEnabled()&& e.isDisplayed())
		{
			e.sendKeys("abfcdwer");
		}
		WebElement e1=driver.findElement(By.xpath("//input[@name='lname']"));
		if(e1.isEnabled()&& e1.isDisplayed())
		{
			e1.sendKeys("abfcdwer");
		}
		
		Thread.sleep(3000);
		WebElement e2=driver.findElement(By.xpath("//input[@id='123']"));
		e2.click();
		boolean b1= e2.isSelected();
		System.out.println(b1);
		Thread.sleep(3000);
		WebElement e3=driver.findElement(By.xpath("(//input)[12]"));
		//e3.click();
		boolean b2= e3.isSelected();
		System.out.println(b2);
		Thread.sleep(3000);
		WebElement e4=driver.findElement(By.xpath("(//input)[13]"));
		e4.click();

	}

}
