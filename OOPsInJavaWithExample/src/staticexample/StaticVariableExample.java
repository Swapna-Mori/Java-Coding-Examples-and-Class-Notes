package staticexample;



public class StaticVariableExample {

	public static int i ; //= 1;
	int j;
	static { 
		i = 30;
		
	}
	
	public StaticVariableExample() {
		i = 30;
		i++;
		j= 45;
	}
	
	public static void display() {
		System.out.println("i value = " + i);
		//System.out.println(j);
	}

	public  void display1() {
		System.out.println("i value = " + i);
		System.out.println(j);
	}
}
