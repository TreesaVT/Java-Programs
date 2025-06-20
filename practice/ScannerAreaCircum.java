package practice;

import java.util.Scanner;

public class ScannerAreaCircum {
	static Scanner s1= new Scanner(System.in);
	static double area;
	static double circumference;
	static void circle()
	{
		double pivalue=Math.PI;
		System.out.println("Enter the radius");
		double r=s1.nextDouble();
		area=pivalue*r*r;
		System.out.println("Area of Circle "+area);
		circumference=2*pivalue*r;
		System.out.println("Circumfernce of Circle "+circumference);
		
	}
	static void rectangle()
	{
		System.out.println("Enter the length");
		double l=s1.nextDouble();
		System.out.println("Enter the breadth");
		double b=s1.nextDouble();
		area=l*b;
		circumference=2*(l+b);
		System.out.println("Area of Rectangle "+area);
		System.out.println("Circumfernce of Rectangle "+circumference);
	}
	static void square()
	{
		System.out.println("Enter the length");
		double l=s1.nextDouble();
		area=l*l;
		circumference=4*l;
		System.out.println("Area of square "+area);
		System.out.println("Circumfernce of square "+circumference);
	}
	static void triangle()
	{
		System.out.println("Enter the breadth");
		double b=s1.nextDouble();
		System.out.println("Enter the hieght");
		double h=s1.nextDouble();
		System.out.println("Please enter the value of a");
		int a=s1.nextInt();
		System.out.println("Please enter the value of c");
		int c=s1.nextInt();
		area=0.5*b*h;
		circumference=a+b+c;
		System.out.println("Area of Triangle "+area);
		System.out.println("Circumfernce of Triangle "+circumference);
	}
	

	public static void main(String[] args) {
		circle();
		rectangle();
		square();
		triangle();
		s1.close();

	}

}
