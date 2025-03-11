package basicprogram;

import java.util.Scanner;

public class ArratValuesAtRuntime {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int age[]=new int[s1.nextInt()];
		for(int i=0;i<age.length;i++)
		{
			System.out.println("Enter the value of Array at index "+i);
		    age[i]=s1.nextInt();
		}
		s1.close();

	}

}
