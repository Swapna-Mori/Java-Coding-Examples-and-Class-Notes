package thiskeywordexample;

public class A {
	
	int value; //instance variable
	
	/*
	 * default values for instance variables are 
	 * 
	 * int => 0
	 * float => 0.0f
	 * double => 0.0
	 * char =>\u0000
	 * boolean => false
	 */
	
	A(){
		this(20);
		System.out.println("default constructor of A");
	}
	
	A(int value){
		//this();//this statement calls default constructor
		System.out.println("Param constructor");
		this.value = value;
		//this.printValue();
	}
	
	
	/**
	 * @param data
	 * local variable d are available only inside this method
	 */
	void printValue(int data) {//data here is parameter
		int d = 0;//local variable
		System.out.println(value + d);
	}

	void display() {
		//System.out.println(data);
	}
}
