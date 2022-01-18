package dateinjava;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationExample {

	public static void main(String[] args) {
		
		Duration no_of_seconds = Duration.between(LocalTime.NOON, LocalTime.MAX);
		System.out.println(no_of_seconds.get(ChronoUnit.SECONDS));

	}

}
