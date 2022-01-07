package staticexample;

public class StaticInnerClassExample {
		public static void main(String[] args) {
			
			//creating an object of inner class using outer class
			Outer.Inner oic = new Outer.Inner();
			oic.callPrivateMethodOfOuterClass();
		}
}
