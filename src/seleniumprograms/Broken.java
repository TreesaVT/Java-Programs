package seleniumprograms;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken {
	public static void main(String[] args) throws IOException
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		List<WebElement>e1=driver.findElements(By.tagName("a"));
		int count= e1.size();
		System.out.println(count);
		
		for(int i=0; i<count; i++)
		{
		WebElement e2= e1.get(i);
		String text=e2.getText();
		String url=e2.getDomAttribute("href");
		//System.out.println(text);
		System.out.println(url);
		verifythelink(url);

}
	}
	static void verifythelink(String Url) throws IOException
	{
		try {
		URL u1=new URL(Url);
		
		HttpURLConnection c1=				(HttpURLConnection) u1.openConnection();
			if(	c1.getResponseCode()==200)
			{
				System.out.println("The link is valid-> " + Url +" "+   c1.getResponseMessage());
			}
			else
			{
				System.out.println("The link is not valid-> "+Url+ " "+ c1.getResponseMessage());

			}
		}
		catch(MalformedURLException e1)
		{
			String domine = "https://www.google.co.in"+Url;
			URL u1=new URL(domine);
			
			HttpURLConnection c1=				(HttpURLConnection) u1.openConnection();
				if(	c1.getResponseCode()==200)
				{
					System.out.println("The link is valid-> " + domine +" "+   c1.getResponseMessage());
				}
				else
				{
					System.out.println("The link is not valid-> "+ domine+ " "+ c1.getResponseMessage());

				}
			System.out.println("Program Executed from cach block");
		}

	}
}