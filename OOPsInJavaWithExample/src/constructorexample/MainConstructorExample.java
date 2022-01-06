package constructorexample;

public class MainConstructorExample {

	public static void main(String[] args) {
		Circle c = new Circle();
		//the following statement calls single parameter constructor
		Circle c1 = new Circle(5);
		
		/*
		 * The following statement
		 * calls constructor with
		 * floating point value
		 */
		Circle c11 = new Circle(5.5f);
		
		//copy constructor
		Circle c111 = new Circle(c11);
		
		//Circle c121 = new Circle(6.5f,"success");
		
		//copy constructor with non primitive data types
		Rectangle rec = new Rectangle(56,66);
		
		
		Circle cir = new Circle(c11,rec);

	}

}
