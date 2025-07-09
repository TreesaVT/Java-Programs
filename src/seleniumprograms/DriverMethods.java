package seleniumprograms;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String Parentid=driver.getWindowHandle();
		System.out.println(Parentid);
		Set<String> pcid=driver.getWindowHandles();
		System.out.println(pcid);
		Thread.sleep(3000);
		driver.quit();
	}

}
