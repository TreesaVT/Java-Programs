package collection;

//import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapKeyValueFetch {
	public static void main(String[] args) {
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(1234, "Treesa");
		m1.put(2345678, "Jonan");
		m1.put(3456789, "Jo");
		m1.put(2314511, "Sachin");
		System.out.println(m1);
		System.out.println(m1.keySet());
		System.out.println(m1.values());
		for(Integer s1:m1.keySet())
				{
			            System.out.println(s1);
				}
		for(String s2:m1.values())
		{
			System.out.println(s2);
		}
		
		for(Entry<Integer,String> e1:m1.entrySet())
		{
			System.out.println(e1);
		}
		
		System.out.println("Iteration using Iterator");//This can be done as the returntype of entrySet is finally a set
		Set<Entry<Integer,String>> s3= m1.entrySet();
		Iterator <Entry <Integer, String>> i1=s3.iterator();
		while(i1.hasNext())
				{
			System.out.println(i1.next());
		}
	}

}
