package basicprogram;
import java.util.Scanner;
public class ScannerSquare {
		static void square()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the value of a");
		int a=s1.nextInt();
		int area=a*a;
		int circumference=4*a;
		System.out.print("Area of Square = ");
		System.out.println(area);
		System.out.print("Circumference of Square = ");
		System.out.println(circumference);
		s1.close();
	}

	public static void main(String[] args) 
	{
		square();
	}
}
