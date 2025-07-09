package testNg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithExcel {
	@DataProvider(name="loginfeature")
	  public Object[][] obj()  throws InterruptedException, EncryptedDocumentException, IOException
	  {
		FileInputStream f1 = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\Selenium\\ExcelSheet\\DataProviderAnnotationFBlogin.xlsx");
	     Workbook w= WorkbookFactory.create(f1);
	     Sheet sheet=w.getSheetAt(0);
	     int rowcount = sheet.getLastRowNum();
	     int columncount = sheet.getRow(0).getLastCellNum();
	     
	     Object[][] data=new Object[rowcount][columncount];
	     for (int i = 1; i <= rowcount; i++) {
	         Row row = sheet.getRow(i);
	         if (row != null) {
	             for (int j = 0; j < columncount; j++) {
	                 Cell cell = row.getCell(j);
	                 if (cell != null) {
	                     data[i - 1][j] = cell.getStringCellValue();
	                 } else {
	                	 data[i - 1][j] = ""; // or some default value
	                 }
	             }
	         } else {
	            System.out.println("Handle the case when row is null"); // Handle the case when row is null
	         }
	     }
	     return data;
	 }
	 
	@Test(dataProvider="loginfeature")
	public  void facebooklogin(String UN, String PWD)throws InterruptedException
	{
	     
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(UN);
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys(PWD);
		driver.findElement(By.name("login")).click();
		Thread.sleep(8000);
	}
}