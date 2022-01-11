package abstractclassandmethodsexample;

public class CurrentAccount extends BankAccount{

	@Override 
	public void deposit() {
		System.out.println("deposit in to Current account");
		
	}

	@Override
	public void withdraw() {
		System.out.println("withdraw from Current  account");
		
	}

}
