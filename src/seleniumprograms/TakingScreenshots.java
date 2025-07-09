package seleniumprograms;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakingScreenshots {

	public static void main(String[] args) throws IOException, InterruptedException {
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.practo.com/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("(//input)[2]"));
		e1.sendKeys("pcm");
		Thread.sleep(1000);
		List<WebElement> e2=driver.findElements(By.xpath("//div[@class='c-omni-suggestion-list']/div/div"));
		e2.get(1).click();
		
		TakesScreenshot ts=(TakesScreenshot)  driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		//File Destination= new File("C:\\Users\\User\\eclipse-workspace\\Selenium\\Screenshot\\treesa.png");//howmany screeshots if we take also it will be overitten
		//File Destination= new File("C:\\Users\\User\\eclipse-workspace\\Selenium\\Screenshot\\treesa"+Math.random()+".png");
		//File Destination= new File("C:\\Users\\User\\eclipse-workspace\\Selenium\\Screenshot\\treesa"+new TakingScreenshots().getClass()+".png");
		
		Date d1=new Date();
		System.out.println(d1.getTime());//output-1740476339062(put in epoch converter to get the human understandable)
		System.out.println(d1);
		Date d2=new Date(d1.getTime()+(1000*60*60*24*4));//future,toget past - 
		System.out.println(d2);
		String format1=	d1.toString();
		String month=	format1.substring(4, 7);
		System.out.println(month);
		String date=	format1.substring(8, 10);
		System.out.println(date);
		String year=	format1.substring(format1.length()-4);
		System.out.println(year);
		String format4=date.concat(" ").concat(month).concat(" ").concat(year);
		System.out.println(format4);
		String hour=format1.substring(11, 13);
		String min=format1.substring(14, 16);
		String sec=format1.substring(17, 19);
		String format5=date.concat(" ").concat(month).concat(" ").concat(year).concat(" ").concat(hour).concat(" ").concat(min).concat(" ").concat(sec);
		
		//File Destination= new File("C:\\Users\\User\\eclipse-workspace\\Selenium\\Screenshot\\treesa".concat(format4)+".png");
		
		//File Destination= new File("C:\\Users\\User\\eclipse-workspace\\Selenium\\Screenshot\\treesa".concat(format5)+".png");
		
		File Destination= new File("C:\\Users\\User\\eclipse-workspace\\Selenium\\Screenshot\\treesa".concat(format5).concat(" ")+new TakingScreenshots().getClass()+".png");
		FileHandler.copy(source, Destination);
		

	}

}
