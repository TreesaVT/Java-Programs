package seleniumprograms;


import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

public class PopspicejetBroserBasedPopup {

	public static void main(String[] args) throws InterruptedException {
//		ChromeOptions c1=new ChromeOptions();
//		c1.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		WebElement e1=driver.findElement(By.linkText("Register"));
//		e1.click();
//		Thread.sleep(3000);
//		WebElement e2=driver.findElement(By.xpath("//span[@class='google-text']"));
//		e2.click();

	}

}
