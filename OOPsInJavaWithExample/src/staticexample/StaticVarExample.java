package staticexample;

public class StaticVarExample {
	public static void main(String[] args) {
		StaticVariableExample.i = 50;
		StaticVariableExample sv1 = new StaticVariableExample();
		sv1.display();
		StaticVariableExample sv2 = new StaticVariableExample();
		sv2.display();
		StaticVariableExample sv3 = new StaticVariableExample();
		sv3.display();
	}

}
