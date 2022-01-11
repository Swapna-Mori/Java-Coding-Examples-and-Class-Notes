package intefaceexampleinjava8;

public class Calculator {

	static int a,b;
	public static void main(String[] args) {
		ArithmeticOperationImpl ao = new ArithmeticOperationImpl();

			System.out.println("Enter the value of a");
			a = ArithmeticOperations.readDataValue();
			System.out.println("Enter the value of b");
			b = ArithmeticOperations.readDataValue();
			System.out.println("addition = " +ao.add(a, b));
			ao.display();
			

	}

}
