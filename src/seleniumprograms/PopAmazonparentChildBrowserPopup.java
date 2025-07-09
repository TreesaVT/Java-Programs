package seleniumprograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class PopAmazonparentChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e1= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		e1.sendKeys("Shoes"+Keys.ENTER);
		WebElement e2= driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		e2.click();
		List<WebElement> list=driver.findElements(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])"));
		list.get(2).click();
		list.get(3).click();
		list.get(4).click();
		list.get(5).click();
		list.get(6).click();
		list.get(7).click();
		Thread.sleep(3000);
		Set<String> ids=driver.getWindowHandles();
		List<String> idlist=new ArrayList(ids);
		driver.switchTo().window(idlist.get(6));
		driver.findElement(By.id("add-to-cart-button")).click();
//		Iterator<String> id=ids.iterator();
//		String parentid=id.next();
//		String childid1=id.next();
//		System.out.println(parentid);
//		System.out.println(childid1);
//		//driver.close();//parent get closed
//		driver.switchTo().window(childid1);//moving control to child
//		WebElement e3= driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
//		boolean pricedisplayed=e3.isDisplayed();
//		System.out.println(pricedisplayed);
//		WebElement e4= driver.findElement(By.cssSelector(".a-spacing-medium a-spacing-top-large"));
//		e4.getText();
//		//boolean descriptiondisplayed=e4.isDisplayed();
//		System.out.println(e4.getText());
//		
//		driver.close();//now child gets closed
	}

}
