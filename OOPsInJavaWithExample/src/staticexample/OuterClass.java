package staticexample;


public class OuterClass {
	private int data = 456;
	public class InnerClass{
		
		public void display() {
			System.out.println(data);
		}
	}

}
