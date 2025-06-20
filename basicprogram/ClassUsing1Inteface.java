package basicprogram;

interface Intrfc1 {
	void method1();
	void method2();
	}

public class ClassUsing1Inteface implements Intrfc1
{

	public static void main(String[] args) 
	{
		ClassUsing1Inteface c1=new ClassUsing1Inteface();
		c1.method1();
		c1.method2();
	}

	public void method1() 
	{
		System.out.println("Code to hide1");
	}

	public void method2() 
	{
		System.out.println("Code to hide2");
	}

}
