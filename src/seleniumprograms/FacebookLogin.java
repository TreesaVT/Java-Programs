package seleniumprograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1=new FileInputStream("C:\\Users\\User\\eclipse-workspace\\Selenium\\ExcelSheet\\SoftAssertCanLoginAndGetAmazonpageUsingTitle.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		String UN=w1.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
		String PWD=w1.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys(UN);
		driver.findElement(By.id("pass")).sendKeys(PWD);
		driver.findElement(By.id("loginbutton")).click();
	}

}
