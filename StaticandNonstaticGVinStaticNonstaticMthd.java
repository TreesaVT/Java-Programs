package basicprogram;
public class StaticandNonstaticGVinStaticNonstaticMthd {
	static int a=100;
	double b=10.5;
	
	static void mul()
	{
		double c;
		StaticandNonstaticGVinStaticNonstaticMthd s1=new StaticandNonstaticGVinStaticNonstaticMthd();
		c=a*s1.b;
		System.out.println(c);
	}
	void add(int d, double b)
	{
		double c;
		//StaticandNonstaticGVinStaticNonstaticMthd s1=new StaticandNonstaticGVinStaticNonstaticMthd();
		StaticandNonstaticGVinStaticNonstaticMthd s2=new StaticandNonstaticGVinStaticNonstaticMthd();
		c=a+s2.b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		mul();
		StaticandNonstaticGVinStaticNonstaticMthd s1=new StaticandNonstaticGVinStaticNonstaticMthd();
		s1.add(2,5.5);
	}
}
