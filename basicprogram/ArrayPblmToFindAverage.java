package basicprogram;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPblmToFindAverage {

	public static void main(String[] args) {
		double array1[]=new double[4];
		array1[0]=10;
		array1[1]=20;
		array1[2]=30;
		array1[3]=20;
		double sum=0;
		double average;
		for(int i=0;i<array1.length;i++)
		{
			sum=sum+array1[i];
		}
		System.out.println(sum);
		average=sum/array1.length;
		System.out.println(average);
	}

}
