package basicprogram;
class Amazon
{	Amazon()
	{
		System.out.println(4);
	}
}
class Amazon1 extends Amazon2
{
	Amazon1( )
	{
		System.out.println(3);
	}
}
class Amazon2 extends Amazon
{
	Amazon2()
	{
		System.out.println(2);
	}
}
public class SuperCallingStatement extends Amazon1
{
	SuperCallingStatement()
		{
			System.out.println(1);
		}
public static void main(String[] args) 
	{
		new SuperCallingStatement();
		}
}
	
