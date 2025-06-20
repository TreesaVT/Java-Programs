package basicprogram;

public class ContructorOverloading {
	
	ContructorOverloading()
	{
		System.out.println(1);
	}
	ContructorOverloading(int a, int b)
	{
		System.out.println(2);
	}

	public static void main(String[] args) 
	{
		new ContructorOverloading();
		new ContructorOverloading(20,30);

	}

}
