package practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEqualatRuntime {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter size of 1st Array");
		int[] array1=new int[s1.nextInt()];
		System.out.println("Enter size of 2nd Array");
		int[] array2=new int[s1.nextInt()];
		for(int i=0,j=0;(i<array1.length)&&(j<array2.length);i++,j++)
		{
			System.out.println("Enter array value at index "+i);
			s1.next();
			System.out.println("Enter array value at index "+j);
			s1.next();
		}
		boolean b=Arrays.equals(array1, array2);
		System.out.println(b);
		if(b==true)
		{
			System.out.println("Entered arrays are equal");
		}

	}

}
