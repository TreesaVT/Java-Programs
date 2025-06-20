package basicprogram;
public class MethodOverloading 
{
	static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	static void add(int a,double b, int c)
	{
		System.out.println(a+b*c);
	}
	void add(int a,int b,int c)
	{
		System.out.println(a-b);
	}
	
	void add(int a,double b)
	{
		System.out.println(a*b);
	}
	public static void main(String[] args) 
	{
		add(2,4);
		add(4,3.2,10);
		MethodOverloading n=new MethodOverloading();
		n.add(2,4,7);
		n.add(5, 0.5);
	}
}
