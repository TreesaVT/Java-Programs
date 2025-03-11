package basicprogram;

import java.util.Scanner;

public class ScannerAreaPrograms {
	
	static void circle()
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Please enter the Radius");
		int r=s1.nextInt();
		double pivalue=Math.PI;
		double area=pivalue*r*r;
		double circumference=2*pivalue*r;
		System.out.print("Area of Circle = ");
		System.out.println(area);
		System.out.print("Circumference of Circle = ");
		System.out.println(circumference);
		s1.close();
	}

	public static void main(String[] args) {
		circle();
	}

}
