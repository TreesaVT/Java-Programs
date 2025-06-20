package module3;
class Casting
{
	static void method1()
	{
		System.out.println(1);
	}
	
	void method2()
	{
		System.out.println(2);
	}
}

class Casting1 extends Casting
{
	static void method3()
	{
		System.out.println(3);
	}
	
	void method4()
	{
		System.out.println(4);
	}
}
public class TypecastingClassEg extends Casting1
{
	static void method5()
	{
		System.out.println(5);
	}
	
	void method6()
	{
		System.out.println(6);
	}

	public static void main(String[] args) {
		
		Casting1 c1=new TypecastingClassEg();//upcasting
		method1();//static can be accessed directly
		c1.method2();
		method3();
		c1.method4();
		//c1.method5();not possible with method 5 and 6
		
		//DOWNCASTING
		TypecastingClassEg t1=(TypecastingClassEg) c1;//downcasting
		t1.method2();
		t1.method4();
		t1.method6();//as downcasting done,can access method6 also
		
		

	}

}
