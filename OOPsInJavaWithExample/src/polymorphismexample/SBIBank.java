package polymorphismexample;

public class SBIBank extends Bank {
	
	float rateOfInterest = 5;
	float accountBalance;
	float interest;
	
	/* polymorphic method */
	public void calculateInterest() {
		System.out.println("Interest is calculated here....");
		interest = accountBalance * rateOfInterest;
	}

}
