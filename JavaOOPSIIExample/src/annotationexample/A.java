package annotationexample;

import java.lang.annotation.Documented;


public class A {
	
	public void display() {
		System.out.println("hello.....");
	}

	@Deprecated
	public void message() {
		System.out.println("deprecated annotatio example");
	} 
}
