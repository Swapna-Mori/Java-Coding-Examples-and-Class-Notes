package javatimeapiexample;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

	public static void main(String[] args) {
	
		LocalTime currTime = LocalTime.now();
		System.out.println(currTime);
		LocalTime meetingTime = LocalTime.of(10,30,11);
		System.out.println(meetingTime);
		System.out.println(currTime.plusHours(4));
		System.out.println(currTime.minusHours(2));
		
		//Zone
		ZoneId zone1 = ZoneId.of("Asia/Kolkata");
		LocalTime currTime1 = LocalTime.now(zone1);
		System.out.println("Indian Time = " + currTime1);
		
		ZoneId zone2 = ZoneId.of("Asia/Tokyo");
		LocalTime currTime2 = LocalTime.now(zone2);
		System.out.println("Japan Time = " + currTime2);
		
		ZoneId zone3 = ZoneId.of("Asia/Harbin");
		LocalTime currTime3 = LocalTime.now(zone3);
		System.out.println("Singapore Time = " + currTime3);
		
	
		
		ZoneId zone4 = ZoneId.of("Europe/Paris");
		LocalTime currTime4 = LocalTime.now(zone4);
		System.out.println("Europe Time = " + currTime4);
		
		
		long hours = ChronoUnit.HOURS.between(currTime4,currTime3);
		System.out.println("Difference betweent two time values = " + hours);
		
		long minutes =ChronoUnit.MINUTES.between(currTime4,currTime3);
		System.out.println("Difference between two time values in minutes = " + minutes);
		
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println(currDateTime);
		
		System.out.println(currDateTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
		System.out.println(currDateTime.get(ChronoField.YEAR));
		System.out.println(currDateTime.get(ChronoField.MINUTE_OF_DAY));
		System.out.println(currDateTime.get(ChronoField.HOUR_OF_AMPM));
		System.out.println(currDateTime.get(ChronoField.MONTH_OF_YEAR));
		System.out.println(currDateTime.get(ChronoField.DAY_OF_WEEK));
		
		
		String dateString = "09-05-2020 11:30";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		LocalDateTime formattedDate = LocalDateTime.parse(dateString, formatter);
		
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formattedDate1 = currDateTime.format(formatter1);
		System.out.println(formattedDate1);
		
		
		

	}

}
