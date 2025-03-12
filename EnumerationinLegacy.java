package collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationinLegacy {

	public static void main(String[] args) {
		Vector<Integer> v1=new Vector<Integer>();
		v1.addElement(23);
		v1.addElement(456);
		v1.addElement(4);
		v1.addElement(76543);
		v1.addElement(67);
		System.out.println(v1);
		
		Enumeration<Integer> e1=v1.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
	}

}
