package basicprogram;

import java.util.Arrays;
//import java.util.Scanner;

public class ArrayPblmToCopyOneArrayToAnother {

	public static void main(String[] args) {
		int array1[]=new int[4];
		array1[0]=45;
		array1[1]=32;
		array1[2]=60;
		array1[3]=12;
		Arrays.sort(array1);//not required here
		/*TO ENTER THE ARRAY VALUE AT RUNTIME
		 Scanner s1=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int array1[]=new int[s1.nextInt()];
		for(int i=0;i<array1.length;i++)
		{
			System.out.println("Enter the Value of Array at index "+i);
		    array1[i]=s1.nextInt();
		}
		s1.close();*/
		
		int array2[]=new int[array1.length];
		for(int i=0;i<array1.length;i++)
		{
			array2[i]=array1[i];
		}
		System.out.println("Input Array "+Arrays.toString(array1));
		System.out.println("Copied Array "+Arrays.toString(array2));
	}

}
