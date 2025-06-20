package basicprogram;
abstract class Abstract1
{
	abstract void add();
	abstract void sub();
	void mul()//can override using methodOveriding
	{
		System.out.println("Code to display in abstract due to some SLA but also can be overiden");
	}
	static void div()//cannot override as it is static
	{
		System.out.println("Code to display in abstract due to some SLA");
	}
}
public class AbstClassWithAbstAndConcreteMthd extends Abstract1
{
	void mul()//if commented this method,line no8 displays
	{
		System.out.println("Code in abstract parnt class has been overidden by methodOveriding");
	}
	public static void main(String[] args) 
	{
		AbstClassWithAbstAndConcreteMthd a1=new AbstClassWithAbstAndConcreteMthd();
		a1.add();
		a1.sub();
		a1.mul();
		Abstract1.div();
	}
	void add() {
		
		System.out.println("Code to display by overiding add abstract method");
	}
	void sub() {
		System.out.println("Code to display by overiding sub abstract method");
	}
}
