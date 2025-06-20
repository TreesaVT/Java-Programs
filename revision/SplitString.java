package revision;

public class SplitString {

	public static void main(String[] args) {
String str="India , is my country";
		
	//	String []a=	str.split(" ");
		String []a=str.split("India");
		System.out.println(a[1]);
		
		String str1="Hello&WorldMyIndia";
		
		String []b=str1.split("My");
		 String[]b1=str1.split("World");
		System.out.println(b1[1]);

	}

}