package seleniumprograms;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_126_A 
{
 static FirefoxDriver driver;
 static WebElement e1,e3,e4;

 static void LaunchBrowser(String url) throws InterruptedException
 {
	 driver=new FirefoxDriver();
	 driver.get(url);
	 driver.manage().window().maximize();
	 Thread.sleep(2000);	
}
 
 static void EnterKey(String s) throws InterruptedException 
 { 
	 e1=driver.findElement(By.name("username"));
	  e1.sendKeys(s);
	Thread.sleep(2000);	
	e1.sendKeys(Keys.ENTER);
 }
 static void Copy_Paste()
 {
	 e1=driver.findElement(By.id("1"));
	 e1.sendKeys(Keys.CONTROL+"a");
	e1.sendKeys(Keys.CONTROL+"c");
		
	driver.findElement(By.id("2"));
	e1.sendKeys("My Name " +Keys.CONTROL +"v");
	
 }
 
 static void DeleteKey(String s3,String s4) throws InterruptedException 
 {
	 e3=driver.findElement(By.name("password"));
		e3.sendKeys(s3);
		Thread.sleep(2000);
		
		for (int i=0;i<=s3.length()-1;i++) 
		{
			e3.sendKeys(Keys.END);
			e3.sendKeys(Keys.ARROW_LEFT);
			e3.sendKeys(Keys.DELETE);				
		}			
		Thread.sleep(2000);
		e3.sendKeys(s4+Keys.ENTER);
		e3.sendKeys(Keys.TAB);
		
 }
 
 static void BackspaceKey(String s2) throws InterruptedException 
 {
	e4=driver.findElement(By.name("fname"));
		e4.sendKeys(s2);
		Thread.sleep(2000);
		for(int i=0;i<=s2.length()-1;i++) 
		{
			e4.sendKeys(Keys.END);
			e4.sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(2000);
	
 }
 
 static void CapslockKey(String s3) throws InterruptedException 
 {
	 e4.sendKeys(Keys.SHIFT +s3);
		e4.sendKeys(Keys.TAB);
		driver.quit();
		
 }
	public static void main(String[] args) throws InterruptedException {
		LaunchBrowser("file:///C:/Users/User/Downloads/learningHTML1.html");
		EnterKey("Mayuri");
		Copy_Paste();
		DeleteKey("65hhgjhg87ggbb","76878hvhv nbb");
		BackspaceKey("Rihaan");
		CapslockKey("Rihaan");
	}

}