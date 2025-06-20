package basicprogram;

import java.util.Scanner;

class Parent1
{
	static int a=10;
	int b;
	static Scanner s1=new Scanner(System.in);
	static void add()
	{
		Parent1 p1=new Parent1();
		System.out.println("Enter a value");
				p1.b=s1.nextInt();
		System.out.println("Value is "+ p1.b);
	}
	
}
/*class Parent2
{
	static int a=20;
	void sub()
	{
		System.out.println(a);
	}
}*/

class HirarchealLevelInheritance1 extends Parent1
{
 void div()
	{
		int d=4;
		int sum=d+a;
		System.out.println(sum);
	}
}

public class HirarchealLevelInheritance extends Parent1 {
static void mul()
{
	Parent1 p1=new Parent1();
	int g=p1.b;
	System.out.println(g);
}
	public static void main(String[] args) {
		mul();		
        add();
        HirarchealLevelInheritance1 h1=new HirarchealLevelInheritance1();
        h1.div();
        //h1.sub();
	}

}
