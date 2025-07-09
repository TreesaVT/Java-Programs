package seleniumprograms;

import java.util.List;
import org.testng.asserts.SoftAssert;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SoftAssertAmazonSearchResultGreaterThan50 {

	public static void main(String[] args) {
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=6702474105936519475&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061994&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		SoftAssert s1=new SoftAssert();
		driver.manage().window().maximize();
		WebElement e1= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		e1.sendKeys("Shoes");
		e1.sendKeys(Keys.ENTER);
		List<WebElement> e2=driver.findElements(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']"));
		System.out.println(e2.size());
		s1.assertEquals(e2.size()>50,true);//can check with == 50,will get exception
		s1.assertEquals(e2.size(),71);//72 shoes found
		
		s1.assertAll();

	}

}
