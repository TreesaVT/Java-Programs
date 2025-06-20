package basicprogram;
public class StringReplaceMathesRepeat {
	public static void main(String[] args) {
	String name="school is very big";
	String n=name.replace('b', 'B');
	System.out.println(n);
	
	String n1=name.replace("big","small");
	System.out.println(n1);
	
	String name2="Treesa 123 VT";
	String n2=name2.replaceAll("[A-Z]", "");
	System.out.println(n2);
	
	
	String n3=n2.replaceAll("[0-9]", "");
	System.out.println(n3);
	
	String n4=name2.replaceAll("[a-z]", "");
	System.out.println(n4);
	
	String n5=name2.replaceFirst("e", "o");
	System.out.println(n5);	
	
	String a="treesa";
	boolean b=a.matches("......");
	System.out.println(b);
	
	boolean b1=a.matches("t(.)*");//to check starts with t?
	System.out.println(b1);
	
	boolean b2=a.matches("(.)*a");//to check ends with a?
	System.out.println(b2);
	
	String a2="Spider man";
	boolean b3=a2.matches("(.)*man(.)*");//to check String contains man in it?
	System.out.println(b3);
	
	String a3=a.repeat(3);
	System.out.println(a3);

	}

}
