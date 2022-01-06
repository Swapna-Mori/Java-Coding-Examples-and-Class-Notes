package accessspecifier1;

import accessspecifier.ClassOne;

public class ClassThree extends ClassOne {
	ClassOne co = new ClassOne();
	void display1() {
		System.out.println(value);
		co.data = 567;
		//System.out.println(co.ch);
	}
}
