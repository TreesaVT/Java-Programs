package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.asserts.Assertion;

public class HardAssertProgram {

	public static void main(String[] args) {
		EdgeDriver driver= new EdgeDriver();
		Assertion a1=new Assertion();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		a1.assertEquals(driver.getTitle(), "Google");//if passed google istead of Treesa,no assertion error
		driver.findElement(By.name("q")).sendKeys("Shoe"+Keys.ENTER);
	

	}

}
