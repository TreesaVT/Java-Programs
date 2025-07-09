package amzsource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage 
{
	WebDriver driver;
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountandlist;
	
	@FindBy(linkText="Start here.")
	WebElement register;
	
	@FindBy(xpath="(//span[.='Sign in'])[1]")
	WebElement signinbutton;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchbutton;
	
	//2
	public void acntndlst(WebDriver driver)
	{
		Actions a1=new Actions(driver);
	    a1.moveToElement(accountandlist).perform();
	}
	
	public void signin()
	{
		signinbutton.click();
	}
	
	public void rgstr()
	{
		register.click();
	}
	
	public void search()
	{
		searchbutton.sendKeys("shoe"+Keys.ENTER);
	}

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
