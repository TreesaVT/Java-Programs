package seleniumprograms;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class NoOfLinksandURLandTextOfEachLink {

	public static void main(String[] args)
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
			
		
		}
	}

		
		
	}
	
	
	

