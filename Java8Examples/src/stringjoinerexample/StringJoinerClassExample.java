package stringjoinerexample;

import java.util.StringJoiner;

public class StringJoinerClassExample {

	public static void main(String[] args) {
		
		StringJoiner joiningStrings = new StringJoiner(" |" ,"{","}");
		
		//addiing values to string joiner object
		joiningStrings.add("apple");
		joiningStrings.add("boy");
		joiningStrings.add("cat");
		joiningStrings.add("dog");
		joiningStrings.add("elephant");
		
		System.out.println(joiningStrings);

	}

}
