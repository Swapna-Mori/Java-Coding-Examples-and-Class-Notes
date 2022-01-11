package uncheckedexceptionexample;

import java.util.Scanner;

public class ArithmeticExceptionExample {
	static Scanner sc = null;
	public static void main(String[] args) {
		
		try {
			sc = new Scanner(System.in);
			System.out.println("enter the value of a");
			int a = sc.nextInt();
			if( a < 0) {
				throw new Exception("a value cannot be less than zero");
			}
			System.out.println("enter the value of b");
			int b = sc.nextInt();
		try {
			if( b == 0) {
				throw new ArithmeticException("B value cannot be zero");
			}
			System.out.println("Division of two numbers = " + (a/b));
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}
		}
}
		

