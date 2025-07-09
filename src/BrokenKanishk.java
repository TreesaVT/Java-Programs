import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenKanishk {
static ChromeDriver driver;
static List<WebElement> e1;
//ChromeOptions options = new ChromeOptions();
//options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
//options.setExperimentalOption("useAutomationExtension", false);
// WebDriver driver = new ChromeDriver(options);
	public static void launchBrowser(String url) throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	public static void fetchUrlPages(String url,String domain) throws InterruptedException, IOException
	{
		launchBrowser(url);
		String currentUrl=driver.getCurrentUrl();
		e1=driver.findElements(By.tagName("//a"));
		for (int i=0;i<e1.size();i++)
		{
			String urls=e1.get(i).getDomAttribute("href");
			System.out.println("Url at index position " + i + " is: " + urls);
			if(urls!=null && !urls.isEmpty())
			{
				if(!urls.contains(domain))
				{
					urls=currentUrl.concat(urls);
				}
			}
			System.out.println("Url at index position " + i + " is: " + urls);
            validateURLs(urls);
		}
		driver.quit();
	}
	
	public static void validateURLs(String url) throws IOException
	{
		try {
			URL u1=new URL(url);
			HttpURLConnection c1=(HttpURLConnection) u1.openConnection();
			if(c1.getResponseCode()==200 || c1.getResponseCode()==201)
			{
				 System.out.println("The link is valid-> " + url + " " + c1.getResponseCode() + " " + c1.getResponseMessage());
            } 
			else 
			{
                System.out.println("The link is not valid-> " + url + " " + c1.getResponseCode() + " " + c1.getResponseMessage());
            }
			}
		catch(Exception e)
		{
			System.out.println("Handled");
			
		}
	}
	public static void main(String[] args) throws InterruptedException, IOException {
	
		fetchUrlPages("https://www.google.co.in/","google");
	}

}
