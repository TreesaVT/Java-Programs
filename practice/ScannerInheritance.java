package practice;

import java.util.Scanner;

public class ScannerInheritance {
	
	 static int a;
 int b=30;
	static int c=20;
	
	public static void main(String[] args) {
		//ClassB c1=new ClassB();
		ScannerInheritance s=new ScannerInheritance();
		s.mul();
		ClassB.sub();
		
		add();
	}
	
	void mul()
	{
		a=b+c;
		System.out.println(a);
	}
	static void add()
	{
		System.out.println("Sum of integers:");
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter value for a");
		a=s1.nextInt();
		System.out.println("Enter value for b");
		int b=s1.nextInt();
		System.out.println(a+b);
		s1.close();
	}
	}

	class ClassB extends ScannerInheritance
	{
		static void sub()
		{
			System.out.println("Difference of integers:");
			Scanner s2=new Scanner(System.in);
			System.out.println("Enter value for a");
			a=s2.nextInt();
			System.out.println("Enter value for b");
			int b=s2.nextInt();
			System.out.println(a-b);
			//s2.close();
			
			
		}
	}

	


