package practice;

public class MethdOverloading {

	static void add()
	{
		System.out.println("addition");
	}
	static void add(int a,double b)
	{
		System.out.println("sub");
	}
	void add(double a,int b)
	{
		System.out.println("MULTI");
	}
	void add(int a,int b)
	{
		System.out.println("division");
	}

	public static void main(String[] args) {
		add();
		add(2,5.3);
		MethdOverloading s1=new MethdOverloading();
		s1.add(5.0,6);
		s1.add(3, 4);
		

	}

}
