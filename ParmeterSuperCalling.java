package basicprogram;
class Google
{
	Google(int a)
	{
		System.out.println(1);
	}
}
class Google1 extends Google
{
	Google1(int a,int b)
	{
		super(4);
		System.out.println(2);
	}
}
public class ParmeterSuperCalling extends Google1


{
	ParmeterSuperCalling(double a)//new method added so that can be called using thisCallingMethod
	{
		this(5);
		System.out.println("this statment only call another contructor within same class");
	}
		ParmeterSuperCalling(int a)
		{
			super(4,5);
			System.out.println(3);
		}
public static void main(String[] args) {
		//new ParmeterSuperCalling(5);
		new ParmeterSuperCalling(4.5);
	}
}
