package basicprogram;
public class NonStaticMethod1 
{ 
	void add()
	{
		int a=200;
		int b=10;
		System.out.println(a+b);
	}
		void sub()
	{
		int a=200;
		int b=10;
		System.out.println(a-b);
	}
		void mul()
	{
		int a=200;
		int b=10;
		System.out.println(a*b);
	}
	public static void main(String[] args) 
	{
		NonStaticMethod1 n=new NonStaticMethod1();
		n.add();
		n.sub();
		n.mul();
	}
}
