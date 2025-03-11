package basicprogram;

public class LocalVariable_StaticandNonstatic 
{
	static void add(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println(c);
	}
	
	void sub (double a, int b)
	{
		double c;
		c=a-b;
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		add(1,2);
		LocalVariable_StaticandNonstatic n=new LocalVariable_StaticandNonstatic();
		n.sub(5.5,3);

	}

}
