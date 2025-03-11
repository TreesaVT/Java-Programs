package basicprogram;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling1 {
	public static void main(String[] args) {
		try{
			Scanner s1=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=s1.nextInt();
		System.out.println("The age is "+age);
		}
		catch(InputMismatchException i)
		{
			try{
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter the age where only numeric value expected");
			int age=s1.nextInt();
			System.out.println("The age is "+age);
			}
			catch(InputMismatchException m)
			{
				Scanner s1=new Scanner(System.in);
				System.out.println("Enter the age in numbers else you will be BLOCKED");
				int age=s1.nextInt();
				System.out.println("The age is "+age);
				s1.close();
			}
		}
	}
}
