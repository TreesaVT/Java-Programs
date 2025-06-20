package basicprogram;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a string array SIZE");
		String [] array1=new String[s1.nextInt()];
		String[] reverse=new String[array1.length];
		for(int i=0,j=array1.length-1;i<array1.length;i++,j--)
		{
			System.out.println("Enter a string array at index "+i);
			array1[i]=s1.next();
			reverse[j]=array1[i];
		}
		s1.close();
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(reverse));

	}

}
