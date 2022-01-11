package stringtokenizerexample;

import java.util.StringTokenizer;

public class SplitStringInToWords {

	public static void main(String[] args) {
	String s = "this is an example of string tokenizer class in java.util package";
	StringTokenizer words = new StringTokenizer(s);
	while(words.hasMoreTokens()) {
		System.out.println(words.countTokens());
		System.out.println(words.nextToken());
		
	}
	
	String s1 = "this,is an example of string tokenizer,with delimiter";
	StringTokenizer words1 = new StringTokenizer(s1,",");
	while(words1.hasMoreTokens()) {
		System.out.println(words1.countTokens());
		System.out.println(words1.nextToken());
		
	}
	}

}
