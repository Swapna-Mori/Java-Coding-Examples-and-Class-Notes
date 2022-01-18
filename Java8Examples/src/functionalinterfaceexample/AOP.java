package functionalinterfaceexample;

public class AOP {

	public static void main(String[] args) {
		//anonymous class
		Addition ad = new Addition() {
			
			@Override
			public void add() {
				System.out.println("This is add method from anonymous");
				
			}
		};//end of anonymous class
		
		ad.add();
		
		//how to implement lambda expression for above code
		Addition adLambda = () -> System.out.println("addition method using lambda expression");
		
		adLambda.add();
		
		Substraction st = (x,y) ->{
			System.out.println("Substraction Functional Interface implemented using Lambda expressions");
			System.out.println("substraction = " +(x-y));
		};
		st.sub(5, 3);

	}

}
