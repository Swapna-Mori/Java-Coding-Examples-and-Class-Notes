package intefaceexampleinjava8;

public class ArithmeticOperationImpl implements ArithmeticOperations {
	
	public ArithmeticOperationImpl() {
		//calling static method in the interface
		
	}
	//int a,b;

	@Override
	public int add(int a, int b) {


		return a + b;
	}

	@Override
	public int div(int a, int b) {

		return a /b;
	}

	@Override
	public int mul(int a, int b) {
	
		return a * b;
	}

	@Override
	public int sub(int a, int b) {
	
		return a - b;
	}
	
	@Override
	public  void display() {
		System.out.println("fsfsafsfsdfsdfsdafsd");
		System.out.println("This is the  method which tests the overriding of default method in interface from java8");
	}


}
