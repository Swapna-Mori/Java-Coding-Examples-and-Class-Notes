package dateinjava;

import java.util.Calendar;
import java.util.Date;

public class DateExampleInJava {

	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println("Today = " + d1);
		
		//create your own date
		@SuppressWarnings("deprecation")
		Date d2 = new Date(2000, 0, 11);
		System.out.println("Date = " + d2);
		
		String str = d2.toString();
		System.out.println("date to string = " + str);
		
		boolean checkDate = d2.after(d1);
		System.out.println(checkDate);
		
		Calendar c = Calendar.getInstance();
		System.out.println("Current Time = " + c.getTime());
		System.out.println("Current Day =  " + c.get(Calendar.DATE));
		System.out.println("Current Year = " + c.get(Calendar.YEAR));
		
		//c.add(Calendar.DATE,-15);
		//System.out.println("15 days ago = " + c.getTime());
		//c.add(Calendar.MONTH,4);
		//System.out.println("4 months later = " + c.getTime());
		
		c.add(Calendar.YEAR, 4);
		System.out.println("4 years later = " + c.getTime());
		
	}

}
