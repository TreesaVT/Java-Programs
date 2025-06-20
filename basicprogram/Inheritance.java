package basicprogram;
class ParentClass
{
	static void add()
	{
		System.out.println(1);
	}
}
public class Inheritance extends ParentClass
{
	static void sub()
	{
		System.out.println(2);
	}

	public static void main(String[] args) {
		add();
		sub();//if we have same method name in both child and parent it is mandatory to call class.methodname
//ParentClass.sub();
	}

}
