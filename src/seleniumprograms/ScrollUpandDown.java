package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollUpandDown {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		JavascriptExecutor j1=driver;
		j1.executeScript("window.scrollBy(0,1000)");//scrolldown
		Thread.sleep(1000);
		j1.executeScript("window.scrollBy(0,-500)");//scrollup
		Thread.sleep(2000);
		WebElement e1=driver.findElement(By.linkText("About Amazon"));
		Point p1=e1.getLocation();
		int x=p1.getX();
		int y=p1.getY();
		int y1=y-700;//(above 500+200)not required in reality,just give y instead of y1 in line 24,doing this just for visibility
		System.out.println(x);
		System.out.println(y);
		j1.executeScript("window.scrollBy(0,"+y1+")");//scrolldown till aboutAmazon

	}

}
