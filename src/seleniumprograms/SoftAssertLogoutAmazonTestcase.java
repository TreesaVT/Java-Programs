package seleniumprograms;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class SoftAssertLogoutAmazonTestcase {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D155259813593%26hvpone%3D%26hvptwo%3D%26hvadid%3D674893540034%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D3047623351284398171%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9061994%26hvtargid%3Dkwd-64107830%26hydadcr%3D14452_2316413%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		SoftAssert s1=new SoftAssert();
		Thread.sleep(2000);
		//driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.id("ap_email")).sendKeys("treesa.jincy43@gmail.com");
		driver.findElement(By.id("continue")).click();
		//driver.navigate().refresh();
		driver.findElement(By.id("ap_password")).sendKeys("Jincy@43");
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		s1.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		Thread.sleep(2000);
		WebElement e1=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	    Actions a1=new Actions(driver);
	    a1.moveToElement(e1).perform();
	    WebElement e2=driver.findElement(By.xpath("//span[.='Sign Out']"));
	    e2.click();
	    WebElement e3=driver.findElement(By.name("email"));
	    s1.assertEquals(e3.isDisplayed(), false);//to check asseretion error
		s1.assertAll();
	}

}
