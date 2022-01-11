package loosecouplingexample;

public class LooseCouplingTest {

	public static void main(String[] args) {
		Traveler t = new Traveler();
		t.setV(new Car());//inject the car
		t.startJourney();//start journey by car
		t.setV(new Flight());//inject the flight
		t.startJourney();//start journey by flight
	}

}
