package module3;

public class TypeCastingPrimitive {

	public static void main(String[] args) {
	//int to double:Widening
		
		double d=100;//implicit way
		System.out.println(d);
		
		double d1=(double)100;//explicit way
		System.out.println(d1);
		
		int a=100;
		double d2=a;
		System.out.println(d2);
		
	//double to int:Narrowing;explicit only
		int i=(int)23.8;
		System.out.println(i);

	}

}
