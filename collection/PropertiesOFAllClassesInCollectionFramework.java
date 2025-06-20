package collection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class PropertiesOFAllClassesInCollectionFramework {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(32);
		a1.add(23);
		a1.add(6);
		a1.add(6);
		a1.add("null");
		a1.add("null");
		//Collections.sort(a1);
		System.out.println(a1);
		
		Vector v1=new Vector();
		v1.add(32);
		v1.add(23);
		v1.add(6);
		v1.add(6);
		v1.add("null");
		v1.add("null");
		//Collections.sort(v1);
		System.out.println(v1);
		
		Stack s1=new Stack();
		s1.add(32);
		s1.add(23);
		s1.add(6);
		s1.add(6);
//		s1.add("null");
//		s1.add("null");
		//Collections.sort(s1);
		System.out.println(s1);
		
		LinkedList l1=new LinkedList();
		l1.add(32);
		l1.add(23);
		l1.add(6);
		l1.add(6);
		l1.add("null");
		l1.add("null");
		//Collections.sort(l1);
		System.out.println(l1);
		
		PriorityQueue p1=new PriorityQueue();
		p1.add(32);
		p1.add(23);
		p1.add(6);
		p1.add(6);
		p1.add(100);
		p1.add(72);
		//p1.add("treesa");
		//p1.add("null");
		//p1.add("null");
		//Collections.sort(p1);
		System.out.println(p1);
		
		LinkedHashSet l2=new LinkedHashSet();
		l2.add(32);
		l2.add(23);
		l2.add(6);
		l2.add(6);
		l2.add("null");
		l2.add("null");
		l2.add("treesa");
		l2.add(100);
		l2.add(72);
		//Collections.sort(l2);
		System.out.println(l2);
		
		HashSet h2=new HashSet();
		h2.add(32);
		h2.add(23);
		h2.add(6);
		h2.add(6);
		h2.add("null");
		h2.add("null");
		h2.add("treesa");
		h2.add(100);
		h2.add(72);
		//Collections.sort(h2);
		System.out.println(h2);
		
		TreeSet t2=new TreeSet();
		t2.add(32);
		t2.add(23);
		t2.add(6);
		t2.add(6);
		//t2.add("null");
		//t2.add("null");
//	t2.add("treesa");
		t2.add(100);
		t2.add(72);
		//Collections.sort(t2);
		System.out.println(t2);
		
		ArrayDeque a2=new ArrayDeque();
		a2.add(32);
		a2.add(23);
		a2.add(6);
		a2.add(6);
		a2.add("null");
		a2.add("null");
	a2.add("treesa");
		a2.add(100);
		a2.add(72);
		//Collections.sort(a2);
		System.out.println(a2);

	}

}
