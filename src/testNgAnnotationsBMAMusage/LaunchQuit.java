package testNgAnnotationsBMAMusage;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.*;
 
public class LaunchQuit {
	ChromeDriver driver; 
	@BeforeMethod
	public void launchbrowser()
	{
		 driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void quit() throws InterruptedException, IOException
	{
		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);//only1 screenshot as the name is same
		File destination=new File("C:\\Users\\User\\eclipse-workspace\\Selenium\\ScreenshotTestNgAnnotationsBMAMusage\\treesa"+new LaunchQuit().getClass()+".png");
		FileHandler.copy(source, destination);
		driver.quit();
	}

}
