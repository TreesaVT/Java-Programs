package module3;

public class TypeCastingPrimitive1 {

	public static void main(String[] args) {
		//convert double into float
		double dou=8.88905656789;
		float f1=(float)dou;//only explicit way
		System.out.println(f1);
		
		//convert byte into int
		int i1=127;//only till 127 is considered as byte(explicit also possible)
		System.out.println(i1);
		
		//convert int into byte
		byte b1=(byte) 123456789;//only explicit
		System.out.println(b1);//not possible,this is possible only when int value within range of byte
		
		//convert int into byte where int value is 100000
		byte b2=(byte) 100000;//only explicit
		System.out.println(b2);
		
		//convert short into byte
		byte b3=(byte) 1009;//only explicit
		System.out.println(b3);
		
		//convert short into int
		int i2= 32767;//implicit
		int i3=(int)32767;//explicit
		System.out.println(i2);
		System.out.println(i3);
		
		//convert float into double
		double d1= 0.12345;//implicit
		double d2=(double)0.12345;//explicit
		System.out.println(d1);
		System.out.println(d2);
		
		//convert double into float
		float f2=(float)0.987654321;//explicit only
		System.out.println(f2);

	}

}
