package basicprogram;
import java.util.Scanner;
public class Caluculator {
	static Scanner s1=new Scanner(System.in);
		public static void main(String[] args) {
		System.out.println("Enter the 1st digit");
		double a=s1.nextDouble();
		System.out.println("Enter the 2nd digit");
		double b=s1.nextDouble();
		System.out.println("Enter the 3rd digit");
		double c=s1.nextDouble();
		System.out.println("Enter the 4th digit");
		double d=s1.nextDouble();
		double sum=a+b+c+d;
		System.out.println("sum is "+sum);
		s1.close();
	}
}
