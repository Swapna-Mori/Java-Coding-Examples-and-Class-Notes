package polymorphismexample1.methodoverriding;

public  class Rectangle extends Shape {
	public final void area() {
		System.out.println("Square area will be calculated");
	}

	public void perimeter() {
		System.out.println("Square perimeter will be calculated");
	}
}
