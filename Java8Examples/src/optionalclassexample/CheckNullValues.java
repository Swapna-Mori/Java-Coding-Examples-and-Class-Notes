package optionalclassexample;

import java.util.Optional;

public class CheckNullValues {

	public static void main(String[] args) throws FoundNullValueException {
	
		String[] str = new String[5];
		str[1] = "hello this is string in java";
		Optional<String> checkNull = Optional.ofNullable(str[1]);

		checkNull.ifPresent(System.out::println);
		//printing the value of str[1] using method referenece
		if(checkNull.isPresent()) {
			char ch = str[1].charAt(0);
			System.out.println(ch);
		}else {
			System.out.println("String value is null or not present");
		}
		
		//System.out.println(checkNull.orElseThrow(() -> new FoundNullValueException("null value")));
		

		//if value present then return value else return an empty optional object
		
		String dataFound =  Optional.of(str[1])
				.orElseThrow(() -> new FoundNullValueException("null value"));
		System.out.println(dataFound);
		
	}

}
