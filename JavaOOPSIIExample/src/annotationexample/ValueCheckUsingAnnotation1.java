package annotationexample;

public class ValueCheckUsingAnnotation1 extends ValueCheckUsingAnnotation {
	
	@CustomAnnotation(data = 60,message="welcome")
	public void checkValue1() {
		System.out.println("custom annotation applied....");
	}

}
