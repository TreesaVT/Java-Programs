package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionUpcastingandAddmthd {

	public static void main(String[] args) {
	 Collection<Object> c1 = new ArrayList<Object>();//upcasting
	 c1.add(true);
	 c1.add("treesa");
	 c1.add(28);
	 c1.add(8907543);
	 c1.add('J');
	 System.out.println(c1);
	 
	 Collection c2=new ArrayList();//upcasting
	 c2.add("Jonalyn");
	 c2.add(4);
	 c2.addAll(c1);
	 System.out.println(c2);

	}

}
