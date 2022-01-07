package polymorphismexample1.methodoverriding;

public class Square extends Shape {
	public static int length;
	public static int breadth;
	public void area() {
		System.out.println("Square area will be calculated");
	}

	public void perimeter() {
		System.out.println("Square perimeter will be calculated");
	}
	
	private String confirmShape(int a,int b,int c) {
		if (length == breadth) {
			return "square";
		}else {
			return "rectangle";
		}
	}
}
