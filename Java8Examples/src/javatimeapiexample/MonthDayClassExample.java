package javatimeapiexample;

import java.time.MonthDay;
import java.time.temporal.ChronoField;

public class MonthDayClassExample {
	public static void main(String[] args) {
		MonthDay month = MonthDay.now();
		System.out.println(month);
		System.out.println(month.get(ChronoField.MONTH_OF_YEAR));
		System.out.println(month.isValidYear(11));
	}

}
