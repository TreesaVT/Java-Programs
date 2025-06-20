package basicprogram;
class Aclass
{static void add()
	{
		System.out.println(1);
	}
}
class Bclass extends Aclass
{static void add()
	{
		System.out.println(2);
	}
}
class Cclass extends Bclass
{static void add()
	{
		System.out.println(3);
	}
}
public class MultiLevelInheritance extends Cclass
{static void add()
	{
		System.out.println(4);
	}
	public static void main(String[] args) {
		add();
		Bclass.add();
		Cclass.add();
	    Aclass.add();
		}
}
