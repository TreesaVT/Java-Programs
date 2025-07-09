package amztest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import amzsource.HomePage;
import amzsource.LoginPage;

public class Testcase3_Registernewuser {
	@Test
	public void RegisternewUser() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		
		HomePage home=new HomePage(driver);
		home.acntndlst(driver);
		home.rgstr();
		
		<class name="packageAmazon.ProjectAmazon.Testcase2_LogintoAmazon"/>
	      <class name="packageAmazon.ProjectAmazon.Testcase3_LoginFailswithIncorrectEmailorPassword"/>
	      <class name="packageAmazon.ProjectAmazon.Testcase4_EditProfileInfo"/>
	      <class name="packageAmazon.ProjectAmazon.Testcase5_LogintoAmazon_SearchforAproduct"/>
	      
	      <class name="packageAmazon.ProjectAmazon.Testcase7_ProductpagedisplaysPriceReviews"/>
	      
	      <class name="packageAmazon.ProjectAmazon.Testcase9_ProductaddedtoCart"/>
	      <class name="packageAmazon.ProjectAmazon.Testcase10_AddandRemoveItemQuantity"/>
	      <class name="packageAmazon.ProjectAmazon.Testcase11_SelectEachPaymentMethod"/>
	      <class name="packageAmazon.ProjectAmazon.Testcase12_CheckoutProcessAddressPaymentSelectionOrderreview"/>
	      <class name="packageAmazon.ProjectAmazon.Testcase13_ApplyforCouponCodeWhileOrdering"/>
	       <class name="packageAmazon.ProjectAmazon.Testcase14_ProductRating"/>
	      <class name="packageAmazon.ProjectAmazon.Testcase15_ReachtillCartPageWithoutLogin"/>
	      
		
		LoginPage login=new LoginPage(driver);
		login.un();
		login.cont();
		login.pwd();
		login.signin();
		SoftAssert s1=new SoftAssert();
		s1.assertEquals(accountandlist.getText(), "Treesa");
	}

}
/*<suite name="Suite">
<test thread-count="5" name="Testing in chrome">
<parameter name="browser" value="chrome"></parameter>
  <classes>
    <class name="packageAmazon.ProjectAmazon.Testcase1_LogintoAmazon"/>
    <class name="packageAmazon.ProjectAmazon.Testcase2_LogintoAmazon_SearchforAproduct"/>
  </classes>
  
</test> <!-- Test -->
<test thread-count="5" name="Testing in edge">
<parameter name="browser" value="edge"></parameter>
  <classes>
    <class name="packageAmazon.ProjectAmazon.Testcase1_LogintoAmazon"/>
    <class name="packageAmazon.ProjectAmazon.Testcase2_LogintoAmazon_SearchforAproduct"/>
  </classes>
</test> <!-- Test -->

<test thread-count="5" name="Testing in firefox">
<parameter name="browser" value="firefox"></parameter>
  <classes>
    <class name="packageAmazon.ProjectAmazon.Testcase1_LogintoAmazon"/>
    <class name="packageAmazon.ProjectAmazon.Testcase2_LogintoAmazon_SearchforAproduct"/>
  </classes>
</test> <!-- Test -->
</suite> <!-- Suite -->*/