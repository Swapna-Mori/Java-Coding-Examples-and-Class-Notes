package polymorphismexample1.methodoverriding;

import java.util.Scanner;

public class Shape {
	
	public int length,breadth;
	
	public String confirmShape() {
		if (length == breadth) {
			return "square";
		}else {
			return "rectangle";
		}
	}
	
	public String confirmShape(int a) {
		if (length == breadth) {
			return "square";
		}else {
			return "rectangle";
		}
	}
	
	private String confirmShape(int a,float b) {
		if (length == breadth) {
			return "square";
		}else {
			return "rectangle";
		}
	}
	
	Scanner sc = new Scanner(System.in);
	public void readDimensions() {
		String shape = this.confirmShape();
		if(shape.equals("square")) {
		System.out.println("enter the length = breadth");
		System.out.println("enter the dimension");
		this.length = sc.nextInt();
		}else {
			System.out.println("enter the length != breadth");
			System.out.println("enter the dimensions");
			System.out.println("enter the length");
			this.length = sc.nextInt();
			System.out.println("enter the breadth");
			this.breadth = sc.nextInt();
		}
	}
	
	public void area() {
		System.out.println("area will be calculated");
	}

	public void perimeter() {
		System.out.println("perimeter will be calculated");
	}
}
