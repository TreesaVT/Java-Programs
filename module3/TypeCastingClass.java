package module3;

public class TypeCastingClass {

	public static void main(String[] args) {
	Object o1=new TypeCastingClass();//upcasting to object class//implicitly
	//Object o2=(Object) new TypeCastingClass();//explicitly upcasting
	
	
	TypeCastingClass t1=(TypeCastingClass) o1;//Downcasting only explicity possible;Also only after downcasting
	//once downcating is done,reference variable t1 can have all the properties of child and associated parents

	}

}
