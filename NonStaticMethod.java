package basicprogram;

public class NonStaticMethod {
	
	void add()
	{
		int a=100;
		int b=20;
		System.out.println(a+b);
	}

	public static void main(String[] args) 
	{
		NonStaticMethod n= new NonStaticMethod();
		n.add();

	}

}
