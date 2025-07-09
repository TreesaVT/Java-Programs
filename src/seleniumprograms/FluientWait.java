package seleniumprograms;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class FluientWait {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        try {
            driver.get("https://www.amazon.in/");

//            FluentWait<ChromeDriver> f1=new FluentWait<ChromeDriver>(driver).withTimeout(Duration.ofSeconds(10))
//            .pollingEvery(Duration.ofSeconds(1))
//            .ignoring(NullPointerException.class);
//            f1.until(ExpectedConditions.titleIs("MKT"));
            // Define FluentWait
            FluentWait<ChromeDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))           // Total wait time
                .pollingEvery(Duration.ofSeconds(2))           // Polling interval
                .ignoring(NoSuchElementException.class);       // Ignore exception
         //    Wait for the element to be present
            WebElement element = wait.until(new Function<WebDriver, WebElement>() {
                public WebElement apply(WebDriver driver) {
                    WebElement el = driver.findElement(By.id("elementId"));
                    if (el.isDisplayed()) {
                        return el;
                    }
                    return null;
                }
            });

            element.click(); // Perform action on the element

        } finally {
            driver.quit(); // Close the browser
        }

	}

}
