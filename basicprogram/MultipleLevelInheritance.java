package basicprogram;
import java.util.Scanner;
interface Google11
{
	void method1();
	void method2();
}
interface Google2
{
	void method3();
	void method4();
}
public class MultipleLevelInheritance implements Google11,Google2
{
	String name;
	int a;
	static Scanner s1=new Scanner(System.in);
	public static void main(String[] args) 
	{
		MultipleLevelInheritance m1=new MultipleLevelInheritance();
		m1.method3();
		m1.method4();
		m1.method1();
		m1.method2();
	}
	public void method3() 
	{
		System.out.println("Enter the Name ");
		name=s1.next();
		System.out.println("Name "+name);
	}
	public void method4() 
	{
		System.out.println("Enter the Age ");
		a=s1.nextInt();
		System.out.println("Age"+a);
	}

	public void method1() 
	{
		System.out.println("hello");
	}
	public void method2() 
	{
		System.out.println(name);		
	}
}
