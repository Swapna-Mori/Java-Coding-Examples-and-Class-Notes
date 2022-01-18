package methodreferenceexample;

public class StaticMethodReferenceExample {

	public static void main(String[] args) {
		Greetings grt = ThoughOfTheDay::writeThoughtOfTheDay;
		
		//calling interface method sayGreetings
		
		grt.sayGreetings();

	}

}
