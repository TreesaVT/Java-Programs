package testNg;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestCase3 {
	@Test(timeOut=1000)
	public void method3()
	{
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.amazon.in/");
	}
}
