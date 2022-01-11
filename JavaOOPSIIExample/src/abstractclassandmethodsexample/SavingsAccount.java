package abstractclassandmethodsexample;

public  class SavingsAccount extends BankAccount{
	public SavingsAccount(String accNo) {
		super();
		System.out.println("Savings Account Constructor.....");
	}
	/*
	 * @Override is predefined annotation to keep 
	 * check on method signature 
	 * (public void deposit())
	 */
	@Override 
	public void deposit() {
		super.OpenAccount();
		System.out.println("deposit in to savings account");
		
	}

	@Override
	public void withdraw() {
		System.out.println("withdraw from savings  account");
		
	}


}
