package javatimeapiexample;

import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.temporal.ChronoField;

public class OffSetTimeExample {
	public static void main(String[] args) {
		
		OffsetTime oft = OffsetTime.now();
		System.out.println(oft);
		
		System.out.println(oft.get(ChronoField.HOUR_OF_DAY));
		System.out.println(oft.get(ChronoField.OFFSET_SECONDS));
		System.out.println(oft.getHour());
		System.out.println(oft.getMinute());
		System.out.println(oft.getOffset());
		
		
		OffsetDateTime ofdt = OffsetDateTime.now();
		System.out.println(ofdt);
		
	}

}
