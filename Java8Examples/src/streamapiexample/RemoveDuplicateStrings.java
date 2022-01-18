package streamapiexample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateStrings {

	public static void main(String[] args) {
		
		
		List<String> techNames = Arrays.asList("Spring","Hibernate","Struts","RestApi","Spring","Struts");
		
		
		List<String> sortedList = techNames.stream().sorted().collect(Collectors.toList());
		
		System.out.println("Sorted List of Strings ..............");
		sortedList.forEach(System.out::println);
		
		System.out.println("Sorted List of Strings in reverse order..............");
		List<String> reversedSortedList = techNames.stream().sorted(Collections.reverseOrder())
								.collect(Collectors.toList());
	
		reversedSortedList.forEach(System.out::println);
		
		System.out.println("After filtering the names using filter and removing duplicates......");
		//using filter method Stream<Integer> java.util.stream.Stream.filter(Predicate<? super Integer> predicate)
		Set<String> fileterdTechNames1 = techNames.stream()
											.filter(techName ->techName.startsWith("S"))
														.collect(Collectors.toSet());
		//System.out.println(fileterdTechNames1);
		
		fileterdTechNames1.forEach(System.out::println);

	}

}
