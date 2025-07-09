package airline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class LoginFailsInvalidUN {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D155259813593%26hvpone%3D%26hvptwo%3D%26hvadid%3D674893540034%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D3047623351284398171%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9061994%26hvtargid%3Dkwd-64107830%26hydadcr%3D14452_2316413%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		SoftAssert s1=new SoftAssert();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("treesa.com");
		driver.findElement(By.id("continue")).click();
		//WebElement e1=driver.findElement(By.xpath("(//div[@class='a-alert-content'])[1]"));
		WebElement e1=driver.findElement(By.xpath("(//div[@class='a-alert-content'])[4]"));
		String actualText= e1.getText();
		String expectedText="Invalid email address";
		boolean validate=actualText.contains(expectedText);
		System.out.println(validate);
		s1.assertEquals(validate, false,"failed text not matching");
		s1.assertAll();
		System.out.println(e1.getText());
		
	}

}
