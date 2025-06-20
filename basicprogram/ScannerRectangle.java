package basicprogram;

import java.util.Scanner;

public class ScannerRectangle {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the value of length");
		int l=s1.nextInt();
		System.out.println("Please enter the value of breadth");
		int b=s1.nextInt();
		int circumference=2*(l+b);
		int area=l*b;
		System.out.print("Area of Rectangle = ");
		System.out.println(area);
		System.out.print("Circumference of Rectangle = ");
		System.out.println(circumference);
		s1.close();
		

	}

}
