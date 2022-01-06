package superexample;

public class B extends A{
	
	public B() {
		super(30);
		System.out.println("default constructor of B");
		super.value = 569;//accessing the super class variable
		super.printValue();//calling super class method
	}

}
