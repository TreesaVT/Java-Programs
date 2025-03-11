package basicprogram;

import java.util.Arrays;

public class StringToCharArray {

	public static void main(String[] args) {
		String a="Treesa is";
		char[] b=a.toCharArray();//this converts the string into char of array.
		System.out.print(b[0]);//New array will be[T,r,e,e,s,a, ,i,s]
		System.out.print(b[1]);//1st method
		System.out.print(b[2]);
		System.out.print(b[3]);
		System.out.println(b[4]);
		System.out.print(b[5]);
		System.out.print(b[6]);
		System.out.print(b[7]);
		System.out.println(b[8]);
		for(int i=0;i<a.length();i++)//2nd method
		{
			System.out.println(b[i]);
		}
		System.out.println(Arrays.toString(b));//3rd method
						
	}

}
