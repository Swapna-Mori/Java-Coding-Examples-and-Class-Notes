package stringsinjava;

import java.util.Scanner;

public class StringsDemo {

	public static void main(String[] args) {
		/*
		 * create the string using any of the following syntax
		 */
		String s = "This is a string!";
		String s1 = new String("This is a string!");
		String s2 = new String();
		char[] chArray = {'A','P','P','L','E'};
		String s3 = new String(chArray);
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//String methods
		System.out.println("combine two strings   " + (s+s1));
		System.out.println("combine two strings  " + (s.concat(s1)));
		System.out.println("length of the string = " + s1.length());
		System.out.println("substring from s1 ==== >" +s1.substring(5));
		System.out.println("substring from s1 ==== >" +s1.substring(5,7));
		System.out.println("substring from s1 ==== >" +s1.substring(5));
		System.out.println("character at 10th index from s1 ==== >" +s1.charAt(10));
		System.out.println("first occurance of 'i' from s1 ==== >" +s1.indexOf('i'));
		System.out.println("last occurance of 'i' from s1 ==== >" +s1.lastIndexOf('i'));
		System.out.println("s1 to uppercase ==== >" +s1.toUpperCase());
		System.out.println("s1 to uppercase ==== >" +s1.toLowerCase());
		//string comparision
		char ch = 'y';
		//how to read the string from key board
		Scanner sc = new Scanner(System.in);
		//sc.nextLine();
		/*
		 * while(ch == 'y') { sc.nextLine();
		 * System.out.println("Enter the first String"); String firstString =
		 * sc.nextLine(); sc.nextLine(); System.out.println("Enter the second String");
		 * String secondString = sc.nextLine();
		 * System.out.println(firstString.compareTo(secondString));
		 * 
		 * System.out.println("do you want to continue"); ch = sc.next().charAt(0);
		 * 
		 * 
		 * }
		 */
		System.out.println("check a string endsWith specified characters = " + s1.endsWith("ing!"));
		System.out.println("check a string startsWith specified characters = " + s1.startsWith("Th"));
		System.out.println("check a string contains specified characters = " + s1.contains("This"));
		System.out.println("check a string contains specified characters = " + s1.contentEquals(s));
		System.out.println("replace a string with specified characters = " + s1.replace('i', 'e'));
		System.out.println("replace a string with specified string = " + s1.replace("is", "as"));
	
		
		//check whether two string are equal are not
		if(s1.equals(s)) {
			System.out.println("both are equal");
		}else {
			System.out.println("both are not equal");
		}
		
		//check whether two string are equal are not
		if(s1 == s) {
			System.out.println("both are equal");
		}else {
			System.out.println("both are not equal");
		}
	}

}
