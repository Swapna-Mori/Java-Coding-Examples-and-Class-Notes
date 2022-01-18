package streamapiexample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {

	public static void main(String[] args) {
		List<Integer> dataList  = Arrays.asList(11,42,36,48,52,68,71,89,90,100,111,121);
		
		Predicate<Integer> oddNumbers1 = x -> (((x%2)!=0));
		Predicate<Integer> numbers1 =  x -> x > 55;
		List<Integer> oddNumbersFromList = dataList.stream().filter(oddNumbers1.and(numbers1))
				.collect(Collectors.toList());
		List<Integer> oddNumbersFromList1 = dataList.stream().filter(oddNumbers1.or(numbers1))
				.collect(Collectors.toList());
		List<Integer> evenNumbersFromList = dataList.stream().filter((oddNumbers1.or(numbers1)).negate())
				.collect(Collectors.toList());
		System.out.println(evenNumbersFromList);
		System.out.println(oddNumbersFromList1);

	}

}
