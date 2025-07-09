import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BrokenLinksinAmazon {

	public static void main(String[] args) throws IOException {
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.Amazon.in/");
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
				System.out.println("The link is valid "+url+" "+c1.getResponseMessage()+" "+c1.getResponseCode());
			}
			else
			{
				
				System.out.println("The link is invalid "+url+" "+c1.getResponseMessage()+" "+c1.getResponseCode());
			    
			}
			}
			catch(MalformedURLException e1)
			{
				if (url!=null && !url.isEmpty()) 
				{
					String domain="https://amazon.in"+url;
				
				
				URL u1=new URL(domain);
				HttpURLConnection c2=(HttpURLConnection)u1.openConnection();
				if(c2.getResponseCode()==200||c2.getResponseCode()==201)
				{
					System.out.println("The link is valid "+domain+" "+c2.getResponseMessage()+" "+c2.getResponseCode());
				}
				else
				{
                 System.out.println("The link is invalid "+domain+" "+c2.getResponseMessage()+" "+c2.getResponseCode());
				}
			    }
				else
				{
					System.out.println("The link is invalid "+url);
				}
				
			}
		
	}

	}


