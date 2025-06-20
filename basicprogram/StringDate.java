package basicprogram;
import java.util.Date;
public class StringDate {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1.getTime());//output-1740476339062(put in epoch converter to get the human understandable)
		System.out.println(d1);
		Date d2=new Date(d1.getTime()+(1000*60*60*24*4));//future,toget past - 
		System.out.println(d2);


		String format1=	d1.toString();
		//DD-MMM-YYYY
		//DD/MM/YYYY
		String month=	format1.substring(4, 7);
		System.out.println(month);
		String date=	format1.substring(8, 10);
		System.out.println(date);
		String year=	format1.substring(format1.length()-4);
		System.out.println(year);
		String format4=date.concat(" ").concat(month).concat(" ").concat(year);
		System.out.println(format4);
		String format2=date.concat("-").concat(month).concat("-").concat(year);
		System.out.println(format2);
		String format3=date.concat("/").concat(month).concat("/").concat(year);
		System.out.println(format3);
		

	}
	}


