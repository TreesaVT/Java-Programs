package basicprogram;

public class StringBufferfunctions {

	public static void main(String[] args) {
		StringBuffer s1= new StringBuffer("Treesa");
		s1.append(" Thomas");
		System.out.println(s1);
		s1.insert(6," Vattakarote");
		System.out.println(s1);
		s1.replace(19, 25, "Sachin");
		System.out.println(s1);   
		s1.delete(6, 18);//first space also deleting here
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
		s1.reverse();//reversing again to work on other mthds
        System.out.println(s1);
        StringBuffer s2= new StringBuffer("Jonalyn rita");
		s2.substring(8);
		System.out.println(s2);
		System.out.println(s2.substring(8));
		System.out.println(s1.substring(1, 6));
	}

}
