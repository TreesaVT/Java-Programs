package basicprogram;
class Treesa
{
	void add(int a)
	{
		System.out.println("This is parent class");
	}
}
public class MethodOveriding extends Treesa
{
	void add(int a)
	{
		
		System.out.println("This is child class");
		//super.add(a);to overcome methodOveriding
	}

	public static void main(String[] args) 
	{
		MethodOveriding m1=new MethodOveriding();
		m1.add(5);
		
		//m1.add(20);again call child class method
//add(2);in case of static
//Treesa.add(3);
	}

}
