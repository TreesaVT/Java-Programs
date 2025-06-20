package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterfaceproperty1 {

	public static void main(String[] args) {
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(1234, "Treesa");
		m1.put(2345678, "Jonan");
		m1.put(3456789, "Jo");
		m1.put(2314511, "Sachin");
		System.out.println(m1);
		
		Map<Integer,String> m2=new HashMap<Integer,String>();
		m2.put(1234, "Treesa");
		m2.put(2345678, "Jonan");
		m2.put(3456789, "Jo");
		m2.put(2314511, "Sachin");
		System.out.println(m2);
		
		System.out.println(m1.equals(m2));
		System.out.println(m2.size());
		System.out.println(m1.containsKey(1234));
		System.out.println(m1.containsValue("Jonan"));
		System.out.println(m1.get(2314511));
		m2.put(242455, null);
		System.out.println(m2);
		m2.putIfAbsent(242455, "Jessy");
		m2.putIfAbsent(888888, "Jonan");
		System.out.println(m2);
	}

}
