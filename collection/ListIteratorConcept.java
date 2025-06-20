package collection;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;
public class ListIteratorConcept {
	public static void main(String[] args) {
		List<String> l1=new ArrayList<String> ();
		l1.add("treesa");
		l1.add("jonalyn");
		l1.add("rita");
		l1.add("sachin");
		l1.add(0,"james");
		System.out.println(l1);
		
		System.out.println("Iteration:");
		Iterator<String> i1= l1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		System.out.println("Forward ListIteration:");
		ListIterator<String> i2=l1.listIterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
		System.out.println("Backward ListIteration:");
		
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
	}
}
