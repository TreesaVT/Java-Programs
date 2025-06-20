package collection;

import java.util.ArrayList;
import java.util.List;

public class ListHeterogeneousproperty {

	public static void main(String[] args) {
		List<Object> l1=new ArrayList<Object> ();
		l1.add("treesa");
		l1.add(28);
		l1.add(4657689);
		l1.add('A');
		l1.add(0,"james");
		l1.add(null);
		l1.add(3,null);
		System.out.println(l1);
		l1.addAll(l1);
		System.out.println(l1);
		l1.addAll(1, l1);
		System.out.println(l1);
		

	}

}
