package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPropertyAddSort {

	public static void main(String[] args) {
		// 4 add methods in list
		List<String> l1=new ArrayList<String> ();
		l1.add("treesa");
		l1.add("jonalyn");
		l1.add("rita");
		l1.add("sachin");
		l1.add(0,"james");
//		l1.add(null);//comenting off while sorting as we get NullPointerException(due to line 27)
//		l1.add(null);
		System.out.println(l1);
		
		List<String> l2=new ArrayList <String> ();
		l2.add("thomas");
		l2.add("thomas");
		l2.add("");
		l2.addAll(1,l1);
		System.out.println(l2);
		Collections.sort(l2);
		System.out.println(l2);

	}

}
