package switchexample;

public class BreakAndContinueExample {

	public static void main(String[] args) {
		int values[] = { 65, 89, 32, 45, 60, 76, 45, 60, 55, 67 };
		for (int i = 0; i < values.length; i++) {
			if (values[i] == 60) {
				break;
			}
			System.out.println(values[i]);
		}
		
		System.out.println("outside of the loop after condition is true");
		
		
		for (int i = 0; i < values.length; i++) {
			if (values[i] == 60) {
				continue;
			}
			System.out.println(values[i]);
		}
		
		System.out.println("outside of the loop after condition is true");


	}

}
