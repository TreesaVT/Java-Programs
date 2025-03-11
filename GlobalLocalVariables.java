package basicprogram;

public class GlobalLocalVariables {
	static String a;
	int b;
	static final String c="Treesa";
	final int d=20;
	static String g;
	
	static void add()
	{
		int e=12;
		final String f="Sachu";
		a=f;
		GlobalLocalVariables g1=new GlobalLocalVariables();
		g1.b=e;
		System.out.println(a);
		System.out.println(g1.b);
		System.out.println(c);
		System.out.println(g1.d);
		e=15;
		//f="jo";
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}
	
	void sub()
	{
		int e=12;
		final String f="Sachu";
		a=f;//a is declared as static in gv;so this keyword not required
		this.b=e;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}
	

	public static void main(String[] args) {
		add();
		GlobalLocalVariables g1=new GlobalLocalVariables();
		g1.sub();

	}

}
