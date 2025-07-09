package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodsLogic 
{
	@Test
	public void login()
	{
		Assert.assertEquals(false, false);//test case will pass and logout will not be skipped
		//Assert.assertEquals(false, true);//test case will fail and logout will  be skipped
	}
	
	@Test(dependsOnMethods="login")
	public void logout()
	{
		Assert.assertEquals(false, false);
	}

}
