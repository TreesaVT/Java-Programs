package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetProperty {

	public static void main(String[] args) {
		Set<Integer> s1=new HashSet<Integer>();//we can create hetero set also without adding wrapper or adding object wrapperclass
		s1.add(2);
		s1.add(89);
		s1.add(52);
		s1.add(null);//comenting off to do concept of sorting
		s1.add(52);//duplicate will be eliminated,no indexing
		s1.add(800);
		System.out.println(s1);
		//Collections.sort(s1);//not working
		s1.addAll(s1);//withis mthd we can add any other set(new set like s2)
		
		Iterator<Integer> i1=s1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}

	}

}
