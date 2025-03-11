package basicprogram;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcptnHndligWhen2Exceptions //2 exceptions may occur for single scenario
{

	public static void main(String[] args) {
		try
		{
			Scanner s1=new Scanner(System.in);
			System.out.println("Please enter the size of array");
			int rollno[]=new int[s1.nextInt()];
		}
		catch(InputMismatchException a1)
		{
			
			System.out.println("Please enter the size of array Only numeric");
		
		}
		catch(NegativeArraySizeException a2)
		{
					System.out.println("Please enter the size of array, No negative numbers");
		}
	}

}
