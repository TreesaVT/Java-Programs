package testNg;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SliderTest_20 {

    @Test
    public void slideprice() throws InterruptedException, AWTException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.navigate().refresh();

        // Search for Shoes
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("Shoes");
        search.sendKeys(Keys.ENTER);
        Thread.sleep(3000); // Wait for results to load

        // Left price slider and value
        WebElement leftSlider = driver.findElement(By.id("p_36/range-slider_slider-item_lower-bound-slider"));
        WebElement leftPriceElement = driver.findElement(By.xpath("(//input[@aria-valuetext])[1]"));

        // Right price slider and value
        WebElement rightSlider = driver.findElement(By.id("p_36/range-slider_slider-item_upper-bound-slider"));
        WebElement rightPriceElement = driver.findElement(By.xpath("(//input[@aria-valuetext])[2]"));

        // Move left slider until value is between 1000 and 1500
        for (int i = 0; i <= 178; i++) {
            leftSlider.sendKeys(Keys.ARROW_RIGHT);
            String text = leftPriceElement.getDomAttribute("aria-valuetext").replace(",", "").replace("₹", "").trim();

            if (text.isEmpty()) continue;

            int number = Integer.parseInt(text);
            System.out.println("Left price is: ₹" + number);

            if (number > 8000 && number < 8500) {
                leftSlider.sendKeys(Keys.ESCAPE);
                break;
            }
        }

        // Move right slider until value is between 45000 and 46000
        for (int j = 0; j <= 178; j++) {
            rightSlider.sendKeys(Keys.ARROW_LEFT);
            String text1 = rightPriceElement.getDomAttribute("aria-valuetext").replace(",", "").replace("₹", "").trim();

            if (text1.isEmpty()) continue;

            int number1 = Integer.parseInt(text1);
            System.out.println("Right price is: ₹" + number1);

            if (number1 < 14000 && number1 > 13500) {
                // Stop adjusting slider
            	Thread.sleep(3000);
            	rightSlider.sendKeys(Keys.ENTER);
            	break;
            }
        }}

}