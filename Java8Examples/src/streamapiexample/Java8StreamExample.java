package streamapiexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8StreamExample {

	public static void main(String[] args) {
		Random rand = new Random();
		List<Integer> dataList  = Arrays.asList(11,42,36,48,52,68,71,89,90,100,111,121);
		
		List<Integer> evenNumberdataList = new ArrayList<Integer>();
		
		for(int i = 0;i<dataList.size();i++) {
			if((dataList.get(i))%2 ==0) {
				evenNumberdataList.add(dataList.get(i));
			}
		}
		
		System.out.println(evenNumberdataList);
		
		
		List<Integer> evenNumbers = dataList.stream().filter(x -> ((x %2) ==0))
																.collect(Collectors.toList());
		System.out.println("List ====> " + evenNumbers);
		Set<Integer> evenNumberSet = dataList.stream().filter(x -> ((x %2) ==0))
																.collect(Collectors.toSet());
		System.out.println("Set ====> " +evenNumberSet);
		Map<Object, Object> evenNumbersMap = dataList.stream().filter(x -> ((x %2) ==0))
				.collect(Collectors.toMap(x1 -> x1/2, x1 -> x1));
		
		System.out.println("Map ====> " +evenNumbersMap);
		
		List<Integer> oddNumbers = dataList.stream().filter(x -> ((x %2) !=0))
				.collect(Collectors.toList());
				
		System.out.println(oddNumbers);
	}

}
