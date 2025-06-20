package basicprogram;

public class StaticMethod 
{
	
	static void add()
	{
		int a=10;
		int b=5;
		int sum=a+b;
		System.out.println(sum);
	}
	
	static void mul()
	{
		int a=10;
		int b=5;
		int mul=a*b;
		System.out.println(mul);
	}
  public static void main(String[] args) 
  {
	add();
	mul();
  }
}
