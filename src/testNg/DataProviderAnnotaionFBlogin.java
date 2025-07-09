package testNg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotaionFBlogin 
{
	@DataProvider(name="loginfeature")
	public Object[][] data1() throws EncryptedDocumentException, IOException
	{
		
		FileInputStream f1=new FileInputStream("C:\\Users\\User\\eclipse-workspace\\Selenium\\ExcelSheet\\DataProviderAnnotationFBlogin.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		String un1=w1.getSheet("Login").getRow(0).getCell(0).getStringCellValue();
		String pwd1=w1.getSheet("Login").getRow(0).getCell(1).getStringCellValue();
//		String un2=w1.getSheet("Login").getRow(1).getCell(0).getStringCellValue();number we need to extra step and blank wont expect
//		String pwd2=w1.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
//		String un3=w1.getSheet("Login").getRow(2).getCell(0).getStringCellValue();
//		String pwd3=w1.getSheet("Login").getRow(2).getCell(1).getStringCellValue();
//		String un4=w1.getSheet("Login").getRow(3).getCell(0).getStringCellValue();
//		String pwd4=w1.getSheet("Login").getRow(3).getCell(1).getStringCellValue();
//		String un5=w1.getSheet("Login").getRow(4).getCell(0).getStringCellValue();
//		String pwd5=w1.getSheet("Login").getRow(4).getCell(1).getStringCellValue();
		Object [][] p1=new Object[5][2];
		p1[0][0]=un1;//only valid user name and pwd taking from excel
		p1[0][1]=pwd1;
		p1[1][0]="7892991682";//validUN
		p1[1][1]="fytt";//invalidpwd
		p1[2][0]="tres@gmail.com";//invalidUN
		p1[2][1]="tfff";//invalidpwd
		p1[3][0]="";//blankUN
		p1[3][1]="";//blankpwd
		p1[4][0]="";//blankUN
		p1[4][1]="fgyuyu";//somepwd
		
		/*Object [][] p1=new Object[5][2];//1st row
		p1[0][0]="treesa.jinc43@gmail.com";//validUN
		p1[0][1]="ddffdd";//validpwd
		//2nd row
		p1[1][0]="7892991682";//validUN
		p1[1][1]="fytt";//invalidpwd
		p1[2][0]="tres@gmail.com";//invalidUN
		p1[2][1]="tfff";//invalidpwd
		p1[3][0]="";//blankUN
		p1[3][1]="";//blankpwd
		//5th row
		p1[4][0]="";//blankUN
		p1[4][1]="fgyuyu";//somepwd
		return p1;*/
		return p1;
	}	
	@Test(dataProvider="loginfeature")
	public void testCase1(String un,String pwd)
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.id("loginbutton")).click();
	}
	
}
