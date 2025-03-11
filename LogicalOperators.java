package basicprogram;

public class LogicalOperators {

	public static void main(String[] args) 
	{
		int a=10;
		int b=5;
				if(a==10 && a>b)
		{
			System.out.println("and");
		}
				if(a==b || b<a)
		{
			System.out.println("OR");
		}
				if(!(a>b && a==b))
		{
			System.out.println(
					"not with and");
		}
		if(!(a>b || a==b))
		{
			System.out.println(
					"not with OR");
		}
	}
}
