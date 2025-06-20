package practice;

public class StaticNonstaticParametrizedAndNonpara {
	static void add()
	{
		System.out.println("addition");
	}
	static void sub(int a,double b)
	{
		System.out.println("sub");
	}
	void mul()
	{
		System.out.println("MULTI");
	}
	void div(int a,int b)
	{
		System.out.println("division");
	}

	public static void main(String[] args) {
		add();
		sub(2,5);
		StaticNonstaticParametrizedAndNonpara s1=new StaticNonstaticParametrizedAndNonpara();
		s1.mul();
		s1.div(3, 4);
		

	}

}
