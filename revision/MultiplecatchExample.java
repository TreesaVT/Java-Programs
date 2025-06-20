package revision;

public class MultiplecatchExample {
public static void main(String[] args) {
try
{
int []arr=new int[5];
arr[5]=100;
int result=10/0;
}
catch(ArrayIndexOutOfBoundsException e) {
System.out.println(e.getMessage());
}
catch(ArithmeticException e) {
System.out.println(e.getMessage());
}
}

}