package polymorphismexample1.methodoverriding;

public class PolymorphismExample {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.area();
		
		Square s = new Square();
		s.area();
		s.confirmShape(56);
	}
}
