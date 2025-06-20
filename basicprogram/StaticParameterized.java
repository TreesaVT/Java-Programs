package basicprogram;

public class StaticParameterized {
	
	static void add(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	static void student(String name)
	{
		System.out.println(name);
	}
	
	static void sub(int a,double b, char c, String name, boolean answer)
	{
		System.out.println(1);
	}

	public static void main(String[] args) 
	{
		add(50,100);
		student("allan");
		sub(50,2.3,'B',"Treesa", true);

	}
}
