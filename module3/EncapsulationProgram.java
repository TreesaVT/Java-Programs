package module3;

class Encapprogram
{
	private String Emailid="treesa@gmail.com";
public String getEmailid()
{
	return Emailid;
}
public void setEmailid(String Emailid)
{
	this.Emailid=Emailid;
}
private int Age=30;
public int getAge()
{
	return Age;
}
public void setAge(int Age)
{
	this.Age=Age;
}
	
}

public class EncapsulationProgram {

	public static void main(String[] args) {
		Encapprogram e1= new Encapprogram();
		e1.setEmailid("jincy@gmail.com");
		System.out.println(e1.getEmailid());
		e1.setAge(25);
		System.out.println(e1.getAge());

	}

}
