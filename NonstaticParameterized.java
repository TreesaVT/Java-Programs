package basicprogram;
public class NonstaticParameterized 
{
	void add(int a,int b)
	{
		System.out.println("addition");
	}
	
	void subtract(double a,boolean b)
	{
		System.out.println("substraction");
	}
		void multiply(boolean a,int b)
	{
		System.out.println("Multiplication");
	}
		void div(double a,int b,boolean c)
	{
		System.out.println("Division");
	}
	public static void main(String[] args) 
	{
		NonstaticParameterized n=new NonstaticParameterized();
		n.add(5,789);
		n.subtract(3.4,false);
		n.multiply(true, 20);
		n.div(5.2,2,true);
		}
}
