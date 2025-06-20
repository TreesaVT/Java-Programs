package practice;

import java.util.Scanner;

public class Scannertwice {

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
		
		Scanner s2= new Scanner(System.in);
		System.out.println("Please enter the value of a");
		int a=s2.nextInt();
		System.out.println("Please enter the value of b");
		int b=s2.nextInt();
		System.out.println("Please enter the value of c");
		int c=s2.nextInt();
		System.out.println("Please enter the value of h");
		int h=s2.nextInt();
		double area=0.5*b*h;
		double circumference=a+b+c;
		System.out.print("Area of Triangle = ");
		System.out.println(area);
		System.out.print("Circumference of Triangle = ");
		System.out.println(circumference);
		
		square();
		s2.close();
	}
}

/*import java.util.Scanner;

public class Scannertwice {

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
		Scanner s2= new Scanner(System.in);
		System.out.println("Please enter the value of a");
		int a=s2.nextInt();
		System.out.println("Please enter the value of b");
		int b=s2.nextInt();
		System.out.println("Please enter the value of c");
		int c=s2.nextInt();
		System.out.println("Please enter the value of h");
		int h=s2.nextInt();
		double area=0.5*b*h;
		double circumference=a+b+c;
		System.out.print("Area of Triangle = ");
		System.out.println(area);
		System.out.print("Circumference of Triangle = ");
		System.out.println(circumference);
		square();
	}

}*/