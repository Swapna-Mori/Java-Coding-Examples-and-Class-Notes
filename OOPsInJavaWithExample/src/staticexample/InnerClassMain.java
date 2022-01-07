package staticexample;

public class InnerClassMain {

	public static void main(String[] args) {
		// first create an object for outer class
		OuterClass oc = new OuterClass();
		//create an object for inner class using above outer class object
		OuterClass.InnerClass inner = oc.new InnerClass();
		
		inner.display();

	}

}
