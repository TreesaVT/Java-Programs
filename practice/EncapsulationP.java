package practice;

class Encapprogram
{
	private String pancard="AWHPT5678R";
	public String getpancard()
	{
		return pancard;
	}
	public void setpancard(String pan)
	{
		this.pancard=pan;
	}

}

public class EncapsulationP extends Encapprogram
{

	public static void main(String[] args) {
		Encapprogram e1=new Encapprogram();
		e1.setpancard("AQERT45678L");
		System.out.println(e1.getpancard());

	}

}
