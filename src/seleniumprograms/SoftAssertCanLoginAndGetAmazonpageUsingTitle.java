package seleniumprograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.asserts.SoftAssert;

public class SoftAssertCanLoginAndGetAmazonpageUsingTitle {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		FileInputStream f1=new FileInputStream("C:\\Users\\User\\eclipse-workspace\\Selenium\\ExcelSheet\\SoftAssertCanLoginAndGetAmazonpageUsingTitle.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		String UN=w1.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
		String PWD=w1.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D155259813593%26hvpone%3D%26hvptwo%3D%26hvadid%3D674893540034%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D3047623351284398171%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9061994%26hvtargid%3Dkwd-64107830%26hydadcr%3D14452_2316413%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		SoftAssert s1=new SoftAssert();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.findElement(By.id("ap_email")).sendKeys(UN);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys(PWD);
		driver.findElement(By.id("signInSubmit")).click();//intentionally removing O to get assertion error
		Thread.sleep(2000);
		driver.navigate().refresh();
		WebElement e1=driver.findElement(By.id("(nav-link-accountList-nav-line-1"));
		String actualText= e1.getText();
		String expectedText="Hello, Treesa";
		boolean validate=actualText.contains(expectedText);
		s1.assertEquals(validate, false,"Failed to login");
		//s1.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	    s1.assertAll();
	}

}
