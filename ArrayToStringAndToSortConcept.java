package basicprogram;

import java.util.Arrays;

public class ArrayToStringAndToSortConcept {

	public static void main(String[] args) {
		int input[]=new int[3];
		input[0]=20;
		input[1]=59;
		input[2]=14;
		Arrays.sort(input);
		String input1[]=new String[2];
		input1[0]="treesa";
		input1[1]="java";
		Arrays.sort(input1);
		System.out.println(Arrays.toString(input));
		System.out.println(Arrays.toString(input1));
		
	}

}
