package basicprogram;
import java.util.Scanner;
public class ScannerTriangle {
	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Please enter the value of a");
		int a=s1.nextInt();
		System.out.println("Please enter the value of b");
		int b=s1.nextInt();
		System.out.println("Please enter the value of c");
		int c=s1.nextInt();
		System.out.println("Please enter the value of h");
		int h=s1.nextInt();
		double area=0.5*b*h;
		double circumference=a+b+c;
		System.out.print("Area of Triangle = ");
		System.out.println(area);
		System.out.print("Circumference of Triangle = ");
		System.out.println(circumference);
		s1.close();
		}
}
