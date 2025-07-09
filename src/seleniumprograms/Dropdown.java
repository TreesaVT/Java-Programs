package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(e1);
		s1.selectByIndex(2);
		Thread.sleep(3000);
		s1.selectByValue("search-alias=audible");
		Thread.sleep(3000);
		s1.selectByVisibleText("Furniture");
		Thread.sleep(3000);

	}

}
