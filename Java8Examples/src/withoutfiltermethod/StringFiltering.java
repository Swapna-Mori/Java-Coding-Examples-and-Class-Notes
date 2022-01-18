package withoutfiltermethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringFiltering {

	public static void main(String[] args) {
		List<String> techNames = Arrays.asList("Spring","Hibernate","Struts","RestApi","Spring Boot");
		List<String> fileterdTechNames = getListOfTechNamesStartsWithS(techNames,"S");
		
		System.out.println("After filtering the names");
		for(String techName : fileterdTechNames) {
			System.out.println(techName);
		}
		
		
		System.out.println("After filtering the names using filter");
		//using filter method Stream<Integer> java.util.stream.Stream.filter(Predicate<? super Integer> predicate)
		List<String> fileterdTechNames1 = techNames.stream()
											.filter(techName ->techName.startsWith("S"))
														.collect(Collectors.toList());
		//System.out.println(fileterdTechNames1);
		
		fileterdTechNames.forEach(System.out::println);

	}

	private static List<String> getListOfTechNamesStartsWithS(List<String> techNames, String prefix) {
		List<String> resultedTechNames = new ArrayList<String>();
		
		for(String techName : techNames) {
			if(techName.startsWith(prefix)) {
				resultedTechNames.add(techName);
			}
		}
		
		return resultedTechNames;
	}

}
