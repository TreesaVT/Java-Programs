package basicprogram;
public class ThisKeyword_GlobalLocalVar {
	String name1;
	double salary;
	int age;
	
	void employee_details(String name,double salary,int age)
	{
		this.name1=name;
		//this.salary=salary;
		this.age=age;
		System.out.println("Name is "+ name);
		System.out.println("Name is "+ salary);
		System.out.println("Name is "+ age);
	}
	public static void main(String[] args) 
	{
		ThisKeyword_GlobalLocalVar t1=new ThisKeyword_GlobalLocalVar();
		t1.employee_details("Treesa",98000,30);
		System.out.println(t1.name1);
		System.out.println(t1.salary);
		System.out.println(t1.age);
	}
}
