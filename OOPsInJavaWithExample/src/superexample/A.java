package superexample;

public class A {
	
	int value;
	

	A(int a){
		
		System.out.println("param constructor of A");
		value = a;
	}
	
	void printValue() {
		System.out.println(value);
	}

}
