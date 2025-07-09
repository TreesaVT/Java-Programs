package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PopFileUploadAndJavaScriptPopupOnGrotechRegis {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		driver.findElement(By.id("fname")).sendKeys("Treesa");
		driver.findElement(By.name("lname")).sendKeys("VT");
		driver.findElement(By.name("email")).sendKeys("treesa.jincy43@gmail.com");
		driver.findElement(By.name("password")).sendKeys("drrtt6788");
		Thread.sleep(2000);
		driver.findElement(By.id("male")).click();
		WebElement e1=driver.findElement(By.id("Skills"));
		Select s1=new Select(e1);
		s1.selectByIndex(1);
		WebElement e4=driver.findElement(By.id("Skills"));
		Select s4=new Select(e4);
		s4.selectByVisibleText("Technical Skills");
		WebElement e2=driver.findElement(By.id("Country"));
		Select s2=new Select(e2);
		s2.selectByValue("India");
		Thread.sleep(3000);
		driver.findElement(By.name("Present-Address")).sendKeys("edayanal house,Mahadevpura,Bangalore");
		Thread.sleep(3000);
		driver.findElement(By.name("Permanent-Address")).sendKeys("vailankanni villa,kadaba,dakshinkannada");
		Thread.sleep(3000);
		driver.findElement(By.name("Pincode")).sendKeys("570048");
		Thread.sleep(3000);
		WebElement e3=driver.findElement(By.id("Relegion"));
		Select s3=new Select(e3);
		Thread.sleep(3000);
		s3.selectByVisibleText("Jews");
		Thread.sleep(6000);
		WebElement e7=driver.findElement(By.name("file"));
		Actions a1=new Actions(driver);
		a1.moveToElement(e7).perform();
		e7.sendKeys("C:\\Users\\User\\Downloads\\trresa.docx");
//		WebElement e5=driver.findElement(By.id("relocate"));
//		e5.click();
		Thread.sleep(3000);
		WebElement e8=driver.findElement(By.name("Submit"));
		e8.click();
		
	}

}
