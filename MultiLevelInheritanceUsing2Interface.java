package basicprogram;
interface Interface1
{
	void add();
	void sub();
}
interface Interface2 extends Interface1
{
	void mul();
	void div();
}
public class MultiLevelInheritanceUsing2Interface implements Interface2
{ 
	static int a=20;
	static double b=6;
	public static void main(String[] args) 
	{
		MultiLevelInheritanceUsing2Interface m1=new MultiLevelInheritanceUsing2Interface();
		m1.add();
		m1.div();
		m1.mul();
		m1.sub();
	}
	public void mul() 
	{
		System.out.println(a*b);
	}
	
	public void div() {
		System.out.println(a/b);
	}

	public void add() 
	{
		System.out.println(a+b);
	}
	public void sub() 
	{
		System.out.println(a-b);
	}
}
