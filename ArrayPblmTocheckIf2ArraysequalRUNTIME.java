package basicprogram;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayPblmTocheckIf2ArraysequalRUNTIME {
	static Scanner s1=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size of 1st Array");
		int input1[]=new int[s1.nextInt()];
		System.out.println("Enter the size of 2nd Array");
		int input2[]=new int[s1.nextInt()];
		for(int i=0,j=0;(i<input1.length)&&(j<input2.length);i++,j++)
		{
			//try{
				System.out.println("Enter the Value of 1st Array at index "+i);
			    input1[i]=s1.nextInt();
			    System.out.println("Enter the Value of 2nd Array at index "+j);
			    input2[j]=s1.nextInt();
			//}
			//catch(ArrayIndexOutOfBoundsException a1)
			//{
			//}
		}
			boolean b=Arrays.equals(input1, input2);
			if(b==true)
			{
				System.out.println("They are equal");
			}
			else
			{
				System.out.println("entered Arrays are not equal");
			}
		
	}
}
