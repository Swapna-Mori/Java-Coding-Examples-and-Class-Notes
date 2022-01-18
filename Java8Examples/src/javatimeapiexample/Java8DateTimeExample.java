package javatimeapiexample;

import java.time.LocalDate;

public class Java8DateTimeExample {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println("Current date = "+ date);
		
		LocalDate beforeWeek = date.minusDays(7);
		System.out.println("Date before a Week = "+ beforeWeek);
		
		LocalDate afterWeek = date.plusDays(7);
		System.out.println("Date after a Week = "+ afterWeek);
		
		System.out.println(date.isLeapYear());
		
		LocalDate lyear = LocalDate.of(2016, 01, 01);
		System.out.println(lyear);
		System.out.println(lyear.isLeapYear());

	}

}
