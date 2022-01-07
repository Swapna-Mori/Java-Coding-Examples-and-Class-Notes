package staticexample;

public class StaticMethodOverridenOrNot {

	public static void main(String[] args) {
		
		A abObj = new B();
		
		System.out.println(abObj instanceof A);
		System.out.println(abObj instanceof B);
		A.testMethod();//this is static method
		//abObj.valuePrint();//this is non static method
	}

}
