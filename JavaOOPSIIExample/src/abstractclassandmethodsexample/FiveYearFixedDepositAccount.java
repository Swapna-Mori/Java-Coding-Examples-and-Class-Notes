package abstractclassandmethodsexample;

public class FiveYearFixedDepositAccount extends FixedDepositAccount {

	@Override
	public void withdraw() {
		System.out.println("withdraw can be done only after 5 years ");
		
	}

}
