package accessspecifierpackage;
public class ASClass1 //common class for within class,within package,outside package becoming subclass,outside package without becoming subclass                           
{
public static void add1()
{
	System.out.println(1);
}
private static void sub1()
{
	System.out.println(2);
}
static void mul1()
{
	System.out.println(3);
}
protected static void div1()
{
	System.out.println(4);
}
protected void div11()
{
	System.out.println(5);
}
protected ASClass1()
{
	System.out.println(6);
}
public static void main(String[] args) {
	add1();
	sub1();
	mul1();
	div1();
	ASClass1 a1=new ASClass1();
	a1.div11();
}
}
