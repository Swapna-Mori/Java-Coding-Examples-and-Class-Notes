package dateinjava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatterExample {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
		//if we want to store date in dd/MM/yyyy
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		String strDate = sdf.format(d);
		System.out.println(strDate);

	}

}
