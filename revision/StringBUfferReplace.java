package revision;

public class StringBUfferReplace {

	public static void main(String[] args) {
		StringBuffer wq= new StringBuffer("Sanjay Kapoor");
	//	wq.replace(7, 13, "Gandhi");
	//	System.out.println(wq);
		wq.delete(7, 13);
		System.out.println(wq);
       wq.reverse();
       System.out.println(wq);
       wq.capacity();
       System.out.println(wq.capacity());
	}

}