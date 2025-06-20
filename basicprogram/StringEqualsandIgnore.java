package basicprogram;

public class StringEqualsandIgnore {

	public static void main(String[] args) {
	 String input="TREESA";
	 boolean a=input.equals("TREESA");
	 System.out.println(a);
	 boolean b=input.equals("Treesa");
	 System.out.println(b);
	 boolean c=input.equalsIgnoreCase("Treesa");
	 System.out.println(c);

	}

}
