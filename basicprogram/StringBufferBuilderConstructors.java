package basicprogram;

public class StringBufferBuilderConstructors {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer();//creates empty string with capacity or length of 16
		System.out.println(s1);
		StringBuffer s2=new StringBuffer("Treesa");
		System.out.println(s2.capacity());
		StringBuffer s3=new StringBuffer(30);//creates empty string with capacity of 30
		System.out.println(s3.capacity());
		
		
		StringBuilder s11=new StringBuilder();//creates empty string with capacity or length of 16
		System.out.println(s11);
		StringBuilder s22=new StringBuilder("Sachin");
		System.out.println(s22);
		StringBuilder s33=new StringBuilder(25);//creates empty string with capacity of 25
		System.out.println(s33);


	}

}
