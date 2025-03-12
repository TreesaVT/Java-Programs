package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionMthdsUsingWrapperclasstocreatehomo {

	public static void main(String[] args) {
		Collection<Integer> c1=new ArrayList<Integer> ();
		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(50);
		System.out.println(c1);
		boolean b1=c1.isEmpty();
		System.out.println(b1);
		
		Collection<Integer> c6=new ArrayList<Integer> ();
		c6.addAll(c1);
		c6.add(100);
		System.out.println(c6);
		boolean b2=c6.contains(100);
		boolean b3=c6.containsAll(c1);
		System.out.println(b2);
		System.out.println(b3);
		c6.remove(100);
		System.out.println(c6);
		c6.removeAll(c1);
		System.out.println(c6);
		
		Collection<Double> c2=new ArrayList<Double> ();
		c2.add(10.6);
		c2.add(20.90);
		c2.add(30.56);
		c2.add(50.2);
		System.out.println(c2);
		
		Collection<String> c3=new ArrayList<String> ();
		c3.add("treesa");
		c3.add("thomas");
		c3.add("Sachin");
		c3.add("jo");
		System.out.println(c3);
		
		Collection<Character> c4=new ArrayList<Character> ();
		c4.add('T');
		c4.add('t');
		c4.add('S');
		c4.add('J');
		System.out.println(c4);
		
		Collection<Boolean> c5=new ArrayList<Boolean> ();
		c5.add(true);
		c5.add(false);
		c5.add(false);
		c5.add(true);
		System.out.println(c5);
		c5.remove(false);
		System.out.println(c5);
		c5.remove(false);
		System.out.println(c5);

	}

}
