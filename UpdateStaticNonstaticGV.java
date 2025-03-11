package basicprogram;

public class UpdateStaticNonstaticGV {
	static double a=10.0;
	int b=2;

	public static void main(String[] args) 
	{
		a=4.5;
		System.out.println(a);
		UpdateStaticNonstaticGV u1=new UpdateStaticNonstaticGV();
		u1.b=6;
		System.out.println(u1.b);

	}

}
