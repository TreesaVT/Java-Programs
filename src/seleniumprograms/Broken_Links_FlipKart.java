package seleniumprograms;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Broken_Links_FlipKart 
{
	public static void main(String[] args) throws IOException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/?gad_source=1&gbraid=0AAAAAohTLnISWmf_yCWAVDyQNs2yeR1d0&gclid=EAIaIQobChMI9b7IqJT_jAMV16NmAh2n8RqBEAAYASAAEgJBLvD_BwE");
	driver.manage().window().maximize();
	List <WebElement> list=driver.findElements(By.tagName("a"));
	int size=list.size();
	System.out.println(size);
	
	for(int i=0; i<size; i++)
	{
		WebElement e2=list.get(i);
		String url=e2.getDomAttribute("href");
		
		if(url==null||url.isEmpty())
		{
			System.out.println("url is is null or empty");
			continue;
		}
		
//		try
//		{
//			URL u1=new URL(url);
//			HttpsURLConnection h1= (HttpsURLConnection) u1.openConnection();
////			h1.setRequestMethod("HEAD");
////			h1.connect();
//			
//			if(h1.getResponseCode()>=400)
//			{
//				System.out.println("Broken Links: "+url);
//			}
//			else
//			{
//				System.out.println("Valid links: "+ url);
//			}
//		}
//		catch(Exception e)
//		{
//			
//		}
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
		catch(Exception e1)
		{
			//System.out.println("Had Exception with the breakfast");
		}
	
	}
	
	}
	

}

