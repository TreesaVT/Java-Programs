package seleniumprograms;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.asserts.SoftAssert;
public class SoftAssertGoogleSearchTitle {

	public static void main(String[] args) {
		EdgeDriver driver= new EdgeDriver();
		SoftAssert s1=new SoftAssert();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		s1.assertEquals(driver.getTitle(), "Treesa");//if passed google istead of Treesa,no assertion error
		
		s1.assertAll();//if not used this method assertion error will not show at the end also

	}

}
