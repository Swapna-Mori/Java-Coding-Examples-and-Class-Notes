package operatorsdemo;

public class ShiftOperators {

	public static void main(String[] args) {
		
		int a = 5;
		System.out.println("left shift of a = " + (a << 2));
		
		a = 5;
		System.out.println("Right shift of a = " + (a >> 2));
		
		a = 5;
		System.out.println("Zero Right shift of a = " + (a >>> 2));
		
		a = 5;
		System.out.println("compliment of a = " + (~a));//-6
		
		a = -5;
		System.out.println("compliment of a = " + (~a));//4
		
		boolean b = false;
		System.out.println("compliment of a = " + (!b));

	}

}
