package annotationexample;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestAnnotation {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		ValueCheckUsingAnnotation va = new ValueCheckUsingAnnotation();
		Method m = va.getClass().getMethod("checkValue");
		CustomAnnotation ca = m.getAnnotation(CustomAnnotation.class);
		System.out.println("data supplied using annotation = " + ca.data());
		System.out.println("data supplied using annotation = " + ca.message());
		Annotation[] all = va.getClass().getAnnotations();
		System.out.println(all.toString());
		ValueCheckUsingAnnotation1 va1 = new ValueCheckUsingAnnotation1();
		Method m1 = va1.getClass().getMethod("checkValue1");
		CustomAnnotation ca1 = m1.getAnnotation(CustomAnnotation.class);
		System.out.println("data supplied using annotation = " + ca1.data());
		System.out.println("data supplied using annotation = " + ca1.message());
	}

}
