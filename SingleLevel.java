package basicprogram;

class Student
{
	void add()
	{
		System.out.println(1);
	}
}

public class SingleLevel extends Student
{
		void sub()
	{
		System.out.println(2);
	}
	
	public static void main(String[] args) {
		
		SingleLevel s1=new SingleLevel();
		s1.sub();
		s1.add();
			}

}
