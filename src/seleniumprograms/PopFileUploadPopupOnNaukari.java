package seleniumprograms;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopFileUploadPopupOnNaukari {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream f1=new FileInputStream("C:\\Users\\User\\eclipse-workspace\\Selenium\\ExcelSheet\\SoftAssertCanLoginAndGetAmazonpageUsingTitle.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		String UN=w1.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
		String PWD=w1.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.linkText("Login"));
		e1.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement e2=driver.findElement(By.xpath("//input[@id='usernameField']"));
		e2.sendKeys(UN);
		WebElement e3=driver.findElement(By.id("passwordField"));
		e3.sendKeys(PWD);
		WebElement e4=driver.findElement(By.xpath("//button[.='Login']"));
		e4.click();
		Thread.sleep(8000);
		WebElement e5=driver.findElement(By.xpath("//div[@class='other-info-wrapper']/div/a"));//div[@class='other-info-wrapper']/div/a
		e5.click();
		Thread.sleep(3000);
		WebElement e6=driver.findElement(By.id("attachCV"));
		
		e6.sendKeys("C:\\Users\\User\\OneDrive\\Desktop\\Treesa VT_3.5 YOE_AutomationTesting.pdf");
		
	}

}
