package practice;

import java.util.Scanner;

public class ArrayAverage {

	public static void main(String[] args) {
		double sum=0;
		double average;
		//double[] array1=new double[] {1,2,3,4};
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter array size");
		double[] array1=new double[s1.nextInt()];
		for (int i=0;i<array1.length;i++)
		{
			System.out.println("Enter array array valur at index "+i);
			//double a=s1.nextDouble();
			array1[i]=s1.nextDouble();
			sum= sum+array1[i];

		}
		
		s1.close();
		average=sum/array1.length;
		System.out.println(sum);
		System.out.println(average);
		

	}

}
