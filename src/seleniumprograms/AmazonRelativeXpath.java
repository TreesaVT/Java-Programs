package seleniumprograms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonRelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=6702474105936519475&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061994&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		WebElement e1= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		e1.sendKeys("shoes");//select the first shoe and get the ids of both tab
		e1.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement e2= driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		e2.click();
		Set<String> pc=driver.getWindowHandles();
		System.out.println(pc);
		
		//driver.quit();

	}

}
