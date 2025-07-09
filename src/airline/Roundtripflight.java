package airline;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Roundtripflight {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/flights");
		driver.navigate().refresh();
				WebElement e1=driver.findElement(By.xpath("//span[.='One way']"));
		e1.click();
		driver.findElement(By.xpath("//p[.='Round trip']")).click();
		WebElement e2=driver.findElement(By.xpath("//input[@placeholder='Where from?']"));
		e2.click();
		WebElement e3=driver.findElement(By.xpath("(//div[@class='field-1 h-13 flex flex-middle p-relative pr-4 w-100p ']/div/ul)[1]"));
		e3.click();
		WebElement e4=driver.findElement(By.xpath("//input[@placeholder='Where to?']"));
		e4.click();
		WebElement e5=driver.findElement(By.xpath("(//div[@class='field-2 flex h-13 flex-middle p-relative pr-4 w-100p ']/div/ul)[2]"));
		e5.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='sc-aXZVg dSvAMK mr-2 mt-1']")).click();
		JavascriptExecutor js=driver;
		js.executeScript("window.scrollBy(0,400)");
		//Thread.sleep(2000);
driver.findElement(By.cssSelector("svg[data-testid=rightArrow]")).click();	
//Thread.sleep(5000);
driver.findElement(By.xpath("(//div[@class='Day-grid flex flex-middle flex-column flex-center'])[10]")).click();
//Thread.sleep(5000);
//driver.findElement(By.cssSelector("div[data-testid=dateSelectReturn]")).click();
driver.findElement(By.xpath("(//div[@class='Day-grid flex flex-middle flex-column flex-center'])[45]")).click();
	}
}	
















//		Thread.sleep(2000);
//		WebElement e6=driver.findElement(By.xpath("(//button)[1]"));//(//div[@class='sc-aXZVg ibgoAF']
//		e6.click();
//		driver.navigate().refresh();
//		Thread.sleep(2000);
//		e2.click();
//		e3.click();
//		e4.click();
//		e5.click();
//		e6.click();
//		List<WebElement> e7=driver.findElements(By.xpath("//button[@class='h-10 flex-1 br-8 bg-intlnew-orange bg-primary-500 hover:bg-primary-600 c-white bc-transparent c-pointer w-100p py-1 px-3 h-8 fs-3 fw-600 t-all button bs-solid tp-color td-500 bw-1 br-4 lh-solid box-border']"));
//		s1.assertEquals(e7.size()>1, true);
//		s1.assertAll();
	


