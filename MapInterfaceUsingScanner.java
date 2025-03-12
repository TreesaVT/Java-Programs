package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapInterfaceUsingScanner {

	public static void main(String[] args) {
		Map<Integer,String> m1=new HashMap<Integer,String>();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter how many key value pairs you want to enter ");
		int a=s1.nextInt();
		for(int i=0;i<a;i++)
		{
				System.out.println("Enter the key and value");
		        m1.put(s1.nextInt(),s1.next());
		}   
		s1.close();
		System.out.println(m1);

	}

}
