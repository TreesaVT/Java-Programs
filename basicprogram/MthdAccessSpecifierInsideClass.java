package basicprogram;
public class MthdAccessSpecifierInsideClass {
	public static void add()
	{
		System.out.println(1);
	}
	private void sub()//non static mthd used here,static also can be used
	{
		System.out.println(2);
	}
	static void mul()
	{
		System.out.println(3);
	}
	protected static void div()
	{
		System.out.println(4);
	}
	protected MthdAccessSpecifierInsideClass ()//Constructor used here
	{
		System.out.println(5);
	}

	public static void main(String[] args) {
		add();
		MthdAccessSpecifierInsideClass m1=new MthdAccessSpecifierInsideClass();
		m1.sub();
		mul();
		div();
	}
}
