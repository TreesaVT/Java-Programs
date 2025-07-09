package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderAnnotationAmazonSearch 
{
	@DataProvider(name="search")
	public Object[][] method1()
	{
		Object[][] data= new Object[10][1];
		data[0][0]="mobile";
		data[1][0]="laptop";
		data[2][0]="mouse";
		data[3][0]="shirt";
		data[4][0]="saree";
		data[5][0]="water bottle";
		data[6][0]="chair";
		data[7][0]="Kids dress";
		data[8][0]="frocks";
		data[9][0]="headphone";
		return data;
	}
	
	@Test(dataProvider="search")
	public void amazonsearch(String input)
	{
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=6702474105936519475&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061994&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		driver.manage().window().maximize();
		WebElement e1= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		e1.sendKeys(input+Keys.ENTER);
	}

}
