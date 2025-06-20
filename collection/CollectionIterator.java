package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {

	public static void main(String[] args) {
		Collection<Object> c1 = new ArrayList<Object>();//upcasting
		 c1.add(true);
		 c1.add("treesa");
		 c1.add(28);
		 c1.add(8907543);
		 c1.add('J');
		 System.out.println(c1);
		 Iterator i1=c1.iterator();
		 while(i1.hasNext())
		 {
			 System.out.println(i1.next());
			 
		 }
		 
	}

}
