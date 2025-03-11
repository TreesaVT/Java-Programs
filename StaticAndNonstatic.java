package basicprogram;

public class StaticAndNonstatic {
	
	static void sub()
	{
		int a=80;
		int b=6;
		System.out.println(a-b);
	}
	
	void add()
	{ 
		int a=40;
		int b=60;
		System.out.println(a+b);
			
	}


	public static void main(String[] args) 
	{
		sub();
		StaticAndNonstatic n=new StaticAndNonstatic();
		n.add();
	}
}
