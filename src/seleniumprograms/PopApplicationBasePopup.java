package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class PopApplicationBasePopup {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D155259813593%26hvpone%3D%26hvptwo%3D%26hvadid%3D674893540034%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D3047623351284398171%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9061994%26hvtargid%3Dkwd-64107830%26hydadcr%3D14452_2316413%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		Thread.sleep(2000);
		driver.findElement(By.id("ap_email")).sendKeys("treesa.jincy43@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Jincy@43");
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(15000);
		WebElement e1= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		e1.sendKeys("Laptop"+Keys.ENTER);
		Thread.sleep(3000);
		WebElement e2=driver.findElement(By.xpath("(//span[@class='rush-component s-latency-cf-section']/div/div)[1]"));
		e2.click();
		Thread.sleep(3000);
		//WebElement e4=driver.findElement(By.id("addToCart_feature_div"));
		WebElement e3=driver.findElement(By.id("add-to-wishlist-button-submit"));
//		JavascriptExecutor j1=driver;
//		Point p1=e3.getLocation();
//		Thread.sleep(3000);
//		j1.executeScript("window.scrollBy(0,"+p1.getY()+")");
		e3.click();
		Thread.sleep(3000);
		WebElement e4=driver.findElement(By.linkText("View Your List"));
		e4.click();

	}

}
