package airline;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.asserts.SoftAssert;

public class FilterPriceRange {

	public static void main(String[] args) throws InterruptedException {
//		EdgeDriver driver= new EdgeDriver();
//		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=6702474105936519475&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061994&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
//		driver.manage().window().maximize();
//		WebElement e1= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//		e1.sendKeys("mobiles"+Keys.ENTER);
//		Thread.sleep(1000);
//		List<WebElement> e2=driver.findElements(By.xpath("//span[@class='rush-component s-latency-cf-section']/div/div"));
//		WebElement e3= driver.findElement(By.linkText("Featured"));
//		e3.click();
//		e3.sendKeys(Keys.ARROW_DOWN);
//		e3.sendKeys(Keys.ENTER);
//		Collections.sort(e2);
		EdgeDriver driver = new EdgeDriver();
		SoftAssert s1 = new SoftAssert();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//button[@class='nav-flyout-button nav-icon nav-arrow'])[2]")).click();
		driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("treesa.jincy43@gmail.com");
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Jincy@43");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		WebElement e1 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		e1.sendKeys("mobile" + Keys.ENTER);
		
		driver.findElement(By.xpath("//span[.='Sort by:']")).click();//(//a[@class='a-dropdown-link'])[1]
		driver.findElement(By.xpath("(//div[@class='a-popover-inner']/ul/li)[2]")).click();
		
		List<WebElement> shoes = driver.findElements(By.xpath("//div[@class='a-section a-spacing-base']"));
		List<Integer> priceList = new ArrayList<Integer>();

		for (WebElement shoe : shoes) {
			try {
				WebElement priceElement = shoe.findElement(By.xpath("//span[@class='a-price-whole']"));
				String priceText = priceElement.getText().replace(",", "").trim();

				if (!priceText.isEmpty() && priceText.matches("\\d+")) {
					priceList.add(Integer.parseInt(priceText));
					System.out.println("Found price: " + priceText);
				} else {
					System.out.println("Skipped invalid price: " + priceText);
				}
			} catch (NoSuchElementException e) {
				System.out.println("Price not found in this shoe block — skipping.");
			}
		}

		// Sort and compare
		List<Integer> sortedPrices = new ArrayList<Integer>(priceList);
		Collections.sort(sortedPrices);

		// Assertion
		s1.assertEquals(priceList, sortedPrices, "Prices are NOT sorted low to high!");
		System.out.println("Price sorting check complete.");
		s1.assertAll();
	}
}



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class TestCase11_ 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		FileInputStream f1 = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Project3\\ExcelSheets\\Praveen_Excel.xlsx");
		Workbook w1= WorkbookFactory.create(f1);
		String un= NumberToTextConverter.toText(w1.getSheet("Login").getRow(1).getCell(0).getNumericCellValue());
		String pw= NumberToTextConverter.toText(w1.getSheet("Login").getRow(1).getCell(1).getNumericCellValue());
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		SoftAssert s1= new SoftAssert();
		driver.get("https://www.amazon.in/");
		WebElement e1= driver.findElement(By.xpath("(//div[@class='nav-div'])[2]"));
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();
		WebElement e2= driver.findElement(By.xpath("//input[@name='email']"));
		e2.sendKeys(un);
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		WebElement e3= driver.findElement(By.xpath("//input[@name='password']"));
		e3.sendKeys(pw);
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		
		WebElement e4= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		e4.sendKeys("shoe" +Keys.ENTER);
		Thread.sleep(2000);
		WebElement e5= driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		e5.click();
		Thread.sleep(3000);
		Set<String> windowHandles = driver.getWindowHandles();
		for (String handle : windowHandles)
		{
			driver.switchTo().window(handle);
		}
		WebElement e6 = driver.findElement(By.xpath("//input[@id='buy-now-button']"));
		e6.click();
		
		
		WebElement e7= driver.findElement(By.xpath("//h2[@id='deliver-to-customer-text']"));
		//List<WebElement> e7 = driver.findElements(By.xpath("(//div[@class='a-column a-span5'])/div/ul/li"));
		String Adress= e7.getText();
		System.out.println(Adress);
		s1.assertEquals(e7.isDisplayed(), true);
		
		
		Thread.sleep(2000);
		WebElement paymentMethod = driver.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[2]"));
		paymentMethod.click();
		//s1.assertEquals(paymentMethod.isSelected(), true);
		s1.assertTrue(paymentMethod.isSelected()," UPI payment button selected");
		
		s1.assertAll();
		
	}
}

package mavenProblems.MavenProject;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_For_Sort {
	@Test
	public void sort() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Shoes");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement dd = driver.findElement(By.cssSelector("[id=s-result-sort-select]"));
		Select s1 = new Select(dd);
		s1.selectByIndex(1);
		driver.navigate().refresh();
		Thread.sleep(2000);
		List<WebElement> priceElements = driver.findElements(By.cssSelector("span.a-price-whole"));
		List<Integer> actualPrices = new ArrayList<>();

		for (int i = 5; i < priceElements.size(); i++) {
			String text = priceElements.get(i).getText().replace(",", "").trim();
			if (!text.isEmpty()) {

				try {
					actualPrices.add(Integer.parseInt(text));
				} catch (NumberFormatException e) {
					System.out.println("Skipped non-numeric price: " + text);
				}
			}

		}

		System.out.println("Actual Prices: " + actualPrices);

		// Create a copy and sort it to compare
		List<Integer> expectedPrices = new ArrayList<>(actualPrices);
		Collections.sort(expectedPrices);
		System.out.println(expectedPrices);

		// Assertion
		//Assert.assertNotEquals(actualPrices, expectedPrices);
		Assert.assertNotEquals(actualPrices, expectedPrices);
	}

}