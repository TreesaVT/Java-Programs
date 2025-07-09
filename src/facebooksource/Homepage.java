package facebooksource;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	ChromeDriver driver;
	//stp1
	@FindBy (xpath="//input[@placeholder='Search Facebook']")
	WebElement search;
	
	//stp2
	public void srch()
	{
		search.sendKeys("Sachu"+Keys.ENTER);
	}
	
	
	//stp3
	public Homepage(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
