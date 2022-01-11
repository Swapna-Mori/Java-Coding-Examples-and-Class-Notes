package loosecouplingexample;

public class Flight implements Vehicle{

	@Override
	public void move() {
		System.out.println("Flight is moving....");
		
	}

}
