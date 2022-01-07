package polymorphismexample1.methodoverriding;

import java.util.Scanner;

public class Shape {
	
	public static int length;
	public static int breadth;
	public int value;
	
	public static String confirmShape() {
		if (length == breadth) {
			return "square";
		}else {
			return "rectangle";
		}
	}
	
	
	

	
	static Scanner sc = new Scanner(System.in);
	public static void readDimensions() {
		String shape = confirmShape();
		if(shape.equals("square")) {
		System.out.println("enter the length = breadth");
		System.out.println("enter the dimension");
		length = sc.nextInt();
		}else {
			System.out.println("enter the length != breadth");
			System.out.println("enter the dimensions");
			System.out.println("enter the length");
			length = sc.nextInt();
			System.out.println("enter the breadth");
			breadth = sc.nextInt();
		}
	}
	
	public void area() {
		System.out.println("area will be calculated");
	}

	public void perimeter() {
		System.out.println("perimeter will be calculated");
	}
}
