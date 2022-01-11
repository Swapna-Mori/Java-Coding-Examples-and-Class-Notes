package singletonclassexample;

public class SingletonExample {
	
	private static SingletonExample singletonObject;
	
	private SingletonExample() {
		// constructor for singleton class
	}
	
	public static SingletonExample getInstance() {
		//create object if it's not already created
		if(singletonObject == null) {
			singletonObject = new SingletonExample();
		}
		
		//returns object created above
		return singletonObject;
	}

	public static void main(String[] args) {
		SingletonExample se1;
		
		//refers to the only object of above single ton class
		
		se1 = SingletonExample.getInstance();
SingletonExample se2;
		
		//refers to the only object of above single ton class
		
		se2 = SingletonExample.getInstance();
			System.out.println(se1.hashCode() + "=====" + se2.hashCode());
	}

}
