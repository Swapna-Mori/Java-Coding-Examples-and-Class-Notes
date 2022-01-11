package abstractclassandmethodsexample;

//abstract parent class
public abstract class BankAccount {
	
	public BankAccount() {
		System.out.println("abstract super class constructor called....");
	}
	
	final String accountNo ="56464";

	public abstract void deposit();
	public abstract void withdraw();
	
	public final static void OpenAccount() {
		System.out.println("Opening an account");
	}
}
