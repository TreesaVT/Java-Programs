package module3;
class Enc
{
	private int mobno=687665576;
	public int getmob()
	{
		return mobno;
	}
	
	public void setmob(int mobile)
	{
		this.mobno=mobile;
	}
}
public class Encap {

	public static void main(String[] args) {
		Enc e=new Enc();
		e.setmob(79999);
		System.out.println(e.getmob());

	}

}
