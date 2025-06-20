package basicprogram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

public class ExceptionHandlingChecked {

	public static void main(String[] args) throws FileNotFoundException, MalformedURLException, InterruptedException {
		for(int i=1;i<50;i++)
		{
			System.out.println(i);
			Thread.sleep(2000);
		}
		URL u1 =new URL("https://www.amazon.in");
		
		FileInputStream f1=new FileInputStream("Location of file");

	}

}
