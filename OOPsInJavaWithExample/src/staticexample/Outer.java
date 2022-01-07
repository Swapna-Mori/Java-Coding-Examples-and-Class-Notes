package staticexample;

public class Outer {
	private static float value = 234.567f;
	
	private static void displayValue() {
		System.out.println(value);
	}
	static class Inner{
		public void callPrivateMethodOfOuterClass() {
			displayValue();
		}
	}
	static public void main(String[] args) {
		
		//creating an object of inner class using outer class
		Outer.Inner oic = new Outer.Inner();
		oic.callPrivateMethodOfOuterClass();
	}
}
