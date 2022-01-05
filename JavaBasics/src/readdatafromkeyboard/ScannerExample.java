package readdatafromkeyboard;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		/*
		 * to read the data from the keyboard in java from java 6 use
		 * Scanner class from java.util predefined package
		 * which contains set of predefined methods to read 
		 * different type of data types
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("To read integer value we have nextInt() method");
		int a = input.nextInt();
		System.out.println("Enter value of integer = " + a);
		System.out.println("To read float value we have nextFloat() method");
		float b = input.nextFloat();
		System.out.println("Enter value of float = " + b);
		System.out.println("To read double value we have nextDouble() method");
		double d = input.nextDouble();
		System.out.println("Enter value of double = " + d);
		System.out.println("To read long value we have nextLong() method");
		long l = input.nextLong();
		System.out.println("Enter value of long = " + l);
		System.out.println("To read char value we have no method");
		char ch = input.next().charAt(0);
		System.out.println("Enter value of char = " + ch);
	}

}
