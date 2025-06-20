package practice;

import java.util.Scanner;

public class ScannerPractice {
	static int a;
	static int b;
	static double pi=Math.PI;
	
	static void add()
	{
		
		double area=pi*a*b;
		System.out.println(area);
	}
	class InheritancePractice 
	{
	static void sub()
	{
		int circumference=a+b;
		System.out.println(circumference);
	}
	}

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter a value");
		a=s1.nextInt();
		System.out.println("Enter b value");
		b=s1.nextInt();
		s1.close();
		add();
		InheritancePractice.sub();

	}

}
