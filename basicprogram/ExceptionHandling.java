package basicprogram;

public class ExceptionHandling {
	static void div()
	{
		
		//int b=1 value comes from parent class A(developerA)
		//int c=0  value comes from parent class B(developer B)
		//a=b/c
		
		//1/0=infinity
		//0/1=0
		try {
		int a=1/0;
		System.out.println(a);
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Exception handled");
		}
		catch(NullPointerException a2)//depending on the exception which we get under try respective catch will execute
		{
			System.out.println("Exception handled2");
		}
	}

	public static void main(String[] args) {
		div();
	

	}

}
