package basicprogram;
abstract class Program1
{
	abstract void login();
	abstract void logout();
}
abstract class Program2 extends Program1
{
	abstract void login();
	abstract void logout();
}
public class ProgramOnAbstract extends Program2
{
	public static void main(String[] args) {
		ProgramOnAbstract p1=new ProgramOnAbstract();
		p1.login();
		p1.logout();
	}
	void login() {
		System.out.println("Real code for login");	
			}
	void logout() {
		System.out.println("Real code for logout");
			}
}
