package practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopyOnetoOther {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a string array SIZE");
		String [] array1=new String[s1.nextInt()];
		String[] array2=new String[array1.length];
		for(int i=0;i<array1.length;i++)
		{
			System.out.println("Enter a string array at index "+i);
			array1[i]=s1.next();
			array2[i]=array1[i];
		}
		s1.close();
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));

	}

}
