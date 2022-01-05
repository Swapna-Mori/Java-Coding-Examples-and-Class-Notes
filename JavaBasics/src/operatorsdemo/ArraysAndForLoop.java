package operatorsdemo;

import java.util.Scanner;

public class ArraysAndForLoop {

	public static void main(String[] args) {

		// initialization of an array
		float marks[] = { 67.89f, 32.45f, 76.45f, 55f, 67f };

		// without array
		float marks1 = 67.89f;
		float marks2 = 67.89f;
		float marks3 = 67.89f;
		float marks4 = 67.89f;
		float marks5 = 67.89f;
		System.out.println("array values with out for loop.......");
		// we can access the array as below
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);

		// if an array contains 5 values index starts from 0 and ends with 4 (0 to 4)
		// if an array contains n values index will be 0 to n-1

		// we can use foreach or for loop for retrieving the data from an array
		System.out.println("array values using for loop.......");
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		System.out.println("array values using for each loop.......");
		for (float f : marks) {
			System.out.println(f);
		}

		// create an empty array
		char[] myName = new char[10];

		char[] myCountryName;
		myCountryName = new char[30];

		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name character by character");

		
		  for (int i = 0; i < myName.length; i++) { myName[i] = sc.next().charAt(0); }
		  
		  System.out.print("myName is = "); for (int i = 0; i < myName.length; i++) {
		  System.out.print(myName[i]); }
		 
		
		for (int i = 0; i < myCountryName.length; i++) {
			myCountryName[i] = sc.next().charAt(0);
		}

		System.out.print("myName is = ");
		for (int i = 0; i < myCountryName.length; i++) {
			System.out.print(myCountryName[i]);
		}
		*/
		float marks11[] = { 67.89f, 32.45f, 76.45f, 55f, 67f };
		//reverse of  array
		System.out.println("array values in reverse using for  loop.......");
		for(int i=marks11.length-1;i>=0;i--) {
			System.out.println(marks11[i]);
		}

	}

}
