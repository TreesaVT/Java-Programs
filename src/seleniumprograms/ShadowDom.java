package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ShadowDom {

	
		public static void main(String[] args) throws InterruptedException {
			ChromeOptions o = new ChromeOptions();
			o.addArguments("--disable-notifications");
			ChromeDriver driver = new ChromeDriver(o);
			driver.manage().window().maximize();
			driver.get("https://www.airindia.com/");
			Thread.sleep(5000);
			WebElement e1 = driver.findElement(By.id("onetrust-accept-btn-handler"));
			e1.click();
			String a1 = "return document.querySelector('#ai-booking-widget > ai-tab-group > ai-tab:nth-child(1) > ai-search-flight > slot-fb > div.ai-search-flight-wrapper > div.ai-search-trip > div > div.ai-search-trip-type > ai-radio-group').shadowRoot.querySelector('#radio0')";
			WebElement e2=(WebElement) driver.executeScript(a1);
			//WebElement e2 = (WebElement) driver.executeScript(a1);
			e2.click();
		}

	}

