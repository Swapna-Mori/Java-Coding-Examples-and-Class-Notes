package decisionstatement;

import java.util.Scanner;

public class EvenNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter integer values in to the array");
		for(int i=0;i<values.length;i++) {
			values[i] = input.nextInt();
		}
		
		System.out.println("Even number in the array are....");
		for(int i=0;i<values.length;i++) {
			if((values[i] % 2) == 0) {
				System.out.print(values[i] + " , ");
			}else {
				System.out.print("$" + " , " );
			}
		}
		
	}

}
