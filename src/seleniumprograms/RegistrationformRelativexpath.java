package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationformRelativexpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//input[@id='firstName']"));
		e1.sendKeys("Treesa");
		WebElement e2=driver.findElement(By.xpath("//input[@id='lastName']"));
		e2.sendKeys("VT");
		WebElement e3=driver.findElement(By.xpath("//input[@id='email']"));
		e3.sendKeys("treesa.jincy43@gmail.com");
		WebElement e4=driver.findElement(By.xpath("//input[@id='phone']"));
		e4.sendKeys("9675454345");
		WebElement e5=driver.findElement(By.xpath("//select[@id='gender']"));
		Select s1=new Select(e5);
		s1.selectByVisibleText("Female");
		WebElement e6=driver.findElement(By.xpath("//select[@id='state']"));
		Select s2=new Select(e6);
		s2.selectByVisibleText("Karnataka");
		WebElement e9=driver.findElement(By.xpath("//input[@id='aadhaar']"));
		e9.sendKeys("967545434567");
		WebElement e10=driver.findElement(By.xpath("//input[@id='pan']"));
		e10.sendKeys("AWHPT7653W");
		Thread.sleep(4000);
		WebElement e7=driver.findElement(By.id("c_bs_1"));
		e7.click();
		Thread.sleep(3000);
		WebElement e8=driver.findElement(By.xpath("//button[@name='Submit']"));
		e8.click();
		//Thread.sleep(3000);
		if(e7.isSelected())//not work as its fastly closing
		{
			System.out.println("Submitted");
		}

	}

}
