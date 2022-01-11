package intefaceexampleinjava8;

import java.util.Scanner;

public interface ArithmeticOperations {
	
	public int add(int a,int b);
	public int div(int a,int b);
	public int mul(int a,int b);
	public int sub(int a,int b);
	Scanner sc = new Scanner(System.in);
	public static int readDataValue() {
		int value = sc.nextInt();
		return value;
	}
	
	default void display() {
		System.out.println("This is the default method in interface from java8");
	}

}
