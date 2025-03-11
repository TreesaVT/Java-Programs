package basicprogram;

public class StringBuilderFunctions {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("Treesa");
		s1.append(" Thomas");
		System.out.println(s1);
		s1.insert(6," Vattakarote");
		System.out.println(s1);
		s1.deleteCharAt(19);
		System.out.println(s1);
		s1.delete(18, 24);
		System.out.println(s1);
		s1.replace(7,18,"Sachin");
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
		s1.capacity();
		System.out.println(s1);
		
		System.out.println(s1.substring(7));
		System.out.println(s1.substring(2,4));
	}
}
