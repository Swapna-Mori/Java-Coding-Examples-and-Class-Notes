package abstractclassandmethodsexample;

public class ThreeYearFixedDepositAmount extends FixedDepositAccount{

	@Override
	public void withdraw() {
		System.out.println("withdraw can be done only after 3 years ");
		
	}

}
