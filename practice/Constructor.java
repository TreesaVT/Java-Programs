package practice;
class Constructor1
{
	Constructor1()
	{
		this(5);
		System.out.println("addition");
	}
	Constructor1(int a)
	{
		
		System.out.println("sub");
	}
}
class Constructor2 extends Constructor1
{
	Constructor2(double b)
	{
		//super();
		System.out.println("mul");
	}
}
class Constructor3 extends Constructor2
{
	Constructor3()
	{
		super(7.5);
		System.out.println("div");
	}
}
public class Constructor extends Constructor3
{
	Constructor()
	{
		//super();
		System.out.println("mod");
	}
	Constructor(int a)
	{
		this();
		System.out.println("god");
	}
	Constructor(double b)
	{
		this(5);
		System.out.println("devil");
	}

	public static void main(String[] args) {
		new Constructor(7.9);
		

	}

}
