package practice;

abstract class Jonalyn
{
	abstract void methd();
	abstract void methd1();
	static void jonan()
	{
		System.out.println("Jonalyn Jonan");	
	}
}

public class Abstract extends Jonalyn
{

	public static void main(String[] args) {
		Abstract a1=new Abstract();
		a1.methd();
		a1.methd1();
		jonan();

	}

	void methd() {
		
		System.out.println("Jonalyn mam");
	}

	void methd1() {
		System.out.println("Shakunthala mam");
	
		
	}

}
