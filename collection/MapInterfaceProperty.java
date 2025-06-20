package collection;
import java.util.HashMap;
import java.util.Map;
public class MapInterfaceProperty {
	public static void main(String[] args) {
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(1234567, "Treesa");//without wrapper or object wrapper we can create heterogenousdata
		m1.put(2345678, "Jonan");
		m1.put(3456789, "Jo");
		m1.put(2314511, "Sachin");
		System.out.println(m1);
		
		Map<Integer,String> m2=new HashMap<Integer,String>();
		m2.put(8765431, "Jessy");
		m2.put(8712355, "Thomas");
		m2.put(8765432, "Jithin");
		m2.put(8712355, "Jindo");
		m2.putAll(m1);
		System.out.println(m2);
		m2.remove(8765432);
		m2.remove(1234567, "Treesa");
		m1.clear();
		System.out.println(m1.isEmpty());
		System.out.println(m1);
		System.out.println(m2);
		m2.replace(8712355, "george");
		m2.replace(8765431, "Jesy", "Monica");//replaces only if value is also same as entered
		System.out.println(m2);

	}

}
