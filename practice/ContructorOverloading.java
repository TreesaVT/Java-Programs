package practice;

public class ContructorOverloading {
	
	static int a=60;
	double b=5.5;
	static double c;
	
	ContructorOverloading(int g,int f)
	{
		c=a-b;
		System.out.println(c);
	}
	
	ContructorOverloading(double g,double f)
	{
		c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		new ContructorOverloading(4,5);
		new ContructorOverloading(2.8,8);
	

	}

}
