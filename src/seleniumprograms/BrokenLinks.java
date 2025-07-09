package seleniumprograms;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException
	{
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		List<WebElement> e1=driver.findElements(By.tagName("a"));
		int count=e1.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			WebElement e2=e1.get(i);
			String URL=e2.getDomAttribute("href");
			String text=e2.getText();
			System.out.println("URL at index"+i+'='+URL);
			System.out.println("text at index"+i+'='+text);
			verifythelink(URL);
		
		}
	}
	static void verifythelink(String url) throws IOException
	{
			try{
				URL u1= new URL(url);
			HttpURLConnection c1=(HttpURLConnection)u1.openConnection();
			if(c1.getResponseCode()==200||c1.getResponseCode()==201)
			{
				System.out.println("The link is valid "+url+" "+c1.getResponseMessage());
			}
			else
			{
				System.out.println("The link is invalid "+url+" "+c1.getResponseMessage());
			}
			}
			catch(MalformedURLException e1)
			{
				System.out.println("Had Exception with the breakfast");
			}
		
	}
	

}
