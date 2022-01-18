package dateinjava;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.Temporal;

public class PeriodExample {

	public static void main(String[] args) {
	
		Period period = Period.ofMonths(3);
		Temporal tempDate = period.addTo(LocalDateTime.now());
		System.out.println(tempDate);
		
		Period period1 = Period.ofYears(10);
		Temporal tempDate1 = period1.addTo(LocalDateTime.now());
		System.out.println(tempDate1);
	}

}
