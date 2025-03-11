package basicprogram;
class ThisWithSuper
{
	ThisWithSuper()
	{
		System.out.println("This is ThisWithSuper class");
	}
}
public class ThisCallingStatment extends ThisWithSuper
{
	ThisCallingStatment()
	{
		this(0.5);
		System.out.println("A");
	}
		ThisCallingStatment(double a)
	{
		this(7,0.5);
		System.out.println("B");
	}
		ThisCallingStatment(int a,double b)
	{
		
		System.out.println("C");
	}
	public static void main(String[] args) 
	{
		new ThisCallingStatment();
	}
}
