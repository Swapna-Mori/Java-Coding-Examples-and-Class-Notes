package constructorexample;

public class Circle  {
	
	int radius;
	String msg;
	Rectangle rt;
	//default constructor
	Circle(){
		System.out.println("default constructor");
	}
	
	//Parameterised Constructor
	Circle(float radius){
		System.out.println("float parameterised constructor");
	}
	
	
	  //Parameterised Constructor 
	Circle(int radius){
	  System.out.println("int parameterised constructor"); }
	 
	
	//Parameterised Constructor with Two parameters
	Circle(float radius,String message){
		System.out.println("parameterised constructor");
	}

	//Shallow copying of the object when we have primitive or mutable data types
	public Circle(Circle c11) {
		System.out.println("Copy Constructor");
		this.radius = c11.radius;
		this.msg =  c11.msg;
	}
	
	//Deep copying of the object when we have non primitive data types
	public Circle(Circle c11,Rectangle rt) {
		System.out.println("Copy Constructor");
		this.radius = c11.radius;
		this.msg =  c11.msg;
		rt = new Rectangle(rt.length,rt.breadth);
	}
	
}
