package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonLinktextPartiallinktext {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=6702474105936519475&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061994&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		WebElement e1= driver.findElement(By.linkText("Mobiles"));
		e1.click();
		Thread.sleep(3000);
		WebElement e2= driver.findElement(By.partialLinkText("Bests"));
		e2.click();
		Thread.sleep(3000);
		WebElement e3= driver.findElement(By.id("twotabsearchtextbox"));
		e3.sendKeys("shoes"+Keys.ENTER);
		
	}

}
