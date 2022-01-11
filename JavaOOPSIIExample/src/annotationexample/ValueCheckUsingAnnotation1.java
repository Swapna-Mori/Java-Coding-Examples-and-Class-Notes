package annotationexample;

public class ValueCheckUsingAnnotation1 extends ValueCheckUsingAnnotation {
	
	@CustomAnnotation(message="creating an method")
	public void checkValue1() {
		System.out.println("custom annotation applied....");
	}

}
