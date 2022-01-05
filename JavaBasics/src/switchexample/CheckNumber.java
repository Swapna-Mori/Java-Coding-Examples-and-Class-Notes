package switchexample;

import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the integer value");
		int readValue = input.nextInt();
		
		char ch ='y';
		
		do {
			
		System.out.println("Enter the choice");
		System.out.println("1. Even ");
		System.out.println("2. Odd ");
		System.out.println("3. Square ");
		int choice = input.nextInt();

		switch (choice) {
		case 1:
			if((readValue !=0)&&(readValue % 2 == 0)) {
				System.out.println("Even number");
			}
			break;
		case 2:
			if((readValue !=0)&&(readValue % 2 != 0)) {
				System.out.println("Odd number");
			}
			break;
		case 3:
			if(readValue !=0) {
				double result = Math.sqrt(readValue);
				System.out.println("square root = " + result);
			}
			break;

		default:
			System.out.println("no such choice available");
			break;
		}
		System.out.println("out of switch");
			System.out.println("do you want to continue");
			ch = input.next().charAt(0);
		}while(ch=='y');
	}

}
