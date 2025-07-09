package facebooksource;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	ChromeDriver driver;
	//stp1
	@FindBy (id="email")
	WebElement username;
	
	@FindBy (id="pass")
	WebElement password;
	
	@FindBy (xpath="//button")
	WebElement loginbutton;
	
	//stp2
	public void un()
	{
		username.sendKeys("treesa.jincy43@gmail.com");
	}
	public void pwd()
	{
		password.sendKeys("Jincy@43");
	}

	public void login()
	{
		loginbutton.click();
	}

	
	//stp3
	public Loginpage(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
