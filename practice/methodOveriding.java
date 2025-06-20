package practice;
class parentoveriding
{
	void add()
	{
		System.out.println("Parent");
	}
}
public class methodOveriding extends parentoveriding
{
	void add()
	{
		
		System.out.println("Child");
		super.add();
	}

	public static void main(String[] args) 
	{
		methodOveriding m1=new methodOveriding();
		m1.add();
		
	

	}

}
