package airline;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class RegisterNewUser {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get(null);
		AmazonPage amazonPage= new AmazonPage(driver);
		amazonPage.launchUrl();
		Thread.sleep(2000);
		String loginMsg=amazonPage.LoginWithValidUser();
		SoftAssert softassert= new SoftAssert();
		softassert.assertEquals(loginMsg, "Hello, Devidas","User is not logged in, or incorrect");
		
		List<String> HWActualValues = amazonPage.editUserInfo("172", "78");
		List<String> expValues=new ArrayList<String>();
		expValues.add("172 cm");
		expValues.add("78 kg");
		boolean isValuesMatching=HWActualValues.containsAll(expValues);
		softassert.assertTrue(isValuesMatching,"Condition not matching test failed");
		softassert.assertAll();
		Thread.sleep(2000);
		driver.quit();

	}

}
