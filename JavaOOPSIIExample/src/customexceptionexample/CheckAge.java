package customexceptionexample;

import java.util.Scanner;

public class CheckAge {
	static Scanner sc = null;
	public static void main(String[] args)  {
		sc = new Scanner(System.in);
		System.out.println("Enter the age...");
		try {
			int age = sc.nextInt();
			if(age < 18) {
				throw new AgeNotValidExcetion("Age is not valid for voting");
			}else {
				System.out.println("age is valid");
			}
		}catch (AgeNotValidExcetion e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally block will be called during exception or no exception");
			sc.close();
		} 

	}

}
